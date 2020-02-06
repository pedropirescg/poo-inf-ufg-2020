package aula13.salaaula.excecao;

public class TestaData {
    public static void main(String[] args) {
        String hoje = "05/02/2020";
        try{
            System.out.println(FormataData.convertStringToDate(hoje));
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Execução obrigatória");
        }
    }
}
