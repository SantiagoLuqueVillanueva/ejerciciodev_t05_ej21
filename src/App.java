public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Por favor, vaya introduciendo números enteros.");
        System.out.println("Puede terminar mediante la introducción de número negativo.");

        int num;
        int impar = 0;
        int pos = 0;
        int numImpar = 0;
        int maxPar = 0;
        
        do{
            num = Integer.parseInt(System.console().readLine());

            if (num >= 0){
                pos++;
            }

            if(num % 2 == 1){
                impar += num;
                numImpar++;
            }

            if(num > maxPar && num % 2 == 0){
               maxPar = num;
            }
        } while(num >= 0);

        System.out.printf("Ha introducido %d números positivos.%n", pos);
        System.out.printf("La media de los impares es %d.%n", impar/numImpar);
        System.out.printf("El máximo de los pares es %d.", maxPar);
    }
}
