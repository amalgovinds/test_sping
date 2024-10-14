package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Data Access Layer
//JpaRepo syntax refers to obj to be referred and its ID
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
