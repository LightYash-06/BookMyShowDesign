package com.bookmyshow.design.controllers;

import org.springframework.stereotype.Controller;

import com.bookmyshow.design.dtos.ResponseStatus;
import com.bookmyshow.design.dtos.SignupRequestDTO;
import com.bookmyshow.design.dtos.SignupResponseDTO;
import com.bookmyshow.design.models.User;
import com.bookmyshow.design.services.UserService;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    public SignupResponseDTO signUp(SignupRequestDTO signupRequestDTO){
        SignupResponseDTO signupResponseDTO = new SignupResponseDTO();

        try{
            User user = userService.signup(signupRequestDTO.getName(),
                    signupRequestDTO.getEmail(),
                    signupRequestDTO.getPassWord());

            signupResponseDTO.setUser(user);
            signupResponseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        }catch (Exception ex){

            signupResponseDTO.setResponseStatus(ResponseStatus.FAILED);
        }

        return signupResponseDTO;
    }
}
