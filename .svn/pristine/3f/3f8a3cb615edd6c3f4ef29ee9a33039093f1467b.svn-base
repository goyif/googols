<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="ThemeBucket">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>Insert title here</title>

<meta name="keywords" content="Modern Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="shouji/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<link href="shouji/css/style.css" rel='stylesheet' type='text/css' />
<link href="shouji/css/font-awesome.css" rel="stylesheet">
<script src="shouji/js/jquery.min.js"></script>
<script src="shouji/js/bootstrap.min.js"></script>



<script type="text/javascript">
function changeImg(){
    //var img = document.getElementById("img"); 
    var dat=new Date();
    //alert(dat);
    //当前日期，从不重复
    $("#imgs").attr("src","${pageContext.request.contextPath }/verify.do?date="+dat);  
}
</script>





</head>
<body id="login">
 <div class="login-logo">
    <a><img src="/images/logo.png" alt=""/></a>
  </div>
  <h2 class="form-heading">login</h2>
  <div class="app-cam">
	  <form action="login.do" method="post" onsubmit="validateCode()">
		<input type="text" class="text" name="companyName" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'E-mail address';}">
		<input type="password" value="Password"  name="companyUser" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}">
	   	验证码： <input type="text" name="verify" />
		<img id="imgs" onclick="changeImg()" src="verify.do"></img>		
		<div class="submit"><input type="submit" onclick="myFunction()" value="Login"></div>
		<div class="login-social-link" align="center">
          <a href="index.html" class="facebook">
              注册
          </a>
      
   </div>
		<ul class="new">
			<li class="new_left"><p><a href="#">Forgot Password ?</a></p></li>
			<li class="new_right"><p class="sign">New here ?<a href="register.html"> Sign Up</a></p></li>
			<div class="clearfix"></div>
		</ul>
	</form>
  </div>
   <div class="copy_layout login">
      <p>Copyright &copy; 2017-12 googol版权  <a href="http://w3layouts.com/" target="_blank">W3layouts</a> </p>
   </div>


</body>
</html>