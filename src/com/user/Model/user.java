/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.user.Model;

/**
 *
 * @author Pasan
 */
public class user {

    public static String getcontactNo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static String getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String id;
    private String name;
    private String contactNo;
    private String address;
    private String email;
 
    public user(){
        
    }
    
   /* public user(String id,String n,String cn,String ad,String e){
        this.id = id;
        this.name = n;
        this.contactNo = cn;
        this.address = ad;
        this.email = e;
    }*/
    
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id =id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }
    public String getContactNo(){
        return contactNo;
    }
    public void setContactNo(String co){
        this.contactNo =co;
    }
    public String getaddress(){
        return address;
    }
    public void setaddress(String ad){
        this.address =ad;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email =email;
    }

   /* public String getContactNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
}