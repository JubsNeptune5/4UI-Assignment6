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
    
    public Scene(char dir, String Pic, Boolean isFrontBlocked, char newDir, String newLoc){
        this.dir = dir;
        this.pic = pic;
        this.isFrontBlocked = isFrontBlocked;
        this.newDir = newDir;
        this.newLoc = newLoc;
    }
    
    public char getDir(){
        return this.dir;
    }
    
    public String getPic(){
        return this.pic;
    }
    
    public boolean getIsFrontBlocked(){
        return isFrontBlocked;
    }
    
    public char getNewDir(){
        return this.newDir;
    }
    
    public String getNewLoc(){
        return this.newLoc;
    }
}
