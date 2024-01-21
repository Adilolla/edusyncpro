package com.edusync;

import com.edusync.bean.Address;
import com.edusync.bean.EduResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EduService {

    @Autowired
    EdusyncRepository edusyncRepository;

    public EduResponse getEduDetails(){
       List< SchoolDetails> details = edusyncRepository.findAll();//very dangerous , it might give all rows of database. may be millions
        EduResponse eduDetails = new EduResponse();
        for (SchoolDetails schoolDetails : details) {

            Address address = new Address();
            address.setAddress1(details.get(0).getAddress());
            address.setAddress2("");
            eduDetails.setAddress(address);
            eduDetails.setId(schoolDetails.getId());
            eduDetails.setContactPerson(schoolDetails.getContactPerson());
            eduDetails.setSchoolName(schoolDetails.getSchoolName());
            eduDetails.setType(schoolDetails.getType());
        }
       return eduDetails;


    }
}
