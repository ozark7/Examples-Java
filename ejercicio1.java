/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author ANDRESF
 */
public class ejercicio1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int x,y;
        
        System.out.println("digite valor de X");
        x = entrada.nextInt();
        System.out.println("digite valor de Y");
        y = entrada.nextInt();
        
        System.out.printf("x = %d\n", x );
        System.out.printf("El valor de %d + %d es %d\n", x, x, ( x + x ));
        System.out.printf("x = %d.2f", x );
        System.out.printf("\n%d - %d\n", ( x + y ), ( y + x ) );
        
    }
}
