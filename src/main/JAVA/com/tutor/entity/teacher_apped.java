package com.tutor.entity;

import java.util.Date;

public class teacher_apped {

//    tappointmented_id int  primary key auto_increment not null,  -- 教师被预约ID
//    tappointmented_time datetime DEFAULT CURRENT_TIMESTAMP,   -- 预约时间
//    tappointmented_subject varchar(50) not null,   -- 预约科目
//    tappointmented_address varchar(80) not null,  -- 预约地点
//    student_id int not null -- 学员ID

    private  Integer tappointmented_id;
    private  Integer teacher_id;
    private Date tappointmented_time;
    private String tappointmented_subject;
    private String tappointmented_address;
    private String tappointmented_condition;
    private  Integer student_id;

    public teacher_apped(Integer teacher_id, Date tappointmented_time, String tappointmented_subject, String tappointmented_address, String tappointmented_condition, Integer student_id) {
        this.teacher_id = teacher_id;
        this.tappointmented_time = tappointmented_time;
        this.tappointmented_subject = tappointmented_subject;
        this.tappointmented_address = tappointmented_address;
        this.tappointmented_condition = tappointmented_condition;
        this.student_id = student_id;
    }

    public teacher_apped(Integer tappointmented_id, Integer teacher_id, Date tappointmented_time, String tappointmented_subject, String tappointmented_address, String tappointmented_condition, Integer student_id) {
        this.tappointmented_id = tappointmented_id;
        this.teacher_id = teacher_id;
        this.tappointmented_time = tappointmented_time;
        this.tappointmented_subject = tappointmented_subject;
        this.tappointmented_address = tappointmented_address;
        this.tappointmented_condition = tappointmented_condition;
        this.student_id = student_id;
    }

    public void setTappointmented_condition(String tappointmented_condition) {
        this.tappointmented_condition = tappointmented_condition;
    }

    public String getTappointmented_condition() {
        return tappointmented_condition;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public Integer getTappointmented_id() {
        return tappointmented_id;
    }

    public Date getTappointmented_time() {
        return tappointmented_time;
    }

    public String getTappointmented_subject() {
        return tappointmented_subject;
    }

    public String getTappointmented_address() {
        return tappointmented_address;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setTappointmented_id(Integer tappointmented_id) {
        this.tappointmented_id = tappointmented_id;
    }

    public void setTappointmented_time(Date tappointmented_time) {
        this.tappointmented_time = tappointmented_time;
    }

    public void setTappointmented_subject(String tappointmented_subject) {
        this.tappointmented_subject = tappointmented_subject;
    }

    public void setTappointmented_address(String tappointmented_address) {
        this.tappointmented_address = tappointmented_address;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public teacher_apped() {
    }
}
