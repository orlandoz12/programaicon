/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia3;
import java.util.Timer;
import java.util.TimerTask;

public class Guia3 {

  
    public static void main(String[] args) {
      TimerTask timertask=new TimerTask(){
          int i=0;
          @Override
          public void run() {
              System.out.println("hola"+i);
              i++;
               }     
       };
      Timer timer=new Timer();
      timer.scheduleAtFixedRate(timertask,5000,2000);
    }
}