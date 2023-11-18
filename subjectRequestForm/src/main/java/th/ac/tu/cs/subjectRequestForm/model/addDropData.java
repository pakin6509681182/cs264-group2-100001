package th.ac.tu.cs.subjectRequestForm.model;

import java.sql.Date;
import java.time.LocalDateTime;
//import java.time.LocalDateTime;

public class addDropData {
    public String status;
    private String studentFirstName;
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
    private String addCourse1Code;
    private String addCourse1Name;
    private int addCourse1Section;
    private LocalDateTime addCourse1DayAndTime;
    private int addCourse1Credits;
    private String addCourse1InstructorName;
    private boolean addCourse1InstructorPermission;
    private String addCourse2Code;
    private String addCourse2Name;
    private int addCourse2Section;
    private LocalDateTime addCourse2DayAndTime;
    private int addCourse2Credits;
    private String addCourse2InstructorName;
    private boolean addCourse2InstructorPermission;
    private String addCourse3Code;
    private String addCourse3Name;
    private int addCourse3Section;
    private LocalDateTime addCourse3DayAndTime;
    private int addCourse3Credits;
    private String addCourse3InstructorName;
    private boolean addCourse3InstructorPermission;
    private String addCourse4Code;
    private String addCourse4Name;
    private int addCourse4Section;
    private LocalDateTime addCourse4DayAndTime;
    private int addCourse4Credits;
    private String addCourse4InstructorName;
    private boolean addCourse4InstructorPermission;
    private String addCourse5Code;
    private String addCourse5Name;
    private int addCourse5Section;
    private LocalDateTime addCourse5DayAndTime;
    private int addCourse5Credits;
    private String addCourse5InstructorName;
    private boolean addCourse5InstructorPermission;
    private String addCourse6Code;
    private String addCourse6Name;
    private int addCourse6Section;
    private LocalDateTime addCourse6DayAndTime;
    private int addCourse6Credits;
    private String addCourse6InstructorName;
    private boolean addCourse6InstructorPermission;
    private String addCourse7Code;
    private String addCourse7Name;
    private int addCourse7Section;
    private LocalDateTime addCourse7DayAndTime;
    private int addCourse7Credits;
    private String addCourse7InstructorName;
    private boolean addCourse7InstructorPermission;
    private String addCourse8Code;
    private String addCourse8Name;
    private int addCourse8Section;
    private LocalDateTime addCourse8DayAndTime;
    private int addCourse8Credits;
    private String addCourse8InstructorName;
    private boolean addCourse8InstructorPermission;
    private String addCourse9Code;
    private String addCourse9Name;
    private int addCourse9Section;
    private LocalDateTime addCourse9DayAndTime;
    private int addCourse9Credits;
    private String addCourse9InstructorName;
    private boolean addCourse9InstructorPermission;
    private String addCourse10Code;
    private String addCourse10Name;
    private int addCourse10Section;
    private LocalDateTime addCourse10DayAndTime;
    private int addCourse10Credits;
    private String addCourse10InstructorName;
    private boolean addCourse10InstructorPermission;
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
    public addDropData() {
        status = "กำลังรอดำเนินการ";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public String getFirstName() {
        return studentFirstName;
    }

    public void setFirstName(String firstName) {
        this.studentFirstName = firstName;
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

    public void setAddressNumber(String adressNumber) {
        this.addressNumber = adressNumber;
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

    public String getAddCourse1Code() {
        return addCourse1Code;
    }

    public void setAddCourse1Code(String addCourse1Code) {
        this.addCourse1Code = addCourse1Code;
    }

    public String getAddCourse1Name() {
        return addCourse1Name;
    }

    public void setAddCourse1Name(String addCourse1Name) {
        this.addCourse1Name = addCourse1Name;
    }

    public int getAddCourse1Section() {
        return addCourse1Section;
    }

    public void setAddCourse1Section(int addCourse1Section) {
        this.addCourse1Section = addCourse1Section;
    }

    public LocalDateTime getAddCourse1DayAndTime() {
        return addCourse1DayAndTime;
    }

    public void setAddCourse1DayAndTime(LocalDateTime addCourse1DayAndTime) {
        this.addCourse1DayAndTime = addCourse1DayAndTime;
    }

    public int getAddCourse1Credits() {
        return addCourse1Credits;
    }

    public void setAddCourse1Credits(int addCourse1Credits) {
        this.addCourse1Credits = addCourse1Credits;
    }

    public String getAddCourse1InstructorName() {
        return addCourse1InstructorName;
    }

    public void setAddCourse1InstructorName(String addCourse1InstructorName) {
        this.addCourse1InstructorName = addCourse1InstructorName;
    }

    public boolean isAddCourse1InstructorPermission() {
        return addCourse1InstructorPermission;
    }

    public void setAddCourse1InstructorPermission(boolean addCourse1InstructorPermission) {
        this.addCourse1InstructorPermission = addCourse1InstructorPermission;
    }

    public String getAddCourse2Name() {
        return addCourse2Name;
    }

    public void setAddCourse2Name(String addCourse2Name) {
        this.addCourse2Name = addCourse2Name;
    }

    public int getAddCourse2Section() {
        return addCourse2Section;
    }

    public void setAddCourse2Section(int addCourse2Section) {
        this.addCourse2Section = addCourse2Section;
    }

    public LocalDateTime getAddCourse2DayAndTime() {
        return addCourse2DayAndTime;
    }

    public void setAddCourse2DayAndTime(LocalDateTime addCourse2DayAndTime) {
        this.addCourse2DayAndTime = addCourse2DayAndTime;
    }

    public int getAddCourse2Credits() {
        return addCourse2Credits;
    }

    public void setAddCourse2Credits(int addCourse2Credits) {
        this.addCourse2Credits = addCourse2Credits;
    }

    public String getAddCourse2InstructorName() {
        return addCourse2InstructorName;
    }

    public void setAddCourse2InstructorName(String addCourse2InstructorName) {
        this.addCourse2InstructorName = addCourse2InstructorName;
    }

    public boolean isAddCourse2InstructorPermission() {
        return addCourse2InstructorPermission;
    }

    public void setAddCourse2InstructorPermission(boolean addCourse2InstructorPermission) {
        this.addCourse2InstructorPermission = addCourse2InstructorPermission;
    }

    public String getAddCourse2Code() {
        return addCourse2Code;
    }

    public void setAddCourse2Code(String addCourse2Code) {
        this.addCourse2Code = addCourse2Code;
    }

    public String getAddCourse3Name() {
        return addCourse3Name;
    }

    public void setAddCourse3Name(String addCourse3Name) {
        this.addCourse3Name = addCourse3Name;
    }

    public int getAddCourse3Section() {
        return addCourse3Section;
    }

    public void setAddCourse3Section(int addCourse3Section) {
        this.addCourse3Section = addCourse3Section;
    }

    public LocalDateTime getAddCourse3DayAndTime() {
        return addCourse3DayAndTime;
    }

    public void setAddCourse3DayAndTime(LocalDateTime addCourse3DayAndTime) {
        this.addCourse3DayAndTime = addCourse3DayAndTime;
    }

    public int getAddCourse3Credits() {
        return addCourse3Credits;
    }

    public void setAddCourse3Credits(int addCourse3Credits) {
        this.addCourse3Credits = addCourse3Credits;
    }

    public String getAddCourse3InstructorName() {
        return addCourse3InstructorName;
    }

    public void setAddCourse3InstructorName(String addCourse3InstructorName) {
        this.addCourse3InstructorName = addCourse3InstructorName;
    }

    public boolean isAddCourse3InstructorPermission() {
        return addCourse3InstructorPermission;
    }

    public void setAddCourse3InstructorPermission(boolean addCourse3InstructorPermission) {
        this.addCourse3InstructorPermission = addCourse3InstructorPermission;
    }

    public String getAddCourse4Name() {
        return addCourse4Name;
    }

    public void setAddCourse4Name(String addCourse4Name) {
        this.addCourse4Name = addCourse4Name;
    }

    public int getAddCourse4Section() {
        return addCourse4Section;
    }

    public void setAddCourse4Section(int addCourse4Section) {
        this.addCourse4Section = addCourse4Section;
    }

    public LocalDateTime getAddCourse4DayAndTime() {
        return addCourse4DayAndTime;
    }

    public void setAddCourse4DayAndTime(LocalDateTime addCourse4DayAndTime) {
        this.addCourse4DayAndTime = addCourse4DayAndTime;
    }

    public int getAddCourse4Credits() {
        return addCourse4Credits;
    }

    public void setAddCourse4Credits(int addCourse4Credits) {
        this.addCourse4Credits = addCourse4Credits;
    }

    public String getAddCourse4InstructorName() {
        return addCourse4InstructorName;
    }

    public void setAddCourse4InstructorName(String addCourse4InstructorName) {
        this.addCourse4InstructorName = addCourse4InstructorName;
    }

    public boolean isAddCourse4InstructorPermission() {
        return addCourse4InstructorPermission;
    }

    public void setAddCourse4InstructorPermission(boolean addCourse4InstructorPermission) {
        this.addCourse4InstructorPermission = addCourse4InstructorPermission;
    }

    public String getAddCourse5Name() {
        return addCourse5Name;
    }

    public void setAddCourse5Name(String addCourse5Name) {
        this.addCourse5Name = addCourse5Name;
    }

    public int getAddCourse5Section() {
        return addCourse5Section;
    }

    public void setAddCourse5Section(int addCourse5Section) {
        this.addCourse5Section = addCourse5Section;
    }

    public LocalDateTime getAddCourse5DayAndTime() {
        return addCourse5DayAndTime;
    }

    public void setAddCourse5DayAndTime(LocalDateTime addCourse5DayAndTime) {
        this.addCourse5DayAndTime = addCourse5DayAndTime;
    }

    public int getAddCourse5Credits() {
        return addCourse5Credits;
    }

    public void setAddCourse5Credits(int addCourse5Credits) {
        this.addCourse5Credits = addCourse5Credits;
    }

    public String getAddCourse5InstructorName() {
        return addCourse5InstructorName;
    }

    public void setAddCourse5InstructorName(String addCourse5InstructorName) {
        this.addCourse5InstructorName = addCourse5InstructorName;
    }

    public boolean isAddCourse5InstructorPermission() {
        return addCourse5InstructorPermission;
    }

    public void setAddCourse5InstructorPermission(boolean addCourse5InstructorPermission) {
        this.addCourse5InstructorPermission = addCourse5InstructorPermission;
    }

    public String getAddCourse6Name() {
        return addCourse6Name;
    }

    public void setAddCourse6Name(String addCourse6Name) {
        this.addCourse6Name = addCourse6Name;
    }

    public int getAddCourse6Section() {
        return addCourse6Section;
    }

    public void setAddCourse6Section(int addCourse6Section) {
        this.addCourse6Section = addCourse6Section;
    }

    public LocalDateTime getAddCourse6DayAndTime() {
        return addCourse6DayAndTime;
    }

    public void setAddCourse6DayAndTime(LocalDateTime addCourse6DayAndTime) {
        this.addCourse6DayAndTime = addCourse6DayAndTime;
    }

    public int getAddCourse6Credits() {
        return addCourse6Credits;
    }

    public void setAddCourse6Credits(int addCourse6Credits) {
        this.addCourse6Credits = addCourse6Credits;
    }

    public String getAddCourse6InstructorName() {
        return addCourse6InstructorName;
    }

    public void setAddCourse6InstructorName(String addCourse6InstructorName) {
        this.addCourse6InstructorName = addCourse6InstructorName;
    }

    public boolean isAddCourse6InstructorPermission() {
        return addCourse6InstructorPermission;
    }

    public void setAddCourse6InstructorPermission(boolean addCourse6InstructorPermission) {
        this.addCourse6InstructorPermission = addCourse6InstructorPermission;
    }

    public String getAddCourse7Name() {
        return addCourse7Name;
    }

    public void setAddCourse7Name(String addCourse7Name) {
        this.addCourse7Name = addCourse7Name;
    }

    public int getAddCourse7Section() {
        return addCourse7Section;
    }

    public void setAddCourse7Section(int addCourse7Section) {
        this.addCourse7Section = addCourse7Section;
    }

    public LocalDateTime getAddCourse7DayAndTime() {
        return addCourse7DayAndTime;
    }

    public void setAddCourse7DayAndTime(LocalDateTime addCourse7DayAndTime) {
        this.addCourse7DayAndTime = addCourse7DayAndTime;
    }

    public int getAddCourse7Credits() {
        return addCourse7Credits;
    }

    public void setAddCourse7Credits(int addCourse7Credits) {
        this.addCourse7Credits = addCourse7Credits;
    }

    public String getAddCourse7InstructorName() {
        return addCourse7InstructorName;
    }

    public void setAddCourse7InstructorName(String addCourse7InstructorName) {
        this.addCourse7InstructorName = addCourse7InstructorName;
    }

    public boolean isAddCourse7InstructorPermission() {
        return addCourse7InstructorPermission;
    }

    public void setAddCourse7InstructorPermission(boolean addCourse7InstructorPermission) {
        this.addCourse7InstructorPermission = addCourse7InstructorPermission;
    }

    public String getAddCourse8Name() {
        return addCourse8Name;
    }

    public void setAddCourse8Name(String addCourse8Name) {
        this.addCourse8Name = addCourse8Name;
    }

    public int getAddCourse8Section() {
        return addCourse8Section;
    }

    public void setAddCourse8Section(int addCourse8Section) {
        this.addCourse8Section = addCourse8Section;
    }

    public LocalDateTime getAddCourse8DayAndTime() {
        return addCourse8DayAndTime;
    }

    public void setAddCourse8DayAndTime(LocalDateTime addCourse8DayAndTime) {
        this.addCourse8DayAndTime = addCourse8DayAndTime;
    }

    public int getAddCourse8Credits() {
        return addCourse8Credits;
    }

    public void setAddCourse8Credits(int addCourse8Credits) {
        this.addCourse8Credits = addCourse8Credits;
    }

    public String getAddCourse8InstructorName() {
        return addCourse8InstructorName;
    }

    public void setAddCourse8InstructorName(String addCourse8InstructorName) {
        this.addCourse8InstructorName = addCourse8InstructorName;
    }

    public boolean isAddCourse8InstructorPermission() {
        return addCourse8InstructorPermission;
    }

    public void setAddCourse8InstructorPermission(boolean addCourse8InstructorPermission) {
        this.addCourse8InstructorPermission = addCourse8InstructorPermission;
    }

    public String getAddCourse9Name() {
        return addCourse9Name;
    }

    public void setAddCourse9Name(String addCourse9Name) {
        this.addCourse9Name = addCourse9Name;
    }

    public int getAddCourse9Section() {
        return addCourse9Section;
    }

    public void setAddCourse9Section(int addCourse9Section) {
        this.addCourse9Section = addCourse9Section;
    }

    public LocalDateTime getAddCourse9DayAndTime() {
        return addCourse9DayAndTime;
    }

    public void setAddCourse9DayAndTime(LocalDateTime addCourse9DayAndTime) {
        this.addCourse9DayAndTime = addCourse9DayAndTime;
    }

    public int getAddCourse9Credits() {
        return addCourse9Credits;
    }

    public void setAddCourse9Credits(int addCourse9Credits) {
        this.addCourse9Credits = addCourse9Credits;
    }

    public String getAddCourse9InstructorName() {
        return addCourse9InstructorName;
    }

    public void setAddCourse9InstructorName(String addCourse9InstructorName) {
        this.addCourse9InstructorName = addCourse9InstructorName;
    }

    public boolean isAddCourse9InstructorPermission() {
        return addCourse9InstructorPermission;
    }

    public void setAddCourse9InstructorPermission(boolean addCourse9InstructorPermission) {
        this.addCourse9InstructorPermission = addCourse9InstructorPermission;
    }

    public String getAddCourse10Name() {
        return addCourse10Name;
    }

    public void setAddCourse10Name(String addCourse10Name) {
        this.addCourse10Name = addCourse10Name;
    }

    public int getAddCourse10Section() {
        return addCourse10Section;
    }

    public void setAddCourse10Section(int addCourse10Section) {
        this.addCourse10Section = addCourse10Section;
    }

    public LocalDateTime getAddCourse10DayAndTime() {
        return addCourse10DayAndTime;
    }

    public void setAddCourse10DayAndTime(LocalDateTime addCourse10DayAndTime) {
        this.addCourse10DayAndTime = addCourse10DayAndTime;
    }

    public int getAddCourse10Credits() {
        return addCourse10Credits;
    }

    public void setAddCourse10Credits(int addCourse10Credits) {
        this.addCourse10Credits = addCourse10Credits;
    }

    public String getAddCourse10InstructorName() {
        return addCourse10InstructorName;
    }

    public void setAddCourse10InstructorName(String addCourse10InstructorName) {
        this.addCourse10InstructorName = addCourse10InstructorName;
    }

    public boolean isAddCourse10InstructorPermission() {
        return addCourse10InstructorPermission;
    }

    public void setAddCourse10InstructorPermission(boolean addCourse10InstructorPermission) {
        this.addCourse10InstructorPermission = addCourse10InstructorPermission;
    }

    public String getAddCourse3Code() {
        return addCourse3Code;
    }

    public void setAddCourse3Code(String addCourse3Code) {
        this.addCourse3Code = addCourse3Code;
    }

    public String getAddCourse4Code() {
        return addCourse4Code;
    }

    public void setAddCourse4Code(String addCourse4Code) {
        this.addCourse4Code = addCourse4Code;
    }

    public String getAddCourse5Code() {
        return addCourse5Code;
    }

    public void setAddCourse5Code(String addCourse5Code) {
        this.addCourse5Code = addCourse5Code;
    }

    public String getAddCourse6Code() {
        return addCourse6Code;
    }

    public void setAddCourse6Code(String addCourse6Code) {
        this.addCourse6Code = addCourse6Code;
    }

    public String getAddCourse7Code() {
        return addCourse7Code;
    }

    public void setAddCourse7Code(String addCourse7Code) {
        this.addCourse7Code = addCourse7Code;
    }

    public String getAddCourse8Code() {
        return addCourse8Code;
    }

    public void setAddCourse8Code(String addCourse8Code) {
        this.addCourse8Code = addCourse8Code;
    }

    public String getAddCourse9Code() {
        return addCourse9Code;
    }

    public void setAddCourse9Code(String addCourse9Code) {
        this.addCourse9Code = addCourse9Code;
    }

    public String getAddCourse10Code() {
        return addCourse10Code;
    }

    public void setAddCourse10Code(String addCourse10Code) {
        this.addCourse10Code = addCourse10Code;
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
