package aula09.as9b.exercicio02;

public interface Imagem {
    String getTipo();
}

class JPG implements Imagem {
    @Override
    public String getTipo() {
        return "JPG";
    }

    public void carregarImagem() {
        System.out.println("Imagem JPG");
        System.out.println("Carregando imagem JPG...");
        System.out.print("...");
        System.out.print("...");
        System.out.print("");
    }

    public void exibir() {
        System.out.println("Exibindo imagem por 20 segundos.");
    }
    public void fechar() {
        System.out.println("Fechando imagem.");
    }
}

class BMP implements Imagem {
    @Override
    public String getTipo() {
        return "BMP";
    }

    public void carregarImagem() {
        System.out.println("Imagem BMP");
        System.out.println("Carregando imagem BMP...");
        System.out.print("...");
        System.out.print("...");
        System.out.print("");
    }

    public void exibir() {
        System.out.println("Exibindo imagem por 20 segundos.");
    }
    public void fechar() {
        System.out.println("Fechando imagem.");
    }
}
