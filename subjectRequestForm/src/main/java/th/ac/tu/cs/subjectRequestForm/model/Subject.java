package th.ac.tu.cs.subjectRequestForm.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Subject {
    private String subjectCode;
    private String subjectName;
    private String subjectSection;
    private String subjectDate;
    private Integer subjectCredit;
    private String subjectTeacher;
    private Boolean subjectCheck;

    public Subject(String subjectCode, String subjectName, String subjectSection, String subjectDate, Integer subjectCredit, String subjectTeacher, Boolean subjectCheck) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.subjectSection = subjectSection;
        this.subjectDate = subjectDate;
        this.subjectCredit = subjectCredit;
        this.subjectTeacher = subjectTeacher;
        this.subjectCheck = subjectCheck;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectSection() {
        return subjectSection;
    }

    public void setSubjectSection(String subjectSection) {
        this.subjectSection = subjectSection;
    }

    public String getSubjectDate() {
        return subjectDate;
    }

    public void setSubjectDate(String subjectDate) {
        this.subjectDate = subjectDate;
    }

    public Integer getSubjectCredit() {
        return subjectCredit;
    }

    public void setSubjectCredit(Integer subjectCredit) {
        this.subjectCredit = subjectCredit;
    }

    public String getSubjectTeacher() {
        return subjectTeacher;
    }

    public void setSubjectTeacher(String subjectTeacher) {
        this.subjectTeacher = subjectTeacher;
    }

    public Boolean getSubjectCheck() {
        return subjectCheck;
    }

    public void setSubjectCheck(Boolean subjectCheck) {
        this.subjectCheck = subjectCheck;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectCode='" + subjectCode + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", subjectSection='" + subjectSection + '\'' +
                ", subjectDate='" + subjectDate + '\'' +
                ", subjectCredit=" + subjectCredit +
                ", subjectTeacher='" + subjectTeacher + '\'' +
                ", subjectCheck=" + subjectCheck +
                '}';
    }
}

