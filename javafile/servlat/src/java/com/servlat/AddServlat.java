/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlat;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Deshan
 */
public class AddServlat extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        int i=Integer.parseInt(request.getParameter("num1"));
         int j=Integer.parseInt(request.getParameter("num1"));
         int k=i+j;
         PrintWriter out=response.getWriter();
        out.println("Value : "+k);
    }
    
}
