package com.online.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
public static String uname="root";
public static String pswd="prakhar";
public static String uri="jdbc:mysql://localhost:3307/shopping";
public static String driver="com.mysql.jdbc.Driver";
public static Connection conn=null;

private MyConnection(){
    
}
    public static Connection getMyConnection(){
        try {
            if(conn==null)
            {
                Class.forName(driver);
                
                conn=DriverManager.getConnection(uri,uname,pswd);
                 System.out.println("Connection established");
                
            }
            
        } catch (Exception e) {
            System.out.println("Connection failed" + e.getMessage());
        }
        return conn;
    }
    
    public static void main(String[] args) {
        MyConnection.getMyConnection();
        
    }
}
