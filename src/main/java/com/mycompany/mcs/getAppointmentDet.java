/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mcs;

import static com.mycompany.mcs.getUserDet.getData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class getAppointmentDet {
    
    public static PreparedStatement getData;
    static{
        
          try {
                    
            getData = ChannellingDB.myConnection().prepareStatement("SELECT * FROM appointment WHERE AppointmentNo like ? OR AppointmentDate like ? OR AppointmentTime like ? OR pContactno like ? OR dName like ?");
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(getUserDet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public static ResultSet getData(String search) throws SQLException{          
        
         
         
        getData.setString(1,"%"+search+"%");
        getData.setString(2,"%"+search+"%");
        getData.setString(3,"%"+search+"%");
        getData.setString(4,"%"+search+"%");
        getData.setString(5,"%"+search+"%");
        
        
        
          
        return getData.executeQuery();

    }
    
}
