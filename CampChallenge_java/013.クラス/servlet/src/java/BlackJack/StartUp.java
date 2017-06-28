/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author 研人
 */
@WebServlet(name = "BlackJack", urlPatterns = {"/BlackJack"})
public class StartUp extends HttpServlet {

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
            
            //ディーラーのインスタンス生成
            Dealer dealer = new Dealer();
            //ディーラーがディールしたカードをsetCardに与えてmyCardsで所持する処理
            dealer.setCard(dealer.deal());
            //ディーラーがヒットしたカードをsetCardに与えてmyCardsで所持する処理
//            dealer.setCard(dealer.hit());
            //ディーラーのカードが16以上ならヒットし、17以上ならスタンドする処理
            while(dealer.checkSum()){
                dealer.hit();
            }
            
                dealer.open();
                out.print(dealer.dealermyCards);
           
            
            
            //ユーザーのインスタンス生成
            User user = new User();
            //ディーラーがディールしたカードをユーザーのsetCardに与えてmyCardsで所持する処理
            user.setCard(dealer.deal());
            //ディーラーがヒットしたカードをユーザーのsetCardに与えてmyCardsで所持する処理
            //user.setCard(dealer.hit());
            //ユーザーのカードが17以下ならディーラーにヒットしてもらい、18以上ならスタンドする処理
            while(user.checkSum()){
                dealer.hit();
            }
            
                user.open();
                out.print(user.usermyCards);
            
            //ユーザーとディーラーがお互いにスタンドした数値で勝負する処理
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BlackJack</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BlackJack at " + request.getContextPath() + "</h1>");
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


