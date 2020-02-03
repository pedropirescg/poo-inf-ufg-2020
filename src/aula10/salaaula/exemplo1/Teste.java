package aula10.salaaula.exemplo1;

public class Teste {
    public static void apresentar (Animal a) {
        System.out.println(a.getNome());
        a.mover(10, 10);
    }

    public static void main(String[] args) {
        // Ave ave = (Ave) new Animal("X");
        Object[] lista = new Object[3];

        lista[0] = new Anfibio("Salamanra");
        lista[1] = new Ave("Quero-quero");
        lista[2] = new Peixe("Dourado");

        for (int i = 0; i < 3; i++){
            apresentar((Animal) lista[i]);
        }
    }
}

