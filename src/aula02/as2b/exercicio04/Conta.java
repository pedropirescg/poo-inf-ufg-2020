package aula02.as2b.exercicio04;

public class Conta {
    private double saldo;
    private double limite;

    public Conta(int saldo){
        this.saldo = saldo;
    }

    public Conta() {

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(this.getSaldo());
        sb.append(" possui limite de" + this.getLimite() + " reais.");
        return sb.toString();
    }
}
