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
    <style>
        #yy{font-family:'微软雅黑'!important;margin:0;padding:0;list-style:none;}
        input{margin:10px;padding:3px 2px;width: 400px;height:30px;}
        #cc{display: inline-block;font-size: 14px;}
        .ingreen{color:green;}
        .inred{color:red;border:none;background: none;}
        span{display: inline-block;width: 60px;text-align:center;}
    </style>
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
                        <a href="product.html" class="ccsl">北欧风格</a>
                        <a href="product.html" class="ccsl">北欧风格</a>
                    </div>
                </li>
                <li>
                    <div class="typeone"><a>个人中心</a></div>
                    <div class="typetwo">
                        <a href="product.html" class="ccsl">美式风格</a>
                        <a href="product.html" class="ccsl">美式风格</a>
                        <a href="product.html" class="ccsl">美式风格</a>
                    </div>
                </li>
            </ul>
        </div>
        <div class="lxwm">
            <!--<div class="titbox0">
              <p class="ccsl">联系我们</p>
            </div>
            <div class="con">
              公司名：河北某某家装有限公司<br />
              联系人：张经理 <br />
              手机：12345678910 <br />
              手机：12345678910（主要负责河北地区）<br />
              Email：12345678910@qq.com
            </div>-->
        </div>
    </div>
    <div class="mainright">
        <div class="brandnavbox">
            <div class="con"><a href="index.html">首页</a>	> <a href="personal.html">个人中心</a></div>
        </div>
        <div class="detailbox">
            <label>${.now}</label>
            <form id="yy" style="margin-left: 20%" action="teacher_certity2.do?id=${t_info.teacher_id}" method="post">
                <ul id="ocheck">
                    <li><span>身份证号:</span><input type="text" class="oChxm" placeholder="最多输入6个字符" name="idcard" /><div id="cc" class="" type="text" ></div></li>
                    <li><span>教员学校:</span><input type="text" class="oChphone"  placeholder="与学信网一致" name="school"/><div id="cc" class="" type="text" ></div></li>
                    <li><span>教员学号:</span><input type="text" class="oChQQ" placeholder="与学信网一致" name="xuehao"/><div id="cc" class="" type="text" ></div></li>
                    <li><span>学科填写:</span><input type="text" class="oChphone"  placeholder="学科" name="subject"/><div id="cc" class="" type="text" ></div></li>
                    <li><span>是否在校:</span><input type="text" class="oChphone"  placeholder="是或否" name="ynschool"/><div id="cc" class="" type="text" ></div></li>
                    <li><span>第一学历:</span><input type="text" class="oChphone"  placeholder="第一学历" name="xueli"/><div id="cc" class="" type="text" ></div></li>
                    <li><span>教师资格证id:</span><input type="text" class="oChmail" placeholder="可以不填" name="certificate"/><div  id="cc" class="" type="text" ></div></li>
                    <li><input type="submit" value="提交" class="oCheckSbumit" style="width: 100px;margin-left:10%" /><input id="btn" type="button" value="校验" style="width: 100px"/></li>
                </ul>
            </form>



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