package aula04.as4b.ex2;

import aula02.as2b.ex3.OlhosPessoa;

public enum UnidadesFederativas {
    AC("Acre"), AL("Alagoas"), AP("Amapá"), AM("Amazonas"), BA("Bahia"),
    CE("Ceará"), ES("Espírito Santo"), GO("Goiás"), MA("Maranhão"), MT("Mato Grosso"),
    MS("Mato Grosso do Sul"), MG("Minas Gerais"), PA("Pará"), PB("Paraíba"), PR("Paraná"),
    PE("Pernambuco"), PI("Piauí"), RJ("Rio de Janeiro"), RN("Rio Grande do Norte"),
    RS("Rio Grande do Sul"), RO("Rondônia"), RR("Roraima"), SC("Santa Catarina"), SP("São Paulo"),
    SE("Sergipe"), TO("Tocantins"), DF("Distrito Federal");

    public final String label;

    UnidadesFederativas(String label){
        this.label = label;
    }

    public static UnidadesFederativas valoresListados(String label){
        for (UnidadesFederativas valorArmazenado: values()) {
            if(valorArmazenado.label.equals(label)) {
                return valorArmazenado;
            }
        }
        return null;
    }
}
