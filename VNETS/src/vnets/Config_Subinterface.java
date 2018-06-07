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
public class Config_Subinterface {
    public static void Config_Subinterface(String hostname){
        String command =" ";
        do{
            System.out.println(hostname);
            System.out.println("(config-subif)#");
            command=new java.util.Scanner(System.in).nextLine();
            Command_Judge.Back_Config_Terminal(command, hostname);
        }while (true);
    }
}
