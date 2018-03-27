<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->

<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->

<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->

<!-- BEGIN HEAD -->

<head>

	<meta charset="utf-8" />

	<title>锁定</title>

	<meta content="width=device-width, initial-scale=1.0" name="viewport" />

	<meta content="" name="description" />

	<meta content="" name="author" />

	<!-- BEGIN GLOBAL MANDATORY STYLES -->

	<link href="media/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

	<link href="media/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>

	<link href="media/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>

	<link href="media/css/style-metro.css" rel="stylesheet" type="text/css"/>

	<link href="media/css/style.css" rel="stylesheet" type="text/css"/>

	<link href="media/css/style-responsive.css" rel="stylesheet" type="text/css"/>

	<link href="media/css/default.css" rel="stylesheet" type="text/css" id="style_color"/>

	<link href="media/css/uniform.default.css" rel="stylesheet" type="text/css"/>

	<!-- END GLOBAL MANDATORY STYLES -->

	<!-- BEGIN PAGE LEVEL STYLES -->

	<link href="media/css/lock.css" rel="stylesheet" type="text/css"/>

	<!-- END PAGE LEVEL STYLES -->

	<link rel="shortcut icon" href="media/image/favicon.ico" />

</head>

<!-- END HEAD -->

<!-- BEGIN BODY -->

<body>

	<div class="page-lock">

		<div class="page-logo">

			<a class="brand" href="lock.do">

			<img src="media/image/logo-big.png" alt="logo" />

			</a>

		</div>

		<div class="page-body">

			<img class="page-lock-img" src="media/image/profile.jpg" alt="">

			<div class="page-lock-info">

				<h1>${admin.admin_name }</h1>

				<span>*默认为登录密码</span>

				<span><em>已锁定</em></span>

				<form class="form-search" action="lockcheck.do" method="post">

					<div class="input-append">
						<input name="billard_id" type="hidden" value="${admin.billard_id }"></input>
						<input type="password" name="lock_password" class="m-wrap" placeholder="锁屏密码">

						<button type="submit" class="btn blue icn-only"><i class="m-icon-swapright m-icon-white"></i></button>

					</div>
					<br/><br/>
					
						<span style="color:red;font-weight:bold">${error }</span>
						
						
					<div class="relogin">

						<button type="button"  class="btn btn-info btn-sm" data-toggle="modal" data-target="#upDiv">忘记密码</button>
						
						 <button type="button"  class="btn btn-info btn-sm" data-toggle="modal" data-target="#addDiv1">修改密码</button> -->

					</div>

				</form>

			</div>

		</div>
		
		
		<div class="modal fade" id="upDiv" tabindex="-1" role="dialog" aria-labelledby="addDivLabel">  
    <div class="modal-dialog" role="document">  
        <div class="modal-content">  
            <div class="modal-header">  
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span  
                        aria-hidden="true"></span></button>  
                <h4 class="modal-title" id="addDivLabel">忘记密码</h4>  
            </div>  
            <div class="modal-body">  
     		<form action="uplockpass.do" method="post" class="form-group">
  				<table cellpadding="0" cellspacing="0"  class="table table-striped">
  				<input name="billard_id" type="hidden" value="${admin.billard_id }"></input>
  		 			<tr><td>手机号<input type="text" name="admin_tel" /></td></tr>
  		 			<tr><td>姓名<input type="text" name="admin_name" /></td></tr>
  		 			
  		 			<tr><td>新密码<input type="text" name="lock_password" /></td></tr>
  		 			<tr><td><input type="submit" value="提交" /></td></tr>
  		 			
  		 			
  		 			
  					
  				</table>
 			</form>
            </div>  
        </div>  
    </div>  
</div>



					<div class="modal fade" id="addDiv" tabindex="-1" role="dialog" aria-labelledby="addDivLabel">  
    <div class="modal-dialog" role="document">  
        <div class="modal-content">  
            <div class="modal-header">  
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span  
                        aria-hidden="true"></span></button>  
                <h4 class="modal-title" id="addDivLabel">修改密码</h4>  
            </div>  
            <div class="modal-body">  
     		<form action="uplockpass.do" method="post" class="form-group">
  				<table cellpadding="0" cellspacing="0"  class="table table-striped">
  				<input name="billard_id" type="hidden" value="${admin.billard_id }"></input>
  		 			<tr><td>手机号<input type="text" name="admin_tel" /></td></tr>
  		 			<tr><td>姓名<input type="text" name="admin_name" /></td></tr>
  		 			
  		 			<tr><td>新密码<input type="text" name="lock_password" /></td></tr>
  		 			<tr><td><input type="submit" value="提交" /></td></tr>
  		 			
  		 			
  		 			
  					
  				</table>
 			</form>
            </div>  
        </div>  
    </div>  
</div>

		

		<div class="page-footer">

			2013 &copy; Metronic. Admin Dashboard Template.

		</div>

	</div>

	<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->

	<!-- BEGIN CORE PLUGINS -->

	<script src="media/js/jquery-1.10.1.min.js" type="text/javascript"></script>

	<script src="media/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>

	<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->

	<script src="media/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>      

	<script src="media/js/bootstrap.min.js" type="text/javascript"></script>

	<!--[if lt IE 9]>

	<script src="media/js/excanvas.min.js"></script>

	<script src="media/js/respond.min.js"></script>  

	<![endif]-->   

	<script src="media/js/jquery.slimscroll.min.js" type="text/javascript"></script>

	<script src="media/js/jquery.blockui.min.js" type="text/javascript"></script>  

	<script src="media/js/jquery.cookie.min.js" type="text/javascript"></script>

	<script src="media/js/jquery.uniform.min.js" type="text/javascript" ></script>

	<!-- END CORE PLUGINS -->

	<!-- BEGIN PAGE LEVEL PLUGINS -->

	<script src="media/js/jquery.backstretch.min.js" type="text/javascript"></script>

	<!-- END PAGE LEVEL PLUGINS -->   

	<script src="media/js/app.js"></script>  

	<script src="media/js/lock.js"></script>      

	<script>

		jQuery(document).ready(function() {    

		   App.init();

		   Lock.init();

		});

	</script>

	<!-- END JAVASCRIPTS -->

</body>

<!-- END BODY -->

</html>