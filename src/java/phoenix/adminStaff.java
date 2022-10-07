 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phoenix;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "adminStaff", urlPatterns = {"/adminStaff"})
public class adminStaff extends HttpServlet {

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
            out.println("<title>Servlet adminStaff</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet adminStaff at " + request.getContextPath() + "</h1>");
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
        String username=request.getParameter("username");
       String password=request.getParameter("password");
       
       
        RequestDispatcher dispatcher=null;
       
        try {
             Statement st ;

                   

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/DBWEB?useSSL=false","root","");
            PreparedStatement pst=con.prepareStatement("insert into userAc(fname,lname,pswd,addr,email,mobno) values (?,?,?,?,?,?)");
            pst.setString(1, username);
                        pst.setString(2, password);
                                          int rowCount = pst.executeUpdate();
                                                dispatcher=request.getRequestDispatcher("register.jsp");
         
            dispatcher.forward(request, response);
            
        } catch (Exception e) {
        }
    }
    }

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
        String fname=request.getParameter("fname");
       String lname=request.getParameter("lname");
       String pswd=request.getParameter("pswd");
       String addr=request.getParameter("addr");
        String email=request.getParameter("email");
        String mobno=request.getParameter("mobno");
       
        RequestDispatcher dispatcher=null;
       
        try {
             Statement st ;

                   

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/DBWEB?useSSL=false","root","");
            PreparedStatement pst=con.prepareStatement("insert into userAc(fname,lname,pswd,addr,email,mobno) values (?,?,?,?,?,?)");
            pst.setString(1, fname);
                        pst.setString(2, lname);
                                    pst.setString(3, pswd);
                                                pst.setString(4, addr);
                                                    pst.setString(5, email);
                                                        pst.setString(4, mobno);
                                                
                                                int rowCount = pst.executeUpdate();
                                                dispatcher=request.getRequestDispatcher("register.jsp");
         
            dispatcher.forward(request, response);
            
        } catch (Exception e) {
        }
    }
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
