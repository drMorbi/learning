package edu.javacours.studentorder.validator;

import edu.javacours.studentorder.domain.wedding.AnswerWedding;
import edu.javacours.studentorder.domain.StudentOrder;

public class WeddingValidator {

    String hostName;

     public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding!");
        AnswerWedding ans = new AnswerWedding();
        ans.succes = false;
        return ans;
    }
}
