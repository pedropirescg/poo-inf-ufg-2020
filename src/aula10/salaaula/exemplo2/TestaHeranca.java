package aula10.salaaula.exemplo2;

public class TestaHeranca {
    public static void main(String [] args){
        Gerente g = new Gerente();
            g.setSalario(3000);
            System.out.println("A bonificação é: " + g.bonificacao());

        Funcionario f = new Funcionario ();
            f.setSalario(3000);
            System.out.println("A bonificação é: " + f.bonificacao());

        Funcionario ger = new Gerente();
            ger.setSalario(3000);
            System.out.println("A bonificação é: " + ger.bonificacao());
    }
}