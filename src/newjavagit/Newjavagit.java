package newjavagit;

import javax.swing.JOptionPane;

public class Newjavagit {

    public static void main(String[] args) {
        int opcion = 0;
        String op = "";
        op = JOptionPane.showInputDialog("Eliga una opciÃ³n: \n"
                + "1 para Matriz 3x3\n"
                + "2 para Matriz 4x4\n"
                + "3 para Matriz 5x5\n");

        opcion = Integer.parseInt(op);
        switch (opcion) {
            case 1:
                Matriz3x3();
                break;
            case 2:
                Matriz4x4();
                break;
            case 3:
                Matriz5x5();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Elige una opciÃ³n valida");
        }
    }

    private static void Matriz3x3() {
        int[][] matriz;
        JOptionPane.showMessageDialog(null, "Matriz de 3x3");
        matriz = new int[3][3];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                matriz[f][c] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion ("
                        + (f + 1) + "," + (c + 1) + ") de la matriz"));
            }
        }
        String res = "";
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                res += matriz[f][c];
                res += "     ";
            }
            res += "\n";
        }
        JOptionPane.showMessageDialog(null, res);
    }

    private static void Matriz4x4() {
        int[][] matriz;
        JOptionPane.showMessageDialog(null, "Matriz de 4x4");
        matriz = new int[4][4];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                matriz[f][c] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion ("
                        + (f + 1) + "," + (c + 1) + ") de la matriz"));
            }
        }
        String res = "";
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                res += matriz[f][c];
                res += "     ";
            }
            res += "\n";
        }
        JOptionPane.showMessageDialog(null, res);
    }

    private static void Matriz5x5() {
        int[][] matriz;
        JOptionPane.showMessageDialog(null, "Matriz de 5x5");
        matriz = new int[5][5];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                matriz[f][c] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion ("
                        + (f + 1) + "," + (c + 1) + ") de la matriz"));
            }
        }
        String res = "";
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                res += matriz[f][c];
                res += "     ";
            }
            res += "\n";
        }
        JOptionPane.showMessageDialog(null, res);
    }

}
