<html>



   <body>
      <table width = "100%" border = "0">
         
         <tr>
            <td colspan = "2" bgcolor = "#b5dcb3">
               <h1>Welcome to Flyaway Admin</h1>
            </td>
         </tr>
         <tr valign = "top">
            <td bgcolor = "#aaa" width = "50">
               <b>Main Menu</b><br />
               Master<br />
               <a  href="../admin/changePassword">Change Password</a><br />              
            </td>
            
            <td bgcolor = "#eee" width = "100" height = "200">
               <jsp:include page="masterData.jsp"></jsp:include>
            </td>
         </tr>
         <tr>
            <td colspan = "2" bgcolor = "#b5dcb3">
               <center>
                  Copyright © 2007 flyaway.com
               </center>
            </td>
         </tr>
         
      </table>
   </body>

</html>