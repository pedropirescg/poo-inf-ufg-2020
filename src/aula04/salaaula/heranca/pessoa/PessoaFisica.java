package aula04.salaaula.heranca.pessoa;

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
        sb.append("\nNome da Pessoa Física: " + this.getNome());
        sb.append("\nEndereço da Pessoa Física: " + this.getEndereco());
        sb.append("\nTelefone da Pessoa Física " + this.getTelefone());
        sb.append("\nCPF da Pessoa Física: " + this.getCpf());
        sb.append("\nEstado Civil da Pessoa Física: " + this.getEstadoCivil());
        sb.append("\nSexo da Pessoa Física: " + this.getSexo());
        return sb.toString();
    }
}
