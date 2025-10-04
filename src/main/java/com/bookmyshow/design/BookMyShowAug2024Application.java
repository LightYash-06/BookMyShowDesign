package com.bookmyshow.design;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.bookmyshow.design.controllers.UserController;
import com.bookmyshow.design.dtos.SignupRequestDTO;
import com.bookmyshow.design.dtos.SignupResponseDTO;

@SpringBootApplication
@EnableJpaAuditing
public class BookMyShowAug2024Application implements CommandLineRunner {

    @Autowired
    private UserController userController;
    public static void main(String[] args) {
        SpringApplication.run(BookMyShowAug2024Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SignupRequestDTO signupRequestDTO = new SignupRequestDTO();
        signupRequestDTO.setName("Anmol");
        signupRequestDTO.setEmail("anmol@scaler.com");
        signupRequestDTO.setPassWord("sdsfjdksxc@123");
        SignupResponseDTO signupResponseDTO = userController.signUp(signupRequestDTO);
    }
}
