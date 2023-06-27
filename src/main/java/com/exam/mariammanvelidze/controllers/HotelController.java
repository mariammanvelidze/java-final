package com.exam.mariammanvelidze.controllers;

import com.exam.mariammanvelidze.dtos.HotelDto;
import com.exam.mariammanvelidze.services.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    private final IHotelService hotelService;

    @Autowired
    public HotelController(IHotelService hotelService){
        this.hotelService = hotelService;
    }

    @PostMapping("add-hotel")
    public HotelDto addHotel(@RequestBody HotelDto hotel){
        return hotelService.add(hotel);
    }

    @GetMapping()
    public List<HotelDto> getHotels(){
        return hotelService.getHotels();
    }


}
