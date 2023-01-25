import java.util.Scanner;
public class Pares {
    Scanner inputValue = new Scanner(System.in);
    System.out.println("Introduce el número de numeros: ");
    int nnaturales = inputValue.nextInt();
    int cuenta = 0;
    for (int i = 0; i <= nnaturales; i++){
        if(nnaturales /2 == 0){
            nnaturales = nnaturales + i;
        }
    }
    System.out.println("La cuenta de los n primeros números naturales es :" + nnaturales);
}
