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
            //ディーラーのカードが16以下ならヒットし、17以上ならスタンドする処理
            while(dealer.checkSum()){
                dealer.setCard(dealer.hit());
            }
            //ディーラーの手札を表示
            out.print("ディーラーの手札" + dealer.dealermyCards + "<br>");
            //カードの合計値を表示（ディーラー）
            out.print("ディーラーのカードの合計値は" + dealer.open() + "<br>" + "<br>");
            
            //ユーザーのインスタンス生成
            User user = new User();
            //ディーラーがディールしたカードをユーザーのsetCardに与えてmyCardsで所持する処理
            user.setCard(dealer.deal());
            //ユーザーのカードが17以下ならディーラーにヒットしてもらい、18以上ならスタンドする処理
            while(user.checkSum()){
                user.setCard(dealer.hit());
            }
            //ユーザーの手札を表示
            out.print("プレイヤーの手札" + user.usermyCards + "<br>");
            //カードの合計値を表示（ユーザー）
            out.print("プレイヤーのカードの合計値は" + user.open() + "<br>" + "<br>");
            
            
            //ユーザーとディーラーがお互いにスタンドした数値で勝負する処理
            
            if(user.open() >= 22){
                out.print("プレイヤーのバストでディーラーの勝利！");
            }else if(dealer.open() >= 22 && user.open() < 22){
                out.print("ディーラーのバストでプレイヤーの勝利！");    
            }else if(dealer.open() < user.open()){
                out.print("プレイヤーの勝利！");
            }else if(dealer.open() > user.open()){
                out.print("ディーラーの勝利！");
            }else if(dealer.open() == user.open()){
                out.print("引き分け！");
            }
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


