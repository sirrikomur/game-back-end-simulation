package entities;

import entities.base.User;

import java.util.Date;

public class Gamer extends User {
    private Date _dateOfRecord;

    public Date getDateOfRecord() {
        return _dateOfRecord;
    }

    public void setDateOfRecord(Date dateOfRecord) {
        _dateOfRecord = dateOfRecord;
    }
}
