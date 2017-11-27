/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssAdv;

import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author ja2slate
 */
public class MainGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //INITILIZATION
        //create a blank file
        FileReader file = null;
        //try to find the info file
        try {
            //create a url for the location of the info file
            URL url = MainGame.class.getResource("info.txt");
            System.out.println(url);
            // creating the file reader
            file = new FileReader(url.getFile());
        } catch (Exception e) {
            //handle any errors
            e.printStackTrace();
            //exit the program
            System.exit(0);
        }
        //use a Scanner with the file
        Scanner in = new Scanner(file);

        
        //INITILIZATION OF SCENES AND LOCATIONS
        //variable for the length of the document
        int length = 0;
        //move through the text document until we are at the end of the document
        while (in.hasNext()) {
            in.nextLine();
            //add one to the length
            length++;
        }
        //reset the scanner 
        in.reset();
        //create an empty array of locations, that is as long as the number of locations 
        Location[] locations = new Location[(((length - 2) / 5) + 1)];
        System.out.println("blagh");
        //start to fill the location array with locations, and these locations with scenes
        for (int l = 0; l <= length; l++) {
            
            System.out.println("locationArray # " + l);
            
            //create/name a location at this spot
            locations[l].setName(in.nextLine());
            //using a for loop move through the scene lines
            for (int s = 0; s < 3; s++) {
                //get this line
                String sceneLine = in.next();
                //check to see that this is not a location line (characterized by its second characted not being a space
                if (sceneLine.charAt(1) != ' ') {
                    //it is so break out of the for loop
                    break;
                } else {
                    //split the sceneLine string by its spaces
                    String[] sceneLineParts = sceneLine.split(" ");
                    //create the scene variables using specific parts of the sceneLineParts
                    char dir = sceneLineParts[0].charAt(0);
                    String pic = sceneLineParts[1];
                    //check to see if the next part of the sceneLineParts is true
                    if(sceneLineParts[2] == "true"){
                        //it is true, so create isFrontBlocked equal to true
                        boolean isFrontBlocked = true;
                    }else{
                        //so we know that it is false, so set it equal to false
                        boolean isFrontBlocked = false;
                        //and now we know that the newDir, and newLoc are existant, set them too:
                        char newDir = sceneLineParts[3].charAt(0);
                        String newLoc = sceneLineParts[4];
                    }
                }
            }
        }

        //print out the rolodex
        for (int i = 0; i < length; i++) {
            System.out.println(locations[i]);
        }
    }
}
