import java.util.Scanner;
public class Consonantes {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("Introduce la frase: ");
        frase = sc.nextLine();
        int consonantes = 0;
        for(int i = 0; i < frase.length(); i++){
            if((frase.charAt(i) != "a")|(frase.charAt(i) != "e")|(frase.charAt(i) != "i")|(frase.charAt(i) != "o")|(frase.charAt(i) != "")){
                consonantes = consonantes + 1;
            }
        }
        System.out.println("La frase tiene" + consonantes+ "consonantes");


    }
}
