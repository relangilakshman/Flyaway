<html>
<body>
<h2>Change Password</h2>
<form action="/admin/updatePassword">
<table border="1">
<tr>
<td>
UserId :<input type="text" name="userId" value=${admin.userId}>
</td>
<td>
Current Password : <input type="text" name="password" value=${admin.password} >
</td>
</tr>
<tr>
<td>
New Password :<input type="text" name="npassword" >
</td>
<td>
Reenter Password : <input type="text" name="rpassword">
</td>
</tr>
<tr>
<td><td><input type="submit" name="Update"/></td><td></td>
</tr>
</table>
</form>
</body>
</html>