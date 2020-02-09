package aula04.as4b.exercicio02;

public class Funcionario {
    private String cpf;
    private Integer matricula;
    private String nome;
    private String cargo;
    private double salario;
    private String departamento;
    private Endereco endereco;

    public Funcionario(String cpf, Integer matricula, String nome) {
        this.cpf = cpf;
        this.matricula = matricula;
        this.nome = nome;
    }

    public Funcionario(){

    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void aumentaSalario(double percentual){
        this.salario += (this.salario * percentual);
    }

    public String ToString(){
        StringBuffer sb = new StringBuffer();
        sb.append(this.getMatricula() + " - " + this.getCpf() + " - " + this.getNome() + " - Departamento: " +
                this.getDepartamento() + " - Cargo: " + this.getCargo());
        return sb.toString();
    }
}
