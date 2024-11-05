package com.Student_Management_System.Tutroial_02.repository;
import com.Student_Management_System.Tutroial_02.model.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<student,Long> {

}