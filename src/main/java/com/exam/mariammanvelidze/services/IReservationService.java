package com.exam.mariammanvelidze.services;

import com.exam.mariammanvelidze.dtos.ReservationsDto;

import java.util.List;

public interface IReservationService {
    ReservationsDto addReservation(int id, ReservationsDto reservationsDto);

    List<ReservationsDto> getRoomReservations();
}
