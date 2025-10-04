package com.bookmyshow.design.dtos;

import com.bookmyshow.design.models.Booking;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookMovieResponseDTO {
    private Booking booking;
    private ResponseStatus responseStatus;
}
