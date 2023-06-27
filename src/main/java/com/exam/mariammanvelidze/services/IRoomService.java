package com.exam.mariammanvelidze.services;

import com.exam.mariammanvelidze.dtos.HotelDto;
import com.exam.mariammanvelidze.dtos.RoomDto;

import java.util.List;

public interface IRoomService {
    RoomDto addRoom(int id, RoomDto roomDto);

    List<RoomDto> getFreeRooms();

    List<RoomDto> getBusyRooms();
}
