package th.ac.tu.cs.subjectRequestForm.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import th.ac.tu.cs.subjectRequestForm.model.User;

import java.util.List;

@Repository
public class JdbcUserRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(User user){
        /*String sql = "INSERT INTO UserInformation (date ,studentFirstName, studentLastName, studentId,studentYear) VALUES (?,?,?, ?, ?)";
        jdbcTemplate.update(sql,user.getDate(), user.getStudentFirstName(), user.getLastname(), user.getStudentId(),user.getStudentYear());*/
        String sql = "INSERT INTO addDropForms (Date, Prefix, FirstName, LastName, StudentID, StudentYear," +
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




              + ")" + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?," +
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

        jdbcTemplate.update(sql, user.getDate(),user.getPrefix(), user.getStudentFirstName(),user.getLastname(), user.getStudentId(),
                user.getStudentYear(), user.getStudentField(), user.getAdvisor(),
                user.getAdressNumber(), user.getMoo(), user.getTumbol(), user.getAmphur(),
                user.getProvince(), user.getPostalCode(), user.getMobilePhone(),
                user.getPhone(), user.getCause() ,
                user.getAddCourse1Code(),
                user.getAddCourse1Name(),
                user.getAddCourse1Section(),
                user.getAddCourse1DayAndTime(),
                user.getAddCourse1Credits(),
                user.getAddCourse1InstructorName(),
                user.isAddCourse1InstructorPermission(),

                user.getAddCourse2Code(),
                user.getAddCourse2Name(),
                user.getAddCourse2Section(),
                user.getAddCourse2DayAndTime(),
                user.getAddCourse2Credits(),
                user.getAddCourse2InstructorName(),
                user.isAddCourse2InstructorPermission(),

                user.getAddCourse3Code(),
                user.getAddCourse3Name(),
                user.getAddCourse3Section(),
                user.getAddCourse3DayAndTime(),
                user.getAddCourse3Credits(),
                user.getAddCourse3InstructorName(),
                user.isAddCourse3InstructorPermission(),

                user.getAddCourse4Code(),
                user.getAddCourse4Name(),
                user.getAddCourse4Section(),
                user.getAddCourse4DayAndTime(),
                user.getAddCourse4Credits(),
                user.getAddCourse4InstructorName(),
                user.isAddCourse4InstructorPermission(),

                user.getAddCourse5Code(),
                user.getAddCourse5Name(),
                user.getAddCourse5Section(),
                user.getAddCourse5DayAndTime(),
                user.getAddCourse5Credits(),
                user.getAddCourse5InstructorName(),
                user.isAddCourse5InstructorPermission(),

                user.getAddCourse6Code(),
                user.getAddCourse6Name(),
                user.getAddCourse6Section(),
                user.getAddCourse6DayAndTime(),
                user.getAddCourse6Credits(),
                user.getAddCourse6InstructorName(),
                user.isAddCourse6InstructorPermission(),

                user.getAddCourse7Code(),
                user.getAddCourse7Name(),
                user.getAddCourse7Section(),
                user.getAddCourse7DayAndTime(),
                user.getAddCourse7Credits(),
                user.getAddCourse7InstructorName(),
                user.isAddCourse7InstructorPermission(),

                user.getAddCourse8Code(),
                user.getAddCourse8Name(),
                user.getAddCourse8Section(),
                user.getAddCourse8DayAndTime(),
                user.getAddCourse8Credits(),
                user.getAddCourse8InstructorName(),
                user.isAddCourse8InstructorPermission(),

                user.getAddCourse9Code(),
                user.getAddCourse9Name(),
                user.getAddCourse9Section(),
                user.getAddCourse9DayAndTime(),
                user.getAddCourse9Credits(),
                user.getAddCourse9InstructorName(),
                user.isAddCourse9InstructorPermission(),

                user.getAddCourse10Code(),
                user.getAddCourse10Name(),
                user.getAddCourse10Section(),
                user.getAddCourse10DayAndTime(),
                user.getAddCourse10Credits(),
                user.getAddCourse10InstructorName(),
                user.isAddCourse10InstructorPermission(),

                user.getDropCourse1Code(),
                user.getDropCourse1Name(),
                user.getDropCourse1Section(),
                user.getDropCourse1DayAndTime(),
                user.getDropCourse1Credits(),
                user.getDropCourse1InstructorName(),
                user.isDropCourse1InstructorPermission(),

                user.getDropCourse2Code(),
                user.getDropCourse2Name(),
                user.getDropCourse2Section(),
                user.getDropCourse2DayAndTime(),
                user.getDropCourse2Credits(),
                user.getDropCourse2InstructorName(),
                user.isDropCourse2InstructorPermission(),

                user.getDropCourse3Code(),
                user.getDropCourse3Name(),
                user.getDropCourse3Section(),
                user.getDropCourse3DayAndTime(),
                user.getDropCourse3Credits(),
                user.getDropCourse3InstructorName(),
                user.isDropCourse3InstructorPermission(),

                user.getDropCourse4Code(),
                user.getDropCourse4Name(),
                user.getDropCourse4Section(),
                user.getDropCourse4DayAndTime(),
                user.getDropCourse4Credits(),
                user.getDropCourse4InstructorName(),
                user.isDropCourse4InstructorPermission(),

                user.getDropCourse5Code(),
                user.getDropCourse5Name(),
                user.getDropCourse5Section(),
                user.getDropCourse5DayAndTime(),
                user.getDropCourse5Credits(),
                user.getDropCourse5InstructorName(),
                user.isDropCourse5InstructorPermission(),

                user.getDropCourse6Code(),
                user.getDropCourse6Name(),
                user.getDropCourse6Section(),
                user.getDropCourse6DayAndTime(),
                user.getDropCourse6Credits(),
                user.getDropCourse6InstructorName(),
                user.isDropCourse6InstructorPermission(),

                user.getDropCourse7Code(),
                user.getDropCourse7Name(),
                user.getDropCourse7Section(),
                user.getDropCourse7DayAndTime(),
                user.getDropCourse7Credits(),
                user.getDropCourse7InstructorName(),
                user.isDropCourse7InstructorPermission(),

                user.getDropCourse8Code(),
                user.getDropCourse8Name(),
                user.getDropCourse8Section(),
                user.getDropCourse8DayAndTime(),
                user.getDropCourse8Credits(),
                user.getDropCourse8InstructorName(),
                user.isDropCourse8InstructorPermission(),

                user.getDropCourse9Code(),
                user.getDropCourse9Name(),
                user.getDropCourse9Section(),
                user.getDropCourse9DayAndTime(),
                user.getDropCourse9Credits(),
                user.getDropCourse9InstructorName(),
                user.isDropCourse9InstructorPermission(),

                user.getDropCourse10Code(),
                user.getDropCourse10Name(),
                user.getDropCourse10Section(),
                user.getDropCourse10DayAndTime(),
                user.getDropCourse10Credits(),
                user.getDropCourse10InstructorName(),
                user.isDropCourse10InstructorPermission()

        );
    }
    public List<User> getAllUsers() {
        String sql = "SELECT * FROM UserInformation";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
    }

    public void saveAddCourses(User user) {
        String sql = "INSERT INTO UserInformation (AddCourse1Code, AddCourse1Name,AddCourse1Section,AddCourse1DayAndTime, AddCourse1Credits, AddCourse1InstructorName, AddCourse1InstructorPermission) VALUES (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                user.getAddCourse1Code(),
                user.getAddCourse1Name(),
                user.getAddCourse1Section(),
                user.getAddCourse1DayAndTime(),
                user.getAddCourse1Credits(),
                user.getAddCourse1InstructorName(),
                user.isAddCourse1InstructorPermission()
        );

        // Repeat the above code for AddCourse2, AddCourse3, and so on
        // You may need a loop to do this dynamically
    }
}
