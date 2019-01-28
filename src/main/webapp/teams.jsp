<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<div style="text-align:center">
 <head>
    <meta charset="UTF-8">
    <title>Teams in Competition</title>
 </head>
 </div>
 <body>

    <h3>Teams in Competition</h3>
        <table align="centre" border="1" cellpadding="5" cellspacing="1" >
           <tr>
              <th>Team name</th>
           </tr>
           <c:forEach items="${TeamList}" var="item" >
              <tr>
                 <td><a href="Profiles?TeamID=${item.get("id")}">${item.getString("name")}</a></td>
              </tr>
           </c:forEach>
        </table>
 </body>
</html>