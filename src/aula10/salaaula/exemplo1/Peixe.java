package aula10.salaaula.exemplo1;

public class Peixe extends Animal {
    public Peixe(String nome){
        super(nome);
    }

    public void nadar(){
        System.out.println("Sou um " + this.getClass().getSimpleName() +
                " e estou nadando.");
    }

    public void mover(int x, int y){
        setCoordenadas(x, y);
        System.out.printf("Movimento do Peixe");
    }
}
