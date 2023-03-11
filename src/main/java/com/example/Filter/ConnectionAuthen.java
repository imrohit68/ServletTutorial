package com.example.Filter;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionAuthen {
   static Connection connect;
     public static Connection createC(){
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             String user = "root";
             String pass = "@Myedu.com68";
             String url = "jdbc:mysql://localhost:3306/Authentication";

             connect = DriverManager.getConnection(url,user,pass);
         }
         catch (Exception e){
             e.printStackTrace();
         }
         return connect;
     }
}
