package isil.pe.proyjsp.controller;

import isil.pe.proyjsp.dao.UserDao;
import isil.pe.proyjsp.model.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListUserServlet", value = "/ListUserServlet")
public class ListUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserDao userDao = new UserDao();
        try {
            List<User> listUsers = userDao.getUsers();
            RequestDispatcher dispatcher = request.getRequestDispatcher("/listuser.jsp");
            request.setAttribute("list",listUsers);
        } catch (Exception e) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/error.jsp");
            request.setAttribute("message", e );
            requestDispatcher.forward(request,response);
            e.printStackTrace();
        }
    }
}
