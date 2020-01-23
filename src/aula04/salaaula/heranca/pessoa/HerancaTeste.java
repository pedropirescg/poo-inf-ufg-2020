package aula04.salaaula.heranca.pessoa;

public class HerancaTeste {
    public static void main(String[] args) {

        Pessoa pessoa = new Cliente("Carlos", "Goiânia", "3545-4500",
                "191", "Solteiro", "Masculino",
                5000.00, "Professor");

        System.out.println("Dados do cliente: " + pessoa.toString());

        if (pessoa instanceof Cliente) {
            Cliente c = (Cliente) pessoa;
            c.adicionaInteresse("Futebol");
            c.adicionaInteresse("Literatura");
            c.adicionaInteresse("Política");
            String algumInteresse = c.consultaInteresse("Futebol");

            if (algumInteresse != null) {
                System.out.println(algumInteresse);
            } else {
                System.out.println("Interesse não encontrado");
            }
        }
    }
}
