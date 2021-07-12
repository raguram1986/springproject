package com.example.studentmanagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.studentmanagement.Domain.Course;
import com.example.studentmanagement.Domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	@Query(value="select student.id, student.stname, course.coursename from student Inner JOIN course ON  student.course= course.id", nativeQuery=true)
	List<Object[]> findStudent();
	
	
}


