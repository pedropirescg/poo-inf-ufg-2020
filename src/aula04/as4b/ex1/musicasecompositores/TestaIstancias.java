package aula04.as4b.ex1.musicasecompositores;

public class TestaIstancias {
    public static void main(String[] args) {

        Compositor compositor1 = new Compositor("Frédéric François Chopin", "Polonês");
        Musica musica1 = new Musica("Nocturne, OP 9", 1830, "Clássica");
        musica1.setCompositor(compositor1);

        System.out.println(musica1);
    }
}
