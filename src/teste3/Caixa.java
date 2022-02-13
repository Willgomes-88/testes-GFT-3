package teste3;

public class Caixa  {


    public double calculaValorFinal(Produto produto, int quantidade  ){
        double calculo = 0;
        double valorFInal;

       /* if (produto.getTipo() == 1) {
            calculo = produto.getValor() * quantidade;
            return calculo * 0.9;
        } else if (produto.getTipo() == 2) {
            calculo = produto.getValor() * quantidade;
            return calculo * 0.8;
        } else if (produto.getTipo() == 3 && quantidade > 5) {
            calculo = produto.getValor() * quantidade;
            return calculo * 0.9;
        } else {
            calculo = produto.getValor() * quantidade;
            return calculo;
        }*/
        switch (produto.getTipo()){
            case 1:
                calculo = (produto.getValor() * quantidade) * 0.9;
                break;
            case 2:
                calculo = (produto.getValor() * quantidade) * 0.8;
                break;
            case 3:
                if (quantidade > 5) {
                    calculo = (produto.getValor() * quantidade) * 0.9;
                } else {
                    calculo = produto.getValor() * quantidade;
                }

        }    return calculo;
    }
}



