import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] elements = {"Akmens", "Šķēres", "Papīrīts"};
        String result = elements[new Random().nextInt(elements.length)];
        System.out.println(result);

        while(true) {
            System.out.println("Izvēlies: Akmens, Šķēres, Papīrīts");

            String userChoice = scan.nextLine();
            if(userChoice.equals(result)) {
                System.out.println("Neizšķirts!");
            } else if(userChoice.equals("Akmens") && result.equals("Šķēres")) {
                System.out.println("Tu uzvarēji!");
            } else if(userChoice.equals("Šķēres") && result.equals("Papīrīts")) {
                System.out.println("Tu uzvarēji!");
            } else if(userChoice.equals("Papīrīts") && result.equals("Akmens")) {
                System.out.println("Tu uzvarēji!");
            } else if(userChoice.equals("Papīrīts") && result.equals("Šķēres")) {
                System.out.println("Tu zaudēji!");
                break;
            } else if(userChoice.equals("Šķēres") && result.equals("Akmens")) {
                System.out.println("Tu zaudēji!");
                break;
            } else if(userChoice.equals("Akmens") && result.equals("Papīrīts")) {
                System.out.println("Tu zaudēji!");
                break;
            } else {
                System.out.println("Izpildas else");
            }
        }

    }
}