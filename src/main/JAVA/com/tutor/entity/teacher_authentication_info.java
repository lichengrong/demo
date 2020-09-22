
package com.tutor.entity;

public class teacher_authentication_info {

//     authentication_id int not null primary key auto_increment,  -- 认证ID
//     teacher_id int not null,-- 教师id
//    teacher_idcard varchar(50) not null,  -- 教员身份证号
//    teacher_school varchar(20) not null,   -- 教员学校
//    teacher_number VARCHAR(50)  not null,   -- 教员学号
//    teacher_certificate VARCHAR(50)	DEFAULT '无', -- 教师资格证id
//    foreign key (teacher_id) references teacher_info (teacher_id)

    private Integer authentication_id;
    private  Integer teacher_id;
    private String teacher_idcard;
    private String teacher_school;
    private  String teacher_subject;
     private String teacher_yn_school;
     private String teacher_academic;
    private String teacher_number;
    private  String teacher_certificate;

    public void setAuthentication_id(Integer authentication_id) {
        this.authentication_id = authentication_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public void setTeacher_idcard(String teacher_idcard) {
        this.teacher_idcard = teacher_idcard;
    }

    public void setTeacher_school(String teacher_school) {
        this.teacher_school = teacher_school;
    }

    public void setTeacher_number(String teacher_number) {
        this.teacher_number = teacher_number;
    }

    public void setTeacher_certificate(String teacher_certificate) {
        this.teacher_certificate = teacher_certificate;
    }

    public Integer getAuthentication_id() {
        return authentication_id;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public String getTeacher_idcard() {
        return teacher_idcard;
    }

    public String getTeacher_school() {
        return teacher_school;
    }

    public String getTeacher_number() {
        return teacher_number;
    }

    public String getTeacher_certificate() {
        return teacher_certificate;
    }

    public teacher_authentication_info() {
    }

    public teacher_authentication_info(Integer teacher_id, String teacher_idcard, String teacher_school, String teacher_subject, String teacher_yn_school, String teacher_academic, String teacher_number, String teacher_certificate) {
        this.teacher_id = teacher_id;
        this.teacher_idcard = teacher_idcard;
        this.teacher_school = teacher_school;
        this.teacher_subject = teacher_subject;
        this.teacher_yn_school = teacher_yn_school;
        this.teacher_academic = teacher_academic;
        this.teacher_number = teacher_number;
        this.teacher_certificate = teacher_certificate;
    }

    public teacher_authentication_info(Integer authentication_id, Integer teacher_id, String teacher_idcard, String teacher_school, String teacher_subject, String teacher_yn_school, String teacher_academic, String teacher_number, String teacher_certificate) {
        this.authentication_id = authentication_id;
        this.teacher_id = teacher_id;
        this.teacher_idcard = teacher_idcard;
        this.teacher_school = teacher_school;
        this.teacher_subject = teacher_subject;
        this.teacher_yn_school = teacher_yn_school;
        this.teacher_academic = teacher_academic;
        this.teacher_number = teacher_number;
        this.teacher_certificate = teacher_certificate;
    }

    public void setTeacher_subject(String teacher_subject) {
        this.teacher_subject = teacher_subject;
    }

    public void setTeacher_yn_school(String teacher_yn_school) {
        this.teacher_yn_school = teacher_yn_school;
    }

    public void setTeacher_academic(String teacher_academic) {
        this.teacher_academic = teacher_academic;
    }

    public String getTeacher_subject() {
        return teacher_subject;
    }

    public String getTeacher_yn_school() {
        return teacher_yn_school;
    }

    public String getTeacher_academic() {
        return teacher_academic;
    }
}
