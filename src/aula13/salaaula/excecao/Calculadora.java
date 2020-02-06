package aula13.salaaula.excecao;

public class Calculadora {

    public int dividir(int a, int b) throws ArithmeticException{
            return a / b;
        }

    public int somar(int[] numeros) throws ArrayIndexOutOfBoundsException {
        int tamanho = numeros.length;
        int soma = 0;
        for(int i = 0; i <= tamanho; i++){
            soma += numeros[i];
        }
        return soma;
    }

    public int multiplica(int a, int b) throws MinhaExcecao {
        int result = 0;
        if(a == 0 || b == 0){
            throw new MinhaExcecao("Esta operação não aceita zeros");
        } else {
            result = a * b;
        }
        return result;
    }

    public static void main(String[] args) {
        Calculadora app  = new Calculadora();
        int a = 10;
        int b = 3;
        try{
            int c = app.multiplica(a, b);
            System.out.println("Resultado da multiplicação de " + a +
                    " por " + b + " é igual a " + app.multiplica(a, b));
            int d = app.dividir(a, b);
            System.out.println("Resultado da divisão de " + a +
                    " por " + b + " é igual a " + app.dividir(a, b));
            int numeros[] = {1, 2, 3, 4, 5};
            System.out.println("Soma do vetor: " + app.somar(numeros));
        } catch (ArithmeticException | MinhaExcecao | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
