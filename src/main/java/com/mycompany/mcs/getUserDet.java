/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mcs;

import static com.mycompany.mcs.getUserDet.getData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Mohomed Faizal Aadil
 */
public class getUserDet {
    
    public static PreparedStatement getData;
    static{  
                   
        try {
                    
            getData = ChannellingDB.myConnection().prepareStatement("SELECT * FROM userdetails WHERE userID like ? OR loginUsername like ? OR userType like ?   ");
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(getUserDet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   // }

    public static ResultSet getData(String search) throws SQLException{          
        
        getData.setString(1,"%"+search+"%");
        getData.setString(2,"%"+search+"%");
        getData.setString(3,"%"+search+"%");
       
          
        return getData.executeQuery();

    }

}

