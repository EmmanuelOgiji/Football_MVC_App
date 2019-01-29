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
        <table id= "Team Profile" align="centre" border="1" cellpadding="5" cellspacing="1" >
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
                 <td id= "Team.name">${TeamProfile.get("name")}</td>
                 <td id= "Team.venue">${TeamProfile.get("venue")}</td>
                 <td id= "Team.website">${TeamProfile.get("website")}</td>
                 <td id= "Team.email">${TeamProfile.get("email")}</td>
                 <td id= "Team.phone">${TeamProfile.get("phone")}</td>
                 <td id= "Team.address">${TeamProfile.get("address")}</td>
                 <td id= "Team.founded">${TeamProfile.get("founded")}</td>
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
                         <td id= "Player.name">${item.get("name")}</td>
                         <td id= "Player.number">${item.get("shirtNumber")}</td>
                      </tr>
                   </c:forEach>
                </table>
 </body>
</html>