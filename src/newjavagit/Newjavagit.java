package newjavagit;

import javax.swing.JOptionPane;

public class Newjavagit {

   public static void main(String[] args) {
        int opcion = 0; String op = "";
        op = JOptionPane.showInputDialog("Eliga una opción: \n"
                +"1 para Matriz 3x3\n" 
                +"2 para Matriz 4x4\n" 
                +"3 para Matriz 5x5\n");

        opcion = Integer.parseInt(op);
        switch (opcion) {
            case 1:Matriz3x3();break;
            case 2:Matriz4x4();break;
            case 3:Matriz5x5();break;
            default:JOptionPane.showMessageDialog(null, "Elige una opción valida");
        }
    }
    private static void Matriz3x3(){
        double[][]matriz;
        JOptionPane.showMessageDialog(null,"Matriz de 3x3");
        matriz = new double[4][4];
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
    }
    private static void Matriz4x4(){
        double[][]matriz;
        JOptionPane.showMessageDialog(null,"Matriz de 4x4");
        matriz = new double[5][5];
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
    }
    private static void Matriz5x5(){
        double[][]matriz;
        JOptionPane.showMessageDialog(null,"Matriz de 5x5");
        matriz = new double[5][5];
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
    }
}