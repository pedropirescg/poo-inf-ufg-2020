package aula11.salaaula.factory_method.ex01;

public class Jms extends Mensagem{
    public Jms(String tipo, String cliente){
        this.tipo = tipo;
        this.cliente = cliente;
        System.out.println("JMS enviado ao cliente: " + cliente);
    }
}
