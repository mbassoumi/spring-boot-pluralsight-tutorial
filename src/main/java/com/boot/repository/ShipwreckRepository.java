package com.boot.repository;

import com.boot.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
//import org.springframework.data.repository.CrudRepository;

@Component
public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {
}
