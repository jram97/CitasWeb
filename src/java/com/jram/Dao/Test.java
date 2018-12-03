/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jram.Dao;

/**
 *
 * @author jram97
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Connect con;
        con = new Connect();
        con.Start();

        /*
        
        
Timestamp now = new Timestamp(new Date().getTime());
        // create a sql date object so we can use it in our INSERT statement
      Calendar calendar = Calendar.getInstance();
      java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.S");
  Date parsedDate = df.parse((request.getParameter("dateOut")));
  java.sql.Timestamp timestamp = new Timestamp(parsedDate.getTime());
  AdminService adminservice = new AdminService();
  
  out.println(timestamp);
        
        
         */
    }

}
