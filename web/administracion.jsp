<%-- 
    Document   : administracion
    Created on : 31/07/2018, 09:15:49 AM
    Author     : sergio
--%>

<%@page import="controlador.ControladorProductos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Panel de administracion</h1>
        
        <% ControladorProductos cp = new ControladorProductos();%>
        <%=cp.getPanelView()%>
        
         <script type="text/javascript" src="js/jquery.min.js"></script>
          <script type="text/javascript" src="js/paneladministracion.js"></script>
        
      
    </body>
</html>
