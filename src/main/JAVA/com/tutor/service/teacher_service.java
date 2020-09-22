package com.tutor.service;

import com.tutor.entity.order_record;
import com.tutor.entity.teacher_apped;
import com.tutor.entity.teacher_authentication_info;
import com.tutor.entity.teacher_info;

import java.util.List;

public interface teacher_service {

    public teacher_info query_teacher_info_id(Integer id);
    public Integer update_teacher_info_count(teacher_info info);
    public Integer update_teacher_info_photo(teacher_info info);
    public Integer insert_teacher_info_authentication(teacher_authentication_info info);
    public  Integer update_teacher_info_certify(teacher_info info);
    public Integer update_teacher_info(teacher_info info);
    public List<teacher_apped> query_teacher_qpped(int a, int b);
    public Integer update_appointmented_condition(teacher_apped info);
    public Integer delete_appointmented_condition(teacher_apped info);
    public  List<order_record> query_record_id(Integer id,Integer pageno,Integer pagesize);
    public Integer insert_record(order_record record);
    public List<order_record> query_record_id_all(order_record record);
    public List<teacher_apped> query_appointmented_id_all(teacher_apped apped);

}
