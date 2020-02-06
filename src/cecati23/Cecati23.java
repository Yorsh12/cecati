/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cecati23;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author christian
 */
public class Cecati23 {

public static void ejecutar(String comando) throws IOException{
String osName = System.getProperty("os.name").toLowerCase();
Runtime obj = Runtime.getRuntime();
 
if(osName.indexOf("win") >= 0) {
	obj.exec("C:\\WINDOWS\\system32\\CALC.EXE");
}
 
else if(osName.indexOf("mac") >= 0) {
	// codigo para Mac
}
 
else if(osName.indexOf("nux") >= 0) {
	obj.exec("/usr/bin/gnome-calculator");
}   
 
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here;
    }
}
