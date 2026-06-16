package com.student.management.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
@Entity
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id",unique = true)
    private Long StudentId;
    @NotNull
    @Column(name = "name")
    private String name;
    @NotNull
    @Column(name = "email")
    private String email;
    @NotNull
    @Column(name = "course")
    private String course;
    @NotNull
    @Column(name = "phone_number")
    private String phoneNumber;
    @NotNull
    @Column(name = "address")
    private String address;
    @Column(name = "gender")
    private String gender;
    @Column(name = "courses_completed")
    private String CoursesCompleted;
    @Column(name = "current_year")
    private int currentYear;
    public student() {
    }
    public void  setStudentId(Long studentId) {
        this.StudentId = studentId;
    }
    public Long getStudentId() {
        return StudentId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public String getCourse() {
        return course;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public void setCoursesCompleted(String coursesCompleted) {
        this.CoursesCompleted = coursesCompleted;
    }
    public String getCoursesCompleted() {
        return CoursesCompleted;
    }
    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }
    public int getCurrentYear() {
        return currentYear;
    }
}
