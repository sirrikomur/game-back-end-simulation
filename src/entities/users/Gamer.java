package entities.users;

import entities.base.Game;
import entities.base.User;

import java.util.Date;
import java.util.List;

public class Gamer extends User {
    private Date _dateOfRecord;
    private List<Game> _games;

   /* public Gamer(int id, String identityNumber, String firstName, String lastName, Calendar dateOfBirth, String email, Date dateOfRecord) {
        super(id, identityNumber, firstName, lastName, dateOfBirth, email);

        _dateOfRecord = dateOfRecord;
    }*/

    public Date getDateOfRecord() {
        return _dateOfRecord;
    }

    public void setDateOfRecord(Date dateOfRecord) {
        _dateOfRecord = dateOfRecord;
    }

    public List<Game> getGames() {
        return _games;
    }

    public void setGames(List<Game> games) {
        _games = games;
    }
}
