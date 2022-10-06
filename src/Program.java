import abstracts.base.IMultipleGameCampaignService;
import abstracts.base.ISingleGameCampaignService;
import adapters.EGovernmentServiceAdapter;
import concretes.users.GamerManager;
import entities.base.*;
import entities.users.Gamer;

import java.util.*;

public class Program {
    private static Scanner _scanner = new Scanner(System.in);
    private static ISingleGameCampaignService _singleGameCampaignService;
    private static IMultipleGameCampaignService _multipleGameCampaignService;

    public Program(ISingleGameCampaignService singleGameCampaignService, IMultipleGameCampaignService multipleGameCampaignService) {
        _singleGameCampaignService = singleGameCampaignService;
        _multipleGameCampaignService = multipleGameCampaignService;
    }

    public void saveGamer(Gamer gamer) {
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

    public void sellGame(List<Game> games, Cart cart, Gamer gamer) {
        String option = "";

        System.out.println("NATIONAL GAMES DAY CAMPAIGN\n" +
                "Price: $0-100 => Discount Rate: %50\n" +
                "Price: $100-500 => Discount Rate: %45\n" +
                "Price: $500-1000 => Discount Rate: %40\n" +
                "Price: Over $1000 => Discount Rate: %35\n");

        int i = 1;
        for (Game game : games) {
            if (game.getCampaign() instanceof SingleGameCampaign) {
                System.out.println(i + ". " + game.getName() + ": $" + _singleGameCampaignService.discount(game) + " instead of $" + game.getPrice());
            } else if (game.getCampaign() instanceof MultipleGameCampaign) {
                System.out.println(i + ". " + game.getName() + " (Campaign: Buy One Get One Free)");
            }

            i++;
        }

        System.out.print("Choose a game: ");
        option = _scanner.nextLine();

        addToCart(cart, gamer, games.get(Integer.parseInt(option) - 1));
    }

    private void addToCart(Cart cart, User user, Game game) {
        List<Game> purchasedGames;
        if (cart.getGames() == null) {
            purchasedGames = new ArrayList<>();
        } else {
            purchasedGames = cart.getGames();
        }

        purchasedGames.add(game);
        cart.setUserId(user.getId());
        cart.setGames(purchasedGames);
    }

    public void cart(Gamer gamer, Cart cart) {
        if (gamer.getId() == cart.getUserId()) {
            System.out.println("GAMES");
            for (Game game : cart.getGames()) {
                System.out.println("- " + game.getName() + ": $" + game.getPrice());
            }

            System.out.println("Total: " + getTotalPrice(cart));
            System.out.println("Discounted Total: " + getDiscountedTotalPrice(cart));
        }
    }

    private float getTotalPrice(Cart cart) {
        float totalPrice = 0;
        for (Game game : cart.getGames()) {
            totalPrice += game.getPrice();
        }

        return totalPrice;
    }

    private float getDiscountedTotalPrice(Cart cart) {
        return getDiscountedTotalPriceOfGamesWithSingleCampaign(cart) + getDiscountedTotalPriceOfGamesWithMultipleCampaign(cart);
    }

    private float getDiscountedTotalPriceOfGamesWithSingleCampaign(Cart cart) {
        float discountedTotalPrice = 0;
        List<Game> gamesWithSingleGameCampaign = getGamesWithSingleCampaign(cart);

        for (Game game : gamesWithSingleGameCampaign) {
            discountedTotalPrice += _singleGameCampaignService.discount(game);
        }

        return discountedTotalPrice;
    }

    private float getDiscountedTotalPriceOfGamesWithMultipleCampaign(Cart cart) {
        float discountedTotalPrice = 0;
        List<Game> gamesWithMultipleGamesCampaign = getGamesWithMultipleCampaign(cart);

        if (gamesWithMultipleGamesCampaign.size() == 1) {
            discountedTotalPrice = gamesWithMultipleGamesCampaign.get(0).getPrice();
        } else if (gamesWithMultipleGamesCampaign.size() > 1) {
            for (int i = 1; i < gamesWithMultipleGamesCampaign.size() + 1; i++) {
                if (i % 2 == 0) {
                    discountedTotalPrice += _multipleGameCampaignService.discount(gamesWithMultipleGamesCampaign.get(i - 2), gamesWithMultipleGamesCampaign.get(i - 1));
                } else if (i == gamesWithMultipleGamesCampaign.size()) {
                    discountedTotalPrice += gamesWithMultipleGamesCampaign.get(i - 1).getPrice();
                }
            }
        }

        return discountedTotalPrice;
    }

    private List<Game> getGamesWithSingleCampaign(Cart cart) {
        List<Game> gamesWithSingleGameCampaign = new ArrayList<>();

        for (Game game : cart.getGames()) {
            if (game.getCampaign() instanceof SingleGameCampaign) {
                gamesWithSingleGameCampaign.add(game);
            }
        }

        return gamesWithSingleGameCampaign;
    }

    private List<Game> getGamesWithMultipleCampaign(Cart cart) {
        List<Game> gamesWithMultipleGamesCampaign = new ArrayList<>();

        for (Game game : cart.getGames()) {
            if (game.getCampaign() instanceof MultipleGameCampaign) {
                gamesWithMultipleGamesCampaign.add(game);
            }
        }

        return gamesWithMultipleGamesCampaign;
    }


}
