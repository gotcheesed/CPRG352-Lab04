<%-- 
    Document   : viewnote
    Created on : 13-Jun-2021, 8:51:22 PM
    Author     : jewob
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note - Note Keeper</title>
    </head>
    <body>
        
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        
        <label><b>Title: </b>${note.title}</label>
        
        <br><br>
        
        <label><b>Contents: </b></label>
        <p>${note.contents}</p>
        
        <a href="note?edit">Edit</a>
        
    </body>
</html>
