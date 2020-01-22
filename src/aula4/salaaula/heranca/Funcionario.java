package aula4.salaaula.heranca;

public class Funcionario extends PessoaFisica {
    private int matricula;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String endereco, String telefone, String cpf, String estadoCivil, String sexo, int matricula, String cargo, double salario) {
        super(nome, endereco, telefone, cpf, estadoCivil, sexo);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Nome do Funcionário: " + this.getNome());
        sb.append("Endereço do Funcionário: " + this.getEndereco());
        sb.append("Telefone do Funcionário: " + this.getTelefone());
        sb.append("CPF do Funcionário:: " + this.getCpf());
        sb.append("Estado Civil do Funcionário:: " + this.getEstadoCivil());
        sb.append("Sexo do Funcionário: " + this.getSexo());
        sb.append("Matrícula do Funcionário: " + this.getMatricula());
        sb.append("Cargo do Funcionário: " + this.getCargo());
        sb.append("Salário do Funcionário: " + this.getSalario());
        return sb.toString();
    }
}
