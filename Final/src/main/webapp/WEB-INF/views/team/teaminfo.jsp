<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<script src="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<body>
		<c:forEach var="row2" items="${map.teaminfo_int}">
			<div class="content-team-profile">
			     <div>팀 평균 활동 점수: ${row2.TeamScore}</div> 
				 <div>팀 총 커미션 : ${row2.Teampoint}</div>
				 <div>팀 총 해결 완료 건수  : ${row2.Sol_cnt}</div>					
			</div>
		</c:forEach>
	
	<c:forEach var="row3" items="${map.teaminfo_notice}">
		<div class="content-team-date">
		    <p>팀 공지사항 : ${row3.Team_notice}</p>
		</div>
	</c:forEach>
	
  
	<div class="content-team-member">
	    <table>
	       <tr>
	          <td>활동점수</td>
	          <td>닉네임</td>
	          <td>커미션</td>
	          <td>이메일</td>
	      </tr>
	      <!-- foreach로 수정 -->
	       <tr>
	          <c:forEach var="row" items="${map.teamleader}">
		          <td><i class="fa-solid fa-fire"></i>  ${row.User_score}</td>
		          <td> 
			          <a href="/mypage_view?User_nickname=${row.User_nickname}" target="_blank"><i class="fa-solid fa-crown"></i>${row.User_nickname}</a>
		          </td>
		          <td>
		             ${row.commission}
		          </td>
		          <td>
		          	${row.Email_address}
		          </td>
	          </c:forEach>
	       </tr>
	        
	       <c:forEach var="row1" items="${map.teammembers}">
		          <tr>
		          	  <td><i class="fa-solid fa-fire"></i>  ${row1.User_score}</td>
			          <td>
				          <a href="/mypage_view?User_nickname=${row1.User_nickname}" target="_blank"><i class="fa-solid fa-user"></i></a> 
				          <a href="/mypage_view?User_nickname=${row1.User_nickname}" target="_blank">${row1.User_nickname}</a>
			          </td>
			          <td>
			             ${row1.commission}
			          </td>
			          <td>
			          	${row1.Email_address}
			          </td>
		          </tr>
	        </c:forEach>
	     </table>
	 </div>
	
</body>

</html>