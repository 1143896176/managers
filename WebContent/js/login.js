
$(document).ready(function(){   
      
	if ($.cookie("rmbUser") == "true") {  
		
		var username = $.cookie("username");
		var password = $.cookie("password");
		 $.ajax({  
	            type : 'post',  
	            url : 'login1.do',  
	            data : {  
	                "username" : username,  
	                "password" : /*$.md5(password)*/password
	            },  
	            success : function(data) {  
	                //'0'失败,'1'成功  
	                if(data==1){
	                	  
	             
	          		  $("#username").val($.cookie("username"));  
	          		  $("#password").val($.cookie("password"));  
	          		$("#remember").attr("checked", true);
	          		    
	                	 
	                }
	                else{
	                	 $.cookie("rmbUser", "false", { expire: -1 });  
	              	    $.cookie("username", "", { expires: -1 });  
	              	    $.cookie("password", "", { expires: -1 });  
	                }
	            }  
	        });  
     	   
     	  
	}
});  

/**  
 * 更换图片  
 */  
function changeImg() {  
    var imgSrc = $("#imgObj");  
    var src = imgSrc.attr("src");  
    imgSrc.attr("src", chgUrl(src));  
};  
/**  
 * 时间戳    
 * 为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳   
 */  
function chgUrl(url) {  
    var timestamp = (new Date()).valueOf();  
    var stamp = $("#timestamp");  
//    alert(url);  
    url = url.substring(0, 68);  
    if ((url.indexOf("&") >= 0)) {  
        url = url + "×tamp=" + timestamp;  
    } else {  
        url = url + "?timestamp=" + timestamp;  
        stamp.val(timestamp);  
    }  
    return url;  
};  
/**  
 * 提交  
 */  
function clickeBut(){  
    //帐号  
    var username = $("#username").val().trim();  
    //密码  
    var password = $("#password").val().trim();  
    //验证码  
    var imageContent = $("#imageContent").val().trim(); 
    if(username.length == 0){  
        $("#message").text("请输入帐号");  
        return false;  
    }  
//  console.log(password);  
      
    if(password.length == 0){  
        $("#message").text("请输入密码");  
        return false;  
    }  
    if(imageContent.length == 0){  
        $("#message").text("请输入验证码");  
        return false;  
    }else if(imageContent.length < 4){  
        $("#message").text("验证码错误");  
        return false;  
    }else{  
        //密码判断  
        $.ajax({  
            type : 'post',  
            url : 'login.do',  
            data : {  
                "username" : username,  
                "password" : /*$.md5(password)*/password
            },  
            success : function(data) {  
                //'0'失败,'1'成功  
                if(data==0){  
                    $("#message").text("账号或密码错误");  
                    return false;  
                }else if(data==1){
                	  
                	//记住用户名密码
                	  if ($("#remember").attr("checked")) {  
                	    var str_username = $("#username").val();  
                	    var str_password = $("#password").val();  
                	    $.cookie("rmbUser", "true", { expires: 90 }); //存储一个带90天期限的cookie  
                	    $.cookie("username", str_username, { expires: 90 });  
                	    $.cookie("password", str_password, { expires: 90 });  
                	  }  
                	   
                	  if(checkImageCode(imageContent)){  
                          //成功提交  
                          $("#form").attr("action", "initialize.do");  
                          $("#form").submit();  
                      }  
                }
            }  
        });  
          
    }  
};  
/**  
 * 验证码校验  
 */  
function checkImageCode(s) {  
    //验证码  
    var code = s.trim();  
    var timestamp = $("#timestamp").val().trim();  
//    console.log(code + " " + timestamp);  
    var status = "";  
    var boo=false;  
    if(code.length != 0 ){  
        $.ajax({  
            type : 'post',  
            async : false,  
            url : 'captcha/checkCaptcha.do',  
            data : {  
                "code" : code  
            },  
            success : function(data) {  
                status = data;  
            }  
        });  
        if(status.indexOf("true")>=0){  
            
            $("#imagCheck").val("true");  
            $("#message").text("");  
            boo = true;  
        }else{  
            changeImg();  
       
            $("#message").text("验证码错误");  
            return false;  
        }  
    }else{  
        $("#message").text("请输入验证码");  
        return;  
    }  
    return boo;  
//    console.log(status);  
}  