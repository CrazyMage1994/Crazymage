<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML >
<html>
<head>

<title></title>
<meta charset="utf-8"">
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/jquery-2.2.2.min.js"></script>	
    <script type="text/javascript">
    	$(function() {
    		//even偶数的意思   odd 奇数的意思
    		$("tr").filter(":even").css("background", "green");
    		$("tr").filter(":odd").css("background", "red");
    
    	});
    </script>
</head>

<body>
<h1>STAFF </h1>
	<img alt="学委sx" 
	src="${pageContext.request.contextPath }/resources/img/6828221DD116208AAC25C059D2A438A0_0..jpg"
	width="50" height="50">
	<table border="1">
		<tr>
			<th>ENAME</th>
			<th>JOB</th>
			<th>SAL</th>
			<th>DNAME</th>
			<th>LOC</th>
		</tr>
		<c:forEach var="staff" items="${requestScope.staffs }">
		<tr>
		<td>${staff.ename }</td>
		<td>${staff.job }</td>
		<td>${staff.sal }</td>
		<td>${staff.dname }</td>
		<td>${staff.loc }</td>
		</tr>
		</c:forEach>
		<tr>
  			<td colspan="9">
  				当前页：${page }|
  				<a href="staffController_findPager?page=${page-1 }">上一页</a>|
  				<a href="staffController_findPager?page=${page+1 }">下一页</a>|
  				总页数：${count+1 }|
  				跳转至：<input type="text" id="page" size="5"/>
  				<button type="button" value="提交" onclick="submitPage()">提交</button>
  				<input type="hidden" value="5" id="rows"/>
  			</td>
  		</tr>
	</table>
</body>
<script type="text/javascript">
  	function submitPage(){
  		var page = document.getElementById("page").value;
  		var count = document.getElementById("rows").value;
  		window.location.href="staffController_findPager?page="+page+"&count="+count;
  	}
  </script>
</html>
