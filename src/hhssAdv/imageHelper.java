/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssAdv;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author laveh2107
 */
public class imageHelper {
    public static BufferedImage loadImage(String name){
        //Set bufferpic
        BufferedImage pic = null;
        try{
            //Read image from file if there is any
            pic = ImageIO.read(new File(name));
        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }
        return pic;
        
    }
}
