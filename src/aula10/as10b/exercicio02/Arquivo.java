package aula10.as10b.exercicio02;

public abstract class Arquivo {
    private String nome;
    private Integer kb;

    public void printDadosArquivo() {
        System.out.println(this.nome);
        System.out.println(this.kb);
    }

    public String getNomeArquivo() {
        return this.nome;
    }

    public Integer getKbArquivo() {
        return this.kb;
    }

    public void adicionar(Arquivo novoArquivo) throws Exception {
        throw new Exception("Não foi possível inserir o arquivo" +
                "pois não é uma pasta.");
    }

    public void remover(String nome) throws Exception {
        throw new Exception("Não é possível remover o arquivo" +
                "pois não é uma pasta");
    }

    public Arquivo getArquivo(String nome) throws Exception {
        throw new Exception("Não é possível pesquisar o arquivo" +
                "pois não é uma pasta");
    }
}
