package fr.eni.tpjee.mesapplications.repas.servlet;

import fr.eni.tpjee.mesapplications.repas.bll.SuiviRepasManager;
import fr.eni.tpjee.mesapplications.repas.bo.Repas;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@WebServlet("/ServletVisualisationRepas")
public class ServletVisualisationRepas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Repas> listeDeRepas = new ArrayList<>();
        SuiviRepasManager repasManager = new SuiviRepasManager();
        listeDeRepas = repasManager.getAllRepas();
        request.setAttribute("listeDeRepas", listeDeRepas);


        RequestDispatcher rd = this.getServletContext().getNamedDispatcher("Historique");
        rd.forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);
    }
}
