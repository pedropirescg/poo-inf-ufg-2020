package aula10.as10b.exercicio03;

public class DelegaciaDisplay implements Observer {
    private Subject subject;
    private String movimento;

    public DelegaciaDisplay(Subject subject) {
        this.subject = subject;
        this.subject.addObservador(this);
    }

    public void atualizaDisplay() {
        System.out.println("Status do alarme: " + movimento);
    }

    @Override
    public void atualizar(String movimento) {
        this.movimento = movimento;
        atualizaDisplay();
    }
}
