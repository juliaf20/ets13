package newjavagit;

public class Newjavagit {

    public static void main(String[] args) {
        Newjavagit njg;
        njg = new Newjavagit();
        njg.crearMariz();
    }

    public void crearMariz() {
        int matriz[][] = new int[3][3];
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.println(matriz[x][y]);
            }
        }
    }

}
