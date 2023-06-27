package com.exam.mariammanvelidze.repositories;

import com.exam.mariammanvelidze.entities.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Rooms,Integer> {
    @Query("SELECT r FROM Rooms r WHERE r.isReserved = false")
    List<Rooms> getFreeRooms();

    @Query("SELECT r FROM Rooms r WHERE r.isReserved = true")
    List<Rooms> getBusyRooms();
}
