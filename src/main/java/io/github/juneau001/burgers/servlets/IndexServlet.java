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

import io.github.juneau001.burgers.business.Accompagnement;
import io.github.juneau001.burgers.business.Boisson;
import io.github.juneau001.burgers.business.Burger;
import io.github.juneau001.burgers.business.Sauce;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Annotation pour configurer la Servlet dans Tomcat
// La servlet écoute sur l'url /index
@WebServlet(urlPatterns = { "/index", "/commande", "/toto"}, loadOnStartup = 1)
public class IndexServlet extends HttpServlet {

    private static List<Integer> annees = new ArrayList<>();
    private static final List<String> mois = new ArrayList<>();
    private static final List<Burger> burgers = new ArrayList<>();
    private static final List<Accompagnement> accompagnements = new ArrayList<>();
    private static final List<Boisson> boissons = new ArrayList<>();
    private static final List<Sauce> sauces = new ArrayList<>();


    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
    * */
    public IndexServlet(){
        super();
        Calendar cal = Calendar.getInstance();
        int anneeEnCOurs = cal.get(Calendar.YEAR);

        for (int i = 0; i < 4; i++){
            annees.add(anneeEnCOurs + i);
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

        burgers.add(new Burger("Burger Guacamole", 6.5f));
        burgers.add(new Burger("Quarter-Pounder", 5.1f));
        burgers.add(new Burger("BBQ-Burger", 7f));
        burgers.add(new Burger("CheeseBurger", 2f));

        accompagnements.add(new Accompagnement("Frites"));
        accompagnements.add(new Accompagnement("Bacon-Frites"));
        accompagnements.add(new Accompagnement("Salade"));

        boissons.add(new Boisson("Coca Cola"));
        boissons.add(new Boisson("Montain Dew"));
        boissons.add(new Boisson("Iced Tea"));
        boissons.add(new Boisson("Pepsi"));
        boissons.add(new Boisson("Powerade"));
        boissons.add(new Boisson("Eau"));

        sauces.add(new Sauce("Ketchup"));
        sauces.add(new Sauce("Mayonnaise"));
        sauces.add(new Sauce("Algérienne"));
        sauces.add(new Sauce("Moutarde"));
        sauces.add(new Sauce("Blanche"));
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
        //request.setAttribute("années", annees);
        //request.setAttribute("années", annees);
        //On enrichit l'objet request avec la liste des burgers
        //Cette liste sera envoyée à la vue
        request.setAttribute("burgers", burgers);
        request.setAttribute("accompagnement",accompagnements);
        request.setAttribute("boissons", boissons);
        request.setAttribute("sauces",sauces);

        //On fait suivre à la vue index.jsp
        request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);


        /*
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            // TODO Auto-generated method stub
            super.doPost(req, resp);
        }

         */
    }
}
