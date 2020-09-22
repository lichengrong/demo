package com.tutor.contor;

import com.google.gson.Gson;
import com.tutor.entity.order_record;
import com.tutor.entity.teacher_apped;
import com.tutor.entity.teacher_authentication_info;
import com.tutor.entity.teacher_info;
import com.tutor.service_imp.teacher_serviceimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

@Controller
public class teacher_Individuals {
@Autowired
public teacher_serviceimp teacher_serviceimp;



    @RequestMapping(value=("/teacher_info1"))
    public ModelAndView test1() {
//        String A=null;
//        System.out.println(A.length());
        //获取账号id
         Integer id=1;
         teacher_info info =new teacher_info();
         info.setTeacher_id(id);
         //查询出账号id的详细属性
        teacher_info t_info= teacher_serviceimp.query_teacher_info_id(id);

        //查询出账号id的访问次数加一
        t_info.setTeacher_count(t_info.getTeacher_count()+1);
        //为查询出页面的信息也修改
        info.setTeacher_count(t_info.getTeacher_count());
        //查询出账号id的访问次数加一-后修改进数据库
        teacher_serviceimp.update_teacher_info_count(info);


        ModelAndView mav=new ModelAndView("personal");
        mav.setViewName("personal");
        System.out.println("--------------------ok"+t_info.getTeacher_name());
        mav.addObject("t_info",t_info);
        return  mav;
    }
    @RequestMapping(value=("/teacher_photo1"))
    public ModelAndView action2(HttpServletRequest req) {
//                String A=null;
//       System.out.println(A.length());
            int id=Integer.parseInt(req.getParameter("id"));
        //获取账号id
        System.out.println("-------------------->");

        ModelAndView mav=new ModelAndView("personal_photo");
        teacher_info info =new teacher_info();
        info.setTeacher_id(id);
//        mav.setViewName("personal_photo");
        mav.addObject("t_info",info);
        return  mav;
    }
    @RequestMapping(value=("/teacher_photo2"))
    public String action3(@RequestParam("file") MultipartFile file,HttpServletRequest req) throws IOException {
        int a= Integer.parseInt(req.getParameter("id"));
        System.out.println(a+"--------->");
        String uploadfile="E:\\SSM\\src\\main\\webapp\\images";
        String filename=file.getOriginalFilename();
        File f= new File(uploadfile+"/"+filename);
        file.transferTo(f);
        teacher_info info =new teacher_info();
        info.setTeacher_id(a);
        info.setTeacher_photo("images/"+filename);
        teacher_serviceimp.update_teacher_info_photo(info);
        return  "forward:teacher_info1.do";
    }

    @RequestMapping(value=("/teacher_certity1"))
    public ModelAndView action4(HttpServletRequest req) {
        int a= Integer.parseInt(req.getParameter("id"));
        //获取账号id

        System.out.println("-------------------->");

        ModelAndView mav=new ModelAndView("personal_certify");
        teacher_info info =new teacher_info();
        info.setTeacher_id(a);
//        mav.setViewName("personal_photo");
        mav.addObject("t_info",info);
        return  mav;
    }
    @RequestMapping(value=("/teacher_certity2"))
    public String action5(HttpServletRequest req) {
        int a1= Integer.parseInt(req.getParameter("id"));
        String a2= req.getParameter("idcard");
        String a3=req.getParameter("school");
        String a4=req.getParameter("xuehao");
        String a5=req.getParameter("certificate");
        String a6=req.getParameter("subject");
        String a7=req.getParameter("ynschool");
        String a8=req.getParameter("xueli");
        if(a5==null||a5==""){
            a5="无";
        }
        //获取账号id
        System.out.println("-------------------->"+a1);
        teacher_authentication_info info=new teacher_authentication_info(a1,a2,a3,a6,a7,a8,a4,a5);
        try {
            teacher_serviceimp.insert_teacher_info_authentication(info);
            teacher_info info2=new teacher_info();
            info2.setTeacher_id(a1);
            info2.setTeacher_certify("认证受理中");
            teacher_serviceimp.update_teacher_info_certify(info2);

        }catch (Exception e){
            System.out.println("----");
        }


        return  "forward:teacher_info1.do";

    }
    @RequestMapping(value=("/teacher_update1"))
    public ModelAndView action6(HttpServletRequest req) {
        int a= Integer.parseInt(req.getParameter("id"));
        //获取账号id
        teacher_info t_info= teacher_serviceimp.query_teacher_info_id(a);
        System.out.println("-------------------->");

        ModelAndView mav=new ModelAndView("personal_update");
//        mav.setViewName("personal_photo");
        mav.addObject("t_info",t_info);
        return  mav;
    }

