package com.exam.mariammanvelidze.dtos;

import com.exam.mariammanvelidze.entities.Hotels;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class HotelDto {
    private int id;
    private String name;

    public static HotelDto mapFromHotel(Hotels hotel){
        HotelDto hotelDto = new HotelDto();
        hotelDto.setId(hotel.getId());
        hotelDto.setName(hotel.getName());
        return hotelDto;
    }
}
