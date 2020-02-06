package aula11.salaaula.factory_method.ex01;

public class Sms extends Mensagem {
    public Sms(String tipo, String cliente){
        this.tipo = tipo;
        this.cliente = cliente;
        System.out.println("SMS enviado ao Cliente: " + cliente);
    }
}
