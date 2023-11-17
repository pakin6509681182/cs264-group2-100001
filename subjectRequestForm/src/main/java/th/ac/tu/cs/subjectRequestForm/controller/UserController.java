package th.ac.tu.cs.subjectRequestForm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import th.ac.tu.cs.subjectRequestForm.model.*;
import th.ac.tu.cs.subjectRequestForm.repository.UserRepository;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping(value={"users"})
public class UserController {
    @Autowired
    private UserRepository userDao;

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

    @GetMapping("/getAddDropDataById")
    @ResponseBody
    public ResponseEntity<List<addDropData>> getAddDropDataById(@RequestParam String id) {
        try {
            List<addDropData> data = userDao.getAddDropDataById(id);
            return new ResponseEntity<>(data, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getDropWDataById")
    @ResponseBody
    public ResponseEntity<List<DropWData>> getDropWDataById(@RequestParam String id) {
        try {
            List<DropWData> data = userDao.getDropWDataById(id);
            return new ResponseEntity<>(data, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getDropOutDataById")
    @ResponseBody
    public ResponseEntity<List<dropOutData>> getDropOutDataById(@RequestParam String id) {
        try {
            List<dropOutData> data = userDao.getDropOutDataById(id);
            return new ResponseEntity<>(data, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getOtherDataById")
    @ResponseBody
    public ResponseEntity<List<otherData>> getOtherDataById(@RequestParam String id) {
        try {
            List<otherData> data = userDao.getOtherDataById(id);
            return new ResponseEntity<>(data, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getRegCrossDataById")
    @ResponseBody
    public ResponseEntity<List<regCrossData>> getRegCrossDataById(@RequestParam String id) {
        try {
            List<regCrossData> data = userDao.getRegCrossDataById(id);
            return new ResponseEntity<>(data, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    
}