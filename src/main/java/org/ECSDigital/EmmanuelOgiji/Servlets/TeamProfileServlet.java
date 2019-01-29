package org.ECSDigital.EmmanuelOgiji.Servlets;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import org.ECSDigital.EmmanuelOgiji.Model.DBAccessor;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Properties;


public class TeamProfileServlet extends HttpServlet {
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
        BasicDBObject TeamProfile=null;
        BasicDBList Squad=null;
        try {
            TeamProfile = (BasicDBObject) DBAccessor.getTeamProfile(httpServletRequest.getParameter("TeamID"));
            Squad = (BasicDBList) TeamProfile.get("squad");
            httpServletRequest.setAttribute("TeamProfile",TeamProfile);
            httpServletRequest.setAttribute("Squad",Squad);
            RequestDispatcher dispatcher = httpServletRequest.getServletContext().getRequestDispatcher("/teamprofile.jsp");
            dispatcher.forward(httpServletRequest, httpServletResponse);
        }
        catch (NullPointerException e){
            RequestDispatcher dispatcher = httpServletRequest.getServletContext().getRequestDispatcher("/Unavailable.jsp");
            dispatcher.forward(httpServletRequest, httpServletResponse);
        }

    }
}