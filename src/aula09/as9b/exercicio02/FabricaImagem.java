package aula09.as9b.exercicio02;

public class FabricaImagem {
    public Imagem criaImagem( String extensaoImagem) {
        if (extensaoImagem.equals("JPG")) {
            return new JPG();
        } else if (extensaoImagem.equals("BMP")) {
            return new BMP();
        } else {
            throw new IllegalArgumentException("Tipo de Imagem Inválido");
        }
    }
}
