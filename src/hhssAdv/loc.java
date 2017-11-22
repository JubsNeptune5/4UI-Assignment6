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
    private String n;
    private String e;
    private String s;
    private String w;
    private String image;
    private boolean isWall;
    private String newLoc;
    private String newDir;
    
    //constructor using the name
    public void setLoc(String loc){
        this.loc = loc;
    }
    
    public void setN(String n){
        this.n = n;
    }
    
    public void setE(String e){
        this.e = e;
    }
    
    public void setS(String s){
        this.s = s;
    }
    
    public void setW(String w){
        this.w = w;
    }
    
    public void setImage(String img){
        this.image = img;
    }
    
    public boolean isWall(){
        return isWall;
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