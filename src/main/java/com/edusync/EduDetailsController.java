package com.edusync;

import com.edusync.bean.EduResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EduDetailsController {

    @Autowired
    EduService eduService;

    @GetMapping("/getEduDetails")
    public ResponseEntity getEduDetails() {

        HttpEntity<EduResponse> entity = new HttpEntity<>(eduService.getEduDetails());
        return new ResponseEntity(entity.getBody(), HttpStatus.valueOf(200));
    }


}
