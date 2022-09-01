/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Marine
 */
public class Connect extends HttpServlet {
    
    // USERS ARRAYLIST
    ArrayList<User> users = CollectionUser.example();
    
        /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // CREATE A SESSION
        HttpSession session = request.getSession();
        // GET INPUT DATA : EMAIL AND PASSWORD
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        // CONNECTION BOOLEAN
        int connect = 0;
        
        
        // LOOP ON USERS ARRAYLIST
        for(User element: users) {
            // IF EMAIL EQUALS USERS EMAIL
            if(email.equals(element.getEmail())) {
                // IF PASSWORD EQUAL USERS PASSWORD
                if(password.equals(element.getPassword())) {
                    // IF ALL EQUALS ARE TRUE
                    connect = element.getID();
                }
            }
        }
        
        session.setAttribute("user", connect);
        
        // IF CONNECTION IS TRUE
        if(connect != 0) {
            session.setAttribute("errors", false);
            // REDIRECT TO
            response.sendRedirect("index.jsp");
        }
        // CONNECTION IS FALSE
        else {
            session.setAttribute("errors", true);
            // REDIRECT TO
            response.sendRedirect("formconnection.jsp");
        }
    }
    
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Connect</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Connect at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
