/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author ANDRESF
 */
public class ejercicio3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float numero1,numero2,numero3;
        
        System.out.println("digite primer numero decimal ");
        numero1 = entrada.nextFloat();
        System.out.println("digite segundo numero decimal ");
        numero2 = entrada.nextFloat();
        System.out.println("digite tercer numero decimal ");
        numero3 = entrada.nextFloat();
        
        float suma = numero1 + numero2 + numero3;
        float prom = (numero1 + numero2 + numero3)/3;
        float multi = numero1 * numero2 * numero3;
        
        System.out.printf("%nsuma es %.2f: ",suma);
        System.out.printf("%npromedio es %.2f: ",prom);
        System.out.printf("%nproducto es %.2f: ",multi);
    }
    
}

