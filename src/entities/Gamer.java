package entities;

import entities.base.User;

import java.util.Calendar;
import java.util.Date;

public class Gamer extends User {
    private Date _dateOfRecord;

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
}
