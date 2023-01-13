package com.examen.escuela.service;

import java.util.Optional;

import com.examen.escuela.model.Calificaciones;

public interface CalificacionesService {
	
	public Calificaciones save (Calificaciones calificaciones);
	public Optional<Calificaciones> get(Integer id);
	public void update(Calificaciones calificaciones);
	public void delete(Integer id);
	

}
