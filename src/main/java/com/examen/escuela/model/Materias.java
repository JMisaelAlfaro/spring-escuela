package com.examen.escuela.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_materias")
public class Materias {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_t_materias;
	private String nombre_materia;
	private Integer activo;
	
	@ManyToOne
	private Calificaciones calificaciones;
	
	public Materias() {
		
	}

	public Integer getId_t_materias() {
		return id_t_materias;
	}

	public void setId_t_materias(Integer id_t_materias) {
		this.id_t_materias = id_t_materias;
	}

	public String getNombre_materia() {
		return nombre_materia;
	}

	public void setNombre_materia(String nombre_materia) {
		this.nombre_materia = nombre_materia;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	
	
	public Calificaciones getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(Calificaciones calificaciones) {
		this.calificaciones = calificaciones;
	}

	@Override
	public String toString() {
		return "Materias [id_t_materias=" + id_t_materias + ", nombre_materia=" + nombre_materia + ", activo=" + activo
				+ "]";
	}

	
	
	

}
