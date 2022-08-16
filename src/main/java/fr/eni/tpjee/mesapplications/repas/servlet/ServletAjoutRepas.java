package fr.eni.tpjee.mesapplications.repas.servlet;

import fr.eni.tpjee.mesapplications.repas.bll.SuiviRepasManager;
import fr.eni.tpjee.mesapplications.repas.bo.Aliments;
import fr.eni.tpjee.mesapplications.repas.bo.Repas;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;


@WebServlet("/ServletAjoutRepas")
public class ServletAjoutRepas extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher rd = this.getServletContext().getNamedDispatcher("Ajout");
        rd.forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        LocalTime heureRepas = null;
        LocalDate dateRepas = null;

        dateRepas = LocalDate.parse(request.getParameter("dateRepas"));
        heureRepas = LocalTime.parse((request.getParameter("heureRepas")));
        String aliment[] = request.getParameter("alimentsRepas").split(",");



        Repas repas = new Repas(heureRepas,dateRepas);

        for (String s : aliment) {
            if (!s.isBlank()) {
                Aliments aliments = new Aliments(s);
                repas.addAliment(aliments);
            }
        }

        SuiviRepasManager suiviRepasManager = new SuiviRepasManager();

        try {

            suiviRepasManager.addRepas(repas);
            RequestDispatcher rd = this.getServletContext().getNamedDispatcher("Historique");
            rd.forward(request,response);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
