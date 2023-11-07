package th.ac.tu.cs.subjectRequestForm.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
public class SubjectRequest {
    private String date;
    private String studentPrefix;
    private String studentFirstName;
    private String studentLastName;
    private String studentId;
    private Integer studentYear;
    private String studyField;
    private String addressNumber;
    private String moo;
    private String tumbol;
    private String amphur;
    private String province;
    private String postalCode;
    private String mobilePhone;
    private String phone;
    private String advisor;
    @ElementCollection
    private List<Subject> addSubjectList;
    @ElementCollection
    private List<Subject> removeSubjectList;
    private String reason;

    public SubjectRequest(String date, String studentPrefix, String studentFirstName, String studentLastName, String studentId, Integer studentYear, String studyField, String addressNumber, String moo, String tumbol, String amphur, String province, String postalCode, String mobilePhone, String phone, String advisor, List<Subject> addSubjectList, List<Subject> removeSubjectList, String reason) {
        this.date = date;
        this.studentPrefix = studentPrefix;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentId = studentId;
        this.studentYear = studentYear;
        this.studyField = studyField;
        this.addressNumber = addressNumber;
        this.moo = moo;
        this.tumbol = tumbol;
        this.amphur = amphur;
        this.province = province;
        this.postalCode = postalCode;
        this.mobilePhone = mobilePhone;
        this.phone = phone;
        this.advisor = advisor;
        this.addSubjectList = addSubjectList;
        this.removeSubjectList = removeSubjectList;
        this.reason = reason;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStudentPrefix() {
        return studentPrefix;
    }

    public void setStudentPrefix(String studentPrefix) {
        this.studentPrefix = studentPrefix;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(Integer studentYear) {
        this.studentYear = studentYear;
    }

    public String getStudyField() {
        return studyField;
    }

    public void setStudyField(String studyField) {
        this.studyField = studyField;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getMoo() {
        return moo;
    }

    public void setMoo(String moo) {
        this.moo = moo;
    }

    public String getTumbol() {
        return tumbol;
    }

    public void setTumbol(String tumbol) {
        this.tumbol = tumbol;
    }

    public String getAmphur() {
        return amphur;
    }

    public void setAmphur(String amphur) {
        this.amphur = amphur;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public List<Subject> getAddSubjectList() {
        return addSubjectList;
    }

    public void setAddSubjectList(List<Subject> addSubjectList) {
        this.addSubjectList = addSubjectList;
    }

    public List<Subject> getRemoveSubjectList() {
        return removeSubjectList;
    }

    public void setRemoveSubjectList(List<Subject> removeSubjectList) {
        this.removeSubjectList = removeSubjectList;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "SubjectRequest{" +
                "date='" + date + '\'' +
                ", studentPrefix='" + studentPrefix + '\'' +
                ", studentFirstName='" + studentFirstName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", studentYear=" + studentYear +
                ", studyField='" + studyField + '\'' +
                ", addressNumber='" + addressNumber + '\'' +
                ", moo='" + moo + '\'' +
                ", tumbol='" + tumbol + '\'' +
                ", amphur='" + amphur + '\'' +
                ", province='" + province + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", phone='" + phone + '\'' +
                ", advisor='" + advisor + '\'' +
                ", addSubjectList=" + addSubjectList +
                ", removeSubjectList=" + removeSubjectList +
                ", reason='" + reason + '\'' +
                '}';
    }
}
