package hhssAdv;


import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slatz8075
 */
public class Location {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a blank file
        FileReader file = null;
        //try to find the info file
        try{
            //create a url for the location of the info file
            URL url = Location.class.getResource("info.txt");
            System.out.println(url);
            // creating the file reader
            file = new FileReader(url.getFile());
        }catch(Exception e){
            //handle any errors
            e.printStackTrace();
            //exit the program
            System.exit(0);
        }
        //use a Scanner with the file
        Scanner in = new Scanner(file);
        
        
        //get the number of locations in the info file
        int numLocations = in.nextInt();
        
        //move to the next line
        in.nextLine();
        //create an empty roladex
        loc[] locations = new loc[numLocations];
        //start to fill the location array with locations and their respective directions, imgs etc.
        for(int i = 0; i < numLocations; i++){
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
        for(int i = 0; i < contacts.length; i++){
            System.out.println(contacts[i]);
        }
    }
}
