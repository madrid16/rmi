package com.system.users;

import com.system.model.RRHHModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.NotBoundException;


@WebServlet("/platzi-java")
public class PlatziJava extends HttpServlet  {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = req.getParameter("message");
        resp.setContentType("application/json");
        try (PrintWriter writer = resp.getWriter()){
            writer.print("{\"message\": \"" + message + "\"}");
            writer.flush();
        }
        RRHHModel rrhhModel;
        try {
            rrhhModel = new RRHHModel();
            rrhhModel.addUserToServer(message);
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String line;
        StringBuffer json = new StringBuffer();
        try (BufferedReader reader = req.getReader()){
            while ((line = reader.readLine()) != null){
                json.append(line);
            }
        }
        System.out.println(json.toString());
    }
}
