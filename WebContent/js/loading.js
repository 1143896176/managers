var submitFlag = false;
	
function submitForm(sUrl) {
	if (submitFormNoMark(sUrl) == true) {
		submitFlag = true;
		showDisableDiv();
		return true;
	}
	return false;
}

function href(sUrl) {
	if (submitFormNoMark(sUrl) == true) {
		submitFlag = true;
		showDisableDiv();
		return true;
	}
	return false;
}


function submitFormNoMark(sUrl) {
	try {
		// FireFoxの場合、このスクリプトエラー
		if (event.ctrlKey) {
			return false;
		}
	} catch (e) {}

	if (submitFlag) {
		return false;
	}
	
	if (sUrl) {
		window.location.href=sUrl;	
	}
	

	return true;
}


function showDisableDiv() {

	 var div_obj = $("#popDisableDiv");
   var windowWidth = document.body.clientWidth;
   var windowHeight = document.body.clientHeight;
   
   var popupHeight = div_obj.height();
   var popupWidth = div_obj.width();

   div_obj.css("position", "absolute")
          .css("left", 700)
          .css("top", 380)
          .show();

   $("<iframe id='maskFrame'></iframe>").addClass("style_maskFrame")
                             .width(windowWidth + document.body.scrollLeft)
                             .height(windowHeight + document.body.scrollTop)
                             .appendTo("body")
                             .fadeIn();

   if (!$.browser.msie) {
       $("#maskFrame").css("opacity", "0.6")
   }
	
/*   setTimeout(function(){//定时器 
	   div_obj.css("display","none");//将图片的display属性设置为none
	   },
	   200);//设置三千毫秒即3秒
   setTimeout(function(){//定时器 
	   $("#maskFrame").css("display","none");//将图片的display属性设置为none
	   },
	   200);//设置三千毫秒即3秒
   
  */
	
}