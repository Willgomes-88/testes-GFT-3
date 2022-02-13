package teste2;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valor, total;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor");
        valor = scan.nextDouble();

        Icms icms = new Icms();
        Ipi ipi = new Ipi();
        Cofins cofins = new Cofins();

        icms.calculaImposto(valor);
        ipi.calculaImposto(valor);
        cofins.calculaImposto(valor);

        total = valor + icms.getValor() + ipi.getValor() + cofins.getValor();
        System.out.println("Valor final: " + total);


    }


}
