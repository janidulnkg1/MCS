/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mcs;

/**
 *
 * @author User
 */
class Doctors {
    private int dID;
    private String dName, dSpeciality;
    
    public Doctors(int dID, String dName, String dSpeciality){
        this.dID=dID;
        this.dName=dName;
        this.dSpeciality=dSpeciality;
    }
    public int getdID(){
        return dID;
    }
     public String getdName(){
        return dName;
    }
      public String getdSpeciality(){
        return dSpeciality;
    }
    
    
    
}
