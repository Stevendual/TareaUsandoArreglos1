package Problema.Dos;

public class FusionarOdenar {

    //Fusionar y ordenar dos arreglos

    public void fusionarOrdenar() {
        int[] arreglo1 = {1, 3, 5, 7, 9};
        int[] arreglo2 = {2, 4, 6, 8, 10};
        int[] arregloFusionado = new int[arreglo1.length + arreglo2.length];

        System.arraycopy(arreglo1, 0, arregloFusionado, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, arregloFusionado, arreglo1.length, arreglo2.length);

        java.util.Arrays.sort(arregloFusionado);

        for (int numero : arregloFusionado) {
            System.out.println(numero);
        }
    }
}
