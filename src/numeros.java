package numerosprimos;

/**
 *
 * @author
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments arg[0] es el primer parámetro que
     * se le pasa cuando se ejecuta por linea de comandos
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean esPrimo = false;

    public static void main(String arg[]) {
        int numeroDigitos = 0;
        int numerod = 0;
        numeroDigitos = Integer.parseInt(arg[0]);
        if (numeroDigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int numero = 1; numero <= 99999; numero++) {
            int divisor = numero;
            int contador = 0;

            while (divisor != 0) {
                divisor = divisor / 10;
                contador++;
            }
            numerod = contador;

            if (numerod == numeroDigitos) {
                if (numero < 4) {
                    esPrimo = true;
                } else {
                    if (numero % 2 == 0) {
                        esPrimo = false;
                    } else {
                        int contador1 = 0;
                        int contador2 = 1;
                        int contador3 = (numero - 1) / 2;
                        if (contador3 % 2 == 0) {
                            contador3--;
                        }
                        while (contador2 <= contador3) {
                            if (numero % contador2 == 0) {
                                contador1++;
                            }
                            contador2 += 2;
                            if (contador1 == 2) {
                                contador2 = contador3 + 1;
                            }
                        }

                        if (contador1 == 1) {
                            esPrimo = true;
                        }
                    }
                }

                if (esPrimo == true) {
                    System.out.println(numero);
                }
            }
        }
    }
}

}
