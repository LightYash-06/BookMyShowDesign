package com.bookmyshow.design.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmyshow.design.models.SeatType;
import com.bookmyshow.design.models.Show;
import com.bookmyshow.design.models.ShowSeatType;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatType, Long> {
    List<ShowSeatType> findAllByShow(Show show);

    Optional<ShowSeatType> findBySeatType(SeatType seatType);

}
