package isil.pe.proyjsp.controller;

import isil.pe.proyjsp.dao.UserDao;
import isil.pe.proyjsp.model.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "UserServlet", value = "/UserServlet")
public class AddUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("/adduser.jsp");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserDao dao = new UserDao();
        int rowsAffected = 0;

        User user = new User();
        user.setName(request.getParameter("name"));
        user.setLastname(request.getParameter("lastname"));
        user.setUsername(request.getParameter("username"));
        user.setPass(request.getParameter("pass"));
        user.setTipDoc(request.getParameter("tipDoc"));
        user.setNroDoc(request.getParameter("nroDoc"));
        user.setEnable(Integer.parseInt(request.getParameter("enable")));

        try{
            rowsAffected = dao.addUser(user);
            if(rowsAffected>0) {
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/success.jsp");
                request.setAttribute("rowsaffected", rowsAffected);
                requestDispatcher.forward(request, response);
            }
        }catch(Exception e){
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/error.jsp");
            request.setAttribute("message", e );
            requestDispatcher.forward(request,response);
            e.printStackTrace();
        }


    }
}
