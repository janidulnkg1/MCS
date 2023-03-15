/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mcs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author User
 */
public class ChannellingDB {
    
    public static Connection myConnection() throws SQLException {
        
        Connection connection=null;
        
            try{
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/channellingdb?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
          
            
        }catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        
        return connection;
    }
}
    

