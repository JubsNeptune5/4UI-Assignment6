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
public class CatchGame {

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
            URL url = CatchGame.class.getResource("info.txt");
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

        //CREATING AN ARRAY OF LOCATIONS
        //variable for the length of the document
        int length = 0;  
        //create a variable for 
        //move through the text document until we are at the end of the document
        while (in.hasNext()) {
            //add one to the length
            length++;
        }
        //create an empty array of locations, that is as long as the number of locations 
        Location[] locations = new Location[(((length-2)/5)+1)]; 
        //start to fill the location array with locations, and these locations with scenes
        for (int i = 0; i < length; i++) {
            
            
            
            //check 
            String location = in.next();
            String n = in.next();
            String email = in.nextLine().trim();
            //create the location
            Contact c = new Contact(name);
            c.setEmail(email);
            c.setNumber(phone);
            //add contact to list
            contacts[i] = c;
        }

        //print out the rolodex
        for (int i = 0; i < contacts.length; i++) {
            System.out.println(contacts[i]);
        }
    }
}
