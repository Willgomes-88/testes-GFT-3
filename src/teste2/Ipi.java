package teste2;

public class Ipi implements Imposto {
    double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void calculaImposto(double valor) {
        if (valor < 25000) {
            this.setValor(valor * 0.05);
            System.out.println("IPI: " + this.getValor());

        } else {
            this.setValor( valor * 0.1);
            System.out.println("IPI: " + this.getValor());

        }

    }
}
