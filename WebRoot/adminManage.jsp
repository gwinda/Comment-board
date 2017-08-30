<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="commentDAO" class="dao.commentDAO" scope="session" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'adminManage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  

    <table style="text-align:left;width:100%;" border="0" cellpadding="2" cellspacing="2">
    <tbody>
      <c:forEach var="com" items="${commentDAO.beancomment}">
      <tr>
      <td>${com.id}</td>
      <td>${com.comment}</td>
      <td>${com.time}</td>
      <td>${com.crank}</td>
<%--       <td>${com.Crank}</td>  --%>
      
<td>
<!--   定义删除操作 -->
     <a href="DeleteComment?id=${com.id}">
      删除
     </a>
</td>
      </tr>
      </c:forEach>
    </tbody>
    </table>
  </body>
</html>
