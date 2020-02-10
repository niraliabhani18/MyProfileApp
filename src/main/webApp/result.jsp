<%@ page import ="java.util.*" %>
<!DOCTYPE html>

<html>
<body>
<center>
<h1>
Profile Details
</h1>
<%
List list = (List) request.getAttribute("Type");
Iterator it= list.iterator();
while(it.hasNext()){
out.println(it.next()+"<br>");
}
%>

</body>
</html>
