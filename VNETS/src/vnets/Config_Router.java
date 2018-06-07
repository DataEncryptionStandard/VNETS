/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vnets;

/**
 *
 * @author arp
 */
public class Config_Router {
    public static void Config_Router_Mode(String hostname){
        String command =" ";
        do{ 
            System.out.print(hostname);
            System.out.print("(config-router)#");
            command=new java.util.Scanner(System.in).nextLine();
            Command_Judge.Back_Config_Terminal(command, hostname);
        }while(true);
    }
}
