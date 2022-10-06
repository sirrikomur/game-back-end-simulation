package entities.base;

import abstracts.base.IEntity;

public class Game implements IEntity {
    private int _id;
    private String _name;
    private float _price;
    private Campaign _campaign;

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public float getPrice() {
        return _price;
    }

    public void setPrice(float price) {
        _price = price;
    }

    public Campaign getCampaign() {
        return _campaign;
    }

    public void setCampaign(Campaign campaign) {
        _campaign = campaign;
    }
}
