package br.com.martinez.exercicio02;

public class Exercicio02 {

    public static void main(String[] args) {
        
        int vetorInt[] = new int[6];
        vetorInt[0] = 5;
        vetorInt[1] = 8;
        vetorInt[2] = 3;
        vetorInt[3] = 4;
        vetorInt[4] = 6;
        vetorInt[5] = 1;
        
        System.out.println("Vetor desordenado: " + vetorInt[0] + " - " + vetorInt[1] + " - " + vetorInt[2] + " - " + 
                                                   vetorInt[3] + " - " + vetorInt[4] + " - " + vetorInt[5] + " . ");
        int x[];
        x = bubble_sort_desc(vetorInt);
        System.out.println("Vetor ordenado crescente: " + imprimeVetor(x));
        
    }
    
    public static String imprimeVetor(int[] x) {
        String vet = "";
        for (int c = 0; c < x.length; c++) {
            if (c == x.length - 1) {
                vet = vet + x[c] + ".";
            } else {
                vet = vet + x[c] + " - ";
            }
        }
        return vet;
    }
    
    public static int[] bubble_sort_desc(int[] x) {
        int aux = 0;

        for (int i = 1; i < x.length; i++) {
            for (int j = 0; j < x.length - 1; j++) {
                if (x[j] < x[j + 1]) {
                    aux = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = aux;
                }
            }
        }        
        return x;
    }
}
