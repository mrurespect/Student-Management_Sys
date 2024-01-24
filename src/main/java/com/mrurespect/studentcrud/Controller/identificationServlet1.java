package com.mrurespect.studentcrud.Controller;


import com.mrurespect.studentcrud.logic.Etudiant;
import com.mrurespect.studentcrud.logic.GestionEtudiants;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

@WebServlet(name = "identificationServlet1", value = "/identificationServlet1")
public class identificationServlet1 extends HttpServlet {
    private List<Etudiant> listEtudiant ;
    @Override
    public void init() {
        listEtudiant= GestionEtudiants.getListeEtudiants();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password =request.getParameter("password");
        ServletContext servletContext=this.getServletContext();
        if (Objects.equals(login,"admin")&&Objects.equals(password,"admin")){
            request.setAttribute("etudiants",listEtudiant);
            this.getServletContext().getRequestDispatcher("/WEB-INF/vue/affichage.jsp").forward(request,response);
        }else servletContext.getRequestDispatcher("/WEB-INF/vue/echec.html").forward(request,response);
    }
}
