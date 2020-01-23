package aula04.salaaula.heranca.pessoa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente extends PessoaFisica {
    private double renda;
    private String profissao;
    private List<String> interesses;

    public Cliente(String nome, String endereco, String telefone, String cpf, String estadoCivil, String sexo, double renda, String profissao) {
        super(nome, endereco, telefone, cpf, estadoCivil, sexo);
        this.renda = renda;
        this.profissao = profissao;
        interesses = new ArrayList<String>();
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public List<String> getInteresses() {
        return interesses;
    }

    public void setInteresses(List<String> interesses) {
        this.interesses = interesses;
    }

    public void adicionaInteresse(String interesse) {
        this.getInteresses().add(interesse);
    }

    public String consultaInteresse(String interesse) {
        String novoInteresse = null;
        for (String s : this.getInteresses()) {
            if (s.equals(interesse)) {
                novoInteresse = s;
            } else {
                System.out.println("Interesse não encontrado");
            }
        }
        return novoInteresse;
    }

    public void removeInteresse(String nomeInteresse) {
        Iterator<String> iterator = interesses.iterator();
        int quantidadeInteresses = interesses.size();
        while (iterator.hasNext()) {
            String interesseRemover = iterator.next();
            if (interesseRemover.equals(nomeInteresse)) {
                iterator.remove();
            }
        }

        int novaQuantidadeInteresses = interesses.size();

        if (novaQuantidadeInteresses < quantidadeInteresses) {
            System.out.println("O interesse com o nome: "
                    + nomeInteresse + "foi removido com sucesso!");
        } else {
            System.out.println("Nenhum interesse encontrado com o nome informado");
        }
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(super.toString());
        sb.append("\nRenda do Cliente: " + this.getRenda());
        sb.append("\nProfissão do Cliente: " + this.getProfissao());
        return sb.toString();
    }
}
