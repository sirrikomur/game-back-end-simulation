package adapters;

import abstracts.base.IUserCheckService;
import entities.base.User;
import external.service.egovernment.EGovernmentService;

import java.util.Calendar;

public class EGovernmentServiceAdapter implements IUserCheckService {
    @Override
    public boolean checkIfRealPerson(User user) {
        EGovernmentService eGovernmentService = new EGovernmentService();

        return eGovernmentService.validatePerson(user.getIdentityNumber(), user.getFirstName(), user.getLastName(), user.getDateOfBirth().get(Calendar.YEAR));
    }
}
