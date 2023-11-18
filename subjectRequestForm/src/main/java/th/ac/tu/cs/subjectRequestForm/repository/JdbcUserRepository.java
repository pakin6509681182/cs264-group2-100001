package th.ac.tu.cs.subjectRequestForm.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import th.ac.tu.cs.subjectRequestForm.model.*;

import java.util.List;

@Repository
public class JdbcUserRepository implements UserRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveAddDrop(addDropData addDropData){
        /*String sql = "INSERT INTO UserInformation (date ,studentFirstName, studentLastName, studentId,studentYear) VALUES (?,?,?, ?, ?)";
        jdbcTemplate.update(sql,user.getDate(), user.getStudentFirstName(), user.getLastname(), user.getStudentId(),user.getStudentYear());*/
        String sql = "INSERT INTO addDropForms (status,Date, Prefix, FirstName, LastName, StudentID, StudentYear," +
                "    StudentField, Advisor, AddressNumber, Moo, Tumbol, Amphur, Province, PostalCode," +
                "    MobilePhone, Phone, Cause," +
                    "AddCourse1Code, AddCourse1Name, AddCourse1Section,AddCourse1DayAndTime, AddCourse1Credits, AddCourse1InstructorName,AddCourse1InstructorPermission"+
                ",AddCourse2Code, AddCourse2Name, AddCourse2Section,AddCourse2DayAndTime, AddCourse2Credits, AddCourse2InstructorName,AddCourse2InstructorPermission" +
                ",AddCourse3Code, AddCourse3Name, AddCourse3Section,AddCourse3DayAndTime, AddCourse3Credits, AddCourse3InstructorName,AddCourse3InstructorPermission" +
                ",AddCourse4Code, AddCourse4Name, AddCourse4Section,AddCourse4DayAndTime, AddCourse4Credits, AddCourse4InstructorName,AddCourse4InstructorPermission," +
                "AddCourse5Code, AddCourse5Name, AddCourse5Section,AddCourse5DayAndTime, AddCourse5Credits, AddCourse5InstructorName,AddCourse5InstructorPermission," +
                "AddCourse6Code, AddCourse6Name, AddCourse6Section,AddCourse6DayAndTime, AddCourse6Credits, AddCourse6InstructorName,AddCourse6InstructorPermission," +
                "AddCourse7Code, AddCourse7Name, AddCourse7Section,AddCourse7DayAndTime, AddCourse7Credits, AddCourse7InstructorName,AddCourse7InstructorPermission," +
                "AddCourse8Code, AddCourse8Name, AddCourse8Section,AddCourse8DayAndTime, AddCourse8Credits, AddCourse8InstructorName,AddCourse8InstructorPermission," +
                "AddCourse9Code, AddCourse9Name, AddCourse9Section,AddCourse9DayAndTime, AddCourse9Credits, AddCourse9InstructorName,AddCourse9InstructorPermission," +
                "AddCourse10Code, AddCourse10Name, AddCourse10Section,AddCourse10DayAndTime, AddCourse10Credits, AddCourse10InstructorName,AddCourse10InstructorPermission," +
                "DropCourse1Code, DropCourse1Name, DropCourse1Section,DropCourse1DayAndTime, DropCourse1Credits, DropCourse1InstructorName,DropCourse1InstructorPermission" +
                ",DropCourse2Code, DropCourse2Name, DropCourse2Section,DropCourse2DayAndTime, DropCourse2Credits, DropCourse2InstructorName,DropCourse2InstructorPermission," +
                "DropCourse3Code, DropCourse3Name, DropCourse3Section,DropCourse3DayAndTime, DropCourse3Credits, DropCourse3InstructorName,DropCourse3InstructorPermission," +
                "DropCourse4Code, DropCourse4Name, DropCourse4Section,DropCourse4DayAndTime, DropCourse4Credits, DropCourse4InstructorName,DropCourse4InstructorPermission," +
                "DropCourse5Code, DropCourse5Name, DropCourse5Section,DropCourse5DayAndTime, DropCourse5Credits, DropCourse5InstructorName,DropCourse5InstructorPermission," +
                "DropCourse6Code, DropCourse6Name, DropCourse6Section,DropCourse6DayAndTime, DropCourse6Credits, DropCourse6InstructorName,DropCourse6InstructorPermission," +
                "DropCourse7Code, DropCourse7Name, DropCourse7Section,DropCourse7DayAndTime, DropCourse7Credits, DropCourse7InstructorName,DropCourse7InstructorPermission," +
                "DropCourse8Code, DropCourse8Name, DropCourse8Section,DropCourse8DayAndTime, DropCourse8Credits, DropCourse8InstructorName,DropCourse8InstructorPermission," +
                "DropCourse9Code, DropCourse9Name, DropCourse9Section,DropCourse9DayAndTime, DropCourse9Credits, DropCourse9InstructorName,DropCourse9InstructorPermission," +
                "DropCourse10Code, DropCourse10Name, DropCourse10Section,DropCourse10DayAndTime, DropCourse10Credits, DropCourse10InstructorName,DropCourse10InstructorPermission"




