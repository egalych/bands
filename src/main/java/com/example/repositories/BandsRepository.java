package com.example.repositories;

import com.example.model.Band;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BandsRepository extends JpaRepository<Band, Long> {
}
