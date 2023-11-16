package th.ac.tu.cs.subjectRequestForm.model;

import java.sql.Date;
import java.time.LocalDateTime;
//import java.time.LocalDateTime;

public class DropWData {
    public DropWData() {
        status = "กำลังรอดำเนินการ";
    }
    public String status;

    public float gpax;
    public String getGpax() {
        return String.format("%.2f", gpax);
    }

    public void setGpax(float gpax) {
        this.gpax = gpax;
    }

    public String getFirstName() {
        return firstName;
    }
    private String firstName;
    private String lastname;
    private String studentId;
    private Date date;
    private String prefix;
    private int studentYear;
    private String studentField;
    private String advisor;
    private String addressNumber;
    private String moo;
    private String tumbol;
    private String amphur;
    private String province;
    private Integer postalCode;
    private String mobilePhone;
    private String phone;
    private String cause;

    private String dropCourse1Code;
    private String dropCourse1Name;
    private int dropCourse1Section;
    private LocalDateTime dropCourse1DayAndTime;
    private int dropCourse1Credits;
    private String dropCourse1InstructorName;
    private boolean dropCourse1InstructorPermission;
    //private String addCourse3Name;
    private String dropCourse2Code;
    private String dropCourse2Name;
    private int dropCourse2Section;
    private LocalDateTime dropCourse2DayAndTime;
    private int dropCourse2Credits;
    private String dropCourse2InstructorName;
    private boolean dropCourse2InstructorPermission;
    private String dropCourse3Code;
    private String dropCourse3Name;
    private int dropCourse3Section;
    private LocalDateTime dropCourse3DayAndTime;
    private int dropCourse3Credits;
    private String dropCourse3InstructorName;
    private boolean dropCourse3InstructorPermission;
    private String dropCourse4Code;
    private String dropCourse4Name;
    private int dropCourse4Section;
    private LocalDateTime dropCourse4DayAndTime;
    private int dropCourse4Credits;
    private String dropCourse4InstructorName;
    private boolean dropCourse4InstructorPermission;
    private String dropCourse5Code;
    private String dropCourse5Name;
    private int dropCourse5Section;
    private LocalDateTime dropCourse5DayAndTime;
    private int dropCourse5Credits;
    private String dropCourse5InstructorName;
    private boolean dropCourse5InstructorPermission;
    private String dropCourse6Code;
    private String dropCourse6Name;
    private int dropCourse6Section;
    private LocalDateTime dropCourse6DayAndTime;
    private int dropCourse6Credits;
    private String dropCourse6InstructorName;
    private boolean dropCourse6InstructorPermission;
    private String dropCourse7Code;
    private String dropCourse7Name;
    private int dropCourse7Section;
    private LocalDateTime dropCourse7DayAndTime;
    private int dropCourse7Credits;
    private String dropCourse7InstructorName;
    private boolean dropCourse7InstructorPermission;
    private String dropCourse8Code;
    private String dropCourse8Name;
    private int dropCourse8Section;
    private LocalDateTime dropCourse8DayAndTime;
    private int dropCourse8Credits;
    private String dropCourse8InstructorName;
    private boolean dropCourse8InstructorPermission;
    private String dropCourse9Code;
    private String dropCourse9Name;
    private int dropCourse9Section;
    private LocalDateTime dropCourse9DayAndTime;
    private int dropCourse9Credits;
    private String dropCourse9InstructorName;
    private boolean dropCourse9InstructorPermission;
    private String dropCourse10Code;
    private String dropCourse10Name;
    private int dropCourse10Section;
    private LocalDateTime dropCourse10DayAndTime;
    private int dropCourse10Credits;
    private String dropCourse10InstructorName;
    private boolean dropCourse10InstructorPermission;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(int studentYear) {
        this.studentYear = studentYear;
    }

    public String getStudentField() {
        return studentField;
    }

