package concretes.campaigns;

import abstracts.base.IMultipleGameCampaignService;
import abstracts.campaigns.IBuyOneGetOneFreeCampaignService;
import entities.base.Game;
import utility.Mathematics;

public class BuyOneGetOneFreeCampaignManager implements IMultipleGameCampaignService {
    private static Mathematics mathematics = new Mathematics();

    @Override
    public float discount(Game... games) {
        return mathematics.getLargeNumber(games[0].getPrice(), games[1].getPrice());
    }
}
