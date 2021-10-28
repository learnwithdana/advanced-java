package com.hca.skills;

import java.io.*;

public class Program {

   public static void main(String[] args) {

       // Make sure there are command line argumenst for first name, last name and file name
       if (args.length < 3) {
           System.out.println("ERROR: Usage is java Program first-name last-name file-name");
           return;
       }

       // Pull args off command
       String argsFirstName = args[0];
       String argsLastName = args[1];
       String argsFileName = args[2];

       // create data I am writing to a file
       String[] skills = new String[13];
       skills[0] = "Angular";
       skills[1] = "JavaScript";
       skills[2] = "Bootstrap";
       skills[3] = "html";
       skills[4] = "Git";
       skills[5] = "Google";
       skills[6] = "CSS";
       skills[7] = "jQuery";
       skills[8] = "Node.js";
       skills[9] = "Teamwork";
       skills[10] = "Markdown";
       skills[11] = "Debugging";
       skills[12] = "TypeScript";

    //    File f = new File("skills.txt");
    //    boolean fileExists = f.exists();

       // check to see if file exists to know about adding a first crlf
       boolean fileExists = new File(argsFileName).exists();

       try {
            // open the file in append mode
            FileWriter writer = new FileWriter(argsFileName, true); 

            // write all the skills
            for(int i = 0; i < skills.length; i++) {

                // if it is a new file, don't put crlf in front of first item
                if (i == 0 && !fileExists) {
                    writer.write(skills[i]);      
                }
                else {
                    writer.write("\n" + skills[i]); 
                    // NOTE:  we are putting crlf in front of items so we don't have a
                    //        crlf at the end of the last item giving us a blank line
                    //        at the end of the file                  
                }
            }
            // ALWAYS close your file
            writer.close();
            System.out.println(argsFileName + " updated today by " + argsFirstName + " " + argsLastName);
       }
       catch(Exception e) {
           // display an error if something went wrong
           System.out.println("ERROR: Something went wrong!");
       }
    }
}