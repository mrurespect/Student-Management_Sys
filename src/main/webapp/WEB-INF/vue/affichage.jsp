<%@ page import="java.util.ArrayList" %>
<%@ page import="com.mrurespect.studentcrud.logic.Etudiant" %>
<%--
  Created by IntelliJ IDEA.
  User: lool
  Date: 28/10/2023
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <style>
        body {
            font-family: 'Comic Sans MS', cursive, sans-serif;
            background-color: #f0f0f0;
            text-align: center;
            margin-top: 20px;
        }
        h3 {
            color: #008080;
        }
        table {
            border-collapse: collapse;
            width: 75%;
            margin: auto;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin-top: 20px;
        }
        th, td {
            padding: 10px;
            border: 1px solid #ccc;
            text-align: left;
        }
        th {
            background-color: #008080;
            color: #fff;
        }
        a {
            text-decoration: none;
            color: #ff6666;
            font-weight: bold;
        }
    </style>
</head>
<body>
<h3>Liste des étudiants</h3>
<table>
    <tr>
        <th>Nom</th>
        <th>CIN</th>
        <th>Moyenne</th>
        <th>Action</th>
    </tr>
    <%
        ArrayList<Etudiant> etudiants=(ArrayList<Etudiant>)request.getAttribute("etudiants");
        for (Etudiant etudiant : etudiants) {
            out.println("<tr>");
            out.println("<td>%s</td>".formatted(etudiant.getNom()));
            out.println("<td>%s</td>".formatted(etudiant.getCin()));
            out.println("<td>%f</td>".formatted(etudiant.getMoyenne()));
            out.println("<td><a href=\"DeleteEtudiant?cin=%s\" >Delete</a></td>".formatted(etudiant.getCin()));
            out.println("</tr>");
        }
    %>
</table>
<br>
<%@include file="insertionEtudiant.html"%>
</body>
</html>
