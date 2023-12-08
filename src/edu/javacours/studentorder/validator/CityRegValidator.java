package edu.javacours.studentorder.validator;

import edu.javacours.studentorder.domain.Child;
import edu.javacours.studentorder.domain.register.AnswerCityReg;
import edu.javacours.studentorder.domain.register.CityRegResponse;
import edu.javacours.studentorder.domain.StudentOrder;
import edu.javacours.studentorder.exception.CityRegException;
import edu.javacours.studentorder.validator.register.CityRegChecker;
import edu.javacours.studentorder.validator.register.FakeCityRegChecker;

import java.util.List;

public class CityRegValidator {

    public String hostName;
    String login;
    String password;

    private CityRegChecker personChecker;

    public CityRegValidator() {
        personChecker = new FakeCityRegChecker();
    }

    public AnswerCityReg checkCityReg(StudentOrder so) {
        try {
            CityRegResponse hans = personChecker.checkPerson(so.getHusband());
            CityRegResponse wans = personChecker.checkPerson(so.getWife());

            List<Child> children = so.getChildren();
            for (Child child : children) {
                CityRegResponse cans = personChecker.checkPerson(child);
            }
        } catch (CityRegException ex) {
            ex.printStackTrace(System.out);
        }

        AnswerCityReg ans = new AnswerCityReg();
        return ans;
    }
}
