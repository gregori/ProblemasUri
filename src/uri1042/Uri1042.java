/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1042;

import java.util.Scanner;

/**
 *
 * @author rodrigo
 */
public class Uri1042 {

    /**
     * @param args the command line arguments
     */
    public static void run() {
        Scanner input = new Scanner(System.in);
        
        NumberSorter ns = new NumberSorter(input.nextInt(), 
                input.nextInt(), input.nextInt());
        
        int[] arr = ns.getArray();
        int[] sorted = ns.sort();
        
        System.out.printf("%d\n%d\n%d\n", sorted[0], sorted[1], sorted[2]);
        System.out.println();
        System.out.printf("%d\n%d\n%d\n", arr[0], arr[1], arr[2]);
    }
    
}
