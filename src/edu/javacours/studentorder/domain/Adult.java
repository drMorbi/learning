package edu.javacours.studentorder.domain;

import java.time.LocalDate;

public class Adult extends Person{

    private String passportSeries;
    private String passportNumber;
    private LocalDate issueDate;
    private String issueDepartment;
    private String university;
    private String studentId;

    public Adult(){
    }

    public Adult(String surName, String giveName, String patronymic, LocalDate date) {
        super(surName, giveName, patronymic, date);
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getStudentID() {
        return studentId;
    }

    public void setStudentId(String studentID) {
        this.studentId = studentID;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }


}
