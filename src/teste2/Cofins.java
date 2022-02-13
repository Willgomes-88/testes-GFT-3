package teste2;

public class Cofins implements Imposto {
    double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void calculaImposto(double valor) {
        if (valor > 17000) {
            this.setValor(valor * 0.08);
            System.out.println("COFINS: " + this.getValor());
        } else {

            System.out.println("COFINS: " + getValor());
        }

        }

    }


