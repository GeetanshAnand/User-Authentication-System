<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<body>
    <%
        // Retrieve the session object
        HttpSession Currentsession = request.getSession(false);
    	if(Currentsession != null){
    		Currentsession.invalidate();
    	}
            response.sendRedirect("index.html");
        
    %>


</body>
</html>