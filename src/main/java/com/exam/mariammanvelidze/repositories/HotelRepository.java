package com.exam.mariammanvelidze.repositories;

import com.exam.mariammanvelidze.entities.Hotels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotels,Integer> {
}
