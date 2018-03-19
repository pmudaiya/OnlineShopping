/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.online.customer;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CustomerController", urlPatterns = {"/CustomerController"})
public class CustomerController extends HttpServlet {

     private String uname,pswd,name,mno,emailid,city,state,country,idtype,idno;
     RequestDispatcher rd=null;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try {
            
            uname=request.getParameter("uname");
            pswd =request.getParameter("pswd");
            name =request.getParameter("name");
               mno=request.getParameter("mno");
               emailid=request.getParameter("emailid");
               city=request.getParameter("city");
               state=request.getParameter("state");
              country=request.getParameter("country");
              idtype=request.getParameter("idtype");
              idno=request.getParameter("idno");
              CustomerBean bean= new CustomerBean();
              bean.setUname(uname);
              bean.setPswd(pswd);
              bean.setName(name);
              bean.setMno(mno);
              bean.setEmailid(emailid);
              bean.setCity(city);
              bean.setState(state);
              bean.setCountry(country);
              bean.setIdtype(idtype);
              bean.setIdno(idno);
              CustomerDAO cdao = new CustomerDAO();     
            if(cdao.registration(bean))
            {
                request.setAttribute("msg", "ho gya ji");
                rd= request.getRequestDispatcher("pages/Customer/CustomerRegistration.jsp");
                rd.forward(request, response);
            }
            else
            {
                
                 request.setAttribute("msg", "humse na ho payega");
                rd= request.getRequestDispatcher("pages/Customer/CustomerRegistration.jsp");
                rd.forward(request, response); 
            }
        } catch(Exception e)
        {
            System.out.println("error in registration" + e.getMessage());
        }

    }

   

   
}