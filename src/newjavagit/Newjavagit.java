package newjavagit;

import java.util.Scanner;

public class Newjavagit {

    public static void main(String[] args) {
        Newjavagit njg;
        njg = new Newjavagit();
        njg.crearMariz();
        njg.imprimir();
    }

    Scanner teclado;
    int[][] matriz;
    
    public void crearMariz() {
        teclado = new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas = teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas = teclado.nextInt();
        matriz = new int[filas][columnas];
        
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print("Ingrese componente:");
                matriz[f][c] = teclado.nextInt();
            }
        }
    }

    public void imprimir() {
        for(int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }

}