    @RequestMapping(value=("/teacher_update2"))
    public String action7(HttpServletRequest req) {
        int a1= Integer.parseInt(req.getParameter("id"));
        String a2=req.getParameter("user");
        System.out.println(a2);
        String a3=req.getParameter("sex");
        String a4=req.getParameter("age");
        String a5=req.getParameter("pwd");
        String a6=req.getParameter("phone");
        String a7=req.getParameter("address");
        System.out.println(a3+"-------");
        System.out.println(a6+"-------");
        teacher_info info=new teacher_info();
        info.setTeacher_id(a1);
        info.setTeacher_name(a2);
        info.setTeacher_sex(a3);
        info.setTeacher_age(Integer.parseInt(a4));
        info.setTeacher_password(a5);
        info.setTeacher_iphone(a6);
        info.setTeacher_address(a7);
        //获取账号id
       teacher_serviceimp.update_teacher_info(info);

        return  "forward:teacher_info1.do";
    }
    @RequestMapping(value=("/teacher_apped1"))
    public ModelAndView action8(HttpServletRequest req) {
        int a= Integer.parseInt(req.getParameter("id"));
        //获取账号id
        teacher_info t_info= teacher_serviceimp.query_teacher_info_id(a);
        System.out.println("-------------------->");

        ModelAndView mav=new ModelAndView("personal_appointmented");
//        mav.setViewName("personal_photo");
        mav.addObject("t_info",t_info);
        return  mav;
    }
    @RequestMapping(value=("/teacher_apped2"))
    public ModelAndView action9(HttpServletRequest req) {
        int a= Integer.parseInt(req.getParameter("id"));
        //获取账号id
        teacher_info t_info= teacher_serviceimp.query_teacher_info_id(a);
        System.out.println("-------------------->");

        ModelAndView mav=new ModelAndView("personal_appointmented");
//        mav.setViewName("personal_photo");
        mav.addObject("t_info",t_info);
        return  mav;
    }
    @RequestMapping(value=("/teacher_apped3"))
    public void action10(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("-------------------->+++++");
        int a= Integer.parseInt(req.getParameter("id"));
        System.out.println(a+"------dsd-sd-s-dsd-");
        //获取账号id
        int pageNo=Integer.parseInt(req.getParameter("page"));
        int pageSize=Integer.parseInt(req.getParameter("size"));
        System.out.println(pageNo+"---"+pageSize);
        List<teacher_apped> list = teacher_serviceimp.query_teacher_qpped((pageNo-1)*pageSize,pageSize);
        System.out.println("-------------------->+++++");
        Gson g=new Gson();
        teacher_apped app=new teacher_apped();
        app.setTeacher_id(a);
        List<teacher_apped> l= teacher_serviceimp.query_appointmented_id_all(app);
        int count =l.size();
        String appedJson="{\"code\":0,\"msg\":\"\",\"count\":"+count+",\"data\":"+g.toJson(list)+"}";
        PrintWriter o=resp.getWriter();
        o.print(appedJson);
    }
    @RequestMapping(value=("/teacher_apped4"))
    public String action11(HttpServletRequest req) {
        int id=Integer.parseInt(req.getParameter("messId"));
        System.out.println(id+"-------------------");
        teacher_apped info =new teacher_apped();
        info.setTappointmented_id(id);
        info.setTappointmented_condition("拒绝");
        teacher_serviceimp.update_appointmented_condition(info);

return null;

    }
    @RequestMapping(value=("/teacher_apped5"))
    public String action12(HttpServletRequest req) {
        int id=Integer.parseInt(req.getParameter("messId"));
        int sid=Integer.parseInt(req.getParameter("mssstudent"));
        int tid=Integer.parseInt(req.getParameter("mssteacher"));
        String subject=req.getParameter("msssubject");
        String address=req.getParameter("mssaddress");

        System.out.println(subject+"-------------------");
        teacher_apped info =new teacher_apped();
        info.setTappointmented_id(id);

        try {
            teacher_serviceimp.delete_appointmented_condition(info);
            order_record record=new order_record();
            record.setOrder_address(address);
            record.setTeacher_id(tid);
            record.setOrder_bengtime(new Date());
            record.setOrder_state("未完成");
            record.setStudent_id(sid);
            record.setOrder_subject(subject);
            teacher_serviceimp.insert_record(record);


        }catch (Exception a){

        }
        return null;

    }
    @RequestMapping(value=("/teacher_dingdan1"))
    public ModelAndView action13(HttpServletRequest req) {
        int id=Integer.parseInt(req.getParameter("id"));
        System.out.println(id+"-------------------");
        teacher_info info=new teacher_info();
        info.setTeacher_id(id);
        ModelAndView mav=new ModelAndView("personal_record");
//        mav.setViewName("personal_photo");
        mav.addObject("t_info",info);
        return  mav;
    }
    @RequestMapping(value=("/teacher_dingdan2"))
    public void action14(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id=Integer.parseInt(req.getParameter("id"));
        int pageNo=Integer.parseInt(req.getParameter("page"));
        int pageSize=Integer.parseInt(req.getParameter("size"));
        System.out.println(id+"-------------------00000000000000000000000000000000000");
        List<order_record> list = teacher_serviceimp.query_record_id(id,(pageNo-1)*pageSize,pageSize);
        System.out.println("-------------------->+++++"+pageSize+"000000000000000000000000000000000000");
        Gson g=new Gson();
        order_record record=new order_record();
        record.setTeacher_id(id);
        List<order_record> l= teacher_serviceimp.query_record_id_all(record);
        int count =l.size();
        System.out.println(list.size());
        String appedJson="{\"code\":0,\"msg\":\"\",\"count\":"+count+",\"data\":"+g.toJson(list)+"}";
        PrintWriter o=resp.getWriter();
        o.print(appedJson);
    }
    @RequestMapping(value=("/teacher_wenti1"))
    public ModelAndView action15(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id=Integer.parseInt(req.getParameter("id"));
        //获取账号id
        System.out.println("-------------------->");

        ModelAndView mav=new ModelAndView("personal_question");
        teacher_info info =new teacher_info();
        info.setTeacher_id(id);
//        mav.setViewName("personal_photo");
        mav.addObject("t_info",info);
        return  mav;
    }
    @RequestMapping(value=("/teacher_wenti2"))
    public ModelAndView action16(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id=Integer.parseInt(req.getParameter("id"));
        //获取账号id
        System.out.println("-------------------->");

        ModelAndView mav=new ModelAndView("personal_question_2");
        teacher_info info =new teacher_info();
        info.setTeacher_id(id);
//        mav.setViewName("personal_photo");
        mav.addObject("t_info",info);
        return  mav;
    }
    @RequestMapping(value=("/teacher_管理"))
    public ModelAndView action17(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id=Integer.parseInt(req.getParameter("id"));
        //获取账号id
        System.out.println("-------------------->");

        ModelAndView mav=new ModelAndView("personal_question_2");
        teacher_info info =new teacher_info();
        info.setTeacher_id(id);
//        mav.setViewName("personal_photo");
        mav.addObject("t_info",info);
        return  mav;
    }



}
