/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author ANDRESF
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1,numero2;
        
        System.out.println("digite primer numero entero ");
        numero1 = entrada.nextInt();
        System.out.println("digite segundo numero entero ");
        numero2 = entrada.nextInt();
        
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multi = numero1 * numero2;
        
        System.out.println("suma es: "+suma);
        System.out.println("diferencia es: "+resta);
        System.out.println("multiplicacion es: "+multi);
    }
    
}
