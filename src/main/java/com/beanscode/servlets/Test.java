package com.beanscode.servlets;

import java.io.IOException;

import com.beanscode.beans.Auteur;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Test")
public class Test extends HttpServlet {
    private static final long serialVersionUID = 1L;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Auteur auteur = new Auteur();
        auteur.setPrenom("Ilyass");
        auteur.setNom("EL AMRI");
        auteur.setActif(true);
        
        request.setAttribute("auteur", auteur);
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
    }


}