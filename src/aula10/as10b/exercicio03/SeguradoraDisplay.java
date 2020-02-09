package aula10.as10b.exercicio03;

public class SeguradoraDisplay implements Observer{
    private String movimento;
    private Subject subject;

    public SeguradoraDisplay(Subject subject) {
        this.subject = subject;
        this.subject.addObservador(this);
    }

    public void atualizaDisplay() {
        System.out.println("Status do alarme: " + movimento);
    }

    @Override
    public void atualizar(String movimento) {
        this.movimento = movimento;
    }
}
