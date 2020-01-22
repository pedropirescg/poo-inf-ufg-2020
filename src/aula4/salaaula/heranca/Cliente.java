package aula4.salaaula.heranca;

public class Cliente extends PessoaFisica {
    private double renda;
    private String interesse;
    private String profissao;

    public Cliente(String nome, String endereco, String telefone, String cpf, String estadoCivil, String sexo, double renda, String interesse, String profissao) {
        super(nome, endereco, telefone, cpf, estadoCivil, sexo);
        this.renda = renda;
        this.interesse = interesse;
        this.profissao = profissao;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public String getInteresse() {
        return interesse;
    }

    public void setInteresse(String interesse) {
        this.interesse = interesse;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Nome do Cliente: " + this.getNome());
        sb.append("Endereço do Cliente: " + this.getEndereco());
        sb.append("Telefone do Cliente: " + this.getTelefone());
        sb.append("CPF do Cliente:: " + this.getCpf());
        sb.append("Estado Civil do Cliente:: " + this.getEstadoCivil());
        sb.append("Sexo do Cliente: " + this.getSexo());
        sb.append("Matrícula do Cliente: " + this.getRenda());
        sb.append("Cargo do Cliente: " + this.getInteresse());
        sb.append("Salário do Cliente: " + this.getProfissao());
        return sb.toString();
    }
}
