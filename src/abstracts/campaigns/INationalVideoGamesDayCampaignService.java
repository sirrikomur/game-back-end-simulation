package abstracts.campaigns;

import abstracts.base.ICampaignService;

public interface INationalVideoGamesDayCampaignService extends ICampaignService {
    float discount(float price);
}
