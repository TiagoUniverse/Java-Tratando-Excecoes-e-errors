import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int notas;
        boolean entrada;

        do {
            try{
                System.out.println("Quantas notas o aluno teve: ");
                notas = scanner.nextInt();
                entrada = true;
            } catch(InputMismatchException e){
                System.out.print("Input error \n");
                // Next line limpa o scanner
                scanner.nextLine();
                entrada = false;
            }



        } while (!entrada);


        scanner.close();
    }
}