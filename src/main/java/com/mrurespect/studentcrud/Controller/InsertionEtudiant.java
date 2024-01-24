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

@WebServlet(name = "InsertionEtudiant", value = "/InsertionEtudiant")
public class InsertionEtudiant extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("nom");
        String cin = request.getParameter("cin");
        double moyenne = Double.parseDouble(request.getParameter("moyenne"));
        Etudiant etudiant =new Etudiant(cin,name,moyenne);
        GestionEtudiants.addEtudiant(etudiant);
        List<Etudiant> listEtudiant = GestionEtudiants.getListeEtudiants();
        request.setAttribute("etudiants", listEtudiant);
        this.getServletContext().getRequestDispatcher("/WEB-INF/vue/affichage.jsp").forward(request,response);
    }
}
