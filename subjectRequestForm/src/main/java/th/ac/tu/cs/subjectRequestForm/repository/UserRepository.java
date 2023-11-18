package th.ac.tu.cs.subjectRequestForm.repository;

import th.ac.tu.cs.subjectRequestForm.model.DropWData;
import th.ac.tu.cs.subjectRequestForm.model.addDropData;
import th.ac.tu.cs.subjectRequestForm.model.dropOutData;
import th.ac.tu.cs.subjectRequestForm.model.otherData;
import th.ac.tu.cs.subjectRequestForm.model.regCrossData;

import java.util.List;

public interface UserRepository {
    public void saveAddDrop(addDropData addDropData);
    public void saveDropW(DropWData dropWData);
    public List<addDropData> getAllUsers();
    public List<addDropData> getAddDropDataById(String userId);
    public List<DropWData> getDropWDataById(String userId);
    public void saveRegCross(regCrossData a);
    public void saveDropout(dropOutData a);
    public void saveOther(otherData a);
    public List<dropOutData> getDropOutDataById(String userId);
    public List<otherData> getOtherDataById(String userId);
    public List<regCrossData> getRegCrossDataById(String userId);
}
