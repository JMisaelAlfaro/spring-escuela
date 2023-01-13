package com.examen.escuela.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.escuela.model.Calificaciones;

@Repository
public interface CalificacionesRepository extends JpaRepository<Calificaciones, Integer>{
	
	

}
