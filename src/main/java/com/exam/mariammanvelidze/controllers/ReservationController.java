package com.exam.mariammanvelidze.controllers;

import com.exam.mariammanvelidze.dtos.ReservationsDto;
import com.exam.mariammanvelidze.services.IReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/reservations")
public class ReservationController {
    private final IReservationService reservationService;

    public ReservationController(IReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping("add-reservation/{id}")
    public ReservationsDto addReservation(@PathVariable("id") int id, @RequestBody ReservationsDto reservation){
        return reservationService.addReservation(id, reservation);
    }

    @GetMapping("get-reservations")
    public List<ReservationsDto> getRoomReservations(){
        return reservationService.getRoomReservations();
    }

}
