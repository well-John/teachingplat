<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% pageContext.setAttribute("APP_PATH", request.getContextPath()); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 验证码 -->
<tr>
   <td nowrap width="437"></td>
    <td>
        <img id="img" src="${APP_PATH}/authImage" />
        <a href='#' onclick="javascript:changeImg()" style="color:white;">
        <span style="color:black;">看不清？</span></a>
    </td>
 </tr>
  
  
 <!-- 触发JS刷新-->
 <script type="text/javascript">
    function changeImg(){
        var img = document.getElementById("img"); 
        img.src = "${APP_PATH}/authImage?date=" + new Date();;
    }
</script>
</body>
</html>