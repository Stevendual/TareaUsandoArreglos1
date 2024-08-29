package Problema.Uno;

public class ReordenarPalabras {

    //Reordenar Palabras de una oracion por arreglos

    public void reordenarPalabras() {
        String[] palabras = {"esta2", "esto1", "bien4", "muy3"};

        java.util.Arrays.sort(palabras, (a, b) -> {

            int numeroA = Integer.parseInt(a.replaceAll("\\D", ""));
            int numeroB = Integer.parseInt(b.replaceAll("\\D", ""));
            return Integer.compare(numeroA, numeroB);
        });

        String[] palabrasSinNumeros = new String[palabras.length];

        for (int i = 0; i < palabras.length; i++) {
            palabrasSinNumeros[i] = palabras[i].replaceAll("\\d", ""); // Elimina todos los dígitos
        }

        for (String palabra : palabrasSinNumeros) {
            System.out.println(palabra);
        }
    }
}
