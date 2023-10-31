package edu.icet.service;

import edu.icet.dao.StudentEntity;
import edu.icet.dto.Student;

import java.util.ArrayList;

public interface StudentService {
    public Iterable<StudentEntity> getStudent();

   // void setStudent(Student student);
    void registerStudent(StudentEntity student);
}
