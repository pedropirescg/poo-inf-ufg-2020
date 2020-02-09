package aula10.as10b.exercicio03;

public class TestaAlarme {
    public static void main(String[] args) {
        Alarme alarme = new Alarme();

        DelegaciaDisplay dp = new DelegaciaDisplay(alarme);
        SeguradoraDisplay sd = new SeguradoraDisplay(alarme);

        alarme.setMovimento("Movimento Detectado");

        dp.atualizaDisplay();
        sd.atualizaDisplay();
    }
}
