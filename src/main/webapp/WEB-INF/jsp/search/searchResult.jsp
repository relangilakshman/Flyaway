<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>

<head>

<meta charset="ISO-8859-1">
<title>Search Result</title>
</head>
<body>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<div align="center">
        <table border="1" cellpadding="5" style="background-color:DodgerBlue;">
            <caption><h2>List of Flights</h2></caption>
            <tr>
                <th>FlightNo</th>
                <th>FlightName</th>
                <th>Source</th>
                <th>Destination</th>
                <th>Schedule Time</th>
                <th>Ticket Cost</th>
            </tr>
            <c:forEach var="flight" items="${flights}">
                <tr>
                    <td><c:out value="${flight.flightNo}" /></td>
                    <td><c:out value="${flight.flightName}" /></td>
                    <td><c:out value="${flight.source}" /></td>
                    <td><c:out value="${flight.dest}" /></td>
                    <td><c:out value="${flight.scTime}" /></td>
                    <td><c:out value="${flight.ticketCost}" /></td>
                    <td><a href="bookFlight/${flight.flightNo}">Book</a></td>  
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>