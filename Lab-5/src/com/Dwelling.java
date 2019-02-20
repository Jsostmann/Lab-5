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
public class Dwelling {

    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private int bedRooms;
    private double bathRooms;

    public Dwelling() {

        this(null,null,null,null,0,0.0);

    }

    public Dwelling(String streetAddress, String city, String state, String zipCode, int bedRooms, double bathRooms) {

        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.bedRooms = bedRooms;
        this.bathRooms = bathRooms;

    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public int getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(int bedRooms) {
        this.bedRooms = bedRooms;
    }

    public double getBathRooms() {
        return bathRooms;
    }

    public void setBathRooms(double bathRooms) {
        this.bathRooms = bathRooms;
    }

    
    
    @Override
    public String toString() {

      return this.streetAddress + "|" + this.city + "|" + this.state + "|" + this.zipCode + "|" + this.bedRooms + "|" + this.bathRooms;
        
    }

}
