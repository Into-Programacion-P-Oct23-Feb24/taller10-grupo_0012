/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double num;
        double[][] datos = new double[2][2];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.println("INGRESE UN NUMERO");
                num = entrada.nextDouble();

                if (num >= 1000 && num <= 1199) {
                    datos[i][j] = num;
                } else {
                    datos[i][j] = 10;
                }
            }
        }
        for (int i = 0; i < datos.length; i++) {
            String acumulador = "";
            for (int j = 0; j < datos[i].length; j++) {
                acumulador = String.format("%s %.2f", acumulador, datos[i][j]);
            }
            System.out.printf("%s\n", acumulador);
        }

    }
}
