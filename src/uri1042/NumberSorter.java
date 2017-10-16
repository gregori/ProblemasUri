/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1042;

import java.util.Arrays;

/**
 *
 * @author rodrigo
 */
public class NumberSorter {
    private int[] arr;
    
    public NumberSorter(int i1, int i2, int i3) {
        arr = new int[3];
        arr[0] = i1;
        arr[1] = i2;
        arr[2] = i3;
    }
    
    public int[] getArray() {
        return arr;
    }
    
    public int[] sort() {
        int[] arrTmp  = Arrays.copyOf(arr, 3);
        
        Arrays.sort(arrTmp);
        
        return arrTmp;
    }
            
}
