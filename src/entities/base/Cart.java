package entities.base;

import abstracts.base.IEntity;

import java.util.List;

public class Cart implements IEntity {
    private int _id;
    private int _userId;
    private List<Game> _games;

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public int getUserId() {
        return _userId;
    }

    public void setUserId(int userId) {
        _userId = userId;
    }

    public List<Game> getGames() {
        return _games;
    }

    public void setGames(List<Game> games) {
        _games = games;
    }
}
