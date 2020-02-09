package aula04.as4b.ex2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        List<Funcionario> lista = new ArrayList<Funcionario>();

            try {
                Scanner sc = new Scanner(System.in);
                while (sc.hasNext()){
                    Funcionario funcionario = new Funcionario();
                    funcionario.setMatricula(sc.nextInt());

                    if(funcionario.getMatricula() == 0){
                        for(int i = 0; i <= lista.size(); i++) {
                            System.out.println(funcionario);
                        }
                        break;
                    }
                    funcionario.setNome(sc.nextLine());
                    funcionario.setCpf(sc.nextLine());
                    funcionario.setCargo(sc.nextLine());
                    funcionario.setDepartamento(sc.nextLine());
                    funcionario.setSalario(sc.nextFloat());
                    while (sc.hasNext()){
                        Endereco endereco = new Endereco();
                        endereco.setRua(sc.nextLine());
                        endereco.setNumero(sc.nextInt());
                        endereco.setQuadra(sc.nextInt());
                        endereco.setLote(sc.nextInt());
                        endereco.setComplemento(sc.nextLine());
                        endereco.setBairro(sc.nextLine());
                        endereco.setCidade(sc.nextLine());
                        endereco.setUnidadesFederativas(UnidadesFederativas.valoresListados(sc.nextLine()));
                        funcionario.setEndereco(endereco);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            for(Funcionario funcionario: lista){
            funcionario.aumentaSalario(0.3);
        }
            for (int i = 0; i <= lista.size(); i++) {
                System.out.println(lista);
            }
    }
}
