package aula10.salaaula.exemplo1;

public class Ave extends Animal {
    public Ave(String nome){
        super(nome);
    }

    public void mover(int x, int y){
        setCoordenadas(x, y);
        System.out.println("Movimento da Ave");
    }
}
