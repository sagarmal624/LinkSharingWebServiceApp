package com.yakkaytech.linkSharing.services;

import com.yakkaytech.linkSharing.domain.User;
import com.yakkaytech.linkSharing.repository.hibernate.UserRepositoryImpl;
import com.yakkaytech.linkSharing.repository.jpa.UserRepository;
import com.yakkaytech.linkSharing.util.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepositoryImpl userRepositoryImpl;

//    @Autowired
//    UserRepository userrepository;

    public ResponseDTO save(User user){

        Object object=userRepositoryImpl.save(user);
        ResponseDTO responseDTO = new ResponseDTO("Something went wrong", false);
        if (object != null) {
            responseDTO.setMessage("user saved successfuly");
            responseDTO.setStatus(true);
        }
        return responseDTO;
    }

    public ResponseDTO get(Integer id) {
        Object person = userRepositoryImpl.get(id);
        ResponseDTO responseDTO = new ResponseDTO();
        if (person != null) {
            responseDTO.setStatus(true);
            responseDTO.setData(person);
        }
        return responseDTO;
    }

}
