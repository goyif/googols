<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Googol</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/libraries/jquery/jquery-3.2.1.js"></script>
<!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
<script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
<script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>

<link rel="stylesheet" href="${pageContext.request.contextPath}/libraries/layui-v2.2.3/layui/css/layui.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/libraries/layui-v2.2.3/layui/css/app.css" media="all">
<script type="text/javascript" src="${pageContext.request.contextPath}/libraries/layui-v2.2.3/layui/layui.js"></script>
</head>
<body>
    <div class="layui-layout layui-layout-admin kit-layout-admin">
        <div class="layui-header">
            <div class="layui-logo">GOOGOL</div>
            <div class="layui-logo kit-logo-mobile">GOOGOL</div>
            <ul class="layui-nav layui-layout-left kit-nav">
                <li class="layui-nav-item"><a href="#">控制台</a></li>
                <li class="layui-nav-item"><a href="#">主题管理</a></li>
                <li class="layui-nav-item"><a href="#" id="pay"><i class="fa fa-gratipay" aria-hidden="true"></i>联系我们</a></li>
                <li class="layui-nav-item">
                    <a href="#">其它系统</a>
                    <dl class="layui-nav-child">
                        <dd><a href="#">消息管理</a></dd>
                        <dd><a href="#">授权管理</a></dd>
                    </dl>
                </li>
            </ul>
            <ul class="layui-nav layui-layout-right kit-nav">
                <li class="layui-nav-item">
                    <a href="#">
                        <img src="${pageContext.request.contextPath}/img/-48c1234bd4e2e995.jpg" class="layui-nav-img"> Van
                    </a>
                    <dl class="layui-nav-child">
                        <dd><a href="#">基本资料</a></dd>
                        <dd><a href="#">修改密码</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="#"><i class="fa fa-sign-out" aria-hidden="true"></i>注销</a></li>
            </ul>
        </div>

        <div class="layui-side layui-bg-black kit-side">
            <div class="layui-side-scroll">
                <div class="kit-side-fold"><i class="fa fa-navicon" aria-hidden="true"></i></div>
                <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
                <ul class="layui-nav layui-nav-tree" lay-filter="kitNavbar" kit-navbar>
                    <li class="layui-nav-item">
                        <a class="" href="#"><i class="fa fa-plug" aria-hidden="true"></i><span>主操作</span></a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="#" kit-target data-options="{url:'${pageContext.request.contextPath}/page/user/userList.jsp',icon:'&#xe6c6;',title:'用户管理',id:'1'}">
                                    <i class="layui-icon">&#xe6c6;</i><span> 用户管理</span></a>
                            </dd>
                            <dd>
                                <a href="#" data-url="#" data-icon="&#xe628;" data-title="订单管理"  kit-target data-id='2'><i class="layui-icon" aria-hidden="true">&#xe6c6;</i><span> 订单管理</span></a>
                            </dd>
                            <dd>
                                <a href="#" data-url="#" data-icon="&#xe628;"  data-title="消费者管理" kit-target data-id='3'><i class="layui-icon">&#xe658;</i><span> 消费者管理</span></a>
                            </dd>
                            <dd>
                                <a href="#" kit-target data-options="{url:'https://www.baidu.com',icon:'&#xe658;',title:'百度一下',id:'5'}"><i class="layui-icon">&#xe658;</i><span> 百度一下</span></a>
                            </dd>
                        </dl>
                    </li>
                    <li class="layui-nav-item layui-nav-itemed">
                        <a href="#"><i class="fa fa-plug" aria-hidden="true"></i><span>组件</span></a>
                        <dl class="layui-nav-child">
                            <dd><a href="#" kit-target data-options="{url:'navbar.html',icon:'&#xe658;',title:'Navbar',id:'6'}"><i class="layui-icon">&#xe658;</i><span>Navbar</span></a></dd>
                            <dd><a href="#" kit-target data-options="{url:'tab.html',icon:'&#xe658;',title:'TAB',id:'7'}"><i class="layui-icon">&#xe658;</i><span> Tab</span></a></dd>
                            <dd><a href="#" kit-target data-options="{url:'onelevel.html',icon:'&#xe658;',title:'OneLevel',id:'50'}"><i class="layui-icon">&#xe658;</i><span> OneLevel</span></a></dd>
                            <dd><a href="#" kit-target data-options="{url:'app.html',icon:'&#xe658;',title:'App',id:'8'}"><i class="layui-icon">&#xe658;</i><span> app.js主入口</span></a></dd>
                        </dl>
                    </li>
                    <li class="layui-nav-item">
                        <a href="#" data-url="#" data-name="table" kit-loader><i class="fa fa-plug" aria-hidden="true"></i><span> 表格(page)</span></a>
                    </li>
                    <li class="layui-nav-item">
                        <a href="#" data-url="#" data-name="form" kit-loader><i class="fa fa-plug" aria-hidden="true"></i><span> 表单(page)</span></a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="layui-body" id="container">
            <!-- 内容主体区域 -->
            <div style="padding: 15px;">主体内容加载中,请稍等...</div>
        </div>

        <div class="layui-footer">
            <!-- 底部固定区域 -->
            2017 &copy;
            GOOGOL thebo
        </div>
    </div>
    <script type="text/javascript">
        var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");
        document.write(unescape("%3Cspan id='cnzz_stat_icon_1264021086'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "s22.cnzz.com/z_stat.php%3Fid%3D1264021086%26show%3Dpic1' type='text/javascript'%3E%3C/script%3E"));
    </script>
    <script>
        var message;
        layui.config({
            base: '${pageContext.request.contextPath}/libraries/indexTemplate/build/js/'
        }).use(['app', 'message'], function() {
            var app = layui.app,
                $ = layui.jquery,
                layer = layui.layer;
            //将message设置为全局以便子页面调用
            message = layui.message;
            //主入口
            app.set({
                type: 'iframe'
            }).init();
            $('#pay').on('click', function() {
                layer.open({
                    title: false,
                    type: 1,
                    content: '<img src="${pageContext.request.contextPath}/libraries/indexTemplate/build/images/about.png" />',
                    area: ['282px', '289px'],
                    shadeClose: true
                });
            });
        });
    </script>
</body>
</html>
