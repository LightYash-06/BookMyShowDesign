package com.bookmyshow.design.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmyshow.design.models.SeatType;
import com.bookmyshow.design.models.ShowSeat;
import com.bookmyshow.design.models.ShowSeatType;

import java.util.List;
import java.util.Optional;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {
    @Override
    List<ShowSeat> findAllById(Iterable<Long> showSeatIds);

}
