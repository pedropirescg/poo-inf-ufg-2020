package aula09.as9b.exercicio02;

public class TestaApp {
    public static void main(String[] args) {
        FabricaImagem fabrica = new FabricaImagem();
        String tipo = "BMP";
        Imagem imagem = fabrica.criaImagem(tipo);


        Visualizador visualiza = new Visualizador();
        visualiza.visualizar(tipo);
    }
}
