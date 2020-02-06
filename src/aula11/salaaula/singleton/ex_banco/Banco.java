package aula11.salaaula.singleton.ex_banco;

public final class Banco {
    public static Banco instacia;
    int codigo;
    String nome;
    private Banco(){
        codigo = 001;
        nome = "Banco do Brasil";
    }
    public static Banco getInstacia(){
        if(instacia != null){
            instacia = new Banco();
        }
        return instacia;
    }
}
