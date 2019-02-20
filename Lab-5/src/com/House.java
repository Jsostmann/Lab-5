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
public class House extends Dwelling {
    
    private double acreage;
    private int garageSize;
    
    public House() {
    
        this(null,null,null,null,0,0.0,0.0,0);
        
    
    }
    public House(double acreage, int garageSize) {
    
        this(null,null,null,null,0,0.0,acreage,garageSize);
    
        
    }
    public House(String streetAddress, String city, String state, String zipCode, int bedRooms, double bathRooms, double acreage, int garageSize){
    
        super(streetAddress,city,state,zipCode,bedRooms,bathRooms);
        this.acreage = acreage;
        this.garageSize = garageSize;
        
    
    }

    public double getAcreage() {
        return acreage;
    }

    public void setAcreage(int acreage) {
        this.acreage = acreage;
    }

    public int getGarageSize() {
        return garageSize;
    }

    public void setGarageSize(int garageSize) {
        this.garageSize = garageSize;
    }
    
    @Override
    public String toString() {
    
     return "New House: " + System.lineSeparator() + super.toString() + "|" + this.acreage + "|" + this.garageSize;
    
    }
    
    
    
}
