<html>
<body>
<header>

</header>
<script type="text/javascript">
document.getElementById("traveldt").innerHTML = "Date : " + Date(); 
function filldate(){
	
    var d=document.getElementById('traveldt').value;
    
    var rd=d.split('-').reverse().join("/");
  
    document.getElementById("traveldt").innerHTML=rd;
    
    }
</script>
<table border="2" style="background-color:Crimson;">
<tr>Home | <a  href="../admin/login">Admin</a></tr>
<tr><img alt="" src="/images/welcome.jpg" align="top"/>
</tr>
<tr>
<form action="search">
Source<input type="text" name="source" value =${searchBean.source} >
Destination<input type="text" name="dest" value =${searchBean.dest} >
DEPARTURE<input type="date"   id="traveldt" name="traveldt" value=${searchBean.traveldt} >
TRAVELLERS <input type="text" name="nop" value=${searchBean.nop} >
<input type="submit" name="Submit"/>
</tr>
</form>
<div>
<jsp:include page="../search/searchResult.jsp"></jsp:include>
</div>
</table>
</body>
</html>