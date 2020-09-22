package com.tutor.entity;

import java.util.Date;

public class order_record {

//    order_id int primary key auto_increment not null,  -- 订单编号ID
//    order_bengtime datetime DEFAULT CURRENT_TIMESTAMP,   -- 订单开始时间
//    order_address --地点
//    order_subject varchar(20) not null,   -- 科目
//    order_state varchar(20)  DEFAULT '未完成',  -- 订单状态
//    order_endtime datetime,   -- 订单开始时间
//    student_id int not null,   -- 学生ID
//    teacher_id int not null,   -- 教员ID

    private Integer order_id;
    private Date order_bengtime;
    private String order_address;
    private String order_subject;
    private String order_state;
    private Date order_endtime;
    private Integer student_id;
    private  Integer teacher_id;


    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public void setOrder_bengtime(Date order_bengtime) {
        this.order_bengtime = order_bengtime;
    }

    public void setOrder_subject(String order_subject) {
        this.order_subject = order_subject;
    }

    public void setOrder_state(String order_state) {
        this.order_state = order_state;
    }

    public void setOrder_endtime(Date order_endtime) {
        this.order_endtime = order_endtime;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public Date getOrder_bengtime() {
        return order_bengtime;
    }

    public String getOrder_subject() {
        return order_subject;
    }

    public String getOrder_state() {
        return order_state;
    }

    public Date getOrder_endtime() {
        return order_endtime;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setOrder_address(String order_address) {
        this.order_address = order_address;
    }

    public String getOrder_address() {
        return order_address;
    }

    public order_record(Date order_bengtime, String order_address, String order_subject, String order_state, Date order_endtime, Integer student_id, Integer teacher_id) {
        this.order_bengtime = order_bengtime;
        this.order_address = order_address;
        this.order_subject = order_subject;
        this.order_state = order_state;
        this.order_endtime = order_endtime;
        this.student_id = student_id;
        this.teacher_id = teacher_id;
    }

    public order_record(Integer order_id, Date order_bengtime, String order_address, String order_subject, String order_state, Date order_endtime, Integer student_id, Integer teacher_id) {
        this.order_id = order_id;
        this.order_bengtime = order_bengtime;
        this.order_address = order_address;
        this.order_subject = order_subject;
        this.order_state = order_state;
        this.order_endtime = order_endtime;
        this.student_id = student_id;
        this.teacher_id = teacher_id;
    }

    public order_record() {
    }
}
