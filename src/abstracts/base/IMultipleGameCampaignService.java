package abstracts.base;

import entities.base.Game;

public interface IMultipleGameCampaignService extends ICampaignService {
    float discount(Game... games);
}
