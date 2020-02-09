package aula11.as11.exercicio01;

import java.time.LocalDate;
import java.util.ArrayList;

public class Agenda{
    private ArrayList<Pessoa> agenda;

    public Agenda(){
        ArrayList<Pessoa> agenda = new ArrayList<Pessoa>();
    }

    public void armazenaPessoa(String nome, String idade, float altura) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setAltura(altura);
        pessoa.setDataNascimento(idade);
        agenda.add(pessoa);
    }

    public void removePessoa(String nome) {
        int index = this.buscaPessoa(nome);
        if(index > 0)
            agenda.remove(nome);
        else
            System.out.println("Pessoa não cadastrada.");
    }

    public int buscaPessoa(String n) {
        int posicaoPessoa = -1;
        for(Pessoa nome: agenda) {
            if(n.equals(nome)){
                posicaoPessoa = agenda.indexOf(nome);
                break;
            } else{
                posicaoPessoa = -1;
            }
        }
        return posicaoPessoa;
    }

    public void imprimeAgenda(){
        for (int i = 0; i < agenda.size(); i++){
            System.out.println(agenda.get(i));
        }
    }

    public String imprimePessoa (int i){
        return agenda.get(i).toString();
    }
}
