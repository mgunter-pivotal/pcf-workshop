<%@ page import="com.beans.MyInfoLocal" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.Context" %>
<html>
<head><title>Hello EJB 3 !</title></head>
<body>

<p>
Object HeloEjb from Servlet : <%= request.getAttribute("infoEjb") %><br>
Print Hello : <%= request.getAttribute("printInfo") %>
</body>
</html>