/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssAdv;

/**
 *
 * @author ja2slate
 */
public class Scene {

    private char dir;
    private String pic;
    private boolean isFrontBlocked;
    private char newDir;
    private String newLoc;
    
    public void setDir(char dir){
        this.dir = dir;
    }
    
    public char getDir(){
        return this.dir;
    }
    
    public void setPic(String Pic){
        this.pic = pic;
    }
    
    public String getPic(){
        return this.pic;
    }
    
    public void setIsFrontBlocked(Boolean isFrontBlocked){
        this.isFrontBlocked = isFrontBlocked;
    }
    
    public boolean getIsFrontBlocked(){
        return isFrontBlocked;
    }
    
    public void setNewDir(char newDir){
        this.newDir = newDir;
    }
    
    public char getNewDir(){
        return this.newDir;
    }
    
    public void setNewLoc(String newLoc){
        this.newLoc = newLoc;
    }
    
    public String getNewLoc(){
        return this.newLoc;
    }
    
}
