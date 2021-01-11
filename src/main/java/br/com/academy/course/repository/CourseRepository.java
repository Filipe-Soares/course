package br.com.academy.course.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.academy.course.endpoint.model.Course;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long>{

}
