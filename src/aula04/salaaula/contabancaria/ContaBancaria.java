package aula04.salaaula.contabancaria;

import java.util.List;

public class ContaBancaria {
    int numero;
    double saldo;
    double limite;
    String tipo;
    List<Cliente> titulares;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Cliente> getTitulares() {
        return this.titulares;
    }

    public void setTitulares(List<Cliente> titulares) {
        this.titulares = titulares;
    }
    /*    public List<Cliente> getTitulares() {
        return this.titulares;
    }

    public void setTitulares(List<Cliente> titular) {
        this.titulares = titulares;
    } */
}
