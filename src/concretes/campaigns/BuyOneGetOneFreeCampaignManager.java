package concretes.campaigns;

import abstracts.base.IMultipleGameCampaignService;
import abstracts.campaigns.IBuyOneGetOneFreeCampaignService;
import entities.base.Game;
import utility.Mathematics;

public class BuyOneGetOneFreeCampaignManager implements IMultipleGameCampaignService {

    @Override
    public float discount(Game... games) {
        return Mathematics.getLargeNumber(games[0].getPrice(), games[1].getPrice());
    }
}
