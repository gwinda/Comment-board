<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="commentDAO" class="dao.commentDAO" scope="session" />
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'input.jsp' starting page</title>
    
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
    <a href="adminload.jsp">管理员登录</a>
  <form  action="Servletcomment" method="post" name="form" style="background:skyblue;" >
  <fieldset>
    <!-- <legend><h1>评论</h1></legend> -->
    <h2>留言板</h2>
    ${user}
    <input type="hidden" value="user"name="${user}">
      <p><input type="text" name="comment"><br>
    <p> 
             您给本系统打多少分呢？
     <input type="text" name="Crank">
     1-5
    </p>
      <p><input type="submit" value="提交" value="submit">
      <input type="reset" value="重置" name="reset">   
    </fieldset>
  
    </form>
    
    
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
     <%-- <a href="deleteComment?id=${com.id}">
      删除
     </a >--%>
</td>
      </tr>
      </c:forEach>
    </tbody>
    </table>
  </body>
</html>
