package io.javabrains.springbootstarter.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseReposistory courseReposistory;

    public List<Course> getAllCourses(String topic_id) {
        List<Course> courses = new ArrayList<>();
        courseReposistory.findByTopicId(topic_id).forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id) {
        return courseReposistory.findOne(id);
    }

    public void addCourse(Course course) {
        courseReposistory.save(course);
    }

    public void updateCourse(Course course) {
        courseReposistory.save(course);
    }

    public void deleteCourse(String id) {
        courseReposistory.delete(id);
    }
}
