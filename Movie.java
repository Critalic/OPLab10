/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labop10;

import java.util.ArrayList;
/**
 *
 * @author START
 */
public class Movie {
    String title;
    ArrayList <String> actors;

    public Movie(String title) {
        this.title = title;
        this.actors = new ArrayList<>();
    }
    
    public void addActor (String act, Actor actor ) {
        
        actors.add(act);
        actor.addMovie(title);
        
        
    }

    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", actors=" + actors + '}';
    }
    
    
}
