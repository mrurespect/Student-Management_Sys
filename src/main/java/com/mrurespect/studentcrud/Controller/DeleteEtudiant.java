package com.mrurespect.studentcrud.Controller;


import com.mrurespect.studentcrud.logic.Etudiant;
import com.mrurespect.studentcrud.logic.GestionEtudiants;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "DeleteEtudiant", value = "/DeleteEtudiant")
public class DeleteEtudiant extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cin = request.getParameter("cin");
        GestionEtudiants.deleteEtudiant(cin);
        List<Etudiant> listEtudiant = GestionEtudiants.getListeEtudiants();
        request.setAttribute("etudiants", listEtudiant);
        this.getServletContext().getRequestDispatcher("/WEB-INF/vue/affichage.jsp").forward(request,response);
    }
}
