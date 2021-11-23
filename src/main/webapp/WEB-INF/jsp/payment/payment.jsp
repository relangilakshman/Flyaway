<html>
<body>
<h2>Payment Gateway</h2>
<form action="/flyaway/payment">
<table>
<tr>
<td>
Ticket No<input type="text" name="ticketId" value=${ticket.ticketId} hidden="true"/>
</td>
<td>
Amount: <input type="text" name="amount" value=${flight.ticketCost} />
</td>
</tr>
<tr>
<td><input type="submit" name="Submit"/></td>
</tr>
</table>
</form>
</body>
</html>