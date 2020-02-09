package aula02.as2b.exercicio03;

public enum CabeloPessoa {
    LOURO("Louro"), CASTANHO("Castanho"), PRETO("Preto");

    public final String label;

    CabeloPessoa (String label){
        this.label = label;
    }

    public static CabeloPessoa valoresListados(String label){
        for(CabeloPessoa cabeloArmazenado: values()){
            if(cabeloArmazenado.label.equals(label)){
                return cabeloArmazenado;
            }
        }
        return null;
    }
}
