package aula02.as2b.exercicio02;

public class Carro {
    private double custoFabrica;
    private final double valorImposto = 0.45;
    private final double custoDistribuidor = 0.28;

    public double getCustoFabrica() {
        return custoFabrica;
    }

    public void setCustoFabrica(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double getValorImposto() {
        return valorImposto;
    }

    public double getCustoDistribuidor() {
        return custoDistribuidor;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("\nO custo de fábrica é: " + this.getCustoFabrica());
        return sb.toString();
    }
}
