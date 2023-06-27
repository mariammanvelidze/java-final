package com.exam.mariammanvelidze.controllers;

import com.exam.mariammanvelidze.dtos.RoomDto;
import com.exam.mariammanvelidze.services.IRoomService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rooms")
public class RoomController {
    private final IRoomService roomService;

    public RoomController(IRoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping("add-room/{id}")
    public RoomDto addRoom(@PathVariable("id") int id, @RequestBody RoomDto room){
        return roomService.addRoom(id, room);
    }
}
