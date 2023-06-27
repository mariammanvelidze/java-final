package com.exam.mariammanvelidze.entities;

import com.exam.mariammanvelidze.dtos.RoomDto;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="rooms")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Rooms {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roomId;

    @Column(name="room_number")
    private int roomNumber;

    @Column(name="is_reserved")
    private boolean isReserved;

    @Column(name="price")
    private double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="hotel_id")
    private Hotels hotel;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reservations> reservations = new ArrayList<>();

    public static Rooms mapFromRoomDto(RoomDto roomDto){
        Rooms room = new Rooms();
        room.roomNumber = roomDto.getRoomNumber();
        room.isReserved = roomDto.isReserved();
        room.price = roomDto.getPrice();
        return room;
    }
}
