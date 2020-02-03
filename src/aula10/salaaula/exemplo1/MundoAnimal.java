package aula10.salaaula.exemplo1;

public class MundoAnimal {
    public static void main(String[] args) {

        Animal[] reino = new Animal[3];

        reino[0] = new Anfibio("Salamanra");
        reino[1] = new Ave("Quero-quero");
        reino[2] = new Peixe("Dourado");

        int tamanhoVetor = reino.length;

        for (int i = 0; i < tamanhoVetor; i++) {
            if(reino[i] instanceof Peixe)
                ((Peixe) reino[i]).nadar();
            reino[i].mover(10, 10);
        }
    }
}

