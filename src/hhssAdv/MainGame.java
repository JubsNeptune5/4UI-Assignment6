/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssAdv;

import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author slatz8075
 */
public class MainGame {

    //create variables for the 'player' to access the specific location and scenes
    //(loc short for location)
    private int playerLoc = 0;
    private int playerScene = 0;
    //create the starting info variables
    private String startLoc;
    private char startDir;
    //create a resizable array for the locations
    ArrayList<Location> locations = new ArrayList<>();

    public MainGame() {
        
        //INITILIZATION
        //create a blank file
        FileReader file = null;
        //try to find the info file
        try {
            //create a url for the location of the info file
            URL url = MainGame.class.getResource("src//hhssAdv//info.txt");

            // creating the file reader
            file = new FileReader("src//hhssAdv//info.txt");
        } catch (Exception e) {
            //handle any errors
            e.printStackTrace();
            //exit the program
            System.exit(0);
        }
        
        //use a Scanner with the file
        Scanner in = new Scanner(file);
        //start to fill the location array with locations, and these locations with scenes
        //but first get the starting information
        //it is so store this location as the starting location
        startLoc = in.nextLine();
        //we should now be at the starting direction information
        //so store it as such
        startDir = in.nextLine().charAt(0);
        //finally move to the start of the real information
        for (int l = 0; in.hasNext(); l++) {
            //create/name a location at this spot
            String name = in.nextLine();
            locations.add(new Location());
            locations.get(l).setName(name);
            //using a for loop move through the scene lines
            for (int s = 0; s < 4; s++) {
                //create an empty scene at this spot
                Scene scene = new Scene();
                locations.get(l).setScene(s, scene);
                //get this line
                String sceneLine = in.nextLine();
                //split the sceneLine string by its spaces
                String[] sceneLineParts = sceneLine.split(" ");
                //set the specific parts of the scene equal to the array parts
                scene.setDir(sceneLineParts[0].charAt(0));
                scene.setPic(sceneLineParts[1]);
                //check to see if the next part of the sceneLineParts is true

                if (sceneLineParts[2].substring(0, 4).equals("true")) {
                    //it is true, so set isFrontBlocked equal to true
                    locations.get(l).getScene(s).setIsFrontBlocked(true);
                } else {
                    //so we know that it is false, so set it equal to false
                    locations.get(l).getScene(s).setIsFrontBlocked(false);
                    //and now we know that the newDir, and newLoc are existent, set them too
                    locations.get(l).getScene(s).setNewLoc(sceneLineParts[3]);
                    locations.get(l).getScene(s).setNewDir(sceneLineParts[4].charAt(0));
                }
            }
        }
        //find the position in the location array that is equal to the startLoc
        for (int locPos = 0; locPos < locations.size(); locPos++) {
            //check to see if this location's name is the starting name
            if (locations.get(locPos).getName().equals(startLoc)) {
                //it is so set the player's inital position equal to this one
                playerLoc = locPos;
                //and break out of the for loop
                break;
            }
        }
        //now set the scene the player is facing equal to its numerical equivalent
        if (startDir == 'N') {
            playerScene = 0;
        } else if (startDir == 'E') {
            playerScene = 1;
        } else if (startDir == 'S') {
            playerScene = 2;
        } else {
            playerScene = 3;
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
        return locations.get(playerLoc);
    }

    //setting the location in the location array that the player is at
    public void setLoc(int loc) {
        this.playerLoc = loc;
    }

    //setting the scene that the player is observing
    public void setSce(int sce) {
        this.playerScene = sce;
    }

    //Getter to rectrieve the psce variable to use in the GUI
    public int getPlayerScene() {
        return this.playerScene;
    }

    public void turnLeft() {
        //Check if the direction is equal to North 
        if (getLoc().getScene(playerScene).getDir() == 'N') {
            //Set the scene to be west
            playerScene = 3;
        } else if (getLoc().getScene(playerScene).getDir() == 'E') {
            //Set the scene to be north
            playerScene = 0;
        } else if (getLoc().getScene(playerScene).getDir() == 'S') {
            //Set the scene to be one directyion left of the current direction
            playerScene = 1;
        } else {
            //Set the scene to be one directyion left of the current direction
            playerScene = 2;
        }
    }

    public void turnRight() {
        //Check if the direction is equal to North 
        if (getLoc().getScene(playerScene).getDir() == 'N') {
            //Set the scene to be east
            playerScene = 1;
        } else if (getLoc().getScene(playerScene).getDir() == 'E') {
            //Set the scene to be south
            playerScene = 2;
        } else if (getLoc().getScene(playerScene).getDir() == 'S') {
            //Set the scene to be west
            playerScene = 3;
        } else {
            //Set the scene to be north
            playerScene = 0;
        }
    }

    public void move() {
        //make sure that we can move
        if (getLoc().getScene(playerScene).getIsFrontBlocked() == false) {
            //we can so get the new loc and new dir 
            char pNewDir = getLoc().getScene(playerScene).getNewDir();
            String newLoc = getLoc().getScene(playerScene).getNewLoc();
            System.out.println("newLoc: " + newLoc);
            //Check if the direction is equal to North 
            if (pNewDir == 'N') {
                //Set the players direction to north
                playerScene = 0;
                //check if its east
            } else if (pNewDir == 'E') {
                //Set the players direction to east
                playerScene = 1;
                //check if its south
            } else if (pNewDir == 'S') {
                //Set the players direction to south
                playerScene = 2;
                //it is not all of these make it west
            } else {
                //Set the players direction to west
                playerScene = 3;
            }

            //Go through the positions in the array
            for (int i = 0; i < locations.size(); i++) {
                //Find the position i the array where the new location is located
                if (locations.get(i).getName().equals(newLoc)) {
                    //Set the location as the new location
                    setLoc(i);
                }
            }
        }
    }
}
