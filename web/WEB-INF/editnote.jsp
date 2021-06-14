<%-- 
    Document   : editnote
    Created on : 13-Jun-2021, 8:51:30 PM
    Author     : jewob
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note - Note Keeper</title>
    </head>
    <body>
        
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>

        <form method="POST" action="note">
            
            <label>Title: </label>
            <input type="text" name="title" value="${note.title}">
            
            <br>
            
            <label>Contents: </label>
            
            <br>
            
            <textarea name="contents" cols="30" rows="5">${note.contents}</textarea>
            
            <br>
            
            <input type="submit" value="Save">
            
        </form>
            
    </body>
</html>
