/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author ANDRESF
 */
public class ejercicio6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float peso,altura;
        
        System.out.println("digite peso en kg");
        peso = entrada.nextFloat();
        System.out.println("digite altura en metros");
        altura = entrada.nextFloat();
        
        float IMC = (peso)/(altura*altura);
        
        System.out.println("su IMC es: "+IMC);
    }
    
}

