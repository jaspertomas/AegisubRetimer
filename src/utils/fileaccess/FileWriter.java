/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils.fileaccess;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author jaspertomas
 */
public class FileWriter {
    public static void main(String args[])
    {
        FileWriter.write("a.txt", "hi\nhello");
    }
    public static boolean write(String filename, String contents) {
        File file=new File(filename);
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new java.io.FileWriter(file));
            writer.write(contents);
        } catch (IOException e) {
            System.err.println(e);
            return false;
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.err.println(e);
                }
            }
            return true;
        }    
    }
}
