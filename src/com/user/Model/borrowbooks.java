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
public class borrowbooks {
    
    
        
    private int id;
    private String name;
    private String person;
    
    
    public borrowbooks(){
        
    }

    public borrowbooks(int aInt, String name1, String person) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        this.id = aInt;
        this.name = name1;
        this.person = person;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id =id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }
    public String getPerson(){
        return person;
    }
    public void setPerson(String per){
        this.person =per;
    }
    
    
}
