/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Cola {
    private static ArrayList<String> elementos;
    
    public Cola() {
        elementos = new ArrayList<>();
    }
    
    public static ArrayList<String> getCola() {
        if (elementos == null) {
            elementos = new ArrayList<>();
        }
        return elementos;
    }
}
