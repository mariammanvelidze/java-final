package com.exam.mariammanvelidze.dtos;

import com.exam.mariammanvelidze.entities.Rooms;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RoomDto {
    private int id;
    private int roomNumber;
    private boolean isReserved;
    private double price;

    public static RoomDto mapFromRoom(Rooms room){
        RoomDto roomDto = new RoomDto();
        roomDto.setId(room.getRoomId());
        roomDto.setReserved(room.isReserved());
        roomDto.setPrice(room.getPrice());
        return roomDto;
    }
}
