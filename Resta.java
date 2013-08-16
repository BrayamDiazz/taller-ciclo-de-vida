/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.Scanner;

/**
 *
 * @author BRAYAM
 */
public class Resta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x,y,z;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        x = entrada.nextInt();
        System.out.println("Introduzca el siguiente numero");
        y = entrada.nextInt();
        z = x-y;
        System.out.println("El resultado de su resta es "+z);
    }
}
