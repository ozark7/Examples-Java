/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *Se desea construir un programa en java que permita calcular el costo total de un viaje que tiene una duración en días.
Para ello, se requiere los siguientes datos: Número de días del viaje, Total de kilómetros conducidos por día, costo por
litro de gasolina, promedio de kilometro por litro de gasolina, pago por estacionamiento por día, pago de peajes por día.
Imprima en consola el resultado.
 * @author ANDRESF
 */
public class ejercicio9 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float dias,kilometros,costo_gasolina,prom_kilometro,estacionamiento,peaje;
        
        System.out.println("dias de viaje: ");
        dias = entrada.nextFloat();
        System.out.println("total de kilometros por dia");
        kilometros = entrada.nextFloat();
        System.out.println("costo por litro de gasolina");
        costo_gasolina = entrada.nextFloat();
        System.out.println("promedio de kilometro por litro de gasolina");
        prom_kilometro = entrada.nextFloat();
        System.out.println("pago por estacionamiento por dia");
        estacionamiento = entrada.nextFloat();
        System.out.println("pago de peajes por dia");
        peaje = entrada.nextFloat();
        
        float litros_gasolina = (1*(kilometros*dias)/prom_kilometro);
        float dinero_gasolina = litros_gasolina * costo_gasolina;
        float dinero_estacionamiento = estacionamiento*dias;
        float dinero_peaje = peaje*dias;
        float dinero_total = dinero_peaje+dinero_gasolina+dinero_estacionamiento;
        
        System.out.println("dinero en gasolina: "+dinero_gasolina);
        System.out.println("dinero en estacionamiento: "+dinero_estacionamiento);
        System.out.println("dinero en peaje: "+dinero_peaje);
        System.out.println("usted gastará en su viaje la cantidad de: "+dinero_total);
        
    }
    
}
