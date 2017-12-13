/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssAdv;

/**
 *
 * @author slatz8075
 */
public class Location {
    
    private String name;
    private Scene[] scenes = new Scene[4];
    
    //constructor for setting the name of the location
    public void setName(String name){
        this.name = name;
    }
    
    //return the name string
    public String getName(){
        return this.name;
    }
    
    //constructor for setting the name of the scene
    public void setScene(int index, Scene scene){
        this.scenes[index] = scene;
    }
    
    //return the scene number    
    public Scene getScene(int index){
        return scenes[index];
    }
}