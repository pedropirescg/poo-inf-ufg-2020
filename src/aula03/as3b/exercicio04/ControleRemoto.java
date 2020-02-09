package aula03.as3b.exercicio04;

public class ControleRemoto {

    Televisao televisao = new Televisao();

    public ControleRemoto() {

    }

    public void aumentaVolume(int vol) {
        televisao.setVolume((televisao.getVolume() + 1));
    }

    public void diminuiVolume(int vol) {
        if(televisao.getVolume() > 0)
        televisao.setVolume((televisao.getVolume() - 1));
    }

    public void trocarCanal(int canal) {
        televisao.setCanal(canal);
    }

    public String consultaVolume() {
        return String.valueOf(televisao.getVolume());
    }

    public String consultaCanal() {
        return String.valueOf(televisao.getCanal());
    }
}
