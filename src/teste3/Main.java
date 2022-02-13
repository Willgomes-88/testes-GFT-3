package teste3;

public class Main {
    public static void main(String[] args) {
        Produto [] produtos = new Produto[6];
        Caixa caixa = new Caixa();

        produtos[0] = new Produto("Banana",0.99,2);
        produtos[1] = new Produto("Energético",5.49,3);
        produtos[2] = new Produto("Arroz",20,1);
        produtos[3] = new Produto("Chocolate",4.5,1);
        produtos[4] = new Produto("Leite",3.73,3);
        produtos[5] = new Produto("Abacaxi",2.4,2);

        System.out.println("Nome do produto: " + produtos[0].getNome() +" Valor final: " +  caixa.calculaValorFinal(produtos[0],3));
        System.out.println("Nome do produto: " + produtos[1].getNome() +" Valor final: " +  caixa.calculaValorFinal(produtos[1],7));
        System.out.println("Nome do produto: " + produtos[2].getNome() +" Valor final: " +  caixa.calculaValorFinal(produtos[2],1));
        System.out.println("Nome do produto: " + produtos[3].getNome() +" Valor final: " +  caixa.calculaValorFinal(produtos[3],12));
        System.out.println("Nome do produto: " + produtos[4].getNome() +" Valor final: " +  caixa.calculaValorFinal(produtos[4],5));
        System.out.println("Nome do produto: " + produtos[5].getNome() +" Valor final: " +  caixa.calculaValorFinal(produtos[5],1));




    }
}
