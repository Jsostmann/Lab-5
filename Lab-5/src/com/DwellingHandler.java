/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jamesostmann
 */
public class DwellingHandler {
    
    private static ArrayList<Dwelling> dwellings;
    private static Scanner scan;
    public DwellingHandler() {
    
        dwellings = new ArrayList<>();
        
    }
    
    @Override
    public String toString() {
    
        String result = "";
        
        for(Dwelling temp: dwellings) {
        
            result += temp.toString() + System.lineSeparator() + System.lineSeparator();
        
        }
        
            
        return result;
    
    }
    
    public void readDwellings(String fName) {
    
        try {
        
            scan = new Scanner(new File(fName));
            
            while(scan.hasNextLine()) {
               
              char letter = scan.nextLine().trim().charAt(0);
                
                if(letter == 'H') {
            
                   addHouse();
            
                } else if( letter == 'A') {
            
                    addAppartment();
            
                }
            
            }
            
        } catch (FileNotFoundException e) {
        
        
        
        }
        
        
    }
    
    public void printDwellings() {
        
        
        
        JOptionPane.showMessageDialog(null, this.toString(), "Dwellings" , JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
    
    private void addHouse(){
    
        String streetAddress = scan.nextLine();
        String city = scan.nextLine();
        String state = scan.nextLine();
        String zipCode = scan.nextLine();
        int bedRooms = Integer.parseInt(scan.nextLine());
        double bathRooms = Double.parseDouble(scan.nextLine());
        
        double acreage = Double.parseDouble(scan.nextLine());
        int garageSize = Integer.parseInt(scan.nextLine());
        
        House house = new House(streetAddress,city,state,zipCode,bedRooms,bathRooms,acreage,garageSize);
        dwellings.add(house);
    
    }
    
    private void addAppartment() {
        
        String streetAddress = scan.nextLine();
        String city = scan.nextLine();
        String state = scan.nextLine();
        String zipCode = scan.nextLine();
        int bedRooms = Integer.parseInt(scan.nextLine());
        double bathRooms = Double.parseDouble(scan.nextLine());
        
        String appartmentNum = scan.nextLine();
        boolean laundry = convertToBoolean(Integer.parseInt(scan.nextLine()));
        
        
        
        
        Appartment appartment = new Appartment(streetAddress,city,state,zipCode,bedRooms,bathRooms,appartmentNum,laundry);
        dwellings.add(appartment);
        
    }
    
    private boolean convertToBoolean(int num) {
    
       return num == 1;
        
    }
    
    
    
}
