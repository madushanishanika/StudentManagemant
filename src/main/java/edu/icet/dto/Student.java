package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String studentName;
    private int age;
    private String address;
    private String gender;
    private String contactNumber;
    private String emailAddress;
    private String grdnName;
    private String grdnAddress;
    private String relationship;
    private String grdnPhnNumber;
}
