import adapters.EGovernmentServiceAdapter;
import concretes.GamerManager;
import entities.Gamer;

import java.util.Calendar;
import java.util.Scanner;

public class Program {
    private static Scanner _scanner = new Scanner(System.in);

    public void recordGamer(Gamer gamer) {
        GamerManager gamerManager = new GamerManager(new EGovernmentServiceAdapter());
        gamer.setId(1);

        System.out.print("Enter Identity Number: ");
        gamer.setIdentityNumber(_scanner.nextLine());

        System.out.print("Enter First Name: ");
        gamer.setFirstName(_scanner.nextLine());

        System.out.print("Enter Last Name: ");
        gamer.setLastName(_scanner.nextLine());

        System.out.print("Enter Birth Day: ");
        int day = Integer.parseInt(_scanner.nextLine());

        System.out.print("Enter Birth Month: ");
        int month = Integer.parseInt(_scanner.nextLine());

        System.out.print("Enter Birth Year: ");
        int year = Integer.parseInt(_scanner.nextLine());
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        gamer.setDateOfBirth(calendar);

        System.out.print("Enter Email: ");
        gamer.setEmail(_scanner.nextLine());

        gamer.setDateOfRecord(calendar.getTime());

        gamerManager.create(gamer);
    }
}
