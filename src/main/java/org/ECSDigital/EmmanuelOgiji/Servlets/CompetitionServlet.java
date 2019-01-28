package org.ECSDigital.EmmanuelOgiji.Servlets;
import com.mongodb.BasicDBList;
import org.ECSDigital.EmmanuelOgiji.Model.DBAccessor;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import java.util.Properties;



public class CompetitionServlet extends HttpServlet {
    Properties prop = new Properties();
    {
        try {
            FileInputStream fis = new FileInputStream("src/Files/env.properties");
            prop.load(fis);
        } catch (FileNotFoundException e) {
            System.out.println("env.properties not found");
        } catch (IOException e){
            System.out.println("Properties file IO Exception");
        }
    }

    public void doGet (HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        BasicDBList CompetitionList = (BasicDBList) DBAccessor.getCompetitionsCollection().get("competitions");
        httpServletRequest.setAttribute("CompetitionList",CompetitionList);
        RequestDispatcher dispatcher = httpServletRequest.getServletContext().getRequestDispatcher("/competitions.jsp");
        dispatcher.forward(httpServletRequest, httpServletResponse);
    }
}
