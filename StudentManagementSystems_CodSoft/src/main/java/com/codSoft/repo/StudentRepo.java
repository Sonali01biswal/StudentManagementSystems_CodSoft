package com.codSoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.codSoft.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
