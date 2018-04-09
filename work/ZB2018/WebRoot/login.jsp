<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="style/login/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="style/login/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="style/login/style.css" />
<title>login</title>
</head>
<body>
       <div class="sucaihuo-container">

		<div class="demo form-bg" style="padding: 20px 0;">
		        <div class="container">
		            <div class="row">
		                <div class="col-md-offset-3 col-md-6">
		                    <form class="form-horizontal" action="mainpage" method="post">
		                        <span class="heading">用户登录</span>
		                        <div class="form-group">
		                            <input type="email" class="form-control" id="inputEmail3" name="u_name" placeholder="用户名或电子邮件">
		                            <i class="fa fa-user"></i>
		                        </div>
		                        <div class="form-group help">
		                            <input type="password" class="form-control" id="inputPassword3" name="u_pwd" placeholder="密　码">
		                            <i class="fa fa-lock"></i>
		                            <a href="#" class="fa fa-question-circle"></a>
		                        </div>
		                        <div class="form-group">
		                            <div class="main-checkbox">
		                                <input type="checkbox" value="None" id="checkbox1" name="check"/>
		                                <label for="checkbox1"></label>
		                            </div>
		                            <span class="text">Remember me</span>
		                            <button type="submit" class="btn btn-default">登录</button>
		                        </div>
		                    </form>
		                </div>
		            </div>
		        </div>
		    </div>

		</div>
</body>
</html>