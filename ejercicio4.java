/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author ANDRESF
 */
public class ejercicio4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float radio;
        
        System.out.println("digite radio en metros ");
        radio = entrada.nextFloat();
        
        float area = (float) (3.14)*(radio*radio);
        float longitud = (float) ((2*3.14)*(radio));
        
        System.out.printf("%nlongitud es %.2f: ",longitud); 
        System.out.printf("%narea es %.2f: ",area);
    }
    
}
