package za.ac.cput.service;

import za.ac.cput.domain.Student;

import java.util.List;

public interface StudentService extends IService<Student, String> {
    List<Student> findAll();
}
