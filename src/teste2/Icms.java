package teste2;

public class Icms implements Imposto{
    double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    @Override
    public void calculaImposto(double valor) {
        this.setValor(valor * 0.3);
        System.out.println("ICMS: " + this.getValor());

    }
}
