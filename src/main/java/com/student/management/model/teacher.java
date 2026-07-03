package com.student.management.model;

import jakarta.persistence.*;

@Entity
public class teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id",unique = true)
    private Long teacherId;
    @Column(name="teacherName")
    private String teacherName;
    @Column(name="teacherEmail")
    private String teacherEmail;
    @Column(name="teacherGender")
    private String teacherGender;
    @Column(name="teacherHighestQualifications")
    private String teacherHighestQualifications;
    @Column(name="teacherPhoneNumber")
    private Long teacherPhoneNumber;
    @Column(name="teacherAddress")
    private String teacherAddress;
    @Column(name="teacherSpecializations")
    private String teacherSpecializations;
    public teacher(){
    }
    public void setTeacherId(Long teacherId){
        this.teacherId=teacherId;
    }
    public void setTeacherName(String teacherName){
        this.teacherName=teacherName;
    }
    public void setTeacherEmail(String teacherEmail){
        this.teacherEmail=teacherEmail;
    }
    public void setTeacherHighestQualifications(String teacherHighestQualifications){
        this.teacherHighestQualifications=teacherHighestQualifications;
    }
    public void setTeacherPhoneNumber(Long teacherPhoneNumber){
        this.teacherPhoneNumber=teacherPhoneNumber;
    }
    public void setTeacherAddress(String teacherAddress){
        this.teacherAddress=teacherAddress;
    }
    public void setTeacherGender(String teacherGender){
        this.teacherGender=teacherGender;
    }
    public String getTeacherGender(){
        return teacherGender;
    }

    public void setTeacherSpecilizations(String teacherSpecializations) {
        this.teacherSpecializations = teacherSpecializations;
    }
    public Long getTeacherId(){
        return teacherId;
    }

    public Long getTeacherPhoneNumber() {
        return teacherPhoneNumber;
    }

    public String getTeacherAddress() {
        return teacherAddress;
    }
    public String getTeacherName(){
        return teacherName;
    }
    public String getTeacherEmail(){
        return teacherEmail;
    }
    public String getTeacherHighestQualifications(){
        return teacherHighestQualifications;
    }
    public String getTeacherSpecializations(){
        return teacherSpecializations;
    }

}
