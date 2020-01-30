package com.example.s07j2eetp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.s07j2eetp.entity.*;

@Repository
public interface StudentRepository extends JpaRepository <Student, Long> { 
    List<Student> findByName(String name); 
}

