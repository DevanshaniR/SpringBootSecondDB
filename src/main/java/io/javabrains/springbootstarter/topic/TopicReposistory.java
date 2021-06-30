package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicReposistory extends CrudRepository<Topic, String> {

}
