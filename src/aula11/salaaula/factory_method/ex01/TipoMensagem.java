package aula11.salaaula.factory_method.ex01;

public abstract class TipoMensagem {
    public abstract Mensagem criaMensagem(String tipo, String cliente);
}
