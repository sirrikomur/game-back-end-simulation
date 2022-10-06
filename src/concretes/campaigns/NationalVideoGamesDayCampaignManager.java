package concretes.campaigns;

import abstracts.base.ISingleGameCampaignService;
import abstracts.campaigns.INationalVideoGamesDayCampaignService;
import entities.base.Game;
import entities.base.SingleGameCampaign;

public class NationalVideoGamesDayCampaignManager implements ISingleGameCampaignService {
    //@Override
    public float discount(Game game) {
        if (isPriceBetween0And100(game.getPrice())) {
            return discountPriceBetween0And100(game.getPrice());
        } else if (isPriceBetween100And500(game.getPrice())) {
            return discountPriceBetween100And500(game.getPrice());
        } else if (isPriceBetween500And1000(game.getPrice())) {
            return discountPriceBetween500And1000(game.getPrice());
        }

        return discountPriceOver1000(game.getPrice());
    }

    private float discountPriceBetween0And100(float price) {
        return discountByRate(price, 50);
    }

    private float discountPriceBetween100And500(float price) {
        return discountByRate(price, 45);
    }

    private float discountPriceBetween500And1000(float price) {
        return discountByRate(price, 40);
    }

    private float discountPriceOver1000(float price) {
        return discountByRate(price, 35);
    }

    private float discountByRate(float price, int discountRate) {
        return price - ((price * discountRate) / 100);
    }

    private boolean isPriceBetween0And100(float price) {
        return price > 0 && price < 100;
    }

    private boolean isPriceBetween100And500(float price) {
        return price >= 100 && price < 500;
    }

    private boolean isPriceBetween500And1000(float price) {
        return price >= 500 && price < 1000;
    }

    private boolean isPriceOver1000(float price) {
        return price >= 1000;
    }
}
