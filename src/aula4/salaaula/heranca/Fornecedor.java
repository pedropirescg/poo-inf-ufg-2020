package aula4.salaaula.heranca;

public class Fornecedor extends PessoaJuridica {
    private String produtos;

    public Fornecedor(String nome, String endereco, String telefone, String cnpj, String razaoSocial, String produtos) {
        super(nome, endereco, telefone, cnpj, razaoSocial);
        this.produtos = produtos;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Nome do Fornecedor: " + this.getNome());
        sb.append("Endereço do Fornecedor: " + this.getEndereco());
        sb.append("Telefone do Fornecedor: " + this.getTelefone());
        sb.append("CNPJ da Pessoa Jurídica: " + this.getCnpj());
        sb.append("Razão Social da Pessoa Jurídica: " + this.getRazaoSocial());
        return sb.toString();
    }
}
