package edu.javacours.studentorder.validator.register;

import edu.javacours.studentorder.domain.register.CityRegResponse;
import edu.javacours.studentorder.domain.Person;
import edu.javacours.studentorder.exception.CityRegException;

public interface CityRegChecker {
    CityRegResponse checkPerson(Person person) throws CityRegException;
}
