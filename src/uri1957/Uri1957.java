/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1957;

import java.util.Scanner;

/**
 *
 * @author rodrigo
 */
public class Uri1957 {
    public static void run() {
        Scanner input = new Scanner(System.in);
        
        int decimal = input.nextInt();
        System.out.println(Dec2Hex.dec2Hex(decimal));
    }
}
