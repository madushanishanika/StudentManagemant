package edu.icet.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String studentName;
    private int age;
    private String address;
    private String gender;
    private String contactNumber;
    private String emailAddress;
    private String grdnName;
    private String grdnAddress;
    private String relationship;
    private  String grdnPhnNumber;
}
