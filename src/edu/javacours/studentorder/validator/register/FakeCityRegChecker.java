package edu.javacours.studentorder.validator.register;

import edu.javacours.studentorder.domain.Adult;
import edu.javacours.studentorder.domain.Child;
import edu.javacours.studentorder.domain.register.CityRegResponse;
import edu.javacours.studentorder.domain.Person;
import edu.javacours.studentorder.exception.CityRegException;

public class FakeCityRegChecker implements CityRegChecker {

    private static final String GOOD_1 = "1000";
    private static final String GOOD_2 = "2000";
    private static final String BAD_1 = "1001";
    private static final String BAD_2 = "2001";
    private static final String ERROR_1 = "1002";
    private static final String ERROR_2 = "2002";

    public CityRegResponse checkPerson(Person person) throws CityRegException {
        CityRegResponse res = new CityRegResponse();

        if (person instanceof Adult) {
            Adult t = (Adult) person;
            String ps = t.getPassportSeries();
            if (ps.equals(GOOD_1) || ps.equals(GOOD_2)) {
                res.setExisting(true);
                res.setTemporal(false);
            }
            if (ps.equals(BAD_1) || ps.equals(BAD_2)) {
                res.setExisting(false);
            }
            if (ps.equals(ERROR_1) || ps.equals(ERROR_2)) {
                CityRegException ex = new CityRegException("Fake ERROR " + ps);
                throw ex;
            }
        }

        if(person instanceof Child) {
            res.setExisting(true);
            res.setTemporal(true);
        }

        System.out.println(res);

        return res;    }

}
