<%@ page contentType="text/html;" %> 

<%@ page import="models.Todos" %> 
<%@ page import="java.util.*" %> 

<%
    ArrayList<String> todos = new Todos().getAll();
%> 

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Todos</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/style.css" rel="stylesheet">
    </head>
    <body>
        <div style='display:flex;flex-direction:column;position:fixed;top:50%;left:50%;transform: translate(-50%, -50%);border:2px black solid;padding:10px;'>
            <h1 style='margin: 5px 0px;'>Todos</h1>
            <ul>
                <% for(String todo: todos) {%>
                <li><%=todo%></li>
                <% }%>
            </ul>
            <form action="/demo/todos" method="POST">
                <input type="text" name="todo" id="todo" placeholder="Enter a todo">
                <input type="submit" value="Add">
            </form>
            <a href="/demo/todos"><button>Delete All</button></a>
        </div>

    </body>
</html>
