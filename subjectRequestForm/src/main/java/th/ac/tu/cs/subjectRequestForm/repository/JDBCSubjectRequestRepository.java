package th.ac.tu.cs.subjectRequestForm.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import th.ac.tu.cs.subjectRequestForm.model.SubjectRequest;

import javax.validation.constraints.NotNull;

@Repository
public class JDBCSubjectRequestRepository implements SubjectRequestRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(SubjectRequest subjectRequest) {
        try {
            System.out.println(subjectRequest);
            jdbcTemplate.update("INSERT INTO RequestInfo VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                    subjectRequest.getDate(), subjectRequest.getStudentPrefix(), subjectRequest.getStudentFirstName(), subjectRequest.getStudentLastName(), subjectRequest.getStudentId(), subjectRequest.getStudentYear(), subjectRequest.getStudyField(), subjectRequest.getAddressNumber(), subjectRequest.getMoo(), subjectRequest.getTumbol(), subjectRequest.getAmphur(), subjectRequest.getProvince(), subjectRequest.getPostalCode(), subjectRequest.getMobilePhone(), subjectRequest.getPhone(), subjectRequest.getAdvisor());
            subjectRequest.getAddSubjectList().remove(0);
            subjectRequest.getRemoveSubjectList().remove(0);
            subjectRequest.getAddSubjectList().forEach(subject -> {
                jdbcTemplate.update("INSERT INTO AddSubject VALUES(?,?,?,?,?,?,?,?,?)", subjectRequest.getDate(), subjectRequest.getStudentId(), subject.getSubjectCode(), subject.getSubjectName(), subject.getSubjectSection(), subject.getSubjectDate(), subject.getSubjectCredit(), subject.getSubjectTeacher(), 0);
            });
            subjectRequest.getRemoveSubjectList().forEach(subject -> {
                jdbcTemplate.update("INSERT INTO RemoveSubject VALUES(?,?,?,?,?,?,?,?,?)", subjectRequest.getDate(), subjectRequest.getStudentId(), subject.getSubjectCode(), subject.getSubjectName(), subject.getSubjectSection(), subject.getSubjectDate(), subject.getSubjectCredit(), subject.getSubjectTeacher(), 0);
            });
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}