/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssAdv;

/**
 *
 * @author slatz8075
 */
public class Scene {

    private char dir;
    private String pic;
    private boolean isFrontBlocked;
    private String newLoc;
    private char newDir;
/*
    //initilize the scene with meaningless variables/ themselves
    public Scene(){
        this.dir = dir;
        this.pic = pic;
        this.isFrontBlocked = isFrontBlocked;
        this.newLoc = newLoc;
        this.newDir = newDir;
    }
*/
    
    public char getDir(){
        return this.dir;
    }
    
    public void setDir(char dir){
        this.dir = dir;
    }
    
    public String getPic(){
        return this.pic;
    }
    
    public void setPic(String Pic){
        this.pic = pic;
    }
    
    public boolean getIsFrontBlocked(){
        return isFrontBlocked;
    }
    
    public void setIsFrontBlocked(boolean isFrontBlocked){
        this.isFrontBlocked = isFrontBlocked;
    }
    
    public String getNewLoc(){
        return this.newLoc;
    }
    
    public void setNewLoc(String newLoc){
        this.newLoc = newLoc;
    }
    
    public char getNewDir(){
        return this.newDir;
    }
    
    public void setNewDir(char newDir){
        this.newDir = newDir;
    }
}
