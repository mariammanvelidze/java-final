package com.exam.mariammanvelidze.services.impl;

import com.exam.mariammanvelidze.dtos.RoomDto;
import com.exam.mariammanvelidze.entities.Hotels;
import com.exam.mariammanvelidze.entities.Rooms;
import com.exam.mariammanvelidze.repositories.HotelRepository;
import com.exam.mariammanvelidze.repositories.RoomRepository;
import com.exam.mariammanvelidze.services.IRoomService;
import org.springframework.stereotype.Service;

@Service
public class RoomService implements IRoomService {
    private final RoomRepository roomRepository;
    private final HotelRepository hotelRepository;

    public RoomService(RoomRepository roomRepository, HotelRepository hotelRepository) {
        this.roomRepository = roomRepository;
        this.hotelRepository = hotelRepository;
    }

    @Override
    public RoomDto addRoom(int id, RoomDto roomDto) {
        Hotels hotel = hotelRepository.getReferenceById(id);
        Rooms room = Rooms.mapFromRoomDto(roomDto);
        room.setHotel(hotel);
        hotel.getRooms().add(room);
        hotelRepository.save(hotel);
        return roomDto;
    }
}
