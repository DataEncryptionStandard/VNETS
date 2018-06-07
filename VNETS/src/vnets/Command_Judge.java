/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vnets;

/**
 *
 * @author infy08
 */
public class Command_Judge {
    public static void Command_Judge_Do(String command,String hostname){
        
    }
    public static void Back_Config_Terminal(String command,String hostname){
         if (command.matches("ex.*"))
                Config_Terminal.Config_Terminal_Mode(hostname);
            
    }
}
