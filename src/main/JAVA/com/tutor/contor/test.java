package com.tutor.contor;

import com.tutor.aop.extremely_imp;
import com.tutor.entity.teacher_info;
import com.tutor.util.JesonUtil;
import org.aspectj.lang.annotation.Before;
import redis.clients.jedis.Jedis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Controller
//@RequestMapping(value = ("/cls"))
public class test implements Serializable {
    private static final long serialVersionUID = -4270193527907896940L;

//    @RequestMapping(value=("/action1"))
//    public String test1() {
//        System.out.println("--------------------ok");
//
//
//
//        return "index";
    //}

    public static void main(String[] args) {
        extremely_imp o= new extremely_imp();
        o.addUser();

//        redisutil redis=new redisutil();
//        Jedis j= redisutil.getJedis();
//        Map<String,teacher_info> m=new HashMap<String,teacher_info>();
//
//        teacher_info info=new teacher_info();
//        info.setTeacher_name("鹏飞开火车");
//        m.put("info",info);
//       // j.hmset("l1",m);
//        List<teacher_info> list=new ArrayList();
//        teacher_info t=new teacher_info();
//        t.setTeacher_name("nb");
//        list.add(t);
//       // String appedJson="{\"code\":0,\"msg\":\"\",\"count\":"+count+",\"data\":"+g.toJson(list)+"}";
//          String a= JesonUtil.toJSONString(list);
//        System.out.println(a);
//        List<teacher_info> list2 =JesonUtil.parseArray(a,teacher_info.class);
//        System.out.println(list2.get(0).getTeacher_name());
    }
}
