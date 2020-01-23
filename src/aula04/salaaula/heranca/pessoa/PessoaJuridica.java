package aula04.salaaula.heranca.pessoa;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String razaoSocial) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Nome da Pessoa Jurídica: " + this.getNome());
        sb.append("Endereço da Pessoa Jurídica: " + this.getEndereco());
        sb.append("Telefone da Pessoa Jurídica " + this.getTelefone());
        sb.append("CNPJ da Pessoa Jurídica: " + this.getCnpj());
        sb.append("Razão Social da Pessoa Jurídica: " + this.getRazaoSocial());
        return sb.toString();
    }
}
