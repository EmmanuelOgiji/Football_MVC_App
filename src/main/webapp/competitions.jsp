<%@page import="org.json.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<div style="text-align:center">
 <head>
    <meta charset="UTF-8">
    <title>Competitions Available</title>
 </head>
 </div>
 <body>

    <h3>Competitions List</h3>
        <table align="centre" border="1" cellpadding="5" cellspacing="1" >
           <tr>
              <th>Competitions Available</th>
           </tr>
           <c:forEach items="${CompetitionList}" var="item" >
              <tr>
                 <td><a href="Teams?CompCode=${item.get("code")}&CompID=${item.get("id")}">${item.get("name")}</a></td>
              </tr>
           </c:forEach>
        </table>
 </body>
</html>