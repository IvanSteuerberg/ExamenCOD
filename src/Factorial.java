package factorial;

public class Factorial {

    public static void main(String[] args) {

        int numero;
        int factorial;

        numero = 8;

        int i;
/*
        La variable numero es el numero del que se va a hacer el factorial, la variable factorial es
        es el resultado del factorial de ese numero y la variable i es el contador
*/
        if (numero == 0) {
            factorial = 1;
        } else {
            factorial = 1;
            for (i = numero; i >= 1; i--) {
                factorial = factorial * i;
            }
        }

        System.out.println(factorial);

    }

}
