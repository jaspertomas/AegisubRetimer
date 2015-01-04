/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aegisubtemplateeditor;

import java.util.ArrayList;
import utils.fileaccess.FileReader;

/**
 *
 * @author jaspertomas
 */
public class AegisubDurationEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String data=FileReader.read("src/data/3.ass");
        String lines[]=data.split("\n");
        
        ArrayList<Dialogue> dialogues=new ArrayList<Dialogue>();
        
        for(String line:lines)
        if(line.startsWith("Dialogue"))
        {
            //System.out.println(line);
            dialogues.add(new Dialogue(line));
        }
        
        for(Dialogue d:dialogues)
        {
            System.out.println(d);
        }
    }
}
