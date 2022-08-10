package fr.eni.tpjee.mesapplications.chifoumi;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;


@WebServlet("/jeuChifoumi")
public class jeuChifoumi extends HttpServlet {
    private static final long serialVersionUID = 1L;

    String[] choix = new String[] { "Pierre", "Feuille", "Ciseaux"};
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int aleatoire =(int)(Math.random() * 3);
        String sChoixIA = choix[aleatoire];
        request.setAttribute("sChoixIA", sChoixIA);

        request.setAttribute("sChoixIA", sChoixIA);
        System.out.println("choix de l'IA : " + sChoixIA);

        String choixJoueur = request.getParameter("choixJoueur");
        request.setAttribute("choixJoueur", choixJoueur);

        String resultat = null;
        //switch, en fonction du choix du joueur on compare avec la valeur sChoixIA.
        switch (choixJoueur){
            case "Pierre" :
                if(sChoixIA.equals("Pierre")){
                    resultat =  "Egalité";
                } else if (sChoixIA.equals("Feuille")) {
                    resultat =  "Perdu";
                } else {
                    resultat =  "Gagné";
                }
                break;

            case "Feuille" :
                if(sChoixIA.equals("Pierre")){
                    resultat =  "Gagné";
                } else if (sChoixIA.equals("Feuille")) {
                    resultat =  "Egalité";
                } else {
                    resultat =  "Perdu";
                }
                break;

            case "Ciseaux" :
                if (sChoixIA.equals("Pierre")){
                   resultat =  "Perdu";
                } else if (sChoixIA.equals("Feuille")) {
                    resultat = "Gagné";
                } else {
                    resultat = "Egalité";
                }
                break;
        }

        System.out.println(resultat);
        request.setAttribute("resultat", resultat);
        RequestDispatcher rd = this.getServletContext().getNamedDispatcher("resultat");
        rd.forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
