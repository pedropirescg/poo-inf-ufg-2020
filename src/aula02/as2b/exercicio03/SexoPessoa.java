package aula02.as2b.exercicio03;

public enum SexoPessoa {
    MASCULINO ("Masculino"), FEMININO("Feminino");

    public final String label;

    SexoPessoa(String label){
        this.label = label;
    }

    public static SexoPessoa valoresListados (String  label){
        for(SexoPessoa sexoArmazenado: values()) {
            if(sexoArmazenado.label.equals(label)){
                return sexoArmazenado;
            }
        }
        return null;
    }
}
