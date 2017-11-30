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
    //create variables for the 'player' to access the specific location and scenes
    public int pLoc = 0;
    public int pSce = 0;
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
            //create/name a location at this spot
            String name = in.nextLine();
            locations[l] = new Location();
            locations[l].setName(name);
            //using a for loop move through the scene lines
            for (int s = 0; s < 3; s++) {
                //create an empty scene at this spot
                Scene scene = new Scene();
                locations[l].setScene(s, scene);
                //get this line
                String sceneLine = in.nextLine();
                //first check if this line is the special case at the beginning of the document
                if (sceneLine.length() == 1) {
                    //now only add the direction to the scene
                    locations[l].getScene(s).setDir(sceneLine.charAt(0));
                    //and break the scene loop
                    break;
                    //now check to see that this is not a location line (characterized by its second character not being a space
                } else if (sceneLine.charAt(1) != ' ') {
                    //it is so break out of the for loop
                    break;
                    //new we know that this is a regular scene line
                } else {
                    //split the sceneLine string by its spaces
                    String[] sceneLineParts = sceneLine.split(" ");
                    //set the specific parts of the scene equal to the array parts
                    locations[l].getScene(s).setDir(sceneLineParts[0].charAt(0));
                    locations[l].getScene(s).setPic(sceneLineParts[1]);
                    //check to see if the next part of the sceneLineParts is true
                    if (sceneLineParts[2] == "true") {
                        //it is true, so set isFrontBlocked equal to true
                        locations[l].getScene(s).setIsFrontBlocked(true);
                    } else {
                        //so we know that it is false, so set it equal to false
                        locations[l].getScene(s).setIsFrontBlocked(false);
                        //and now we know that the newDir, and newLoc are existent, set them too:
                        System.out.println(sceneLineParts[3]);
                        locations[l].getScene(s).setNewLoc(sceneLineParts[3]);
                        locations[l].getScene(s).setNewDir(sceneLineParts[4].charAt(0));
                    }
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new main game
        MainGame game = new MainGame();
    }

    //getters for the information inside of the arrays
    public Location getLoc() {
        return locations[pLoc];
    }

    public void setLoc(int loc) {
        this.pLoc = loc;
    }
}
