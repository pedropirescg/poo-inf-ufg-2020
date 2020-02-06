package aula02.as2b.ex3;

public enum OlhosPessoa {
    AZUL("Azul"), VERDE("Verde"), CASTANHO("Castanho");

    public final String label;

    OlhosPessoa(String label){
        this.label = label;
    }

    public static OlhosPessoa valoresListados(String label){
        for (OlhosPessoa olhoArmazenado: values()) {
            if(olhoArmazenado.label.equals(label)) {
                return olhoArmazenado;
            }
        }
        return null;
    }
}
