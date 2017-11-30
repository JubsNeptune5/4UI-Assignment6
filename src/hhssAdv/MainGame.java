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
 * @author slatz8075
 */
public class MainGame {

    GUI gui;
    //create variables for the 'player' to 
    int ploc = 0;
    int pSce = 0;
    //create the array of locations:
    //create a length variable to define how long the array is 100
    int length = 100;
    //create an empty array of locations, that is as long as the defined length
    Location[] locations = new Location[length];

    public MainGame() {
        //create a new Gui, that passes in this game to use

        gui = new GUI(this);

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
            System.out.println("success!");
        } catch (Exception e) {
            //handle any errors
            e.printStackTrace();
            //exit the program
            System.exit(0);
            System.out.println("fail");
        }
        //use a Scanner with the file
        Scanner in = new Scanner(file);
        System.out.println("Thisfar");

        //start to fill the location array with locations, and these locations with scenes
        for (int l = 0; l < length; l++) {

            System.out.println("Array Position " + l);
            //create/name a location at this spot
            System.out.println("Thisfar");
            String name = in.nextLine();
            System.out.println("name: " + name);
            locations[l] = new Location();
            locations[l].setName(name);

            //using a for loop move through the scene lines
            for (int s = 0; s < 3; s++) {
                //get this line
                String sceneLine = in.nextLine();
                //check to see that this is not a location line (characterized by its second character not being a space
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
                    if (sceneLineParts[2] == "true") {
                        //it is true, so create isFrontBlocked equal to true
                        boolean isFrontBlocked = true;
                    } else {
                        //so we know that it is false, so set it equal to false
                        boolean isFrontBlocked = false;
                        //and now we know that the newDir, and newLoc are existent, set them too:
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainGame game = new MainGame();

        //getters for the information inside of the arrays
    }
    
    
    public Location getLoc() {
        return locations[ploc];
    }

    public void setLoc(int loc) {
        this.pLoc = loc;
    }
}
