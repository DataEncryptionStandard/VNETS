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
public class EnableEXEC {
    public static void Enable_Mode(String hostname){
        String command ="";
        do{
            System.out.print(hostname);
            System.out.print("#");
            command = new java.util.Scanner(System.in).nextLine();
            if (command.matches("conf.* t.*"))
                Config_Terminal.Config_Terminal_Mode(hostname);
            else if (command.matches("disa.*") || command.matches("ex.*"))
                UserEXEC.UserEXEC_Mode(hostname);
        }while(true);
    }
}