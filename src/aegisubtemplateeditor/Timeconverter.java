/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aegisubtemplateeditor;

/**
 *
 * @author jaspertomas
 */
public class Timeconverter {
    public static void main(String args[]) 
    {
        int minutes=7;
        int seconds=29;
        int centiseconds=44;
        int offset=(minutes*60*100)+(seconds*100)+centiseconds;
        System.out.println(offset);
    }
}
