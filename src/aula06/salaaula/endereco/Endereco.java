package aula06.salaaula.endereco;

public class Endereco {
    private String tipo;
    private String numero;
    private String complemento;
    private Integer cep;
    private Bairro bairro;
    private Logradouro logradouro;

    public Endereco(String tipo, Logradouro log, String numero, String complemento, Bairro bairro, Integer cep) {
        this.tipo = tipo;
        this.logradouro = log;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nImprimindo os dados do Endereço: ");
        sb.append("\nTipo do Endereço: " + this.getTipo());
        sb.append("\n" + this.getLogradouro().getTipo().toString());
        sb.append("\n" + this.getLogradouro().getNome());
        sb.append("\n" + this.getNumero());
        sb.append("\n" + this.getComplemento());
        sb.append("\n" + this.getCep());
        sb.append("\n" + this.getBairro().getNome());
        sb.append("\n" + this.getBairro().getMunicipio().getNome());
        sb.append("\n" + this.getBairro().getMunicipio().getEstado().getNome());
        sb.append("\n" + this.getBairro().getMunicipio().getEstado().getPais().getNome());
        return sb.toString();
    }
}
