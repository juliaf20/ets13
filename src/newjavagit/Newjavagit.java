package newjavagit;

import java.util.Scanner;

public class Newjavagit {

    public static void main(String[] args) {
        Newjavagit njg;
        njg = new Newjavagit();
        njg.crearMariz3x3();
        njg.crearMariz4x4();
        njg.crearMariz5x5();
        //teclado = new Scanner(System.in);
    }

    //Scanner teclado;
    int[][] matriz;

    public void crearMariz3x3(/*int x, int y*/) {
        System.out.println("Matriz de 3");
        matriz = new int[4][4];
        //teclado = new Scanner(System.in);
        for (int f = 1; f < matriz.length; f++) {
            for (int c = 1; c < matriz[f].length; c++) {
                if (f == 1 || c == 1 || f == matriz.length - 1 || c == matriz[f].length - 1) {
                    System.out.print("1");
                } else {
                    System.out.print("2");
                }
            }
            System.out.println("");
        }
    }/*
        for (int f = 1; f <= x; f++) {
            for (int c = 1; c <= y; c++) {
                if (f == 1 || c == 1 || f == x || c == y) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
    }*/

    public void crearMariz4x4() {
        System.out.println("Matriz de 4");
        matriz = new int[5][5];
        //teclado = new Scanner(System.in);
        for (int f = 1; f < matriz.length; f++) {
            for (int c = 1; c < matriz[f].length; c++) {
                if (f == 1 || c == 1 || f == matriz.length - 1 || c == matriz[f].length - 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
    }
    
     public void crearMariz5x5() {
        System.out.println("Matriz de 5");
        matriz = new int[6][6];
        for (int f = 1; f < matriz.length; f++) {
            for (int c = 1; c < matriz[f].length; c++) {
                if (f == 1 || c == 1 || f == matriz.length - 1 || c == matriz[f].length - 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
    }

}
