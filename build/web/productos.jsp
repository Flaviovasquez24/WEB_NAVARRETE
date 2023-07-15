<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.logging.Logger" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Listado de Productos</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <script>
        function mostrarStock(stock) {
            alert("Stock disponible: " + stock);
        }
    </script>
</head>
<%
    String[] cod = {"A01", "A02", "A03", "A04", "A05", "A06"};
    String[] nom = {"Lapiceros Boliball BLT", "Borrador Duo Negro Artesco BLT", "Cuad.Theme Book A4 Navarrete", "Pinceles Creativo BLT x5", "Tempera Faber Castell x7", "Marcador Fine x5 Vinifan"};
    int[] pre = {2, 3, 5, 2, 10, 8};
    int[] stock = {200, 500, 5000, 300, 150, 200, 400};
    int tot = 0;
    double ti = 0;
    double mt = 0;
    String mensaje = "";
    int s = 0;

    Logger logger = Logger.getLogger(this.getClass().getName());
%>
<body>
    <h1 class="title">Distribuidora Navarrete</h1>
    <table class="catalog-table">
        <tr>
            <th>Código</th>
            <th>Foto</th>
            <th>Nombre</th>
            <th>Precio</th>
            <th>Cantidad</th>
            <th>Monto $</th>
            <th>IGV %</th>
            <th>Total</th>
            <th>Estado</th>
            <th>Stock</th>
        </tr>
        <% for (int i = 0; i < cod.length; i++) { %>
            <tr>
                <td><%= cod[i] %></td>
                <td><img src="img/<%= cod[i] %>.jpg" height="80" width="80"></td>
                <td><%= nom[i] %></td>
                <td><%= pre[i] %></td>
                <td><%= pre[i] %></td>
                <% tot = pre[i] * pre[i]; %>
                <td><%= tot %></td>
                <% ti = tot * 0.19; %>
                <td><%= ti %></td>
                <% mt = tot + ti;
                s += mt;
                %>
                <td><%= mt %></td>

                <% if (mt > 1000) {
                    mensaje = "Precio Normal";
                } else {
                    mensaje = "Oferta";
                } %>
                <td><%= mensaje %></td>

                <td>
                    <button class = stock onclick="mostrarStock(<%= stock[i] %>)">Stock</button>
                </td>

                <% String message = "codigo = " + cod[i] + " - nombre = " + nom[i];
                logger.info(message);
                %>
            </tr>
        <% } %>
    </table>
</body>
</html>
