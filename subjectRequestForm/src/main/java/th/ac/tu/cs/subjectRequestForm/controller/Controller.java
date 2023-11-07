package th.ac.tu.cs.subjectRequestForm.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import th.ac.tu.cs.subjectRequestForm.model.Subject;
import th.ac.tu.cs.subjectRequestForm.model.SubjectRequest;

@RestController
public class Controller {

    @PostMapping("/store")
    public ResponseEntity<SubjectRequest> storeJson(@RequestBody SubjectRequest subjectRequest) {
        // Your code to store the JSON data goes here
        return new ResponseEntity<>(subjectRequest, HttpStatus.OK);
    }
}
