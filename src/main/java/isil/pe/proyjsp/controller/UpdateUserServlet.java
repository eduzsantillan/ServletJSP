package isil.pe.proyjsp.controller;

import isil.pe.proyjsp.dao.UserDao;
import isil.pe.proyjsp.model.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "UpdateUserServlet", value = "/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/updateuser.jsp");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserDao dao = new UserDao();
        String nroDocumento = request.getParameter("nroDoc");
        User user = new User();
        user.setName(request.getParameter("name"));
        user.setLastname(request.getParameter("lastname"));
        user.setUsername(request.getParameter("username"));
        user.setPass(request.getParameter("pass"));
        user.setTipDoc(request.getParameter("tipDoc"));
        user.setEnable(Integer.parseInt(request.getParameter("enable")));

        try {
            int rowsAffected = dao.updateUser(nroDocumento, user);

            if(rowsAffected>0){
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/success.jsp");
                request.setAttribute("mensaje", "El usuario de dni "+ nroDocumento + " fue actualizado correctamente");
                requestDispatcher.forward(request, response);
            }else{
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/error.jsp");
                request.setAttribute("mensaje", "El usuario de dni "+ nroDocumento + " no existe");
                requestDispatcher.forward(request, response);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
