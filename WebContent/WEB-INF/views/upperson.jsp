<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->

<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->

<!--[if !IE]><!--> <html lang="en" class="no-js"> <!--<![endif]-->

<!-- BEGIN HEAD -->

<head>

	<meta charset="utf-8" />

	<title>个人信息</title>

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
	
	<script src="js/loading.js" type="text/javascript" ></script>


<link href="media/css/loading.css" rel="stylesheet" type="text/css"/>
	

	<link href="media/css/default.css" rel="stylesheet" type="text/css" id="style_color"/>

	<link href="media/css/uniform.default.css" rel="stylesheet" type="text/css"/>

	<!-- END GLOBAL MANDATORY STYLES -->

	<!-- BEGIN PAGE LEVEL STYLES --> 

	<link href="media/css/jquery.gritter.css" rel="stylesheet" type="text/css"/>

	<link href="media/css/daterangepicker.css" rel="stylesheet" type="text/css" />

	<link href="media/css/fullcalendar.css" rel="stylesheet" type="text/css"/>

	<link href="media/css/jqvmap.css" rel="stylesheet" type="text/css" media="screen"/>

	<link href="media/css/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen"/>

	<!-- END PAGE LEVEL STYLES -->

	<link rel="shortcut icon" href="media/image/favicon.ico" />

</head>

<!-- END HEAD -->

<!-- BEGIN BODY -->

