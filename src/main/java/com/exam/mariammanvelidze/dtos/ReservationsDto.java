package com.exam.mariammanvelidze.dtos;

import com.exam.mariammanvelidze.entities.Reservations;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class ReservationsDto {
    private Long id;
    private Date from;
    private Date until;
    private Long reservedBy;
    private double price;

    public static ReservationsDto mapFromRoomReservation(Reservations reservation){
        ReservationsDto reservationDto = new ReservationsDto();
        reservationDto.setId(reservation.getId());
        reservationDto.setFrom(reservation.getReservedFrom());
        reservationDto.setUntil(reservation.getReservedUntil());
        reservationDto.setReservedBy(reservation.getReservedBy());
        reservationDto.setPrice(reservation.getPrice());

        return reservationDto;
    }
}
