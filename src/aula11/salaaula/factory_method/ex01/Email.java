package aula11.salaaula.factory_method.ex01;

public class Email extends Mensagem {
    public Email(String tipo, String cliente){
        this.tipo = tipo;
        this.cliente = cliente;
        System.out.println("E-mail enviado ao cliente: " + cliente);
    }
}
