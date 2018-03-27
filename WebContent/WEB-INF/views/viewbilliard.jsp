<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>   
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

	<title>查询台球桌使用状况</title>

	<meta content="width=device-width, initial-scale=1.0" name="viewport" />

	<meta content="" name="description" />

	<meta content="" name="author" />

	<!-- BEGIN GLOBAL MANDATORY STYLES -->

	<link href="media/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>


	<script src="js/loading.js" type="text/javascript" ></script>


<link href="media/css/loading.css" rel="stylesheet" type="text/css"/>

	<link href="media/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>

	<link href="media/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>

	<link href="media/css/style-metro.css" rel="stylesheet" type="text/css"/>

	<link href="media/css/style.css" rel="stylesheet" type="text/css"/>

	<link href="media/css/style-responsive.css" rel="stylesheet" type="text/css"/>

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

				<li class="active">

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

						<li class="active">

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

				<li class="">

					<a href="javascript:;">

					<i class="icon-th"></i> 

					<span class="title">修改信息</span>

					<span class="arrow "></span>

					</a>

					<ul class="sub-menu">

						<li >

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

							管理台球桌

							 <small>查询台球桌使用状况</small>

						</h3>

						<ul class="breadcrumb">

							<li>

								<i class="icon-home"></i>

								<a href="manage.do">主页</a> 

								<span class="icon-angle-right"></span>

							</li>

							<li>

								<a href="#">管理台球桌</a>

								<span class="icon-angle-right"></span>

							</li>

							<li><a href="#">查询台球桌使用状况</a></li>

						</ul>

					</div>

				</div>

				<!-- END PAGE HEADER-->

				<!-- BEGIN PAGE CONTENT-->

	<div class="row-fluid">

					<div class="span12">

						

						<div class="portlet box blue">

							<div class="portlet-title">

								<div class="caption"><i class="icon-coffee"></i>查询</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>


								</div>

							</div>

							<div class="portlet-body">
								<form action="adminselect.do">
								<table >

							


										<tr class="odd gradeX">

											<td>使用状况</td>

											<td><select name="station"  >

										<option value="1" ${status==1?'selected':'' }>未使用</option>

										<option value="2" ${status==2?'selected':'' }>使用中</option>
										
										
										<option value="3" ${status==3?'selected':'' }>会员使用中</option>

									</select></td>
									
									<td>台球桌号</td>
													
							
									<td><select name="billiardid" >
									
										<option value="0" selected>全部</option>
										<c:forEach var="billiard" items="${billiard_list }">
										
												<option value="${billiard }" <c:if test="${billiard eq  billiardid}">selected</c:if>>${billiard }</option>										
										
										</c:forEach>
												
									</select></td>

											<td colspan="2" >	<div class="portlet-body">
								<p>
									<button type="submit" class="btn blue btn-block">查询 <i class="m-icon-swapright m-icon-white"></i></button>
							
								</p>
							
							</div></td>


										</tr>


								</table>
								</form>

							</div>

						</div>
						

						<!-- 		<table class="table table-striped table-bordered table-hover" id="sample_1">

									<thead>

										<tr>

											<th style="width:8px;"></th>

											<th>台球桌号</th>

											<th class="hidden-480">价格</th>

											<th class="hidden-480">位置</th>

											
											<th class="hidden-480">开始使用</th>

											

										</tr>

									</thead>

									<tbody>

										<tr class="odd gradeX">

											<td><input type="radio" name="radio" class="radio" value="" /></td>

											<td>shuxer</td>

											<td class="hidden-480"><a href="mailto:shuxer@gmail.com">shuxer@gmail.com</a></td>

											<td class="hidden-480">120</td>

											<td class="center hidden-480">12 Jan 2012</td>
											


										</tr>

									</tbody>

								</table> -->
								
								
								
								<table class="table table-striped table-bordered table-hover" id="sample_1">

								

									<tbody>
									
									<c:if test="${ !empty nouseInfo_list }">
										
											<thead>
								
										<tr>
											<th style="width:8px;"></th>
											
											<th>台球桌号</th>

											<th class="hidden-480">单价(元/小时)</th>

											<th class="hidden-480">位置</th>

											<th class="hidden-480">下个预约时间</th>
						
										
											

										</tr>
								
									</thead>
									
									<c:forEach var="noUseinfo" items="${nouseInfo_list }">
									
										<tr class="odd gradeX">

											<td><input type="radio" name="nouse"  value="${noUseinfo.billiard_id }" /></td>
											
											<td>${noUseinfo.billiard_id }</td>

											<td class="hidden-480">${noUseinfo.price }</td>

											<td class="hidden-480">${noUseinfo.location }</td>

											
										<c:if test="${ empty noUseinfo.reserve}">
											
													<td class="center hidden-480"><span style="color:red"> 此桌没有被预约</span></td>
											
													
											</c:if>
											
												<c:if test="${ !empty noUseinfo.reserve}">
												
									<td class="center hidden-480">
											<fmt:formatDate value="${noUseinfo.reserve.reserve_start }" pattern="yyyy/MM/dd HH:mm:ss"/></td>
											
											</c:if>
													
													
										</tr>
										
									</c:forEach>
									<button type="button"
											class="btn green " id="user" >普通用户使用</button>
											 <button type="button"
											class="btn red " id="member"
											  >会员使用</button>
											 
									
									</c:if>
									
									<c:if test="${ !empty noUseinfo }">
										
											<thead>
								
										<tr>
											<th style="width:8px;"></th>
											
											<th>台球桌号</th>

											<th class="hidden-480">单价(元/小时)</th>

											<th class="hidden-480">位置</th>

											<th class="hidden-480">下个预约时间</th>
						
											
											

										</tr>
								
									</thead>
									
									
									
										<tr class="odd gradeX">

											<td><input type="radio" name="nouse"  value="${noUseinfo.billiard_id }" /></td>
											
											<td>${noUseinfo.billiard_id }</td>

											<td class="hidden-480">${noUseinfo.price }</td>

											<td class="hidden-480">${noUseinfo.location }</td>

											
											
											
											<c:if test="${ empty noUseinfo.reserve}">
											
											<td class="center hidden-480"><span style="color:red"> 此桌没有被预约</span></td>
											
											
																								
											</c:if>
											
											<c:if test="${ !empty noUseinfo.reserve}">
												
									<td class="center hidden-480">
											<fmt:formatDate value="${noUseinfo.reserve.reserve_start }" pattern="yyyy/MM/dd HH:mm:ss"/></td>
											
											
											
											</c:if>
											
										
											
										</tr>
										
								<button type="button"
											class="btn green " id="user" >普通用户使用</button>
											 <button type="button"
											class="btn red " id="member"
											  >会员使用</button>
									
									</c:if>
									
									
									
										<c:if test="${ !empty use_list }">
										
											<thead>
								
										<tr>

											<th style="width:8px;"></th>
											<th>使用编号</th>

											<th class="hidden-480">使用者姓名</th>

											<th class="hidden-480">台球桌号</th>

											<th class="hidden-480">单价(元/小时)</th>
											
											<th class="hidden-480">使用开始时间</th>
											
											
											

										</tr>
								
									</thead>
									
									<c:forEach var="userinfo" items="${use_list }">
									
										<tr class="odd gradeX">

											<td><input type="radio" name="use" id="use"  value="${userinfo.use_id }" /></td>
											
											<td>${userinfo.use_id }</td>

											<td class="hidden-480">${userinfo.user_name }</td>

											<td class="hidden-480">${userinfo.billard_id }</td>

											<td class="center hidden-480">${userinfo.price }</td>
											
											<td class="center hidden-480"><fmt:formatDate value="${userinfo.use_start }" pattern="yyyy/MM/dd HH:mm:ss"/></td>
											
											
										</tr>
										
									</c:forEach>
									<button type="button"
											class="btn green " id="account" >结算</button>
											 
									
									</c:if>
									
									
									
									
									<c:if test="${ !empty userinfo }">
									
										<thead>
								
										<tr>

											<th style="width:8px;"></th>
											
											<th>使用编号</th>

											<th class="hidden-480">使用者姓名</th>

											<th class="hidden-480">台球桌号</th>

											<th class="hidden-480">单价(元/小时)</th>
											
											<th class="hidden-480">使用开始时间</th>
											
											
											

										</tr>
								
									</thead>
									
									
										<tr class="odd gradeX">
											<td><input type="radio" name="use" id="use"  value="${userinfo.use_id }" /></td>
											
											<td>${userinfo.use_id }</td>

											<td class="hidden-480">${userinfo.user_name }</td>

											<td class="hidden-480">${userinfo.billard_id }</td>

											<td class="center hidden-480">${userinfo.price }</td>
											
											<td class="center hidden-480"><fmt:formatDate value="${userinfo.use_start }" pattern="yyyy/MM/dd HH:mm:ss"/></td>
											
											

										</tr>
										
										<button type="button"
											class="btn green " id="account" >结算</button>

									</c:if>
								
									<c:if test="${ !empty memUse_list }">
										
											<thead>
								
										<tr>

											<th style="width:8px;"></th>
											
											<th>使用编号</th>

											<th class="hidden-480">使用者id</th>

											<th class="hidden-480">台球桌号</th>
											
											<th class="hidden-480">使用开始时间</th>
											
											<th class="hidden-480">预约结束时间</th>
											
											<th class="hidden-480">单价(元/小时)</th>
											
											<th class="hidden-480">余额</th>
											
											<th class="hidden-480">会员等级</th>
											
											<th class="hidden-480">优惠折扣</th>
											
										
											

										</tr>
								
									</thead>
									
									<c:forEach var="memUse" items="${memUse_list }">
									
										<tr class="odd gradeX">

											<td><input type="radio" name="memuse" id="memuse"  value="${memUse.account_id }" /></td>
											<td>${memUse.account_id }</td>

											<td class="hidden-480">${memUse.member_id }</td>

											<td class="hidden-480">${memUse.billiard_id }</td>

											
											<td class="center hidden-480"><fmt:formatDate value="${memUse.account_start }" pattern="yyyy/MM/dd HH:mm:ss"/></td>
											
											<c:if test="${empty memUse.account_end }">
											<td class="center hidden-480">无</td>
											</c:if>
											<c:if test="${!empty memUse.account_end }">
											<td class="center hidden-480"><fmt:formatDate value="${memUse.account_end }" pattern="yyyy/MM/dd HH:mm:ss"/></td>
											</c:if>
											<td class="center hidden-480">${memUse.price }</td>
											
											<td class="center hidden-480">${memUse.member.balance }</td>
											
											<td class="center hidden-480">${memUse.member.grade }</td>
											
											<td class="center hidden-480">${memUse.discount }</td>
											
										</tr>
										
									</c:forEach>
									
									<button type="button"
											class="btn red " id="memAccount" >结算</button>
									
									</c:if>
									
									<c:if test="${ !empty memUse }">
									
										<thead>
								
										<tr>

											<th style="width:8px;"></th>
											
											<th>使用编号</th>

											<th class="hidden-480">使用者id</th>

											<th class="hidden-480">台球桌号</th>
											
											<th class="hidden-480">使用开始时间</th>
											
											<th class="hidden-480">预约结束时间</th>
											
											<th class="hidden-480">单价(元/小时)</th>
											
											<th class="hidden-480">余额</th>
											
											<th class="hidden-480">会员等级</th>
											
											<th class="hidden-480">优惠折扣</th>
											
										
										</tr>
								
									</thead>
									
										<tr class="odd gradeX">

											<td><input type="radio" name="memuse" id="memuse"  value="${memUse.account_id }" /></td>
											<td>${memUse.account_id }</td>

											<td class="hidden-480">${memUse.member_id }</td>

											<td class="hidden-480">${memUse.billiard_id }</td>

											
											<td class="center hidden-480"><fmt:formatDate value="${memUse.account_start }" pattern="yyyy/MM/dd HH:mm:ss"/></td>
											
											<c:if test="${empty memUse.account_end }">
											<td class="center hidden-480">无</td>
											</c:if>
											<c:if test="${!empty memUse.account_end }">
											<td class="center hidden-480"><fmt:formatDate value="${memUse.account_end }" pattern="yyyy/MM/dd HH:mm:ss"/></td>
											</c:if>
											
											<td class="center hidden-480">${memUse.price }</td>
											
											<td class="center hidden-480">${memUse.member.balance }</td>
											
											<td class="center hidden-480">${memUse.member.grade }</td>
											
											<td class="center hidden-480">${memUse.discount }</td>
											
										</tr>
										<button type="button"
											class="btn red " id="memAccount" >结算</button>
									
									</c:if>
									
									
									<div >
									<span class="form-control" id="message" 
									
									 ></span>
								
									
									</div>
									
									</tbody>
								</table>
								
						

							</div>

						</div>

						<!-- END EXAMPLE TABLE PORTLET-->

					</div>

				</div>

				

					</div>

				</div>

				<!-- END PAGE CONTENT-->

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

	<script src="media/js/jquery.vmap.js" type="text/javascript"></script>   

	<script src="media/js/jquery.vmap.russia.js" type="text/javascript"></script>

	<script src="media/js/jquery.vmap.world.js" type="text/javascript"></script>

	<script src="media/js/jquery.vmap.europe.js" type="text/javascript"></script>

	<script src="media/js/jquery.vmap.germany.js" type="text/javascript"></script>

	<script src="media/js/jquery.vmap.usa.js" type="text/javascript"></script>

	<script src="media/js/jquery.vmap.sampledata.js" type="text/javascript"></script>  

	<script src="media/js/jquery.flot.js" type="text/javascript"></script>

	<script src="media/js/jquery.flot.resize.js" type="text/javascript"></script>

	<script src="media/js/jquery.pulsate.min.js" type="text/javascript"></script>

	<script src="media/js/date.js" type="text/javascript"></script>

	<script src="media/js/daterangepicker.js" type="text/javascript"></script>     

	<script src="media/js/jquery.gritter.js" type="text/javascript"></script>

	<script src="media/js/fullcalendar.min.js" type="text/javascript"></script>

	<script src="media/js/jquery.easy-pie-chart.js" type="text/javascript"></script>

	<script src="media/js/jquery.sparkline.min.js" type="text/javascript"></script>  

	<!-- END PAGE LEVEL PLUGINS -->

	<!-- BEGIN PAGE LEVEL SCRIPTS -->

	<script src="media/js/app.js" type="text/javascript"></script>

	<script src="media/js/index.js" type="text/javascript"></script>        

	<!-- END PAGE LEVEL SCRIPTS -->  

	<script>
