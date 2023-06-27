package com.exam.mariammanvelidze.services.impl;

import com.exam.mariammanvelidze.dtos.HotelDto;
import com.exam.mariammanvelidze.entities.Hotels;
import com.exam.mariammanvelidze.repositories.HotelRepository;
import com.exam.mariammanvelidze.services.IHotelService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService implements IHotelService {
    private final HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public HotelDto add(HotelDto hotel) {
        Hotels mappedHotel = Hotels.mapFromHotelDto(hotel);
        Hotels addedHotel =  hotelRepository.save(mappedHotel);
        return HotelDto.mapFromHotel(addedHotel);
    }

    public List<HotelDto> getHotels(){
        List<Hotels> hotels = hotelRepository.findAll();
        List<HotelDto> hotelDtos = new ArrayList<>();

        for(Hotels hotel : hotels){
            hotelDtos.add(HotelDto.mapFromHotel(hotel));
        }

        return hotelDtos;
    }
}
