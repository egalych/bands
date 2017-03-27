package com.example.repositories;

import com.example.model.Band;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BandsRepository extends JpaRepository<Band, Long> {
    List<Band> findByCity(String city);

    @Query("select band from Band band where band.year <> :year")
    List<Band> findBy(@Param("year") Integer year);
}
