package com.exam.mariammanvelidze.services;

import com.exam.mariammanvelidze.dtos.HotelDto;
import com.exam.mariammanvelidze.dtos.RoomDto;

public interface IRoomService {
    RoomDto addRoom(int id, RoomDto roomDto);
}
