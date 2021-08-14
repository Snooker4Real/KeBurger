package io.github.juneau001.burgers.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/*
* La classe IndexServlet hérite de la classe HttpServlet
* Toutes nos servlets doivent hériter de cette super classe
*
* Une sevlet est une classe Java capable de traiter une requête HTTP
* et de formuler une réponse
*
* */

import io.github.juneau001.burgers.business.*;
import io.github.juneau001.burgers.services.impl.AccService;
import io.github.juneau001.burgers.services.impl.BoissonService;
import io.github.juneau001.burgers.services.impl.BurgerService;
import io.github.juneau001.burgers.services.impl.SauceService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * La classe IndexServlet hérite de la classe HttpServlet
 * Toutes nos servlets doivent hériter de cette super classe
 *
 * Une servlet est une classe Java capable de traiter une requête HTTP
 * et de formuler une réponse
 */
// Annotation pour configurer la servlet dans Tomcat
// La servlet écoute sur l'url /index

@WebServlet(urlPatterns = { "/index"}, loadOnStartup = 1)
public class IndexServlet extends HttpServlet {

    private static List<Integer> annees = new ArrayList<>();
    private static final List<String> mois = new ArrayList<>();
    private static final BurgerService burgers = new BurgerService();
    private static final AccService accompagnements = new AccService();
    private static final BoissonService boissons = new BoissonService();
    private static final SauceService sauces = new SauceService();
    private static final List<Commande> commandes = new ArrayList<>();
    private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
    * */
    public IndexServlet(){
        super();
        Calendar cal = Calendar.getInstance();
        int anneeEnCours = cal.get(Calendar.YEAR);

        for (int i = 0; i < 4; i++){
            annees.add(anneeEnCours + i);
        }

        mois.add("Janvier");
        mois.add("Février");
        mois.add("Mars");
        mois.add("Avril");
        mois.add("Mai");
        mois.add("Juin");
        mois.add("Juillet");
        mois.add("Août");
        mois.add("Septembre");
        mois.add("Octobre");
        mois.add("Novembre");
        mois.add("Décembre");
    }

    /**
     * Cette méthode traite une requête HTTP vers l'url /index
     * et dont la méthode est GET
     *
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(new Date() + " : nouvelle requête HTTP dont la méthode est GET");
        request.setAttribute("annees", annees);
        request.setAttribute("mois", mois);

        AccService.init();
        BurgerService.init();
        BoissonService.init();
        SauceService.init();
        //On enrichit l'objet request avec la liste des burgers
        //Cette liste sera envoyée à la vue
        request.setAttribute("burgers", burgers.getList());
        System.out.println(accompagnements.getList());
        request.setAttribute("accompagnements",accompagnements.getList());
        System.out.println(boissons.getList());
        request.setAttribute("boissons", boissons.getList());
        request.setAttribute("sauces",sauces.getList());

        //On fait suivre à la vue index.jsp
        request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
    }
}
