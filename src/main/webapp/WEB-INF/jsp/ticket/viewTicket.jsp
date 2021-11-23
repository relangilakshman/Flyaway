<html>
<h2>Successfully Booked the Ticket</h2>
<h2>Ticket Details</h2>
<body>
<form action="/flyaway" >
<table border="1" style="background-color:DodgerBlue;">
<tr>
<td>Flight No: ${flight.flightNo}</td>
<td>Flight Name:${flight.flightName}</td>
</tr>
<tr>
<td>Source :${flight.source} </td>
<td>Destination: ${flight.dest}</td>
</tr>
<tr>
<td>Date of Travel & Time: ${flight.date}& ${flight.scTime} </td>
<td>No Of Passengers: ${ticket.nopasinger}</td>
</tr>
<tr>
<td>First Name: ${ticket.fname}</td>
<td>Last Name: ${ticket.lname} </td>
</tr>
<tr>
<td>Id No: ${ticket.idno} </td>
<td>Phone No: ${ticket.phno} </td>
</tr>
<tr>
<td>Email: ${ticket.email} </td>
<td>Ticket Cost: ${flight.ticketCost} </td>
</tr>
<tr>
<td><input type="submit" name="GoToHome"/></td>
</tr>
</table>
</form>
</body>
</html>