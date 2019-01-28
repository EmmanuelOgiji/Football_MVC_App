<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<div style="text-align:center">
 <head>
    <meta charset="UTF-8">
    <title>Team Profile</title>
 </head>
 </div>
 <body>

    <h3>Teams Profile</h3>
        <table align="centre" border="1" cellpadding="5" cellspacing="1" >
           <tr>
              <th>Team name</th>
              <th>Home Stadium</th>
              <th>Website</th>
              <th>email</th>
              <th>Phone</th>
              <th>Address</th>
              <th>Founded</th>
           </tr>
              <tr>
                 <td>${TeamProfile.get("name")}</td>
                 <td>${TeamProfile.get("venue")}</td>
                 <td>${TeamProfile.get("website")}</td>
                 <td>${TeamProfile.get("email")}</td>
                 <td>${TeamProfile.get("phone")}</td>
                 <td>${TeamProfile.get("address")}</td>
                 <td>${TeamProfile.get("founded")}</td>
              </tr>
        </table>
        <br>
        <h3>Squad</h3>
        <table align="centre" border="1" cellpadding="5" cellspacing="1" >
                   <tr>
                      <th>Player Name</th>
                      <th>Shirt Number</th>
                   </tr>
                   <c:forEach items="${Squad}" var="item" >
                      <tr>
                         <td>${item.get("name")}</td>
                         <td>${item.get("shirtNumber")}</td>
                      </tr>
                   </c:forEach>
                </table>
 </body>
</html>