<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="renderer" content="webkit"/>
    <meta name="force-rendering" content="webkit"/>
    <title></title>
    <link type="text/css" rel="stylesheet" href="css/style.css" />
    <link rel="stylesheet" type="text/css" href="layui/css/layui.css">
    <script type="text/javascript" src="layui/layui.js"></script>
    <script src="https://www.jq22.com/jquery/jquery-1.10.2.js"></script>
    <script type="text/javascript" src="js/banner.js"></script>

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
            <script type="text/html" id="barPerson">
                {{#  if(d.tappointmented_condition != '拒绝'){ }}
                <a class="layui-btn layui-btn-xs" lay-event="reply"><i class="layui-icon">&#xe63a;</i>  接受</a>
                <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del"><i class="layui-icon">&#xe640;</i>  拒绝</a>

                {{#  } }}
            </script>
            <table id="demo" lay-filter="test"></table>



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


</body>
<script>
    layui.use('table', function () {
        var table = layui.table;
        var laypage=layui.laypage;
        var layer=layui.layer;
        //第一个实例
        table.render({
            elem : '#demo',
            method:'post',
            page:true,
            limits:[5,10,20],
            url : 'http://localhost:8080/teacher/teacher_apped3.do?id=${t_info.teacher_id}', //数据接口
            totalRow : true,
            cols : [ [ //表头
              {
                    field : 'tappointmented_id',
                    title : '编号',
                    sort : true,
                    width : 80,
                    fixed : 'left',
                    align : 'center'
                }, {
                    field : 'tappointmented_time',
                    title : '时间',
                    width : 200,
                    align : 'center'
                }, {
                    field : 'tappointmented_subject',
                    title : '预约科目',
                    sort : true,
                    width : 100,
                    align : 'center'
                }, {
                    field : 'tappointmented_address',
                    title : '预约地点',
                    width : 150,
                    align : 'center'
                }, {
                    field : 'tappointmented_condition',
                    title : '状态',
                    width : 80,
                    align : 'center'
                }, {
                    field : 'student_id',
                    title : '学员id',
                    align : 'center',
                    width : 80,
                    style :'color:gray'
                },  {
                    fixed : 'right',
                    title : '操作',
                    width:160,
                    toolbar : '#barPerson',
                    align : 'center'
                } ] ], parseData: function (res) { //将原始数据解析成 table 组件所规定的数据
                return {
                    "code": res.code, //解析接口状态
                    "msg": res.msg, //解析提示文本
                    "count": res.total, //解析数据长度
                    "data": res.rows.item //解析数据列表
                };
            },
            request: {
                pageName: 'page' // 页码的参数名称，默认：page
                , limitName: 'size' //每页数据量的参数名，默认：limit
            },
        });
    });
    //编辑数据
    layui.use(['form','layer','table','jquery'],function(){
        var form=layui.form,layer=layui.layer,table=layui.table,$=layui.jquery;
        //监听行工具事件
        table.on('tool(test)',function(obj){
            var str=JSON.stringify(obj);
            var event=obj.event;
            var data=obj.data;
            if(event ==='reply'){
                layer.confirm('真得接受预约Id为：'+data.student_id+'的学员吗?',function(){
                    $.ajax({

                        url:'teacher_apped5',
                        type:'get',
                        data:{"messId":data.tappointmented_id,"msssubject":data.tappointmented_subject,"mssaddress":data.tappointmented_address,"mssstudent":data.student_id,"mssteacher":data.teacher_id},
                        success:function(data) {
                            layer.msg("预约成功", {icon: 6, time: 850});
                            setTimeout('window.location.reload()', 500);
                        },error:function (data) {
                            layer.msg("预约成功", {icon: 6, time: 850});
                            setTimeout('window.location.reload()', 500);
                        }

                    });

                });
            }
           else{
                layer.confirm('真得拒绝预约Id为：'+data.student_id+'的学员吗?',function(){
                    $.ajax({

                        url:'teacher_apped4',
                        type:'get',
                        data:{"messId":data.tappointmented_id},
                        success:function(data){
                            //layer.msg(data.megId);
                            layer.msg("拒绝成功",{icon: 6,time: 	850});
                            setTimeout('window.location.reload()',500);
                        },error:function (data) {
                            layer.msg("拒绝成功", {icon: 6, time: 850});
                            setTimeout('window.location.reload()', 500);
                        }
                    });
                });
            }
        });
    });




</script>
</html>