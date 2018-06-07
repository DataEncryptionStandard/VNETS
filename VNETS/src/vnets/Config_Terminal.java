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
public class Config_Terminal {
    public static void Config_Terminal_Mode(String hostname){
        String command =" ";
        do{ 
            System.out.print(hostname);
            System.out.print("(config)#");
            command=new java.util.Scanner(System.in).nextLine();
            if (command.matches("interface .*"))
                Config_Interface.present(hostname);
        }while(true);
    }
}
