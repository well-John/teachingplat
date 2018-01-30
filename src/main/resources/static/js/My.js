 
	function checklogin() {
		$.ajax({
			url : 'checklogin',
			type : 'post',
			dataType : "json",
			success : function(data) {
				if (data.code == 100) {
					return true;
				} else {
					// alert("请先登录！！！");
					window.location.href = "index.html";
					return false;
				}
			}
		});
	}

	// 处理时间字符串
	function getMyDate(str) {
		var oDate = new Date(str), oYear = oDate.getFullYear(), oMonth = oDate
				.getMonth() + 1, oDay = oDate.getDate(), oHour = oDate.getHours(), oMin = oDate
				.getMinutes(), oSen = oDate.getSeconds(), oTime = oYear + '-'
				+ getzf(oMonth) + '-' + getzf(oDay) + ' ' + getzf(oHour) + ':'
				+ getzf(oMin) + ':' + getzf(oSen);// 最后拼接时间
		return oTime;
	}
	// 补0操作
	function getzf(num) {
		if (parseInt(num) < 10) {
			num = '0' + num;
		}
		return num;
	}
	//显示教员姓名
	function showName(str) {
		if(str!=null)
		return str.substring(0,1)+"教员";
	}
	//显示分页信息
	function showPageInfo(ele, data) {
		var pageInfo = '<div class="page"><span id="lstInfo_dataPager"> <a class="aspNetDisabled">&lt;&lt;</a>&nbsp;<a class="aspNetDisabled">&lt;</a>&nbsp;'
				+ '<span>'
				+ data.map.pageInfo.pageNum
				+ '</span>&nbsp;<a class="aspNetDisabled btn_page">&gt;</a>&nbsp;<a class="aspNetDisabled btn_page">&gt;&gt;</a>&nbsp;'
				+ '</span></div>';
		$(pageInfo).appendTo(ele);
	}
	function check_phone(ele){
		var isPhone=/^1[34578]\d{9}$/;
		if(!isPhone.test(ele)){
			return false;
		}
		return true;
	}
	//邮箱格式
	function check_email(ele){
		var isemail=/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/;
		if(!isemail.test(ele)){
			return false;
		}
		return true;
	}
	//显示学生个人信息框
	function showStudentLoginBox(data){
		var w1='<div class="s_loginbox">'+'<div class="name">欢迎您：<span class="cf60">'
			+data.map.student.name+'</span></div><a class="logout">&nbsp;</a>'
			+'<div class="clear10"></div><ul><li class="li1">我的订单</li><li class="li2"><span class="red">'
			+1+'</span></li>'+'<li class="li3"><a href="student_order.html" class="link2">查看</a></li></ul>'
			+'<ul><li class="li1">预约记录</li><li class="li2"><span class="red">'
	        +1+'</span></li><li class="li3"><a href="student_yuyue.html" class="link2">查看</a></li></ul>'
			+'<div class="clear"></div><div class="xq"><a href="student_xuqiu.html">发布需求 &gt;</a></div><div class="grzx">'
			+'<a href="student/index">&nbsp;</a></div>'
			return w1;
		}
	//显示教师个人信息框
	function showTeacherLoginBox(data){
		var w1='<div class="t_loginbox"><div class="name">欢迎您：<span class="cf60">'+data.map.teacher.nickname+'</span></div>'
	          + '<a href="###" class="logout">&nbsp;</a><div class="clear5"></div>'
	          + '<div class="img" style="width: 74px; height: 82px"><img src="images/'+data.map.teacher.avatar+'" border="0"></div>'
				  + '<div class="notice"><ul><li class="li1">证件</li><li class="li2"><span class="red">0</span></li><li class="li3"><a href="/Teacher/CardManage.aspx" class="link2">上传</a></li></ul>'
	          + '<ul><li class="li1">照片</li><li class="li2"><span class="red">1</span></li><li class="li3"><a href="/Teacher/PhotoManage.aspx" class="link2"> 上传</a></li></ul>'
	          + '<ul><li class="li1">待支付</li><li class="li2"><span class="red">0</span></li><li class="li3"><a href="Teacher/TeachList.aspx" class="link2">查看</a></li></ul>'
	   		  +	'<ul><li class="li1">预约</li><li class="li2"><span class="red">0</span></li><li class="li3"><a href="/Teacher/OrderList.aspx" class="link2">查看</a></li></ul></div>'
			  +'<div class="clear10"></div> <div class="grzx"><a href="teacher/index">&nbsp;</a></div></div>'
	      
			  return w1;
	}
	//页面一加载就判断当前是否已登录，根据登录的身份正确显示个人信息框，有些页面不登录不给跳转
	function showBox(){
		$.ajax({
			url : 'checklogin',
			type : 'post',
			dataType : "json",
			success:function(data){
				if(data.code==100){
					var divlogin=$("#Header1_divLogout");
					var text="您好！欢迎来到阳光家教网！";
					var href=$("<a></a>").text("个人中心");
					var logout_a=$("<a></a>").attr("href","").addClass("logout").text(" 退出");
					var box= $(".right4");
					var div_clear=$("<div></div>").addClass("clear10");
					if(data.map.type==1){
						//显示左上角信息
						divlogin.empty();
						divlogin.append(text).append(href).attr("href","student/index").append("| ").append(logout_a);
						//显示个人信息
						$(box).prepend(div_clear).prepend(showStudentLoginBox(data));
						
					}else{
						//显示左上角信息
						divlogin.empty();
						divlogin.append(text).append(href).attr("href","teacher/index").append("| ").append(logout_a);
						//显示个人信息
						$(box).prepend(div_clear).prepend(showTeacherLoginBox(data));
					}					
				}else{
					window.location.href="index.html";
				}
			}
		});
	}
	
	
	//页面一加载就判断当前是否已登录，根据登录的身份正确显示个人信息框，有些页面不登录给跳转
	function showBox1(){
		$.ajax({
			url : 'checklogin',
			type : 'post',
			dataType : "json",
			success:function(data){
				if(data.code==100){
					var divlogin=$("#Header1_divLogout");
					var text="您好！欢迎来到阳光家教网！";
					var href=$("<a></a>").text("个人中心");
					var logout_a=$("<a></a>").attr("href","").addClass("logout").text(" 退出");
					var box= $(".right4");
					var div_clear=$("<div></div>").addClass("clear10");
					if(data.map.type==1){
						//显示左上角信息
						divlogin.empty();
						divlogin.append(text).append(href).attr("href","student/index").append("| ").append(logout_a);
						//显示个人信息
						$(box).prepend(div_clear).prepend(showStudentLoginBox(data));
						
					}else{
						//显示左上角信息
						divlogin.empty();
						divlogin.append(text).append(href).attr("href","teacher/index").append("| ").append(logout_a);
						//显示个人信息
						$(box).prepend(div_clear).prepend(showTeacherLoginBox(data));
					}					
				}
			}
		});
	}
	
	
	//退出
	$(document).on("click",".logout",function(){
		$.ajax({
			url:'logout',
			type:'post',
			success:function(){
				window.location.reload();
			}
		});
		});

	//显示教师库中的教师信息
	function showTeachers(ele,data){
		$(ele).empty();
		$.ajax({
			url:'teacher/selectAllTeacher',
			type:'post',
			data:data,
			dataType:'json',
			success:function(data){
				if(data.code==100){
					var list=data.map.pageInfo.list;
					
					$(list).each(function(index,data){
						var TeacherInfo='<li class="cf2"><div class="teacher_head"><a href="teacher_info.html" target="_blank" title="家教">'
					           +'<img src="images/'+data.avatar+'" border="0" width="90" height="100"></a><div style="display: block">'
					           +'<a href="teacher_info.html" class="teach_num">成功(<span>2</span>)</a></div>'
					           +'<div style="display: none"><a href="teacher_info.html" class="teach_view">评价(<span>0</span>)</a></div></div>'
					           +'<div class="teacher_info"><div class="btn"><div>登录时间：<span class="eng">'+getMyDate(data.lastTime)+'</span></div>'
					           +'<a href="teacher_info.html" target="_blank" title="家教">查看详情</a>	</div><div class="tit"><a href="teacher_info.html" target="_blank">'+showName(data.name)+'</a>'
					           +'<span class="honor_label"><i class="female"></i><span><i class="good" title="未签约"></i></span><span><i class="v"title="未审核证件"></i></span></span> <em>'+data.currentStatus+'</em></div>'
					           +'<div class="tit_info"><span>编号： <a href="teacher_info.html" class="eng">'+data.id+'</a></span></div><div class="label_g"><span>'+data.university+'</span><span>'+data.major+'</span><span>'+data.education+'</span></div>'
					           +'<div class="teacher_article"><p class="teacher_p">'+data.teachingSubject+'</p></div><div class="teacher_article"><p class="teacher_p">'+data.description+'</p></div></div></li>';
						     $(ele).append(TeacherInfo);
					});
					var ele1=$(".pages");
					build_pageInfo_teacher(ele1,data)
				}else{
					$(".pages").empty();
				}
			}
		});	
	}
	//显示学员库中的信息
	function showOrders(ele,data){
		$(ele).empty();
		$.ajax({
			url:'teacherRequirement/selectAllTeacherRequire',
			type:'post',
			data:data,
			dataType:'json',
			success:function(data){
				if(data.code==100){
					var list=data.map.pageInfo.list;
					$(list).each(function(index,data){
						var TeacherRequireInfo='<div class="dd_item"><div class="dd_title"><dl><dt><a href="xueyuanshow.html?id='+data.id+'" target="_blank"><span>'+data.area+data.subject+"家教"+"(编号："+data.id+")"+'</span></a></dt>'
											  +'<dd>发布时间：'+getMyDate(data.releaseTime)+'</dd></dl></div><div class="dd_con"><div class="ch1"><p>学员：</p><p>所在区域：</p><p>教师资格要求：</p></div><div class="ch2">'
											  +'<p>'+data.grade+'</p><p>'+data.area+'</p><p>'+data.requirement+'</p></div><div class="ch3"><p>求教科目：</p><p>教员性别要求：</p></div>'
							                  +'<div class="ch4"><p>'+data.subject+'</p><p>'+showSex(data.requireSex)+'</p></div><div class="ch7"><div class="zt1">'+(data.releaseStatus==0?"发布中":"已关闭")+'</div><div class="zt2"><a href="xueyuanshow.html?id='+data.id+'" class="link33" target="_blank">更多详细资料</a></div>'
							                  +'<div class="clear">&nbsp;</div></div><div class="clear">&nbsp;</div></div>';
						     $(ele).append(TeacherRequireInfo);
					});
					var ele1=$(".pages");
					build_pageInfo_teacherRequire(ele1,data)
				}else{
					$(".pages").empty();
				}
			}
		});	
	}
	
	

	function build_pageInfo_teacher(ele,data){
		$(ele).empty();
		var page1_div=$("<div></div>").addClass("pagel");
		var total_span=$("<span></span>").addClass("red").text(data.map.pageInfo.total);
		page1_div.append("共").append(total_span).append("条记录");
		page1_div.appendTo(ele);
		ele.append("，当前为第"+data.map.pageInfo.pageNum+"页[共有"+data.map.pageInfo.pages+"页]");
		var pager_div=$("<div></div>").addClass("pager");
		var ul=$("<ul></ul>");
		$(ul).appendTo(pager_div);
		//首页
		var shouye_li=$("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
		shouye_li.click(function(){
			to_page_teacher(1);
		});  
		ul.append(shouye_li);
		//上一页
		var prePageLi = $("<li></li>").append(
				$("<a></a>").append("&laquo;").attr("href", "#"));
		prePageLi.click(function() {
			to_page_teacher(data.map.pageInfo.pageNum - 1);
		});
		ul.append(prePageLi);
		//页码
		$.each(data.map.pageInfo.navigatepageNums, function(index, item) {

			var Li = $("<li></li>").append(
					$("<a></a>").append(item).attr("href", "#"));
			if (data.map.pageInfo.pageNum == item) {
				Li.find("a").addClass("on");
			}
			Li.click(function() {
				to_page_teacher(item);
			});
			ul.append(Li);
		});
		//下一页
		var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"))
				.attr("href", "#");
		nextPageLi.click(function() {
			to_page_teacher(data.map.pageInfo.pageNum + 1);

		});
		ul.append(nextPageLi);

		//末页
		var lastPageLi = $("<li></li>").append(
				$("<a></a>").append("末页").attr("href", "#"));
		lastPageLi.click(function() {
			to_page_teacher(data.map.pageInfo.pages);
		});
		ul.append(lastPageLi);
		ul.appendTo(pager_div);
		pager_div.appendTo(ele);
		var clear=$("<div></div>").addClass("clear");
		clear.appendTo(ele);
	}
	
	function build_pageInfo_teacherRequire(ele,data){
		$(ele).empty();
		var page1_div=$("<div></div>").addClass("pagel");
		var total_span=$("<span></span>").addClass("red").text(data.map.pageInfo.total);
		page1_div.append("共").append(total_span).append("条记录");
		page1_div.appendTo(ele);
		ele.append("，当前为第"+data.map.pageInfo.pageNum+"页[共有"+data.map.pageInfo.pages+"页]");
		var pager_div=$("<div></div>").addClass("pager");
		var ul=$("<ul></ul>");
		$(ul).appendTo(pager_div);
		//首页
		var shouye_li=$("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
		shouye_li.click(function(){
			to_page_teacherRequire(1);
		});  
		ul.append(shouye_li);
		//上一页
		var prePageLi = $("<li></li>").append(
				$("<a></a>").append("&laquo;").attr("href", "#"));
		prePageLi.click(function() {
			to_page_teacherRequire(data.map.pageInfo.pageNum - 1);
		});
		ul.append(prePageLi);
		//页码
		$.each(data.map.pageInfo.navigatepageNums, function(index, item) {

			var Li = $("<li></li>").append(
					$("<a></a>").append(item).attr("href", "#"));
			if (data.map.pageInfo.pageNum == item) {
				Li.find("a").addClass("on");
			}
			Li.click(function() {
				to_page_teacherRequire(item);
			});
			ul.append(Li);
		});
		//下一页
		var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"))
				.attr("href", "#");
		nextPageLi.click(function() {
			to_page_teacherRequire(data.map.pageInfo.pageNum + 1);

		});
		ul.append(nextPageLi);

		//末页
		var lastPageLi = $("<li></li>").append(
				$("<a></a>").append("末页").attr("href", "#"));
		lastPageLi.click(function() {
			to_page_teacherRequire(data.map.pageInfo.pages);
		});
		ul.append(lastPageLi);
		ul.appendTo(pager_div);
		pager_div.appendTo(ele);
		var clear=$("<div></div>").addClass("clear");
		clear.appendTo(ele);
	}
	
		
	function to_page_teacher(pageNum){
		var ele=$("#teacher_ul");
		var data="subject="+subject+"&area="+area+"&university="+school+"&identity="+identity+"&sex="+sex+"&pageNum="+pageNum;
		showTeachers(ele,data);
	}
		
	function to_page_teacherRequire(pageNum){
		var ele=$(".dd_lstcon");
		var data="subject="+subject+"&area="+area+"&grade="+grade+"&identity="+identity+"&sex="+sex+"&pageNum="+pageNum;
		showOrders(ele,data);
	}
		
	function showSex(data){
		if(data==0)
			return "男";
		else if(data==1)
			return "女";
		else
			return "无要求";
	}
	//获取html上url中的参数
	 function GetQueryString(name)
     {
          var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
          var r = window.location.search.substr(1).match(reg);
          if(r!=null)return  (r[2]); return null;
     }

	function build_pageInfo(ele,data){
		$(ele).empty();		
       var page1_div=$("<div></div>").addClass("page1");
		var total_span=$("<span></span>").addClass("red").text(data.map.pageInfo.total);
		page1_div.append("共"+data.map.pageInfo.total+"条记录");
		page1_div.appendTo(ele);
		ele.append("，当前为第"+data.map.pageInfo.pageNum+"页[共有"+data.map.pageInfo.pages+"页]");
		var pager_div=$("<div></div>").addClass("pager");
		var ul=$("<ul></ul>");
		$(ul).appendTo(pager_div);
		//首页
		var shouye_li=$("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
		shouye_li.click(function(){
			to_page(1);
		});  
		ul.append(shouye_li);
		//上一页
		var prePageLi = $("<li></li>").append(
				$("<a></a>").append("&laquo;").attr("href", "#"));
		prePageLi.click(function() {
			to_page(data.map.pageInfo.pageNum - 1);
		});
		ul.append(prePageLi);
		//页码
		$.each(data.map.pageInfo.navigatepageNums, function(index, item) {

			var Li = $("<li></li>").append(
					$("<a></a>").append(item).attr("href", "#"));
			if (data.map.pageInfo.pageNum == item) {
				Li.find("a").addClass("on");
			}
			Li.click(function() {
				to_page(item);
			});
			ul.append(Li);
		});
		//下一页
		var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"))
				.attr("href", "#");
		nextPageLi.click(function() {
			to_page(data.map.pageInfo.pageNum + 1);

		});
		ul.append(nextPageLi);

		//末页
		var lastPageLi = $("<li></li>").append(
				$("<a></a>").append("末页").attr("href", "#"));
		lastPageLi.click(function() {
			to_page(data.map.pageInfo.pages);
		});
		ul.append(lastPageLi);
		ul.appendTo(pager_div);
		pager_div.appendTo(ele);
		var clear=$("<div></div>").addClass("clear");
		clear.appendTo(ele);
	}
		
	function to_page(pageNum){
		var ele=$("#teacher_ul");
		var data="subject="+subject+"&area="+area+"&university="+school+"&identity="+identity+"&sex="+sex+"&pageNum="+pageNum;
		showTeachers(ele,data);
	}
		
		
		
		
		




