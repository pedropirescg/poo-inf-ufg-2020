package caelumcursos.carro;

public class TestaCarro {
    public static void main(String[] args) {
        Carro meuCarro;
        meuCarro = new Carro();

        meuCarro.modelo = "Mustang";
        meuCarro.cor = "Azul Turqueza";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 80;

        meuCarro.ligaOCarro();

        meuCarro.acelera(20);
        System.out.println("Velocidade atual do carro: " + meuCarro.velocidadeAtual);
    }
}
