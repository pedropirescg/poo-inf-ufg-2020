package aula11.salaaula.factory_method.ex01;

public class TestaMensagem {
    public static void main(String[] args) {

        FabricaMensagem factory = new FabricaMensagem();

        factory.criaMensagem("SMS", "Marcos");
        factory.criaMensagem("JMS", "Mario");
        factory.criaMensagem("Email", "João");
    }
}
