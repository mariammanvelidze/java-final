package com.exam.mariammanvelidze.entities;

import com.exam.mariammanvelidze.dtos.HotelDto;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="hotels")
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Hotels {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column(name="name")
    private String name;

    public static Hotels mapFromHotelDto(HotelDto hotelDto){
        Hotels hotel = new Hotels();
        hotel.name = hotelDto.getName();

        return hotel;
    }
}
