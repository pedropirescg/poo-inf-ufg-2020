package aula02.as2b.ex3;

import java.time.chrono.ChronoLocalDate;
import java.util.Comparator;

    class InterfaceDeComparacao implements Comparator<Pessoa> {
    public int compare(Pessoa a, Pessoa b){
        return a.getDataNascimento().compareTo(b.getDataNascimento());
    }
}
