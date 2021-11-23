<html>
<h2>Registration</h2>
<body>
<form action="../register" >
<table border="1" style="background-color:DodgerBlue;">
<tr>
<td>Flight No<input type="text" name="flno" value=${flight.flightNo} readonly/></td>
<td>Flight Name<input type="text" name="flname" value=${flight.flightName} readonly/></td>
</tr>
<tr>
<td>Source<input type="text" name="source"value=${flight.source} readonly/></td>
<td>Destination<input type="text" name="dest" value=${flight.dest} readonly/></td>
</tr>
<tr>
<td>Date of Travel & Time<input type="text" name="date" value=${flight.date} readonly /> & <input type="text" name="date" value=${flight.scTime} readonly /> </td>
<td>No Of Passengers <input type="text" name="nopasinger" value=${ticket.nopasinger} ></td>
</tr>
<tr>
<td>First Name<input type="text" name="fname" value=${ticket.fname} ></td>
<td>Last Name<input type="text" name="lname" value=${ticket.lname} ></td>
</tr>
<tr>
<td>Id No<input type="text" name="idno" value=${ticket.idno} ></td>
<td>Phone No<input type="text" name="phno" value=${ticket.phno} ></td>
</tr>
<tr>
<td>Email<input type="text" name="email" value=${ticket.email} ></td>
<td>Ticket Cost<input type="text" name="email" value=${flight.ticketCost} readonly="readonly"></td>
</tr>
<tr>
<td><input type="submit" name="Payment"/></td>
</tr>
</table>
</form>
</body>
</html>