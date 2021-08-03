package io.github.juneau001.burgers.servlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = {"/Entete"})
public class Entete extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{

    }

}
