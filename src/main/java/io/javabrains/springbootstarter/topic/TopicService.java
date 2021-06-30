package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicReposistory topicReposistory;

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicReposistory.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        return topicReposistory.findOne(id);
    }

    public void addTopic(Topic topic) {
        topicReposistory.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
        topicReposistory.save(topic);
    }

    public void deleteTopic(String id) {
        topicReposistory.delete(id);
    }
}
