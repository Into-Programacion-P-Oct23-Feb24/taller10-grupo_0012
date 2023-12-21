/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        // TODO code application logic here
        String[][] notasCualitativas = new String[3][3];
        double nota;

        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};

        for (int i = 0; i < notasCualitativas.length; i++) {
            for (int j = 0; j < notasCualitativas[i].length; j++) {
                nota = notasCuantitativas[i][j];
                if (nota >= 0 && nota < 3) {
                    notasCualitativas[i][j] = "Insuficiente";
                } else {
                    if (nota >= 3 && nota < 5) {
                        notasCualitativas[i][j] = "Regular";
                    } else {
                        if (nota >= 5 && nota < 8) {
                            notasCualitativas[i][j] = "Buena";
                        } else {
                            if (nota >= 8 && nota <= 9.5) {
                                notasCualitativas[i][j] = "Muy Buena";
                            } else {
                                if (nota >= 9.5 && nota <= 10) {
                                    notasCualitativas[i][j] = "Sobresaliente";
                                }
                            }
                        }
                    }
                }

            }

        }
        for (int i = 0; i < notasCualitativas.length; i++) {
            String acumulador = "";
            for (int j = 0; j < notasCualitativas[i].length; j++) {
                acumulador = String.format("%sNota Cuantitativa: %.2f"
                        + " Nota Cualitativa:%s  \t",
                        acumulador,
                        notasCuantitativas[i][j],
                        notasCualitativas[i][j]);
            }
            System.out.printf("%s\n", acumulador);

        }
    }
}
