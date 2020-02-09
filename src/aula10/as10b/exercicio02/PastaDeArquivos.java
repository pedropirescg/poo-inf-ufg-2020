package aula10.as10b.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class PastaDeArquivos extends Arquivo {

    List<Arquivo> listaDeArquivos = new ArrayList<Arquivo>();

    @Override
    public void printDadosArquivo() {
        System.out.println(this.getNomeArquivo());
        for(Arquivo arquivo: listaDeArquivos) {
            arquivo.printDadosArquivo();
        }
    }

    @Override
    public void adicionar(Arquivo novoArquivo) throws Exception {
        this.listaDeArquivos.add(novoArquivo);
    }

    @Override
    public void remover(String nome) throws Exception {
        for(Arquivo arquivo : listaDeArquivos) {
            if(arquivo.getNomeArquivo().equals(nome)) {
                this.listaDeArquivos.remove(nome);
                return;
            }
        }
        throw new Exception("Não existe este arquivo.");
    }

    @Override
    public Arquivo getArquivo(String nome) throws Exception {
        for(Arquivo arquivo: listaDeArquivos) {
            if(arquivo.getNomeArquivo().equals(nome)) {
                return arquivo;
            }
        }
        throw new Exception("Não existe arquivo");
    }
}
