package com.tutor.service_imp;

import com.tutor.dao.teacher_dao;
import com.tutor.entity.order_record;
import com.tutor.entity.teacher_apped;
import com.tutor.entity.teacher_authentication_info;
import com.tutor.entity.teacher_info;
import com.tutor.service.teacher_service;
import com.tutor.util.JesonUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tutor.util.JedisClient;

import java.util.List;


@Service
public class teacher_serviceimp implements teacher_service {
    @Autowired
    public teacher_dao teacher_dao;
    @Autowired
    public JedisClient jedisClient;

    @Override
    public teacher_info query_teacher_info_id(Integer id) {
        try {
         String a =jedisClient.hget("query_teacher_info_id",id+"");
         if(!StringUtils.isBlank(a)){
             teacher_info info = JesonUtil.parseObject(a,teacher_info.class);
             System.out.println("------------------------------redis缓存中查询-------------");
             return info;
         }
        }catch (Exception E){

        }
     //  jedisClient.
        //执行查询----------
        teacher_info info =  teacher_dao.query_teacher_info_id(id);
        String a= JesonUtil.toJSONString(info);
        try {
            jedisClient.hset("query_teacher_info_id",id+"",a);
        }catch (Exception E){
            System.out.println("缓存失败");
        }
        System.out.println("------------------------------mysql中查询-------------appid");
            return  info;
    }

    @Override
    public Integer update_teacher_info_count(teacher_info info) {
        return teacher_dao.update_teacher_info_count(info);
    }

    @Override
    public Integer update_teacher_info_photo(teacher_info info) {
        return teacher_dao.update_teacher_info_photo(info);
    }

    @Override
    public Integer insert_teacher_info_authentication(teacher_authentication_info info) {
        return teacher_dao.insert_teacher_info_authentication(info);
    }

    @Override
    public Integer update_teacher_info_certify(teacher_info info) {
        return teacher_dao.update_teacher_info_certify(info);
    }

    @Override
    public Integer update_teacher_info(teacher_info info) {
        return teacher_dao.update_teacher_info(info);
    }

    @Override
    public List<teacher_apped> query_teacher_qpped(int a, int b) {
        try {
            String a1 =jedisClient.hget("query_teacher_qpped",a+"");
            if(!StringUtils.isBlank(a1)){
                List<teacher_apped> list=JesonUtil.parseArray(a1,teacher_apped.class);
                System.out.println("------------------------------redis缓存中查询-------------append");
                return list;
            }
        }catch (Exception E){

        }
//数据库查询
        List<teacher_apped> list= teacher_dao.query_teacher_qpped(a,b);
        String a1= JesonUtil.toJSONString(list);
        try {
            jedisClient.hset("query_teacher_qpped",a+"",a1);
        }catch (Exception E){
            System.out.println("缓存失败");
        }
        System.out.println("------------------------------mysql中查询------------append-");
        return list;

    }

    @Override
    public Integer update_appointmented_condition(teacher_apped info) {
        return teacher_dao.update_appointmented_condition(info);
    }

    @Override
    public Integer delete_appointmented_condition(teacher_apped info) {
        return teacher_dao.delete_appointmented_condition(info);
    }

    @Override
    public List<order_record> query_record_id(Integer id,Integer pageno,Integer pagesize) {
        try {
            String a1 =jedisClient.hget("query_record_id",id+"");
            if(!StringUtils.isBlank(a1)){
                List<order_record> list=JesonUtil.parseArray(a1,order_record.class);
                System.out.println("------------------------------redis缓存中查询-------------");
                return list;
            }
        }catch (Exception E){

        }

        //数据库查询
        List<order_record> list= teacher_dao.query_record_id(id,pageno,pagesize);
        String a1= JesonUtil.toJSONString(list);
        try {
            jedisClient.hset("query_record_id",id+"",a1);
        }catch (Exception E){
            System.out.println("缓存失败");
        }
        System.out.println("------------------------------mysql中查询-------------");
        return list;

    }

    @Override
    public Integer insert_record(order_record record) {
        return teacher_dao.insert_record(record);
    }

    @Override
    public List<order_record> query_record_id_all(order_record record) {
        try {
            String a1 =jedisClient.hget("query_record_id_all","record");
            if(!StringUtils.isBlank(a1)){
                List<order_record> list=JesonUtil.parseArray(a1,order_record.class);
                System.out.println("------------------------------redis缓存中查询-------------");
                return list;
            }
        }catch (Exception E){

        }
        //数据库查询
        List<order_record> list= teacher_dao.query_record_id_all(record);
        String a1= JesonUtil.toJSONString(list);
        try {
            jedisClient.hset("query_record_id_all","record",a1);
        }catch (Exception E){
            System.out.println("缓存失败");
        }
        System.out.println("------------------------------mysql中查询-------------");
        return list;



       // return teacher_dao.query_record_id_all(record);
    }

    @Override
    public List<teacher_apped> query_appointmented_id_all(teacher_apped apped) {
        try {
            String a1 =jedisClient.hget("query_appointmented_id_all","apped");
            if(!StringUtils.isBlank(a1)){
                List<teacher_apped> list=JesonUtil.parseArray(a1,teacher_apped.class);
                System.out.println("------------------------------redis缓存中查询----------xxxx---");
                return list;
            }
        }catch (Exception E){

        }

        //数据库查询
        List<teacher_apped> list= teacher_dao.query_appointmented_id_all(apped);
        String a1= JesonUtil.toJSONString(list);
        try {
            jedisClient.hset("query_appointmented_id_all","apped",a1);
        }catch (Exception E){
            System.out.println("缓存失败");
        }
        System.out.println("------------------------------mysql中查询------------xxxx-");
        return list;

    //    return teacher_dao.query_appointmented_id_all(apped);
    }
}
