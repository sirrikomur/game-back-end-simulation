package abstracts.base;

import entities.base.Game;

public interface ISingleGameCampaignService extends ICampaignService {
    float discount(Game game);

}
