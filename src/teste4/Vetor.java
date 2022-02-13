package teste4;
import  java.util.Arrays;

public class Vetor {
    public static void main(String[] args) {
        int soma = 0, maior = 0, menor = 1, mediana =0;
        int[] vetor = {1,2,3,4,5,6,7,8};


        if (vetor.length == 0) {
            System.out.println("Array vazio");
        } else {
            for (int i = 0; i < vetor.length; i++) {
                soma += vetor[i];
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            if (vetor.length % 2 == 0) {
                Arrays.sort(vetor);
                mediana = vetor[(vetor.length /2)-1] + vetor[(vetor.length/2)];
            } else {
                Arrays.sort(vetor);
                mediana = vetor[(vetor.length) / 2];
            }



        }
        System.out.println("Soma dos elementos do vetor: " + soma);
        System.out.println("Maior número do vetor: " + maior);
        System.out.println("Menor número do vetor: " + menor);
        System.out.println("Média dos valores do vetor: " + soma/(double) vetor.length);
        System.out.println("Mediana  dos valores do vetor: " + mediana );
    }
}