$(document).ready(function() { 

var start = "${start}";
var end = "${end}";
var  during = "${during}";
var price = "${price}";

if(start!=null && start !=""){

alert(111);
alert(start+end+during+price);
}

 $("#user").click(function() {  
    
   
        var val=$('input:radio[name="nouse"]:checked').val(); 
         if(val==null){
                alert("请选择使用桌号!");
                return false;
            }
            else{
               beginUse(val);
            }
    });  

$("#member").click(function() {  
    
   
        var val=$('input:radio[name="nouse"]:checked').val(); 
         if(val==null){
                alert("请选择使用桌号!");
                return false;
            }
            else{
               MembeginUse(val);	
            }  
    }); 



 $("#account").click(function() {  
		
		
   
        var val=$('input:radio[name="use"]:checked').val(); 
        
      
         if(val==null){
                alert("请选择使用桌号!");
                return false;
            }
            else{
            
      
               account(val);
            }
    });  

 $("#memAccount").click(function() {  

   
        var val=$('input:radio[name="memuse"]:checked').val(); 
        	
        
         if(val==null){
                alert("请选择使用桌号!");
                return false;
            }
            else{
               memaccount(val);
            }
    });  



});




     function showPopover(target, msg) {
  target.attr("data-original-title", msg);
  $('[data-toggle="tooltip"]').tooltip();
  target.tooltip('show');
  target.focus();
  //2秒后消失提示框
  var id = setTimeout(
    function () {
      target.attr("data-original-title", "");
      target.tooltip('hide');
    }, 4000
  );
}
var message = "${message}";
if(message!=null && message!=""){

showPopover($("#message"),message);
}
     
     
		jQuery(document).ready(function() {    

		   App.init(); // initlayout and core plugins

		   Index.init();

		   Index.initJQVMAP(); // init index page's custom scripts

		   Index.initCalendar(); // init index page's custom scripts

		   Index.initCharts(); // init index page's custom scripts

		   Index.initChat();

		   Index.initMiniCharts();

		   Index.initDashboardDaterange();

		   Index.initIntro();

		});
		
