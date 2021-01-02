/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labop10;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author START
 */
public class Actor {
    
    String name;
    ArrayList<String> moviesPlayed;

    public Actor(String name) {
        this.name = name;
        this.moviesPlayed = new ArrayList<>();
        
    }
    
    public void addMovie (String movie) {
        moviesPlayed.add(movie);
        
        
    }

    @Override
    public String toString() {
        return "Actor/actress "  + name + " has played in" + moviesPlayed;
    }
    
    
    
}
