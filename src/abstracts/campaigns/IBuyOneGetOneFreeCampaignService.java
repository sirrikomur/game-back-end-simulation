package abstracts.campaigns;

import abstracts.base.ICampaignService;
import entities.base.Game;

public interface IBuyOneGetOneFreeCampaignService extends ICampaignService {
    float discount(Game... games);
}
