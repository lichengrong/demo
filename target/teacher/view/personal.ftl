<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="renderer" content="webkit"/>
    <meta name="force-rendering" content="webkit"/>
    <title></title>
    <link rel="stylesheet" type="text/css" href="css/layui.css">
    <link type="text/css" rel="stylesheet" href="css/style.css" />
    <script src="https://www.jq22.com/jquery/jquery-1.10.2.js"></script>
    <script type="text/javascript" src="js/banner.js"></script>
    <script type="text/javascript" src="js/layui.js"></script>
</head>

<body>
<div class="topbox">
    <div class="main">
        <!--<p class="ccsl">您好，欢迎访问本站！</p>-->
    </div>
</div>
<div class="clear"></div>
<div class="logo">
    <a href="index.html"><img src="images/logo.png" /></a>
</div>
<div class="clear"></div>
<div class="nav">
    <div class="main">
        <ul>
            <li><a href="action1.do">首页</a></li>
            <li><a href="tutor.html" >家教中心</a></li>
            <li><a href="student.html">学员中心</a></li>
            <li><a href="billing.html">计费详情</a></li>
            <li><a href="information.html">在线资料</a></li>
            <li><a href="teacher_info1.do" class="on">个人中心</a></li>
            <li><a href="contact.html">联系我们</a></li>
        </ul>
    </div>
</div>
<div class="clear"></div>
<div class="banner">
    <div class="b-img">
        <img src="images/banner1.jpg" width="100%"/>
        <img src="images/banner1.jpg" width="100%" />
    </div>
    <div class="clear"></div>
    <div class="b-list"> </div>
</div>
<div class="clear"></div>
<div class="mainWarp">
    <div class="mainleft">
        <div class="typebox">
            <div class="titbox0">
                <p class="ccsl">装修风格</p>
                <span class="ccsl">Decorating style</span>
            </div>
            <ul>
                <li>
                    <div class="typeone"><a>快捷导航</a></div>
                    <div class="typetwo" style="display:block">
                        <a href="teacher_certity1.do?id=${t_info.teacher_id}" class="ccsl">教员认证</a>
                        <a href="teacher_update1.do?id=${t_info.teacher_id}" class="ccsl">信息修改</a>
                    </div>
                </li>
                <li>
                    <div class="typeone"><a>订单管理</a></div>
                    <div class="typetwo">
                        <a href="teacher_apped1.do?id=${t_info.teacher_id}" class="ccsl">被预约查询</a>
                        <a href="teacher_dingdan1.do?id=${t_info.teacher_id}" class="ccsl">订单管理</a>
                    </div>
                </li>
                <li>
                    <div class="typeone"><a>常见问题</a></div>
                    <div class="typetwo">
                        <a href="teacher_wenti1.do?id=${t_info.teacher_id}" class="ccsl">简历审核失败的原因</a>
                        <a href="teacher_wenti2.do?id=${t_info.teacher_id}" class="ccsl">做家教应该注意什么？</a>
                    </div>
                </li>
            </ul>
        </div>
        <div class="lxwm">
            <div class="titbox0">
              <p class="ccsl">联系我们</p>
            </div>
            <div class="con">
              公司名：乐学家教<br />
              联系人：张经理 <br />
              手机：12345678910 <br />
              手机：12345678910（主要负责河北地区）<br />
              Email：12345678910@qq.com
            </div>
        </div>
    </div>
    <div class="mainright">
        <div class="brandnavbox">
            <div class="con"><a href="index.html">首页</a>	> <a href="personal.html">个人中心</a></div>
        </div>
        <div class="detailbox">
            <label>${.now}</label>
            <label>教师编号：${t_info.teacher_id}</label>
            <h1 >HELLO! ${t_info.teacher_name}</h1>
            <h3 >这是您第 ${t_info.teacher_count}次访问次页面</h3>
            <p style="font-family: 微软雅黑;color: red">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp教员您好，您所带家教我们会定期回访家长，了解上课情况，成功率和好评率将影响后续接单和薪资待遇！教员登录时间，决定排名先后。</p>
            <br/>
            <div style="width: 100%;height:250px">
                <div style="width: 100%;height:25px;background-color: #D9D9D9"><p style="text-align: center;line-height:25px;font-family: 微软雅黑;color: #23262E">个人信息</p></div>
                <div style="width: 100%;height: 90%;" >
                    <div style="float: left;width:30%;height:100%;">
                        <img src="${t_info.teacher_photo}" width="50%" height="180px" style="border: 1px black solid;margin-left:10%;margin-top: 5%" /><br/>
                        <a style="margin-left:20%" href="teacher_photo1.do?id=${t_info.teacher_id}">上传照片</a>
                    </div>

                    <div style="float:right;width: 65%;height: 80%;margin-top:5%">
                        <label style="font-size:20px;font-family: 微软雅黑;">教员账号：${t_info.teacher_account}</label>
                        <label style="font-size:20px;font-family: 微软雅黑;margin-left:10%">教员联系方式：${t_info.teacher_iphone}</label><br/><br/>
                        <label style="font-size:20px;font-family: 微软雅黑;">是否认证：${t_info.teacher_certify}</label>
                        <label style="font-size:20px;font-family: 微软雅黑;margin-left:15%">地区：${t_info.teacher_address}</label><br/><br/>
                    </div>




                </div>
            </div>
            <div style="width: 100%;height: 50px;background-color: #f67903">

                <h1 style="font-family: 微软雅黑">提高接单率的&nbsp<label style="font-size: 30px;color: red">4</label>要素</h1>
            </div>
            <img src="images/img12.jpg" width="100%" />

        </div>
    </div>
    <div class="clear"></div>
</div>
<div class="clear"></div>
<div class="fnav">
    <div class="main">
        <a href="index.html">首页</a>
        <a href="tutor.html">家教中心</a>
        <a href="student.html">学员中心</a>
        <a href="billing.html">计费详情</a>
        <a href="information.html">在线资料</a>
        <a href="personal.html">个人中心</a>
        <a href="contact.html">联系我们</a>
    </div>
</div>
<div class="clear"></div>
<div class="footbox">
    <div class="main">
        <div class="con">装饰装修公司是集室内设计、预算、施工、材料于一体的专业化设计公司。<br />
            Copyright © 河北某某家装有限公司 版权所有 技术支持</div>
    </div>
</div>

<!--<script type="text/javascript">-->
<!--    layui.use(['jquery','form','layer'],function(){-->
<!--        var $ =layui.jquery;-->
<!--        var form=layui.form;-->
<!--        var layer=layui.layer;-->
<!--        form.on('submit(formDemo)',function(data){-->
<!--            $.ajax({-->
<!--                url:'update_news',-->
<!--                type:'post',-->
<!--                data:data.field,-->
<!--                success:function(data){-->
<!--                    layer.alert("修改成功",{icon:6},function(){-->
<!--                        var index=parent.layer.getFrameIndex(window.name);-->
<!--                        parent.layer.close(index);-->
<!--                        window.parent.location.reload();-->
<!--                    });-->
<!--                }-->
<!--            });-->
<!--            return false;-->
<!--        });-->
<!--    });-->
<!--</script>-->
</body>
</html>
