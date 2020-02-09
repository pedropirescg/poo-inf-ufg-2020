package aula04.as4b.exercicio02;

public class Endereco {
    private String rua;
    private int numero;
    private int quadra;
    private int lote;
    private String complemento;
    private String bairro;
    private String cidade;
    private UnidadesFederativas unidadesFederativas;

    public Endereco(String rua, int numero, int quadra, int lote, String complemento,
                    String bairro, String cidade, UnidadesFederativas unidadesFederativas) {
        this.rua = rua;
        this.numero = numero;
        this.quadra = quadra;
        this.lote = lote;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.unidadesFederativas = unidadesFederativas;
    }

    public Endereco(){

    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuadra() {
        return quadra;
    }

    public void setQuadra(int quadra) {
        this.quadra = quadra;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadesFederativas getUnidadesFederativas() {
        return unidadesFederativas;
    }

    public void setUnidadesFederativas(UnidadesFederativas unidadesFederativas) {
        this.unidadesFederativas = unidadesFederativas;
    }
}
