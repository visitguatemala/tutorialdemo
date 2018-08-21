<%-- 
    Document   : crearproducto
    Created on : 23/07/2018, 09:19:43 AM
    Author     : sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="js/jquery.min.js"></script>
        <script type="text/javascript" src="js/main.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nuevo Producto</h1>
        <form action="crearproducto" name="frmnuevo"  enctype="multipart/form-data" id="frm_nuevo">


            <table>
                <tr>
                    <td><label for="">Nombre:</td>
                    <td><input type="text" name="nombre" id="nombre"></td>

                </tr>


                <tr>
                    <td><label for="">Descripcion:</td>
                    <td><textarea  cols="30" rows="6" name="descripcion" id="descripcion"></textarea></td>

                </tr>

                <tr>
                    <td><label for="">Precio:</td>
                    <td><input type="text" name="precio" id="precio"></td>

                </tr>

                <tr>
                    <td><label for="">Categoria:</td>
                    <td><input type="text" name="categoria" id="categoria"></td>

                </tr>

                <tr>
                    <td><label for="">Detalles:</td>
                    <td><textarea  cols="30" rows="6" name="detalles" id="detalles"></textarea></td>

                </tr>

                <tr>
                    <td><label for="">Reviews:</td>
                    <td><textarea  cols="30" rows="6" name="reviews" id="reviews"></textarea></td>

                </tr>

                <tr>
                    <td><label for="">Size:</td>
                    <td>
                        <select name="size" id="size">
                            <option value="Seleccione una opcion">Seleccione una opcion</option>

                            <%

                                for (int i = 1; i <= 20; i++) {%>

                            <option value='<%=i%>'><%=i%></option>

                            <%}%>








                        </select>

                    </td>

                </tr>
                
                <tr>
                    <td><label for="">Color:</td>
                    <td><input type="text" name="color" id="color"></td>

                </tr>
                
                <tr>
                    <td><label for="">Imagenes:</td>
                    <td><input type="file" name="file[]" id="archivos" multiple></td>

                </tr>
                
                     <tr>
                    <td></td>
                    <td><input type="submit" value="crear Producto" id="btncrearproducto"></td>

                </tr>



            </table>



        </form>





    </body>
</html>
