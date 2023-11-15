package th.ac.tu.cs.subjectRequestForm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.tu.cs.subjectRequestForm.model.*;
import th.ac.tu.cs.subjectRequestForm.repository.JdbcUserRepository;

import java.util.List;

@RestController
@RequestMapping(value={"users"})
public class UserController {
    @Autowired
    private JdbcUserRepository userDao;

    @RequestMapping(value = "/addDrop", method = RequestMethod.POST)
    public void addUser(@RequestBody addDropData addDropData) {
        userDao.saveAddDrop(addDropData);
    }

    @RequestMapping(value = "/dropW", method = RequestMethod.POST)
    public void addUser(@RequestBody DropWData a) {
        userDao.saveDropW(a);
    }
    @RequestMapping(value = "/regCross", method = RequestMethod.POST)
    public void addUser(@RequestBody regCrossData a) {
        userDao.saveRegCross(a);
    }
    @RequestMapping(value = "/dropOut", method = RequestMethod.POST)
    public void addUser(@RequestBody dropOutData a) {
        userDao.saveDropout(a);
    }
    @RequestMapping(value = "/other", method = RequestMethod.POST)
    public void addUser(@RequestBody otherData a) {
        userDao.saveOther(a);
    }



    @GetMapping
    public List<addDropData> getAllUsers() {
        return userDao.getAllUsers();
    }

    @GetMapping("/{id}")
    public List<addDropData> getDataById(@PathVariable Long id) {
        return userDao.getDataById(id);
    }
}