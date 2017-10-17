/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uri1042.Uri1042;

/**
 *
 * @author rodrigo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (args.length == 0) {
            System.out.println("Passe o número de um problema.");
        } else {
            // Executa classe conforme o nome passado por parâmetro
            // classes têm que ter o formato: uriNoProjeto.UriNoProjeto
            // por exemplo: uri1042.Uri1042
            Class clazz = Class.forName("uri" + args[0] + ".Uri" + args[0]);
            Method method = clazz.getMethod("run");
            method.invoke(null);
        }
    }
    
}
