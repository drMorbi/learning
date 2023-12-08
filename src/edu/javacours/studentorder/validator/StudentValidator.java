package edu.javacours.studentorder.validator;

import edu.javacours.studentorder.domain.student.AnswerStudent;
import edu.javacours.studentorder.domain.StudentOrder;

public class StudentValidator {

    String hostName;

    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Student!");
        return new AnswerStudent();
    }
}
