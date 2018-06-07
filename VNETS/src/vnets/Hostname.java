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
public class Hostname {
    public static String hostname_Decision(String hostname){
        String back = hostname.substring(hostname.indexOf(" ")+1);
        return back;
    }
}