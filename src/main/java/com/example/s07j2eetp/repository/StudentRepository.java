// changement route du package car j'ai pas fait autant de sous dossier que dans le tuto
package com.example.s07j2eetp.repository;

import java.util.List;
// import jpa repository et effacer crud repository 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.s07j2eetp.entity.*;

@Repository
public interface StudentRepository extends JpaRepository <Student, Long> { 
    List<Student> findByName(String name); 
}

