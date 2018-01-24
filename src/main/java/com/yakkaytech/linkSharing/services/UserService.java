package com.yakkaytech.linkSharing.services;

import com.yakkaytech.linkSharing.domain.User;
import com.yakkaytech.linkSharing.repository.UserRepository;
import com.yakkaytech.linkSharing.util.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public ResponseDTO save(User user) {
        Object object = userRepository.save(user);
        ResponseDTO responseDTO = new ResponseDTO("Something went wrong", false);
        if (object != null) {
            responseDTO.setMessage("User saved successfuly");
            responseDTO.setStatus(true);
        }
        return responseDTO;
    }

}
