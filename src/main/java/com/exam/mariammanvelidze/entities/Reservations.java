package com.exam.mariammanvelidze.entities;

import com.exam.mariammanvelidze.dtos.ReservationsDto;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="reservations")
public class Reservations {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "reserved_from", nullable = false)
    private Date reservedFrom;

    @Column(name = "reserved_until", nullable = false)
    private Date reservedUntil;

    @Column(name = "reserved_by", nullable = false)
    private Long reservedBy; // User Id, Not Created as Entity

    @Column(name = "price", nullable = false)
    private double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id")
    private Rooms room;

    public static Reservations mapFromReservationDto(ReservationsDto reservationDto){
        Reservations reservation = new Reservations();
        reservation.setReservedFrom(reservationDto.getFrom());
        reservation.setReservedUntil(reservationDto.getUntil());
        reservation.setReservedBy(reservationDto.getReservedBy());
        reservation.setPrice(reservationDto.getPrice());

        return reservation;
    }
}
