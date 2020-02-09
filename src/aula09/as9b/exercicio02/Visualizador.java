package aula09.as9b.exercicio02;

public class Visualizador implements Imagem {
    @Override
    public String getTipo() {
        return null;
    }


    public void visualizar(String tipo) {
        if(tipo == "JPG"){
            JPG img = new JPG() {
                @Override
                public String getTipo() {
                    return null;
                }
            };
            img.carregarImagem();
            img.exibir();
            img.fechar();
        } else if (tipo == "BMP") {
            BMP img = new BMP() {
                @Override
                public String getTipo() {
                    return null;
                }
            };
            img.carregarImagem();
            img.exibir();
            img.fechar();
        }
    }
}
