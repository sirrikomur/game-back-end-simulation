import abstracts.base.IMultipleGameCampaignService;
import abstracts.base.ISingleGameCampaignService;
import concretes.campaigns.BuyOneGetOneFreeCampaignManager;
import concretes.campaigns.NationalVideoGamesDayCampaignManager;
import entities.base.Cart;
import entities.base.Game;
import entities.campaigns.BuyOneGetOneFreeCampaign;
import entities.campaigns.NationalVideoGamesDayCampaign;
import entities.users.Gamer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ISingleGameCampaignService singleGameCampaignService = new NationalVideoGamesDayCampaignManager();
        IMultipleGameCampaignService multipleGameCampaignService = new BuyOneGetOneFreeCampaignManager();

        Program program = new Program(singleGameCampaignService, multipleGameCampaignService);
        Gamer gamer = new Gamer();

        List<Game> games = new ArrayList<>();

        Game game1 = new Game();
        game1.setId(1);
        game1.setName("Age of Empires");
        game1.setPrice(100);
        game1.setCampaign(new NationalVideoGamesDayCampaign());
        games.add(game1);

        Game game2 = new Game();
        game2.setId(2);
        game2.setName("Call of Duty");
        game2.setPrice(150);
        game2.setCampaign(new BuyOneGetOneFreeCampaign());
        games.add(game2);

        Game game3 = new Game();
        game3.setId(3);
        game3.setName("Mount of Blade");
        game3.setPrice(85);
        game3.setCampaign(new BuyOneGetOneFreeCampaign());
        games.add(game3);

        Cart cart = new Cart();

        Scanner scanner = new Scanner(System.in);

        String option = "";
        while (!option.toLowerCase(Locale.ENGLISH).equals("exit")) {
            System.out.println("\nType 'exit' to exit.");
            System.out.println("1. Register new Gamer");
            System.out.println("2. Buy a game");
            System.out.println("3. Cart");
            System.out.print("Choose an action: ");
            option = scanner.nextLine();
            System.out.println();
            if (option.equals("1")) {
                program.saveGamer(gamer);
            } else if (option.equals("2")) {
                program.sellGame(games, cart, gamer);
            } else if (option.equals("3")) {
                program.cart(gamer, cart);
            }
        }
    }
}