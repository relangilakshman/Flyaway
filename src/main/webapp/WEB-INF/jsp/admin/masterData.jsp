<html>
<h2>Registration</h2>
<body>
<form action="/admin/addFlight" >
<table border="1" style="background-color:DodgerBlue;">
<tr>
<td>Flight No<input type="text" name="flightNo" value=${flight.flightNo} ></td>
<td>Flight Name<input type="text" name="flightName" value=${flight.flightName} ></td>
</tr>
<tr>
<td>Source<input type="text" name="source"value=${flight.source} ></td>
<td>Destination<input type="text" name="dest" value=${flight.dest} ></td>
</tr>
<tr>
<td>Date of Travel & Time<input type="text" name="date" value=${flight.date} > & <input type="text" name="scTime" value=${flight.scTime} > </td>
<td>No Of Passengers <input type="text" name="vcSheets" value=${ticket.vcSheets} ></td>
</tr>
<tr>
<td></td>
<td>Ticket Cost<input type="text" name="ticketCost" value=${flight.ticketCost} ></td>
</tr>
<tr>
<td><input type="submit" name="AddFligh"/></td>
</tr>
</table>
</form>
</body>
</html>