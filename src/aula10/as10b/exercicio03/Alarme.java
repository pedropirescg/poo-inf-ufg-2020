package aula10.as10b.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Alarme implements Subject{
    private String movimento;
    private List<Observer> observers;

    public Alarme() {
        observers = new ArrayList<>();
    }

    public void setMovimento(String movimento) {
        this.movimento = movimento;
        notificarObservador();
    }


    @Override
    public void addObservador(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notificarObservador() {
        for(Observer observador: observers) {
            observador.atualizar(movimento);
        }
    }
}