function account(val){
	window.location.href="getaccount.do?use_id="+val+"";	
}

function memaccount(val){
	window.location.href="getMemaccount.do?account_id="+val+"";	
}

function beginUse(billiard){
	
	var name = window.prompt("请填写用户姓名","");
	
	
	
	if(name!=null && name!=""){
		
	window.location.href="beginUse.do?billiard="+billiard+"&user_name="+name+"";	
	}else{
	
			alert("请输入用户姓名");
	}
}


function MembeginUse(billiard){
	
	var name = window.prompt("请填写会员id","");
	
	
	
	if(name!=null && name!=""){
		
		$.ajax( {
	
		type: "POST",
		url: "checkMemberid.do?member_id="+name+"",

		success : function(data) {
		    
			if(data !=""){
				alert(data);
				window.location.href="MembeginUse.do?billiard="+billiard+"&member_tel="+name+"";
			}else{
				alert("会员id输入有误");
			}
		},
		error :function(XMLHttpRequest, textStatus, errorThrown){
			alert(XMLHttpRequest.status);
			alert(XMLHttpRequest.readyState);
 			alert(textStatus);
			
		}
	});
		
	}else{
	
			alert("请输入用户手机号");
	}
}



	</script>

	<!-- END JAVASCRIPTS -->

</body>

<!-- END BODY -->

</html>