<%@ page import="com.example.mission1.vo.WifiVO" %>
<%@ page import="com.example.mission1.servlet.WifiServlet" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<html>
<head>
    <title>와이파이 정보 구하기</title>
</head>
<body>
<h1><%= "와이파이 정보 구하기" %>
</h1>
<br/>
<a href="index.jsp">홈</a>
<a href="WIFIHistList.jsp">위치 히스토리 목록</a>
<a href="api-servlet">Open API 와이파이 정보 가져오기</a>
<a href="mybookMarkList.jsp">즐겨 찾기 보기</a>
<a href="bookMarkList.jsp">즐겨 찾기 그룹 관리</a>
<table border="1" style="width:98%;margin: 10px 10px 10px 10px">
    <colgroup>
        <col style="width: 4%;">
        <col style="width: 4%;">
        <col style="width: 5%;">
        <col style="width: 7%;">
        <col style="width: 7%;">
        <col style="width: 7%;">
        <col style="width: 5%;">
        <col style="width: 4%;">
        <col style="width: 4%;">
        <col style="width: 5%;">
        <col style="width: 5%;">
        <col style="width: 5%;">
        <col style="width: 5%;">
        <col style="width: 5%;">
        <col style="width: 4%;">
        <col style="width: 4%;">
        <col style="width: 5%;">
    </colgroup>
    <thead style="border: white">
       <tr style="background: mediumseagreen;color: white">
           <th>거리(KM)</th>
           <th>관리번호</th>
           <th>자치구</th>
           <th>와이파이명</th>
           <th>도로명주소</th>
           <th>상세주소</th>
           <th>설치위치(층)</th>
           <th>설치유형</th>
           <th>설치기관</th>
           <th>서비스구분</th>
           <th>망종류</th>
           <th>설치년도</th>
           <th>실내외구분</th>
           <th>WIFI접속 환경</th>
           <th>X좌표</th>
           <th>Y좌표</th>
           <th>작업일자</th>
       </tr>
    </thead>
    <tbody  style="border: slategray">
        <%
            WifiServlet wifiServlet = new WifiServlet();
            List<WifiVO> wifiList = wifiServlet.selectWifiList();
        %>
        <%if(wifiList.isEmpty()){%>
        <tr>
            <td colspan="17" style="text-align: center;min-height: 100px;"><span> 위치 정보를 입력한 후에 조회해 주세요.</span></td>
        </tr>
        <%}else{%>
        <%
            for(WifiVO wifiVO : wifiList){
        %>
            <tr>
                <td><%=wifiVO.getXSwifiMgrNo()%></td>
                <td><%=wifiVO.getXSwifiWrdofc()%></td>
                <td><%=wifiVO.getXSwifiMainNm()%></td>
                <td><%=wifiVO.getXSwifiAdres1()%></td>
                <td><%=wifiVO.getXSwifiAdres2()%></td>
                <td><%=wifiVO.getXSwifiInstlFloor()%></td>
                <td><%=wifiVO.getXSwifiInstlTy()%></td>
                <td><%=wifiVO.getXSwifiInstlMby()%></td>
                <td><%=wifiVO.getXSwifiSvcSe()%></td>
                <td><%=wifiVO.getXSwifiCmcwr()%></td>
                <td><%=wifiVO.getXSwifiCnstcYear()%></td>
                <td><%=wifiVO.getXSwifiInoutDoor()%></td>
                <td><%=wifiVO.getXSwifiRemars3()%></td>
                <td><%=wifiVO.getLat()%></td>
                <td><%=wifiVO.getLnt()%></td>
                <td><%=wifiVO.getWorkDttm()%></td>
            </tr>
        <%}}%>
    </tbody>
</table>
<%


%>
</body>
</html>