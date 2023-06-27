package com.exam.mariammanvelidze.services.impl;

import com.exam.mariammanvelidze.dtos.ReservationsDto;
import com.exam.mariammanvelidze.entities.Reservations;
import com.exam.mariammanvelidze.entities.Rooms;
import com.exam.mariammanvelidze.repositories.ReservationRepository;
import com.exam.mariammanvelidze.repositories.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final RoomRepository roomRepository;

    public ReservationService(ReservationRepository reservationRepository, RoomRepository roomRepository) {
        this.reservationRepository = reservationRepository;
        this.roomRepository = roomRepository;
    }

    public ReservationsDto addReservation(int roomId, ReservationsDto reservationsDto) {
        Rooms room = roomRepository.getReferenceById(roomId);
        Reservations reservation = Reservations.mapFromReservationDto(reservationsDto);
        reservation.setRoom(room);
        room.getReservations().add(reservation);
        roomRepository.save(room);
        return reservationsDto;
    }

    public List<ReservationsDto> getRoomReservations(){
        List<Reservations> reservations = reservationRepository.findAll();
        List<ReservationsDto> roomReservationDtos = new ArrayList<>();

        for(Reservations roomReservation : reservations){
            roomReservationDtos.add(ReservationsDto.mapFromRoomReservation(roomReservation));
        }

        return roomReservationDtos;
    }
}
