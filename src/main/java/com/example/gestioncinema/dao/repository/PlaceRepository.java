package com.example.gestioncinema.dao.repository;

import com.example.gestioncinema.dao.entities.Cinema;
import com.example.gestioncinema.dao.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface PlaceRepository extends JpaRepository<Place,Long> {
}
