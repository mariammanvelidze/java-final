package com.exam.mariammanvelidze.services;

import com.exam.mariammanvelidze.dtos.HotelDto;
import com.exam.mariammanvelidze.dtos.RoomDto;

import java.util.List;

public interface IHotelService {
    HotelDto add(HotelDto hotel);
    List<HotelDto> getHotels();

}
