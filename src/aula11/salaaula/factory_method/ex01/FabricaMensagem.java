package aula11.salaaula.factory_method.ex01;

public class FabricaMensagem extends TipoMensagem {
    public Mensagem criaMensagem(String tipo, String cliente){
        Mensagem m = null;
        if(tipo.equals("SMS")){
            m = new Sms(tipo, cliente);
        } else if (tipo.equals("JMS")){
            m = new Jms(tipo, cliente);
        } else if (tipo.equals("Email")){
            m = new Email(tipo, cliente);
        }
        return m;
    }
}
