package aula03.as3b.exercicio03;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadePessoas;
    private int lotacaoAtual;

    Elevador elevador = new Elevador();

    public Elevador (int andar, int totalAndares, int capacidadePessoas, int pessoas){
        this.andarAtual = andar;
        this.totalAndares = totalAndares;
        this.capacidadePessoas = capacidadePessoas;
        this.lotacaoAtual = pessoas;
    }

    public Elevador(){
    }

    public void inicializa(int capacidadePessoas, int totalAndares){
        elevador.lotacaoAtual = 0;
        elevador.andarAtual = 0;
        elevador.capacidadePessoas = capacidadePessoas;
        elevador.totalAndares = totalAndares;
    }

    public void entraPessoa() {
        if (elevador.lotacaoAtual < elevador.capacidadePessoas)
            elevador.lotacaoAtual += 1;
    }

    public void saiPessoa() {
        if (elevador.lotacaoAtual > 0)
            elevador.lotacaoAtual -= 1;
    }

    public void sobePessoa(int qtdeAndares) {
        int andaresDisponiveis = elevador.totalAndares - elevador.andarAtual;
        if (andaresDisponiveis > 0 && qtdeAndares <= andaresDisponiveis)
            elevador.totalAndares += qtdeAndares;
    }

    // Não preciso somar o térreo pois na hora de contar os
    // andares disponíveis o método não considera o andar atual.
    public void descePessoa(int qtdeAndares) {
        int andaresDisponiveis = elevador.totalAndares - elevador.andarAtual;
        int podeDescer = totalAndares - andaresDisponiveis;
        if (podeDescer > 0 && qtdeAndares <= podeDescer)
            elevador.totalAndares -= qtdeAndares;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }

    public int getLotacaoAtual() {
        return lotacaoAtual;
    }

    public void setLotacaoAtual(int lotacaoAtual) {
        this.lotacaoAtual = lotacaoAtual;
    }
}
