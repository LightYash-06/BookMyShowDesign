package com.bookmyshow.design.controllers;

import org.springframework.stereotype.Controller;

import com.bookmyshow.design.dtos.BookMovieResponseDTO;
import com.bookmyshow.design.dtos.BookingMovieRequestDTO;
import com.bookmyshow.design.dtos.ResponseStatus;
import com.bookmyshow.design.models.Booking;
import com.bookmyshow.design.services.BookingService;

@Controller
public class BookingController {

    private BookingService bookingService;
    public BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    public BookMovieResponseDTO bookMovie(BookingMovieRequestDTO bookingMovieRequestDTO){
        BookMovieResponseDTO bookMovieResponseDTO = new BookMovieResponseDTO();

        try {
            Booking booking = bookingService.bookMovie(
                    bookingMovieRequestDTO.getUserId(),
                    bookingMovieRequestDTO.getShowId(),
                    bookingMovieRequestDTO.getShowSeatIds()
            );

            bookMovieResponseDTO.setBooking(booking);
            bookMovieResponseDTO.setResponseStatus(ResponseStatus.SUCCESS);
            return bookMovieResponseDTO;
        }catch (Exception ex){
            bookMovieResponseDTO.setResponseStatus(ResponseStatus.FAILED);
            return bookMovieResponseDTO;
        }
    }
}
