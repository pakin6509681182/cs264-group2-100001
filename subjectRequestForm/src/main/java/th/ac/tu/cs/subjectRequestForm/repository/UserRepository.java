package th.ac.tu.cs.subjectRequestForm.repository;

import th.ac.tu.cs.subjectRequestForm.model.DropWData;
import th.ac.tu.cs.subjectRequestForm.model.addDropData;

import java.util.List;

public interface UserRepository {
    public void saveAddDrop(addDropData addDropData);
    public void saveDropW(DropWData dropWData);
    public List<addDropData> getAllUsers();
    public List<addDropData> getAddDropDataById(String userId);
    public List<DropWData> getDropWDataById(String userId);

}
