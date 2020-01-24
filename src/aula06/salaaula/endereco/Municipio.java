package aula06.salaaula.endereco;

import java.util.ArrayList;
import java.util.List;

public class Municipio {
    private Long codigoIBGE;
    private String nome;
    private Estado estado;
    private List<Bairro> bairros;

    public Municipio(Long codigoIBGE, String nome, Estado estado) {
        this.codigoIBGE = codigoIBGE;
        this.nome = nome;
        this.estado = estado;
        this.bairros = new ArrayList<Bairro>();
    }

    public Long getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(Long codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Bairro> getBairros() {
        return bairros;
    }

    public void setBairros(List<Bairro> bairros) {
        this.bairros = bairros;
    }

    public void adicionaBairro(Bairro b) {
        this.bairros.add(b);
    }

    public Bairro consultaMunicipio(String nome) {
        Bairro novoBairro = null;
        for (Bairro b : this.bairros) {
            if (b.getNome().equals(nome)) ;
            novoBairro = b;
        }
        return novoBairro;
    }

    public void removeBairro(Bairro b) {
        this.bairros.remove(b);
    }
}
