/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vnets;
import java.awt.event.*;
/**
 *
 * @author infy08
 */
public class UserEXEC {
    public static void UserEXEC_Mode(String hostname){
        String command="";
        do{
            System.out.print(hostname);
            System.out.print(">");
            //this.Tabkey_Pressed();
            command=new java.util.Scanner(System.in).nextLine();
            if (command.matches("en.*")){
                EnableEXEC.Enable_Mode(hostname);
            
            }
        }while(command.matches("end"));
        
        
    }
    public void Tabkey_Pressed(KeyEvent e,String command){
           int keycode =e.getKeyCode();
           if (keycode == KeyEvent.VK_TAB){
               System.out.println("$$$$$");
                   
           }    
               
    
    }
    
}
