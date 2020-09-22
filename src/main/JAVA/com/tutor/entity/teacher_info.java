package com.tutor.entity;

import java.io.Serializable;

public class teacher_info  implements Serializable {
    //private static final long serialVersionUID = 0;
//    teacher_id int not null primary key auto_increment, -- 教员ID
//    teacher_account VARCHAR(20) not null, -- 登录账号
//    teacher_password VARCHAR(20) not null, -- 教员登录密码
//    teacher_name varchar(20) not null,  -- 教员姓名
//    teacher_sex VARCHAR(4) not null, -- 教员性别
//    teacher_age int not null,   -- 教员年龄
//    teacher_iphone int not null, -- 教员电话
//    teacher_certify VARCHAR(20) not null DEFAULT '否' -- 教员是否认证
//    teacher_photo VARCHAR(50) not null DEFAULT 'images/tx_0.jpg', -- 教员照片
//    teacher_count int not null DEFAULT 0 -- 登陆次数
    public Integer teacher_id;
    public String teacher_account;
    public String teacher_password;
    public String teacher_name;
    public String teacher_sex;
    public Integer teacher_age;
    public String teacher_iphone;
    public String teacher_certify;
    public String teacher_photo;
    public String teacher_address;
    public  Integer teacher_count;

    public teacher_info() {
    }

    public String getTeacher_address() {
        return teacher_address;
    }

    public void setTeacher_address(String teacher_address) {
        this.teacher_address = teacher_address;
    }

    public teacher_info(Integer teacher_id, String teacher_account, String teacher_password, String teacher_name, String teacher_sex, Integer teacher_age, String teacher_iphone, String teacher_certify, String teacher_photo, String teacher_address) {
        this.teacher_id = teacher_id;
        this.teacher_account = teacher_account;
        this.teacher_password = teacher_password;
        this.teacher_name = teacher_name;
        this.teacher_sex = teacher_sex;
        this.teacher_age = teacher_age;
        this.teacher_iphone = teacher_iphone;
        this.teacher_certify = teacher_certify;
        this.teacher_photo = teacher_photo;
        this.teacher_address = teacher_address;
    }

    public teacher_info(Integer teacher_id, String teacher_account, String teacher_password, String teacher_name, String teacher_sex, Integer teacher_age, String teacher_iphone, String teacher_certify, String teacher_photo, Integer teacher_count) {
        this.teacher_id = teacher_id;
        this.teacher_account = teacher_account;
        this.teacher_password = teacher_password;
        this.teacher_name = teacher_name;
        this.teacher_sex = teacher_sex;
        this.teacher_age = teacher_age;
        this.teacher_iphone = teacher_iphone;
        this.teacher_certify = teacher_certify;
        this.teacher_photo = teacher_photo;
        this.teacher_count = teacher_count;
    }

    public void setTeacher_photo(String teacher_photo) {
        this.teacher_photo = teacher_photo;
    }

    public void setTeacher_count(Integer teacher_count) {
        this.teacher_count = teacher_count;
    }

    public String getTeacher_photo() {
        return teacher_photo;
    }

    public Integer getTeacher_count() {
        return teacher_count;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public String getTeacher_account() {
        return teacher_account;
    }

    public String getTeacher_password() {
        return teacher_password;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public String getTeacher_sex() {
        return teacher_sex;
    }

    public Integer getTeacher_age() {
        return teacher_age;
    }


    public String getTeacher_certify() {
        return teacher_certify;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public void setTeacher_account(String teacher_account) {
        this.teacher_account = teacher_account;
    }

    public void setTeacher_password(String teacher_password) {
        this.teacher_password = teacher_password;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public void setTeacher_sex(String teacher_sex) {
        this.teacher_sex = teacher_sex;
    }

    public void setTeacher_age(Integer teacher_age) {
        this.teacher_age = teacher_age;
    }

    public void setTeacher_iphone(String teacher_iphone) {
        this.teacher_iphone = teacher_iphone;
    }

    public String getTeacher_iphone() {
        return teacher_iphone;
    }

    public void setTeacher_certify(String teacher_certify) {
        this.teacher_certify = teacher_certify;
    }
}
