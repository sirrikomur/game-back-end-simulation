package entities.base;

import abstracts.base.IEntity;

import java.util.Calendar;

public class User implements IEntity {
    private int _id;
    private String _identityNumber;
    private String _firstName;
    private String _lastName;
    private Calendar _dateOfBirth;
    private String _email;

    /*public User(int id, String identityNumber, String firstName, String lastName, Calendar dateOfBirth, String email) {
        _id = id;
        _identityNumber = identityNumber;
        _firstName = firstName;
        _lastName = lastName;
        _dateOfBirth = dateOfBirth;
        _email = email;
    }*/

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getIdentityNumber() {
        return _identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        _identityNumber = identityNumber;
    }

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;
    }

    public Calendar getDateOfBirth() {
        return _dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        _dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }
}
