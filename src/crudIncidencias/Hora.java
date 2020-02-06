/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudIncidencias;


import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class Hora extends Thread{
    private JLabel etiqueta;
    public Hora(JLabel etiqueta){
       this.etiqueta = etiqueta;
    }

    @Override
    public void run(){
        while(true){
           Date hoy = new Date();
           SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss"); 
           etiqueta.setText(sdf.format(hoy));
          // SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
          // etiqueta.setText(sdf.format(hoy));
           try{
              sleep(1000); //Segundo a segundo... 
           }catch(Exception e){
              e.getMessage();
           }
       }
   }
}