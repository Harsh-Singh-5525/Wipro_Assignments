
<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!-- LoginJsp.jsp -->
<%
    String name = request.getParameter("name");
    String password = request.getParameter("password");

    if("admin".equals(name) && "wipro".equals(password)){
        // Redirect to SuccessJsp.jsp
        response.sendRedirect("SuccessJsp.jsp");
    } else {
        // Redirect to Fail.jsp
        response.sendRedirect("Fail.jsp");
    }
%>
