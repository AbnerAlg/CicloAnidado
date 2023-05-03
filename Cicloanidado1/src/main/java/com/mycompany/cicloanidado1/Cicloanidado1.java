/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cicloanidado1;

/**
 *
 * @author abner
 */
public class Cicloanidado1 {
    
  public static void imprimirTablaMultiplicacion() {
    for (int i = 1; i <= 10; i++) { // Ciclo externo para multiplicar del 1 al 10
      for (int j = 1; j <= 10; j++) { // Ciclo interno para multiplicar del 1 al 10
        System.out.print(i*j + "\t"); // Imprimir el resultado de la multiplicación y un tabulador
      }
      System.out.println(); // Cambiar de línea después de cada ciclo externo
    }
  }



    public static void main(String[] args) {
        imprimirTablaMultiplicacion();
    }
}
