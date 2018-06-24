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
public class books {
    
    private int id;
    private String name;
    private String author;
    private double price;
    
    
    public books(){
        
    }

    public books(int aInt, String name1, String author, double price) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        this.id = aInt;
        this.name = name1;
        this.author = author;
        this.price = price;
    }

    public books(int aInt, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String au){
        this.author =au;
    }
    public double getprice(){
        return price;
    }
    public void setprice(double price){
        this.price =price;
    }
    
}