<body class="page-header-fixed">

	<!-- BEGIN HEADER -->

	<div class="header navbar navbar-inverse navbar-fixed-top">

		<!-- BEGIN TOP NAVIGATION BAR -->

		<div class="navbar-inner">

			<div class="container-fluid">

				<!-- BEGIN LOGO -->

				<a class="brand" href="manage.do">

				<span style="color:blue">Billi
				
				<span style="color:red">ard</span>

				</a>

				<!-- END LOGO -->

				<!-- BEGIN RESPONSIVE MENU TOGGLER -->

				<a href="javascript:;" class="btn-navbar collapsed" data-toggle="collapse" data-target=".nav-collapse">

				<img src="media/image/menu-toggler.png" alt="" />

				</a>          

				<!-- END RESPONSIVE MENU TOGGLER -->            

				<!-- BEGIN TOP NAVIGATION MENU -->              

				<ul class="nav pull-right">
		
					
					

					<!-- BEGIN USER LOGIN DROPDOWN -->

					<li class="dropdown user">

						<a href="#" class="dropdown-toggle" data-toggle="dropdown">


						<span class="username">${admin.admin_name }</span>

						<i class="icon-angle-down"></i>

						</a>

						<ul class="dropdown-menu">

							

							<li><a href="lock.do"><i class="icon-lock"></i> 锁定系统</a></li>

							<li><a href="remove.do"><i class="icon-key"></i> 注销</a></li>

						</ul>

					</li>

					<!-- END USER LOGIN DROPDOWN -->

				</ul>

				<!-- END TOP NAVIGATION MENU --> 

			</div>

		</div>

		<!-- END TOP NAVIGATION BAR -->

	</div>

	<!-- END HEADER -->
    <div class="copyrights"></div>

	<!-- BEGIN CONTAINER -->

	<div class="page-container">

		<!-- BEGIN SIDEBAR -->

		<div class="page-sidebar nav-collapse collapse">

			<!-- BEGIN SIDEBAR MENU -->        

			<ul class="page-sidebar-menu">

				<li>

					<!-- BEGIN SIDEBAR TOGGLER BUTTON -->

					<div class="sidebar-toggler hidden-phone"></div>

					<!-- BEGIN SIDEBAR TOGGLER BUTTON -->

				</li>

				<li>

			

				</li>

				<li class="start">

					<a href="manage.do">

					<i class="icon-home"></i> 

					<span class="title">系统通知</span>


					</a>

				</li>



				<li >

					<a href="javascript:;">

					<i class="icon-user"></i> 

					<span class="title">管理会员</span>

					<span class="arrow "></span>

					</a>

					<ul class="sub-menu">

						<li  >

							<a href="addmember.do">

							添加会员</a>

						</li>

						<li >

							<a href="viewmember.do">

							查看所有会员</a>

						</li>

						

					</ul>

				</li>

				<li class="last ">

					<a href="preference.do">

					<i class="icon-asterisk"></i> 

					<span class="title">会员优惠信息设置</span>

					</a>

				</li>
				
				
				<li class="last ">

					<a href="reserve.do">

					<i class="icon-bar-chart"></i> 

					<span class="title">预约管理</span>

					</a>

				</li>
				
					<li class="">

					<a href="javascript:;">

					<i class="icon-edit"></i> 

					<span class="title">留言管理</span>

					<span class="arrow "></span>

					</a>

					<ul class="sub-menu">

						<li >

							<a href="message.do">

							<i class="icon-foursquare"></i>

							未读留言</a>

						</li>

						<li >

							<a href="messageread.do">

							<i class="icon-trello"></i>

							已阅留言</a>

						</li>

						
					</ul>

				</li>
				
				
				
				<li class="">

					<a href="javascript:;">

					<i class="icon-briefcase"></i> 

					<span class="title">管理公告</span>

					<span class="arrow "></span>

					</a>

					<ul class="sub-menu">

						<li >

							<a href="addannounce.do">

							<i class="icon-time"></i>

							添加公告</a>

						</li>

						<li >

							<a href="viewannounce.do">

							<i class="icon-cogs"></i>

							查询所有公告</a>

						</li>

						
					</ul>

				</li>

				<li class="">

					<a href="javascript:;">

					<i class="icon-gift"></i> 

					<span class="title">管理台球桌</span>

					<span class="arrow "></span>

					</a>

					<ul class="sub-menu">

						<li >

							<a href="addbilliard.do">

							增加台球桌</a>

						</li>

						<li >

							<a href="viewbilliard.do">

							查询台球桌使用状况</a>

						</li>

						

					</ul>

				</li>

				

				<li class="last ">

					<a href="account.do">

					<i class="icon-tags"></i> 

					<span class="title">管理账单</span>

					</a>

				</li>

				<li class="active">

					<a href="javascript:;">

					<i class="icon-th"></i> 

					<span class="title">修改信息</span>

					<span class="arrow "></span>

					</a>

					<ul class="sub-menu">

						<li class="active">

							<a href="upperson.do">

							修改个人信息</a>

						</li>

						<li >

							<a href="uppassword.do">

							修改密码</a>

						</li>

						

					</ul>

				</li>

			</ul>
			<!-- END SIDEBAR MENU -->

		</div>

		<!-- END SIDEBAR -->

		<!-- BEGIN PAGE -->

		<div class="page-content">

			<!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->

			<div id="portlet-config" class="modal hide">

				<div class="modal-header">

					<button data-dismiss="modal" class="close" type="button"></button>

					<h3>Widget Settings</h3>

				</div>

				<div class="modal-body">

					Widget settings form goes here

				</div>

			</div>

			<!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->

			<!-- BEGIN PAGE CONTAINER-->

			<div class="container-fluid">

				<!-- BEGIN PAGE HEADER-->

				<div class="row-fluid">

					<div class="span12">

						<!-- BEGIN STYLE CUSTOMIZER -->

						<div class="color-panel hidden-phone">

							<div class="color-mode-icons icon-color"></div>

							<div class="color-mode-icons icon-color-close"></div>

							<div class="color-mode">

								<p>主题颜色</p>

								<ul class="inline">

									<li class="color-black current color-default" data-style="default"></li>

									<li class="color-blue" data-style="blue"></li>

									<li class="color-brown" data-style="brown"></li>

									<li class="color-purple" data-style="purple"></li>

									<li class="color-grey" data-style="grey"></li>

									<li class="color-white color-light" data-style="light"></li>

								</ul>

								

							</div>

						</div>

						<!-- END BEGIN STYLE CUSTOMIZER -->    

						<!-- BEGIN PAGE TITLE & BREADCRUMB-->
	<h3 class="page-title">

							个人信息


						</h3>

						<ul class="breadcrumb">

							<li>

								<i class="icon-home"></i>

								<a href="manage.do">主页</a> 

								<span class="icon-angle-right"></span>

							</li>

							<li>

								<a href="#">个人信息</a>

								<span class="icon-angle-right"></span>

							</li>

							<li><a href="#">个人信息</a></li>

						</ul>

					</div>

				</div>

				<!-- END PAGE HEADER-->

						<!-- BEGIN PAGE CONTENT-->

					<div class="tab-pane " id="tab_3">

									<div class="portlet box blue">

										<div class="portlet-title">

											<div class="caption"><i class="icon-reorder"></i>个人信息</div>

											<div class="tools">

												<a href="javascript:;" class="collapse"></a>

												<a href="#portlet-config" data-toggle="modal" class="config"></a>

												<a href="javascript:;" class="reload"></a>


											</div>

										</div>

										<div class="portlet-body form">

											<!-- BEGIN FORM-->

											<div class="form-horizontal form-view">


												<h3 class="form-section">个人信息</h3>

												<div class="row-fluid">

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label" for="firstName">用户名:</label>

															<div class="controls">

																<span class="text">${admin.username }</span>

															</div>

														</div>

													</div>

													<!--/span-->

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label" for="lastName">姓名:</label>

															<div class="controls">

																<span class="text">${admin.admin_name }</span>

															</div>

														</div>

													</div>

													<!--/span-->

												</div>

												<!--/row-->

												<div class="row-fluid">

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label" >联系方式:</label>

															<div class="controls">

																<span class="text">${admin.admin_tel }</span> 

															</div>

														</div>

													</div>

													
												</div>

												
												               

												<h3 class="form-section">台球厅信息</h3>

												<div class="row-fluid">

													<div class="span12 ">

														<div class="control-group">

															<label class="control-label" >台球厅id:</label>

															<div class="controls">

																<span class="text">${admin.billard_id }</span>

															</div>

														</div>

													</div>

												</div>

												<div class="row-fluid">

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label" >名称:</label>

															<div class="controls">

																<span class="text">${admin.billard_name }</span>

															</div>

														</div>

													</div>
													
												</div>

													<!--/span-->
													
														<div class="row-fluid">
													<div class="span6">

														<div class="control-group">

															<label class="control-label" >地址:</label>

															<div class="controls">

																<span class="text">${admin.billard_address }</span>

															</div>

														</div>

													</div>
													</div>

													<!--/span-->


												<!--/row-->           

												<div class="row-fluid">

													<div class="span6 ">

														<div class="control-group">

															<label class="control-label" >简介:</label>

															<div class="controls">

																<span class="text">${admin.synopsis }</span>

															</div>

														</div>

													</div>

													

												</div>

												<div class="form-actions">
													<form action="editperson.do">
													
													<button type="submit" class="btn blue"><i class="icon-pencil"></i> 编辑</button>

													
													
													</form>
												</div>

											</div>

											<!-- END FORM-->  

										</div>

									</div>

								</div>

			<!-- END PAGE CONTAINER-->

		</div>

		<!-- END PAGE -->  

	</div>

	<!-- END CONTAINER -->

		<!-- BEGIN FOOTER -->

	<div class="footer">

		<div class="footer-inner">

			2017 &copy;台球厅管理系统  - 管理员

		</div>

		<div class="footer-tools">

			<span class="go-top">

			<i class="icon-angle-up"></i>

			</span>

		</div>

	</div>

	<!-- END FOOTER -->

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

	<script type="text/javascript" src="media/js/jquery.validate.min.js"></script>

	<script type="text/javascript" src="media/js/additional-methods.min.js"></script>

	<script type="text/javascript" src="media/js/jquery.bootstrap.wizard.min.js"></script>

	<script type="text/javascript" src="media/js/chosen.jquery.min.js"></script>

	<script type="text/javascript" src="media/js/select2.min.js"></script>

	<!-- END PAGE LEVEL PLUGINS -->

	<!-- BEGIN PAGE LEVEL SCRIPTS -->

	<script src="media/js/app.js"></script>

	<script src="media/js/form-wizard.js"></script>     

	<!-- END PAGE LEVEL SCRIPTS -->

<script>

		jQuery(document).ready(function() {       

		   // initiate layout and plugins

		   App.init();

		   FormWizard.init();

		});

	</script>

	<!-- END JAVASCRIPTS -->

</body>

<!-- END BODY -->

</html>