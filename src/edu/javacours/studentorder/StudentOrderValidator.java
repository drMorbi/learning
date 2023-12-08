package edu.javacours.studentorder;

import edu.javacours.studentorder.domain.*;
import edu.javacours.studentorder.domain.children.AnswerChildren;
import edu.javacours.studentorder.domain.register.AnswerCityReg;
import edu.javacours.studentorder.domain.student.AnswerStudent;
import edu.javacours.studentorder.domain.wedding.AnswerWedding;
import edu.javacours.studentorder.mail.MailSender;
import edu.javacours.studentorder.validator.ChildrenValidator;
import edu.javacours.studentorder.validator.CityRegValidator;
import edu.javacours.studentorder.validator.StudentValidator;
import edu.javacours.studentorder.validator.WeddingValidator;

import java.util.LinkedList;
import java.util.List;

public class StudentOrderValidator {
    private CityRegValidator cityRegVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSend;

    public StudentOrderValidator() {
        cityRegVal = new CityRegValidator();
        weddingVal = new WeddingValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSend = new MailSender();
    }

    public static void main(String[] args) {
        StudentOrderValidator sov = new StudentOrderValidator();
        sov.checkAll();
    }

    public void checkAll() {
        List<StudentOrder> soList = readStudentOrders();

        for (StudentOrder so: soList) {
            checkOneOrder(so);
        }
    }

    public List<StudentOrder> readStudentOrders() {
        List<StudentOrder> soList = new LinkedList<>();

        for (int c = 0; c < 5; c++) {
            StudentOrder so = SaveStudentOrder.buildStudentOrder(c);
        }
        return soList;
    }

    public void checkOneOrder(StudentOrder so){
        AnswerCityReg cityAnswer = checkCityReg(so);
//        AnswerWedding wedAnswer = checkWedding(so);
//        AnswerChildren childAnswer = checkChildren(so);
//        AnswerStudent studAnswer = checkStudent(so);
//        sendMail(so);
    }

    public AnswerCityReg checkCityReg(StudentOrder so) {
        return cityRegVal.checkCityReg(so);

    }

    public AnswerWedding checkWedding(StudentOrder so) {
        return weddingVal.checkWedding(so);
    }

    public AnswerChildren checkChildren(StudentOrder so) {
        return childrenVal.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so) {
        return studentVal.checkStudent(so);
    }

    public void sendMail(StudentOrder so) {
        mailSend.sendMail(so);
    }
}
