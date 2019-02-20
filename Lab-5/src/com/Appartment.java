/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author jamesostmann
 */
public class Appartment extends Dwelling {
    
    private String appartmentNum;
    private boolean laundry;
    
    
    public Appartment() {
    
    
        
        this(null,null,null,null,0,0.0,null,false);
        
    
    }
    public Appartment(String appartmentNum, boolean laundry) {
    
    
        this(null,null,null,null,0,0.0,appartmentNum,laundry);
        
        
    
    }
    public Appartment(String streetAddress, String city, String state, String zipCode, int bedRooms, double bathRooms, String appartmentNum, boolean laundry) {
    
        super(streetAddress,city,state,zipCode,bedRooms,bathRooms);
        this.appartmentNum = appartmentNum;
        this.laundry = laundry;
    
    }

    public String getAppartmentNum() {
        return appartmentNum;
    }

    public void setAppartmentNum(String appartmentNum) {
        this.appartmentNum = appartmentNum;
    }

    public boolean isLaundry() {
        return laundry;
    }

    public void setLaundry(boolean laundry) {
        this.laundry = laundry;
    }
    
    @Override
    public String toString() {
    
        return "New Appartment: " + System.lineSeparator() + super.toString() + "|" + this.appartmentNum + "|" + this.laundry;
    
    }
}
