package com.bookmyshow.design.dtos;

import com.bookmyshow.design.models.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupResponseDTO {
    private User user;
    private ResponseStatus responseStatus;
}
