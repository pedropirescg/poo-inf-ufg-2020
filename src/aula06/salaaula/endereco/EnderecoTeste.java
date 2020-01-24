package aula06.salaaula.endereco;

public class EnderecoTeste {
    public static void main(String[] args) {
        Pais pais = new Pais("Brasil");
        Estado estado = new Estado("GO", "Goias", pais);
        Municipio municipio = new Municipio(new Long(25333), "Goiania", estado);
        Bairro bairro = new Bairro("Centro-Oeste", "Setor Bela Vista", municipio);
        Logradouro logradouro = new Logradouro(TipoLogradouro.RUA, "Pascoal Trepridio");
        Endereco end = new Endereco("Residencial", logradouro, "67", "Qd. D, Lt. 1", bairro, 74611010);

        System.out.println(end);
    }
}
