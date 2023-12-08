package edu.javacours.studentorder.validator;

import edu.javacours.studentorder.domain.children.AnswerChildren;
import edu.javacours.studentorder.domain.StudentOrder;

public class ChildrenValidator {

    String hostName;

     public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Child!");
        return new AnswerChildren();
    }
}
