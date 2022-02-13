package teste1;

import java.util.Scanner;

public class ContarLetras {
    public static void main(String[] args) {
        String texto;
        int quantidade;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a frase ");
        texto = scan.nextLine();
        quantidade = contaLetras(texto);


      System.out.println("Numero de letras da última palavra é: " + quantidade);


    }

    public static  int contaLetras(String texto){
         return texto.length() - texto.lastIndexOf(" ") -1   ;
    }
}