    public void setStudentField(String studentField) {
        this.studentField = studentField;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
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

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
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

    public String getCause() {
        //cause = "here";
        //System.out.println(cause);
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void Date(Date date) {
        this.date = date;
    }

    public String getDropCourse1Code() {
        return dropCourse1Code;
    }

    public void setDropCourse1Code(String dropCourse1Code) {
        this.dropCourse1Code = dropCourse1Code;
    }

    public String getDropCourse1Name() {
        return dropCourse1Name;
    }

    public void setDropCourse1Name(String dropCourse1Name) {
        this.dropCourse1Name = dropCourse1Name;
    }

    public int getDropCourse1Section() {
        return dropCourse1Section;
    }

    public void setDropCourse1Section(int dropCourse1Section) {
        this.dropCourse1Section = dropCourse1Section;
    }

    public LocalDateTime getDropCourse1DayAndTime() {
        return dropCourse1DayAndTime;
    }

    public void setDropCourse1DayAndTime(LocalDateTime dropCourse1DayAndTime) {
        this.dropCourse1DayAndTime = dropCourse1DayAndTime;
    }

    public int getDropCourse1Credits() {
        return dropCourse1Credits;
    }

    public void setDropCourse1Credits(int dropCourse1Credits) {
        this.dropCourse1Credits = dropCourse1Credits;
    }

    public String getDropCourse1InstructorName() {
        return dropCourse1InstructorName;
    }

    public void setDropCourse1InstructorName(String dropCourse1InstructorName) {
        this.dropCourse1InstructorName = dropCourse1InstructorName;
    }

    public boolean isDropCourse1InstructorPermission() {
        return dropCourse1InstructorPermission;
    }

    public void setDropCourse1InstructorPermission(boolean dropCourse1InstructorPermission) {
        this.dropCourse1InstructorPermission = dropCourse1InstructorPermission;
    }

    public String getDropCourse2Code() {
        return dropCourse2Code;
    }

    public void setDropCourse2Code(String dropCourse2Code) {
        this.dropCourse2Code = dropCourse2Code;
    }

    public String getDropCourse2Name() {
        return dropCourse2Name;
    }

    public void setDropCourse2Name(String dropCourse2Name) {
        this.dropCourse2Name = dropCourse2Name;
    }

    public int getDropCourse2Section() {
        return dropCourse2Section;
    }

    public void setDropCourse2Section(int dropCourse2Section) {
        this.dropCourse2Section = dropCourse2Section;
    }

    public LocalDateTime getDropCourse2DayAndTime() {
        return dropCourse2DayAndTime;
    }

    public void setDropCourse2DayAndTime(LocalDateTime dropCourse2DayAndTime) {
        this.dropCourse2DayAndTime = dropCourse2DayAndTime;
    }

    public int getDropCourse2Credits() {
        return dropCourse2Credits;
    }

    public void setDropCourse2Credits(int dropCourse2Credits) {
        this.dropCourse2Credits = dropCourse2Credits;
    }

    public String getDropCourse2InstructorName() {
        return dropCourse2InstructorName;
    }

    public void setDropCourse2InstructorName(String dropCourse2InstructorName) {
        this.dropCourse2InstructorName = dropCourse2InstructorName;
    }

    public boolean isDropCourse2InstructorPermission() {
        return dropCourse2InstructorPermission;
    }

    public void setDropCourse2InstructorPermission(boolean dropCourse2InstructorPermission) {
        this.dropCourse2InstructorPermission = dropCourse2InstructorPermission;
    }

    public String getDropCourse3Code() {
        return dropCourse3Code;
    }

    public void setDropCourse3Code(String dropCourse3Code) {
        this.dropCourse3Code = dropCourse3Code;
    }

    public String getDropCourse3Name() {
        return dropCourse3Name;
    }

    public void setDropCourse3Name(String dropCourse3Name) {
        this.dropCourse3Name = dropCourse3Name;
    }

    public int getDropCourse3Section() {
        return dropCourse3Section;
    }

    public void setDropCourse3Section(int dropCourse3Section) {
        this.dropCourse3Section = dropCourse3Section;
    }

    public LocalDateTime getDropCourse3DayAndTime() {
        return dropCourse3DayAndTime;
    }

    public void setDropCourse3DayAndTime(LocalDateTime dropCourse3DayAndTime) {
        this.dropCourse3DayAndTime = dropCourse3DayAndTime;
    }

    public int getDropCourse3Credits() {
        return dropCourse3Credits;
    }

    public void setDropCourse3Credits(int dropCourse3Credits) {
        this.dropCourse3Credits = dropCourse3Credits;
    }

    public String getDropCourse3InstructorName() {
        return dropCourse3InstructorName;
    }

    public void setDropCourse3InstructorName(String dropCourse3InstructorName) {
        this.dropCourse3InstructorName = dropCourse3InstructorName;
    }

    public boolean isDropCourse3InstructorPermission() {
        return dropCourse3InstructorPermission;
    }

    public void setDropCourse3InstructorPermission(boolean dropCourse3InstructorPermission) {
        this.dropCourse3InstructorPermission = dropCourse3InstructorPermission;
    }

    public String getDropCourse4Code() {
        return dropCourse4Code;
    }

    public void setDropCourse4Code(String dropCourse4Code) {
        this.dropCourse4Code = dropCourse4Code;
    }

    public String getDropCourse4Name() {
        return dropCourse4Name;
    }

    public void setDropCourse4Name(String dropCourse4Name) {
        this.dropCourse4Name = dropCourse4Name;
    }

    public int getDropCourse4Section() {
        return dropCourse4Section;
    }

    public void setDropCourse4Section(int dropCourse4Section) {
        this.dropCourse4Section = dropCourse4Section;
    }

    public LocalDateTime getDropCourse4DayAndTime() {
        return dropCourse4DayAndTime;
    }

    public void setDropCourse4DayAndTime(LocalDateTime dropCourse4DayAndTime) {
        this.dropCourse4DayAndTime = dropCourse4DayAndTime;
    }

    public int getDropCourse4Credits() {
        return dropCourse4Credits;
    }

    public void setDropCourse4Credits(int dropCourse4Credits) {
        this.dropCourse4Credits = dropCourse4Credits;
    }

    public String getDropCourse4InstructorName() {
        return dropCourse4InstructorName;
    }

    public void setDropCourse4InstructorName(String dropCourse4InstructorName) {
        this.dropCourse4InstructorName = dropCourse4InstructorName;
    }

    public boolean isDropCourse4InstructorPermission() {
        return dropCourse4InstructorPermission;
    }

    public void setDropCourse4InstructorPermission(boolean dropCourse4InstructorPermission) {
        this.dropCourse4InstructorPermission = dropCourse4InstructorPermission;
    }

    public String getDropCourse5Code() {
        return dropCourse5Code;
    }

    public void setDropCourse5Code(String dropCourse5Code) {
        this.dropCourse5Code = dropCourse5Code;
    }

    public String getDropCourse5Name() {
        return dropCourse5Name;
    }

    public void setDropCourse5Name(String dropCourse5Name) {
        this.dropCourse5Name = dropCourse5Name;
    }

    public int getDropCourse5Section() {
        return dropCourse5Section;
    }

    public void setDropCourse5Section(int dropCourse5Section) {
        this.dropCourse5Section = dropCourse5Section;
    }

    public LocalDateTime getDropCourse5DayAndTime() {
        return dropCourse5DayAndTime;
    }

    public void setDropCourse5DayAndTime(LocalDateTime dropCourse5DayAndTime) {
        this.dropCourse5DayAndTime = dropCourse5DayAndTime;
    }

    public int getDropCourse5Credits() {
        return dropCourse5Credits;
    }

    public void setDropCourse5Credits(int dropCourse5Credits) {
        this.dropCourse5Credits = dropCourse5Credits;
    }

    public String getDropCourse5InstructorName() {
        return dropCourse5InstructorName;
    }

    public void setDropCourse5InstructorName(String dropCourse5InstructorName) {
        this.dropCourse5InstructorName = dropCourse5InstructorName;
    }

    public boolean isDropCourse5InstructorPermission() {
        return dropCourse5InstructorPermission;
    }

    public void setDropCourse5InstructorPermission(boolean dropCourse5InstructorPermission) {
        this.dropCourse5InstructorPermission = dropCourse5InstructorPermission;
    }

    public String getDropCourse6Code() {
        return dropCourse6Code;
    }

    public void setDropCourse6Code(String dropCourse6Code) {
        this.dropCourse6Code = dropCourse6Code;
    }

    public String getDropCourse6Name() {
        return dropCourse6Name;
    }

    public void setDropCourse6Name(String dropCourse6Name) {
        this.dropCourse6Name = dropCourse6Name;
    }

    public int getDropCourse6Section() {
        return dropCourse6Section;
    }

    public void setDropCourse6Section(int dropCourse6Section) {
        this.dropCourse6Section = dropCourse6Section;
    }

    public LocalDateTime getDropCourse6DayAndTime() {
        return dropCourse6DayAndTime;
    }

    public void setDropCourse6DayAndTime(LocalDateTime dropCourse6DayAndTime) {
        this.dropCourse6DayAndTime = dropCourse6DayAndTime;
    }

    public int getDropCourse6Credits() {
        return dropCourse6Credits;
    }

    public void setDropCourse6Credits(int dropCourse6Credits) {
        this.dropCourse6Credits = dropCourse6Credits;
    }

    public String getDropCourse6InstructorName() {
        return dropCourse6InstructorName;
    }

    public void setDropCourse6InstructorName(String dropCourse6InstructorName) {
        this.dropCourse6InstructorName = dropCourse6InstructorName;
    }

    public boolean isDropCourse6InstructorPermission() {
        return dropCourse6InstructorPermission;
    }

    public void setDropCourse6InstructorPermission(boolean dropCourse6InstructorPermission) {
        this.dropCourse6InstructorPermission = dropCourse6InstructorPermission;
    }

    public String getDropCourse7Code() {
        return dropCourse7Code;
    }

    public void setDropCourse7Code(String dropCourse7Code) {
        this.dropCourse7Code = dropCourse7Code;
    }

    public String getDropCourse7Name() {
        return dropCourse7Name;
    }

    public void setDropCourse7Name(String dropCourse7Name) {
        this.dropCourse7Name = dropCourse7Name;
    }

    public int getDropCourse7Section() {
        return dropCourse7Section;
    }

    public void setDropCourse7Section(int dropCourse7Section) {
        this.dropCourse7Section = dropCourse7Section;
    }

    public LocalDateTime getDropCourse7DayAndTime() {
        return dropCourse7DayAndTime;
    }

    public void setDropCourse7DayAndTime(LocalDateTime dropCourse7DayAndTime) {
        this.dropCourse7DayAndTime = dropCourse7DayAndTime;
    }

    public int getDropCourse7Credits() {
        return dropCourse7Credits;
    }

    public void setDropCourse7Credits(int dropCourse7Credits) {
        this.dropCourse7Credits = dropCourse7Credits;
    }

    public String getDropCourse7InstructorName() {
        return dropCourse7InstructorName;
    }

    public void setDropCourse7InstructorName(String dropCourse7InstructorName) {
        this.dropCourse7InstructorName = dropCourse7InstructorName;
    }

    public boolean isDropCourse7InstructorPermission() {
        return dropCourse7InstructorPermission;
    }

    public void setDropCourse7InstructorPermission(boolean dropCourse7InstructorPermission) {
        this.dropCourse7InstructorPermission = dropCourse7InstructorPermission;
    }

    public String getDropCourse8Code() {
        return dropCourse8Code;
    }

    public void setDropCourse8Code(String dropCourse8Code) {
        this.dropCourse8Code = dropCourse8Code;
    }

    public String getDropCourse8Name() {
        return dropCourse8Name;
    }

    public void setDropCourse8Name(String dropCourse8Name) {
        this.dropCourse8Name = dropCourse8Name;
    }

    public int getDropCourse8Section() {
        return dropCourse8Section;
    }

    public void setDropCourse8Section(int dropCourse8Section) {
        this.dropCourse8Section = dropCourse8Section;
    }

    public LocalDateTime getDropCourse8DayAndTime() {
        return dropCourse8DayAndTime;
    }

    public void setDropCourse8DayAndTime(LocalDateTime dropCourse8DayAndTime) {
        this.dropCourse8DayAndTime = dropCourse8DayAndTime;
    }

    public int getDropCourse8Credits() {
        return dropCourse8Credits;
    }

    public void setDropCourse8Credits(int dropCourse8Credits) {
        this.dropCourse8Credits = dropCourse8Credits;
    }

    public String getDropCourse8InstructorName() {
        return dropCourse8InstructorName;
    }

    public void setDropCourse8InstructorName(String dropCourse8InstructorName) {
        this.dropCourse8InstructorName = dropCourse8InstructorName;
    }

    public boolean isDropCourse8InstructorPermission() {
        return dropCourse8InstructorPermission;
    }

    public void setDropCourse8InstructorPermission(boolean dropCourse8InstructorPermission) {
        this.dropCourse8InstructorPermission = dropCourse8InstructorPermission;
    }

    public String getDropCourse9Code() {
        return dropCourse9Code;
    }

    public void setDropCourse9Code(String dropCourse9Code) {
        this.dropCourse9Code = dropCourse9Code;
    }

    public String getDropCourse9Name() {
        return dropCourse9Name;
    }

    public void setDropCourse9Name(String dropCourse9Name) {
        this.dropCourse9Name = dropCourse9Name;
    }

    public int getDropCourse9Section() {
        return dropCourse9Section;
    }

    public void setDropCourse9Section(int dropCourse9Section) {
        this.dropCourse9Section = dropCourse9Section;
    }

    public LocalDateTime getDropCourse9DayAndTime() {
        return dropCourse9DayAndTime;
    }

    public void setDropCourse9DayAndTime(LocalDateTime dropCourse9DayAndTime) {
        this.dropCourse9DayAndTime = dropCourse9DayAndTime;
    }

    public int getDropCourse9Credits() {
        return dropCourse9Credits;
    }

    public void setDropCourse9Credits(int dropCourse9Credits) {
        this.dropCourse9Credits = dropCourse9Credits;
    }

    public String getDropCourse9InstructorName() {
        return dropCourse9InstructorName;
    }

    public void setDropCourse9InstructorName(String dropCourse9InstructorName) {
        this.dropCourse9InstructorName = dropCourse9InstructorName;
    }

    public boolean isDropCourse9InstructorPermission() {
        return dropCourse9InstructorPermission;
    }

    public void setDropCourse9InstructorPermission(boolean dropCourse9InstructorPermission) {
        this.dropCourse9InstructorPermission = dropCourse9InstructorPermission;
    }

    public String getDropCourse10Code() {
        return dropCourse10Code;
    }

    public void setDropCourse10Code(String dropCourse10Code) {
        this.dropCourse10Code = dropCourse10Code;
    }

    public String getDropCourse10Name() {
        return dropCourse10Name;
    }

    public void setDropCourse10Name(String dropCourse10Name) {
        this.dropCourse10Name = dropCourse10Name;
    }

    public int getDropCourse10Section() {
        return dropCourse10Section;
    }

    public void setDropCourse10Section(int dropCourse10Section) {
        this.dropCourse10Section = dropCourse10Section;
    }

    public LocalDateTime getDropCourse10DayAndTime() {
        return dropCourse10DayAndTime;
    }

    public void setDropCourse10DayAndTime(LocalDateTime dropCourse10DayAndTime) {
        this.dropCourse10DayAndTime = dropCourse10DayAndTime;
    }

    public int getDropCourse10Credits() {
        return dropCourse10Credits;
    }

    public void setDropCourse10Credits(int dropCourse10Credits) {
        this.dropCourse10Credits = dropCourse10Credits;
    }

    public String getDropCourse10InstructorName() {
        return dropCourse10InstructorName;
    }

    public void setDropCourse10InstructorName(String dropCourse10InstructorName) {
        this.dropCourse10InstructorName = dropCourse10InstructorName;
    }

    public boolean isDropCourse10InstructorPermission() {
        return dropCourse10InstructorPermission;
    }

    public void setDropCourse10InstructorPermission(boolean dropCourse10InstructorPermission) {
        this.dropCourse10InstructorPermission = dropCourse10InstructorPermission;
    }

}
