import java.util.Scanner;
public class Main {
    public static void main(String[] argv){
        Password Passwords[] = new Password[];
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el número de contraseñas : ");
        int num = inputValue.nextInt();
        Passwords.length = num;
        int tamanyo;
        System.out.println("Introduce el tamaño del pass : ");
        tamanyo = inputValue.nextInt();
        for (int i = 0; i <= Passwords.length; i++){
            Passwords [i]= new Password pass = new Password();
        }
        Boolean[] fuertes = Boolean[num];
        for (int i = 0; i <= Passwords.length; i++){
            fuertes[i] = esFuerte;
        }
        for(int i = 0; i <= Passwords.length; i++){
            System.out.println("La contraseña " + contrasenya +"es fuerte? " + esFuerte());
        }
    }

}
