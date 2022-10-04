import entities.Gamer;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Program program = new Program();
        Gamer gamer = new Gamer();

        String option = "";
        while (!option.toLowerCase(Locale.ENGLISH).equals("exit")) {
            System.out.print("Choose an action: ");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextLine();
            if (option.equals("1")) {
                program.recordGamer(gamer);
            }
        }
    }
}