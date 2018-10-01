<%-- 
    Document   : Registro
    Created on : 1/10/2018, 07:36:23 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    
  String usuario = request.getParameter("TUsuario");
  
    
%>    



<%
            if(request.getParameter("BAceptar")!=null){
%>
                 ${usuario.nombre}

<%
    return;}  
%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <h1>Regístrate</h1>
        <%-- class="aqui va la localizacion del Bean" --%>
        <jsp:useBean id="usuario" scope="page" class="mx.edu.ipn.cecyt9.edusite.model.UsuarioClase" >
        </jsp:useBean> 
            ${usuario.setNombre(usuario)}
           
         
            <form action="RegistroJsp.jsp">
            
            <input type="text" name="TUsuario">
            <input type="submit" value="ACEPTAR" name="BAceptar">
            
        </form>
            
    </body>
</html>
