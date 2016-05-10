package com.system.users;

import com.google.gson.GsonBuilder;
import com.system.model.RRHHModel;

import com.google.gson.Gson;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.util.LinkedHashMap;
import java.util.Map;


@WebServlet("/rrhh")
public class RRHHServlet extends HttpServlet  {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        String name = req.getParameter("inputGetName");
        Map<String, String> data = new LinkedHashMap<String, String>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        RRHHModel rrhhModel;
        try {
            rrhhModel = new RRHHModel();
            data.put("name", rrhhModel.getDataFromServer(name));
            response.setCharacterEncoding("UTF-8");
        } catch (NotBoundException e) {
            e.printStackTrace();
            data.put("name", "Server with problem, you try again");
        }finally {
            String json = gson.toJson(data);
            response.getWriter().write(json);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        String name = req.getParameter("inputPostName");
        RRHHModel rrhhModel;
        Map<String, String> data = new LinkedHashMap<String, String>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try {
            rrhhModel = new RRHHModel();
            rrhhModel.addUserToServer(name);
            response.setCharacterEncoding("UTF-8");
            data.put("status", "success");
            data.put("message", "User added successfully");
        } catch (NotBoundException e) {
            e.printStackTrace();
            data.put("status", "error");
            data.put("message", "We have a problem with insert new user");
        }finally {
            String json = gson.toJson(data);
            response.getWriter().write(json);
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        String name = req.getParameter("inputDeleteName");
        RRHHModel rrhhModel;
        Map<String, String> data = new LinkedHashMap<String, String>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try {
            rrhhModel = new RRHHModel();
            rrhhModel.deleteUserToServer(name);
            response.setCharacterEncoding("UTF-8");
            data.put("status", "success");
            data.put("message", "User delete successfully");
        } catch (NotBoundException e) {
            e.printStackTrace();
            data.put("status", "error");
            data.put("message", "We have a problem with delete new user");
        }finally {
            String json = gson.toJson(data);
            response.getWriter().write(json);
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        String originalName = req.getParameter("inputPutOriginalName");
        String newName = req.getParameter("inputPutNewName");
        RRHHModel rrhhModel;
        Map<String, String> data = new LinkedHashMap<String, String>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try {
            rrhhModel = new RRHHModel();
            rrhhModel.updateUserToServer(originalName, newName);
            response.setCharacterEncoding("UTF-8");
            data.put("status", "success");
            data.put("message", "User update successfully");
        } catch (NotBoundException e) {
            e.printStackTrace();
            data.put("status", "error");
            data.put("message", "We have a problem with update new user");
        }finally {
            String json = gson.toJson(data);
            response.getWriter().write(json);
        }
    }
}