              + ")" + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?)";

        jdbcTemplate.update(sql, addDropData.getStatus(),addDropData.getDate(), addDropData.getPrefix(), addDropData.getStudentFirstName(), addDropData.getLastname(), addDropData.getStudentId(), 
                addDropData.getStudentYear(), addDropData.getStudentField(), addDropData.getAdvisor(),
                addDropData.getAddressNumber(), addDropData.getMoo(), addDropData.getTumbol(), addDropData.getAmphur(),
                addDropData.getProvince(), addDropData.getPostalCode(), addDropData.getMobilePhone(),
                addDropData.getPhone(), addDropData.getCause() ,
                addDropData.getAddCourse1Code(),
                addDropData.getAddCourse1Name(),
                addDropData.getAddCourse1Section(),
                addDropData.getAddCourse1DayAndTime(),
                addDropData.getAddCourse1Credits(),
                addDropData.getAddCourse1InstructorName(),
                addDropData.isAddCourse1InstructorPermission(),

                addDropData.getAddCourse2Code(),
                addDropData.getAddCourse2Name(),
                addDropData.getAddCourse2Section(),
                addDropData.getAddCourse2DayAndTime(),
                addDropData.getAddCourse2Credits(),
                addDropData.getAddCourse2InstructorName(),
                addDropData.isAddCourse2InstructorPermission(),

                addDropData.getAddCourse3Code(),
                addDropData.getAddCourse3Name(),
                addDropData.getAddCourse3Section(),
                addDropData.getAddCourse3DayAndTime(),
                addDropData.getAddCourse3Credits(),
                addDropData.getAddCourse3InstructorName(),
                addDropData.isAddCourse3InstructorPermission(),

                addDropData.getAddCourse4Code(),
                addDropData.getAddCourse4Name(),
                addDropData.getAddCourse4Section(),
                addDropData.getAddCourse4DayAndTime(),
                addDropData.getAddCourse4Credits(),
                addDropData.getAddCourse4InstructorName(),
                addDropData.isAddCourse4InstructorPermission(),

                addDropData.getAddCourse5Code(),
                addDropData.getAddCourse5Name(),
                addDropData.getAddCourse5Section(),
                addDropData.getAddCourse5DayAndTime(),
                addDropData.getAddCourse5Credits(),
                addDropData.getAddCourse5InstructorName(),
                addDropData.isAddCourse5InstructorPermission(),

                addDropData.getAddCourse6Code(),
                addDropData.getAddCourse6Name(),
                addDropData.getAddCourse6Section(),
                addDropData.getAddCourse6DayAndTime(),
                addDropData.getAddCourse6Credits(),
                addDropData.getAddCourse6InstructorName(),
                addDropData.isAddCourse6InstructorPermission(),

                addDropData.getAddCourse7Code(),
                addDropData.getAddCourse7Name(),
                addDropData.getAddCourse7Section(),
                addDropData.getAddCourse7DayAndTime(),
                addDropData.getAddCourse7Credits(),
                addDropData.getAddCourse7InstructorName(),
                addDropData.isAddCourse7InstructorPermission(),

                addDropData.getAddCourse8Code(),
                addDropData.getAddCourse8Name(),
                addDropData.getAddCourse8Section(),
                addDropData.getAddCourse8DayAndTime(),
                addDropData.getAddCourse8Credits(),
                addDropData.getAddCourse8InstructorName(),
                addDropData.isAddCourse8InstructorPermission(),

                addDropData.getAddCourse9Code(),
                addDropData.getAddCourse9Name(),
                addDropData.getAddCourse9Section(),
                addDropData.getAddCourse9DayAndTime(),
                addDropData.getAddCourse9Credits(),
                addDropData.getAddCourse9InstructorName(),
                addDropData.isAddCourse9InstructorPermission(),

                addDropData.getAddCourse10Code(),
                addDropData.getAddCourse10Name(),
                addDropData.getAddCourse10Section(),
                addDropData.getAddCourse10DayAndTime(),
                addDropData.getAddCourse10Credits(),
                addDropData.getAddCourse10InstructorName(),
                addDropData.isAddCourse10InstructorPermission(),

                addDropData.getDropCourse1Code(),
                addDropData.getDropCourse1Name(),
                addDropData.getDropCourse1Section(),
                addDropData.getDropCourse1DayAndTime(),
                addDropData.getDropCourse1Credits(),
                addDropData.getDropCourse1InstructorName(),
                addDropData.isDropCourse1InstructorPermission(),

                addDropData.getDropCourse2Code(),
                addDropData.getDropCourse2Name(),
                addDropData.getDropCourse2Section(),
                addDropData.getDropCourse2DayAndTime(),
                addDropData.getDropCourse2Credits(),
                addDropData.getDropCourse2InstructorName(),
                addDropData.isDropCourse2InstructorPermission(),

                addDropData.getDropCourse3Code(),
                addDropData.getDropCourse3Name(),
                addDropData.getDropCourse3Section(),
                addDropData.getDropCourse3DayAndTime(),
                addDropData.getDropCourse3Credits(),
                addDropData.getDropCourse3InstructorName(),
                addDropData.isDropCourse3InstructorPermission(),

                addDropData.getDropCourse4Code(),
                addDropData.getDropCourse4Name(),
                addDropData.getDropCourse4Section(),
                addDropData.getDropCourse4DayAndTime(),
                addDropData.getDropCourse4Credits(),
                addDropData.getDropCourse4InstructorName(),
                addDropData.isDropCourse4InstructorPermission(),

                addDropData.getDropCourse5Code(),
                addDropData.getDropCourse5Name(),
                addDropData.getDropCourse5Section(),
                addDropData.getDropCourse5DayAndTime(),
                addDropData.getDropCourse5Credits(),
                addDropData.getDropCourse5InstructorName(),
                addDropData.isDropCourse5InstructorPermission(),

                addDropData.getDropCourse6Code(),
                addDropData.getDropCourse6Name(),
                addDropData.getDropCourse6Section(),
                addDropData.getDropCourse6DayAndTime(),
                addDropData.getDropCourse6Credits(),
                addDropData.getDropCourse6InstructorName(),
                addDropData.isDropCourse6InstructorPermission(),

                addDropData.getDropCourse7Code(),
                addDropData.getDropCourse7Name(),
                addDropData.getDropCourse7Section(),
                addDropData.getDropCourse7DayAndTime(),
                addDropData.getDropCourse7Credits(),
                addDropData.getDropCourse7InstructorName(),
                addDropData.isDropCourse7InstructorPermission(),

                addDropData.getDropCourse8Code(),
                addDropData.getDropCourse8Name(),
                addDropData.getDropCourse8Section(),
                addDropData.getDropCourse8DayAndTime(),
                addDropData.getDropCourse8Credits(),
                addDropData.getDropCourse8InstructorName(),
                addDropData.isDropCourse8InstructorPermission(),

                addDropData.getDropCourse9Code(),
                addDropData.getDropCourse9Name(),
                addDropData.getDropCourse9Section(),
                addDropData.getDropCourse9DayAndTime(),
                addDropData.getDropCourse9Credits(),
                addDropData.getDropCourse9InstructorName(),
                addDropData.isDropCourse9InstructorPermission(),

                addDropData.getDropCourse10Code(),
                addDropData.getDropCourse10Name(),
                addDropData.getDropCourse10Section(),
                addDropData.getDropCourse10DayAndTime(),
                addDropData.getDropCourse10Credits(),
                addDropData.getDropCourse10InstructorName(),
                addDropData.isDropCourse10InstructorPermission()

        );
    }
    public void saveDropW(DropWData dropWData){
        /*String sql = "INSERT INTO UserInformation (date ,studentFirstName, studentLastName, studentId,studentYear) VALUES (?,?,?, ?, ?)";
        jdbcTemplate.update(sql,user.getDate(), user.getStudentFirstName(), user.getLastname(), user.getStudentId(),user.getStudentYear());*/
        String sql = "INSERT INTO DropWForms (status,Date, Prefix, FirstName, LastName, StudentID, StudentYear," +
                "    StudentField, Advisor, AddressNumber, Moo, Tumbol, Amphur, Province, PostalCode," +
                "    MobilePhone, Phone, Cause,gpax, " +
                "DropCourse1Code, DropCourse1Name, DropCourse1Section,DropCourse1DayAndTime, DropCourse1Credits, DropCourse1InstructorName,DropCourse1InstructorPermission" +
                ",DropCourse2Code, DropCourse2Name, DropCourse2Section,DropCourse2DayAndTime, DropCourse2Credits, DropCourse2InstructorName,DropCourse2InstructorPermission," +
                "DropCourse3Code, DropCourse3Name, DropCourse3Section,DropCourse3DayAndTime, DropCourse3Credits, DropCourse3InstructorName,DropCourse3InstructorPermission," +
                "DropCourse4Code, DropCourse4Name, DropCourse4Section,DropCourse4DayAndTime, DropCourse4Credits, DropCourse4InstructorName,DropCourse4InstructorPermission," +
                "DropCourse5Code, DropCourse5Name, DropCourse5Section,DropCourse5DayAndTime, DropCourse5Credits, DropCourse5InstructorName,DropCourse5InstructorPermission," +
                "DropCourse6Code, DropCourse6Name, DropCourse6Section,DropCourse6DayAndTime, DropCourse6Credits, DropCourse6InstructorName,DropCourse6InstructorPermission," +
                "DropCourse7Code, DropCourse7Name, DropCourse7Section,DropCourse7DayAndTime, DropCourse7Credits, DropCourse7InstructorName,DropCourse7InstructorPermission," +
                "DropCourse8Code, DropCourse8Name, DropCourse8Section,DropCourse8DayAndTime, DropCourse8Credits, DropCourse8InstructorName,DropCourse8InstructorPermission," +
                "DropCourse9Code, DropCourse9Name, DropCourse9Section,DropCourse9DayAndTime, DropCourse9Credits, DropCourse9InstructorName,DropCourse9InstructorPermission," +
                "DropCourse10Code, DropCourse10Name, DropCourse10Section,DropCourse10DayAndTime, DropCourse10Credits, DropCourse10InstructorName,DropCourse10InstructorPermission"




                + ")" + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?)";


        jdbcTemplate.update(sql, dropWData.getStatus(),dropWData.getDate(), dropWData.getPrefix(), dropWData.getFirstName(), dropWData.getLastname(), dropWData.getStudentId(),
                dropWData.getStudentYear(), dropWData.getStudentField(), dropWData.getAdvisor(),
                dropWData.getAddressNumber(), dropWData.getMoo(), dropWData.getTumbol(), dropWData.getAmphur(),
                dropWData.getProvince(), dropWData.getPostalCode(), dropWData.getMobilePhone(),
                dropWData.getPhone(), dropWData.getCause() , dropWData.getGpax(),

                dropWData.getDropCourse1Code(),
                dropWData.getDropCourse1Name(),
                dropWData.getDropCourse1Section(),
                dropWData.getDropCourse1DayAndTime(),
                dropWData.getDropCourse1Credits(),
                dropWData.getDropCourse1InstructorName(),
                dropWData.isDropCourse1InstructorPermission(),

                dropWData.getDropCourse2Code(),
                dropWData.getDropCourse2Name(),
                dropWData.getDropCourse2Section(),
                dropWData.getDropCourse2DayAndTime(),
                dropWData.getDropCourse2Credits(),
                dropWData.getDropCourse2InstructorName(),
                dropWData.isDropCourse2InstructorPermission(),

                dropWData.getDropCourse3Code(),
                dropWData.getDropCourse3Name(),
                dropWData.getDropCourse3Section(),
                dropWData.getDropCourse3DayAndTime(),
                dropWData.getDropCourse3Credits(),
                dropWData.getDropCourse3InstructorName(),
                dropWData.isDropCourse3InstructorPermission(),

                dropWData.getDropCourse4Code(),
                dropWData.getDropCourse4Name(),
                dropWData.getDropCourse4Section(),
                dropWData.getDropCourse4DayAndTime(),
                dropWData.getDropCourse4Credits(),
                dropWData.getDropCourse4InstructorName(),
                dropWData.isDropCourse4InstructorPermission(),

                dropWData.getDropCourse5Code(),
                dropWData.getDropCourse5Name(),
                dropWData.getDropCourse5Section(),
                dropWData.getDropCourse5DayAndTime(),
                dropWData.getDropCourse5Credits(),
                dropWData.getDropCourse5InstructorName(),
                dropWData.isDropCourse5InstructorPermission(),

                dropWData.getDropCourse6Code(),
                dropWData.getDropCourse6Name(),
                dropWData.getDropCourse6Section(),
                dropWData.getDropCourse6DayAndTime(),
                dropWData.getDropCourse6Credits(),
                dropWData.getDropCourse6InstructorName(),
                dropWData.isDropCourse6InstructorPermission(),

                dropWData.getDropCourse7Code(),
                dropWData.getDropCourse7Name(),
                dropWData.getDropCourse7Section(),
                dropWData.getDropCourse7DayAndTime(),
                dropWData.getDropCourse7Credits(),
                dropWData.getDropCourse7InstructorName(),
                dropWData.isDropCourse7InstructorPermission(),

                dropWData.getDropCourse8Code(),
                dropWData.getDropCourse8Name(),
                dropWData.getDropCourse8Section(),
                dropWData.getDropCourse8DayAndTime(),
                dropWData.getDropCourse8Credits(),
                dropWData.getDropCourse8InstructorName(),
                dropWData.isDropCourse8InstructorPermission(),

                dropWData.getDropCourse9Code(),
                dropWData.getDropCourse9Name(),
                dropWData.getDropCourse9Section(),
                dropWData.getDropCourse9DayAndTime(),
                dropWData.getDropCourse9Credits(),
                dropWData.getDropCourse9InstructorName(),
                dropWData.isDropCourse9InstructorPermission(),

                dropWData.getDropCourse10Code(),
                dropWData.getDropCourse10Name(),
                dropWData.getDropCourse10Section(),
                dropWData.getDropCourse10DayAndTime(),
                dropWData.getDropCourse10Credits(),
                dropWData.getDropCourse10InstructorName(),
                dropWData.isDropCourse10InstructorPermission()

        );
    }
    public void saveRegCross(regCrossData regCrossData){

        /*String sql = "INSERT INTO UserInformation (date ,studentFirstName, studentLastName, studentId,studentYear) VALUES (?,?,?, ?, ?)";
        jdbcTemplate.update(sql,user.getDate(), user.getStudentFirstName(), user.getLastname(), user.getStudentId(),user.getStudentYear());*/
        String sql = "INSERT INTO regCrossForms (status,Date, Prefix, FirstName, LastName, StudentID, StudentYear," +
                "    StudentField, Advisor, AddressNumber, Moo, Tumbol, Amphur, Province, PostalCode," +
                "    MobilePhone, Phone,reg,code,section,semester,year,teacher,reason  "





                + ")" + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)" ;


        jdbcTemplate.update(sql, regCrossData.getStatus(),regCrossData.getDate(), regCrossData.getPrefix(), regCrossData.getFirstName(), regCrossData.getLastname(), regCrossData.getStudentId(),
                regCrossData.getStudentYear(), regCrossData.getStudentField(), regCrossData.getAdvisor(),
                regCrossData.getAddressNumber(), regCrossData.getMoo(), regCrossData.getTumbol(), regCrossData.getAmphur(),
                regCrossData.getProvince(), regCrossData.getPostalCode(), regCrossData.getMobilePhone(),
                regCrossData.getPhone(), regCrossData.getReg(),regCrossData.getCode(),regCrossData.getSection(),regCrossData.getSemester(),regCrossData.getYear(),regCrossData.getTeacher(),regCrossData.getReason()

        );
    }
    public void saveDropout(dropOutData dropOutData){
        String sql = "INSERT INTO dropOutForms (status,Date, Prefix, firstName, LastName, StudentID, StudentYear," +
                "    StudentField, Advisor, AddressNumber, Moo, Tumbol, Amphur, Province, PostalCode," +
                "    MobilePhone, Phone,type,reason  "
                + ")" + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)" ;


        jdbcTemplate.update(sql, dropOutData.getStatus(),dropOutData.getDate(), dropOutData.getPrefix(), dropOutData.getFirstName(), dropOutData.getLastname(), dropOutData.getStudentId(),
                dropOutData.getStudentYear(), dropOutData.getStudentField(), dropOutData.getAdvisor(),
                dropOutData.getAddressNumber(), dropOutData.getMoo(), dropOutData.getTumbol(), dropOutData.getAmphur(),
                dropOutData.getProvince(), dropOutData.getPostalCode(), dropOutData.getMobilePhone(),
                dropOutData.getPhone(),dropOutData.getType() ,dropOutData.getReason()

        );
    }
    public void saveOther(otherData dropOutData){
        /*String sql = "INSERT INTO UserInformation (date ,studentFirstName, studentLastName, studentId,studentYear) VALUES (?,?,?, ?, ?)";
        jdbcTemplate.update(sql,user.getDate(), user.getStudentFirstName(), user.getLastname(), user.getStudentId(),user.getStudentYear());*/
        String sql = "INSERT INTO otherForms (status,Date, Prefix, FirstName, LastName, StudentID, StudentYear," +
                "    StudentField, Advisor, AddressNumber, Moo, Tumbol, Amphur, Province, PostalCode," +
                "    MobilePhone, Phone,reason  "





                + ")" + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)" ;


        jdbcTemplate.update(sql, dropOutData.getStatus(),dropOutData.getDate(), dropOutData.getPrefix(), dropOutData.getFirstName(), dropOutData.getLastname(), dropOutData.getStudentId(),
                dropOutData.getStudentYear(), dropOutData.getStudentField(), dropOutData.getAdvisor(),
                dropOutData.getAddressNumber(), dropOutData.getMoo(), dropOutData.getTumbol(), dropOutData.getAmphur(),
                dropOutData.getProvince(), dropOutData.getPostalCode(), dropOutData.getMobilePhone(),
                dropOutData.getPhone(),dropOutData.getReason()

        );
    }

    public List<addDropData> getAllUsers() {
        String sql = "SELECT * FROM UserInformation";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(addDropData.class));
    }

    /*public void saveAddCourses(addDropData addDropData) {
        String sql = "INSERT INTO UserInformation (AddCourse1Code, AddCourse1Name,AddCourse1Section,AddCourse1DayAndTime, AddCourse1Credits, AddCourse1InstructorName, AddCourse1InstructorPermission) VALUES (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                addDropData.getAddCourse1Code(),
                addDropData.getAddCourse1Name(),
                addDropData.getAddCourse1Section(),
                addDropData.getAddCourse1DayAndTime(),
                addDropData.getAddCourse1Credits(),
                addDropData.getAddCourse1InstructorName(),
                addDropData.isAddCourse1InstructorPermission()
        );

        // Repeat the above code for AddCourse2, AddCourse3, and so on
        // You may need a loop to do this dynamically
    }*/

    public List<addDropData> getAddDropDataById(String userId) {
        String sql = "SELECT * FROM addDropForms WHERE studentID = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(addDropData.class), userId);
    }

    public List<DropWData> getDropWDataById(String userId) {
        String sql = "SELECT * FROM DropWForms WHERE studentID = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(DropWData.class), userId);
    }

    public List<dropOutData> getDropOutDataById(String userId) {
        String sql = "SELECT * FROM dropOutForms WHERE studentID = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(dropOutData.class), userId);
    }

    public List<otherData> getOtherDataById(String userId) {
        String sql = "SELECT * FROM otherForms WHERE studentID = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(otherData.class), userId);
    }
    
    public List<regCrossData> getRegCrossDataById(String userId) {
        String sql = "SELECT * FROM regCrossForms WHERE studentID = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(regCrossData.class), userId);
    }
}
