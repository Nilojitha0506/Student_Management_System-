package com.Student_Management_System.Tutroial_02.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Student")

public class student {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 @Column(name = "first_name",nullable = false)
 private String firstName;
 @Column(name = "last_name",nullable = false)
 private String lastName;
 @Column(name = "email_id",nullable = false)
 private String email;
 @Column(name = "department",nullable = false)
 private String department;
  @Column(name = "yearOfEnrollment",nullable = false)
 private String yearOfEnrollment;
}
