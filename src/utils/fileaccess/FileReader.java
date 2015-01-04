/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils.fileaccess;

//from http://www.roseindia.net/tutorial/java/core/files/readFile.html

import java.io.*;

public class FileReader {

    public static String read(String filename) {
        String string="";
        
        try {
            FileInputStream fstream = new FileInputStream(filename);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String str;
            while ((str = br.readLine()) != null) {
                string+=str+"\n";
            }
            in.close();
            
            return string;
            
        } catch (Exception e) {
            System.err.println("FileReader: Unable to read "+filename);
            System.err.println(e);
            return null;
        }
        
    }

    public static void main(String args[]) {

        System.out.println(FileReader.read("serverurl"));
    
    }
}