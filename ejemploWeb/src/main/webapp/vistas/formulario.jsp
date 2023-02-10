<%@ include file="/vistas/cabecera.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
  <head>
  <title>Formulario</title>
  </head>
  <body>
    <h1>Nuevo Alumno</h1>
    <form:form method="POST" 
          action="guardarAlumno" modelAttribute="alumnoV">
             <table>
                <tr>
                    <td><form:label path="nombre">Nombre</form:label></td>
                    <td><form:input path="nombre"/></td>
                </tr>
                <tr>
                    <td><form:label path="apellidos">Apellidos</form:label></td>
                    <td><form:input path="apellidos"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Guardar"/></td>
                </tr>
            </table>
        </form:form> 
 </body>
</html>
