package th.ac.tu.cs.subjectRequestForm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import th.ac.tu.cs.subjectRequestForm.model.SubjectRequest;
import th.ac.tu.cs.subjectRequestForm.repository.SubjectRequestRepository;

@RestController
@RequestMapping(value = "/api", method = RequestMethod.POST)
public class SubjectRequestController {
    @Autowired
    SubjectRequestRepository subjectRequestRepository;

    @PostMapping("/request")
    @ResponseBody
    public ResponseEntity<SubjectRequest> saveRequest(@RequestBody SubjectRequest subjectRequest) {
        try {
            subjectRequestRepository.save(subjectRequest);
            return new ResponseEntity<>(subjectRequest, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(subjectRequest);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);//return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
        }
    }
}