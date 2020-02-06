package aula11.salaaula.factory_method;

public class TesteApp {
    public static void main(String[] args) {
        FabricaPessoa factory = new FabricaPessoa();
        String nome = "Pedro";
        String sexo = "M";
        Pessoa pessoa = factory.criaPessoa(nome, sexo);

        factory.criaPessoa("Maria", "F");

        try {
            String nome2 = "Erro";
            String sexo2 = "Z";
            Pessoa pessoa2 = factory.criaPessoa(nome2, sexo2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
