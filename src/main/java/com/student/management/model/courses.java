package com.student.management.model;

import jakarta.persistence.*;

@Entity
public class courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="courseId", unique = true)
    private long courseId;
    @Column(name="courseName")
    private String courseName;
    @Column(name="credits")
    private int credits;
    @Column(name="semester")
    private int  semester;
    @Column(name="departments")
    private String departments;
    @Column(name="duration")
    private int duration;
    public courses(){

    }
    public void setCourseId(int courseId){
        this.courseId=courseId;
    }
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
    public void setCredits(int credits){
        this.credits=credits;
    }
    public void setSemester(int semester){
        this.semester=semester;
    }
    public void setDepartments(String departments){
        this.departments=departments;
    }
    public void setDuration(int duration){
        this.duration=duration;
    }
    public long getCourseId(){
        return courseId;
    }
    public String getCourseName(){
        return courseName;
    }
    public int getCredits(){
            return credits; }
    public int getSemester(){
        return semester;
    }
    public String getDepartments(){
        return departments;
    }
    public int getDuration(){
        return duration;
    }

}
