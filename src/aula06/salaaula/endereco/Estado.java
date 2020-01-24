package aula06.salaaula.endereco;

import java.util.ArrayList;
import java.util.List;

public class Estado {
    private String sigla;
    private String nome;
    private Pais pais;
    private List<Municipio> municipios;

    public Estado(String sigla, String nome, Pais pais) {
        this.sigla = sigla;
        this.nome = nome;
        this.pais = pais;
        this.municipios = new ArrayList<Municipio>();
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Municipio> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(List<Municipio> municipios) {
        this.municipios = municipios;
    }

    public void adicionaMunicipio(Municipio m) {
        this.municipios.add(m);
    }

    public Municipio consultaMunicipio(String nome) {
        Municipio novoMunicipio = null;
        for (Municipio m : this.municipios) {
            if (m.getNome().equals(nome)) ;
            novoMunicipio = m;
        }
        return novoMunicipio;
    }

    public void removeMunicipio(Municipio m) {
        this.municipios.remove(m);
    }
}
