/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssAdv;

/**
 *
 * @author slatz8075
 */
public class loc {
    private String loc;
    private String dir;
    private String image;
    private boolean isWall;
    private String newLoc;
    private String newDir;
    
    //constructor using the name
    public void setLoc(String loc){
        this.loc = loc;
    }
    
    public void setDir(String dir){
        this.dir = dir;
    }
    
    public void setImage(String img){
        this.image = img;
    }
    
    public boolean isWall(String dir){
        this.dir = dir;
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