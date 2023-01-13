package com.examen.escuela.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.escuela.model.Calificaciones;
import com.examen.escuela.repository.CalificacionesRepository;

@Service
public class CalificacionesServiceImpl implements CalificacionesService {

	@Autowired
	private CalificacionesRepository calificacionesRepository;
	
	
	
	@Override
	public Calificaciones save(Calificaciones calificaciones) {
		return calificacionesRepository.save(calificaciones);
	}

	@Override
	public Optional<Calificaciones> get(Integer id) {
		
		return calificacionesRepository.findById(id);
	}

	@Override
	public void update(Calificaciones calificaciones) {
		calificacionesRepository.save(calificaciones);
	}

	@Override
	public void delete(Integer id) {
		calificacionesRepository.deleteById(id);
		
	}

}
