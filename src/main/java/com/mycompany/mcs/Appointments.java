/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mcs;

/**
 *
 * @author User
 */
class Appointments {
     private int AppointmentID,AppointmentNo;
    private String AppointmentDate, AppointmentTime, pTitle,pFname,pLname,pContactno,pAge,dName;
    
    public Appointments(int AppointmentID,int AppointmentNo,  String AppointmentDate, String AppointmentTime,String pTitle,String pFname,String pLname,String pContactno,String pAge,String pdName){
        this.AppointmentID=AppointmentID;
        this.AppointmentNo=AppointmentNo;
        this.AppointmentDate=AppointmentDate;
        this.AppointmentTime=AppointmentTime;
        this.pTitle=pTitle;
        this.pFname=pFname;
        this.pLname=pLname;
        this.pContactno=pContactno;        
        this.dName=dName;
        
    }

    Appointments(int aInt, int aInt0, String string, String string0, String string1, String string2, String string3, String string4, String string5, String string6, boolean add) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public int getAppointmentID(){
        return AppointmentID;
    }
    public int getAppointmentNo(){
        return AppointmentNo;
    }
    public String getAppointmentDate(){
        return AppointmentDate;
    }
    public String getAppointmentTime(){
        return AppointmentTime;
    }public String getpTitle(){
        return pTitle;
    }public String getpFname(){
        return pFname;
    }
    public String getpLname(){
        return pLname;
    }
     public String getpContactno(){
        return pContactno;
    }
      public String getpAge(){
        return pAge;
    }
      public String getdName(){
        return dName;
    }
      
     
}
