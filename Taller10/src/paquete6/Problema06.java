/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}};
        String acumulador = "";
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                String caracteres = estudiantes[i][j];
                int cantidad = caracteres.length();
                if (cantidad == 11) {
                    acumulador = String.format("%s %s\n", acumulador, estudiantes[i][j]);
                }
            }
        }
        System.out.printf("%s", acumulador);
    }
}
