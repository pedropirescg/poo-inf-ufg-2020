package aula4.salaaula.heranca;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private String estadoCivil;
    private String sexo;

    public PessoaFisica(String nome, String endereco, String telefone, String cpf, String estadoCivil, String sexo) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Nome da Pessoa Física: " + this.getNome());
        sb.append("Endereço da Pessoa Física: " + this.getEndereco());
        sb.append("Telefone da Pessoa Física " + this.getTelefone());
        sb.append("CPF da Pessoa Física: " + this.getCpf());
        sb.append("Estado Civil da Pessoa Física: " + this.getEstadoCivil());
        sb.append("Sexo da Pessoa Física: " + this.getSexo());
        return sb.toString();
    }
}
