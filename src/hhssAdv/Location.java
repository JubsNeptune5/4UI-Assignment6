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
    
    //constructor using the name
    public void setName(String name){
        this.name = name;
    }
    
    public void setScene(int index, Scene scene){
        this.scenes[index] = scene;
    }
    
    public Scene getScene(int index){
        return scenes[index];
    }
    
    @Override
    public String toString(){
        String format = this.loc + "\n";
        format += "direction: " + this.dir + "\n";
        format += "Image: " + this.image + "\n";
        format += "Image: " + this.image + "\n";
        
        return format;
    }
}