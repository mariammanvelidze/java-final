package com.exam.mariammanvelidze.repositories;

import com.exam.mariammanvelidze.entities.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservations,Integer> {
}
