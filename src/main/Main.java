/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import uri1042.Uri1042;

/**
 *
 * @author rodrigo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Passe o número de um problema.");
        } else {
            switch (args[0]) {
                case "1042":
                    Uri1042.run();
                    break;
            }
        }
    }
    
}
