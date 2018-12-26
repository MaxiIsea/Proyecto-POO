<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proyecto POO</title>
    </head>
    <body>
        <h1>INGRESO DE USUARIOS</h1>
        <link rel="stylesheet" href="resources/css/style.css" type="text/css">
        <script lang="Javascript" type="text/Javascript" src="resources/js/script.js"></script>
        <form method="post" action="login" name="loginForm">
            <h1>Email ID:<input type="text" name="email" placeholder="Email ID" /><br/></h1>
            <h1>Password:<input type="password" name="pass" placeholder="Password"/><br/></h1>
            <input onclick=validar_login(loginForm) type="submit" value="Ingresar"/>
        </form>        
        <h1>Texto de relleno</h1>
    </body>
</html>