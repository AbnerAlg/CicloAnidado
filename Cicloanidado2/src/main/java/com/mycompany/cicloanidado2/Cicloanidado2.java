/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cicloanidado2;

/**
 *
 * @author abner
 */
public class Cicloanidado2 {
  
  public static void imprimirTrianguloAsteriscos(int numFilas) {
    for (int i = 1; i <= numFilas; i++) { // Ciclo externo para imprimir cada fila
      for (int j = 1; j <= i; j++) { // Ciclo interno para imprimir los asteriscos de cada fila
        System.out.print("*"); // Imprimir un asterisco
      }
      System.out.println(); // Cambiar de línea después de cada ciclo externo
    }
  }


    public static void main(String[] args) {
        int numFilas = 5; // Número de filas del triángulo
        imprimirTrianguloAsteriscos(numFilas);
    }
}
