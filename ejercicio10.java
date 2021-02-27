/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author ANDRESF
 */
public class ejercicio10 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float peso_kilogramos;
        
        System.out.println("digite peso en kilogramos (conversion de unidades)");
        peso_kilogramos = entrada.nextFloat();
        
        float libra = (float) (peso_kilogramos * 2.20462);
        float tonelada = (float) (peso_kilogramos * 0.001); 
        float gramos = (float) (peso_kilogramos * 1000);
        
        System.out.println("peso de Kg a Libras: "+libra);
        System.out.println("peso de Kg a Tonelada: "+tonelada);
        System.out.println("peso de Kg a gramos: "+gramos);
        
    }
    
}

