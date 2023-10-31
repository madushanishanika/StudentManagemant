package edu.icet.service;

import edu.icet.dao.StudentEntity;
import edu.icet.dto.Student;
import edu.icet.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentServiceImp implements StudentService {
   // ArrayList<Student> studentList = new ArrayList();
    @Autowired
    StudentRepository studentRepository;
    @Override
    public Iterable<StudentEntity> getStudent(){
//        Student student =  new Student();
//        student.setStudentName("shani");
//        student.setAge(20);
//        student.setAddress("panadura");
//        student.setGender("male");
//        student.setContactNumber("3456789");
//        student.setEmailAddress("s@gmail.com");
//        student.setGrdnName("siri");
//        student.setGrdnAddress("kalutara");
//        student.setRelationship("hubby");
//        student.setGrdnPhnNumber("2345678");
//        studentList.add(student);
        return studentRepository.findAll();
    }
    // @Override
//    public void setStudent(Student student) {
//        Student student1 = new Student();
//        student1.setStudentName(student.getStudentName());
//        student1.setAge(student.getAge());
//        student1.setAddress(student.getAddress());
//        student1.setGender(student.getGender());
//        student1.setContactNumber(student.getContactNumber());
//        student1.setEmailAddress(student.getEmailAddress());
//        student1.setStudentName(student.getGrdnName());
//        student1.setGrdnAddress(student.getGrdnAddress());
//        student1.setRelationship(student.getRelationship());
//        student1.setGrdnPhnNumber(student.getGrdnPhnNumber());
//    }
    public void registerStudent(StudentEntity student) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setStudentName(student.getStudentName());
        studentEntity.setAge(student.getAge());
        studentEntity.setAddress(student.getAddress());
        studentEntity.setGender(student.getGender());
        studentEntity.setContactNumber(student.getContactNumber());
        studentEntity.setEmailAddress(student.getEmailAddress());
        studentEntity.setGrdnName(student.getGrdnName());
        studentEntity.setGrdnAddress(student.getGrdnAddress());
        studentEntity.setRelationship(student.getRelationship());
        studentEntity.setGrdnPhnNumber(student.getGrdnPhnNumber());
        studentRepository.save(studentEntity);
    }
}
