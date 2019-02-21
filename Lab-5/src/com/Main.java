/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import com.DwellingHandler;
/**
 *
 * @author jamesostmann
 */
public class Main {
    
    public static void main(String[] args) {
        
       
        DwellingHandler handler = new DwellingHandler();
        
        handler.readDwellings("dwelling.txt");
        handler.printDwellings();
        
        
        
    }
    
    
    
}
