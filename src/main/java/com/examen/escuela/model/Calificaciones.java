package com.examen.escuela.model;

import java.util.Date;

public class Calificaciones {
	
	private Integer id_t_calificaciones;
	private Integer id_t_materias;
	private Integer id_t_usuarios;
	private double calificaciones;
	private Date fecha_registro;

	public Calificaciones() {
		
	}

	public Calificaciones(Integer id_t_calificaciones, Integer id_t_materias, Integer id_t_usuarios,
			float calificaciones, Date fecha_registro) {
		super();
		this.id_t_calificaciones = id_t_calificaciones;
		this.id_t_materias = id_t_materias;
		this.id_t_usuarios = id_t_usuarios;
		this.calificaciones = calificaciones;
		this.fecha_registro = fecha_registro;
	}

	public Integer getId_t_calificaciones() {
		return id_t_calificaciones;
	}

	public void setId_t_calificaciones(Integer id_t_calificaciones) {
		this.id_t_calificaciones = id_t_calificaciones;
	}

	public Integer getId_t_materias() {
		return id_t_materias;
	}

	public void setId_t_materias(Integer id_t_materias) {
		this.id_t_materias = id_t_materias;
	}

	public Integer getId_t_usuarios() {
		return id_t_usuarios;
	}

	public void setId_t_usuarios(Integer id_t_usuarios) {
		this.id_t_usuarios = id_t_usuarios;
	}

	public double getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(float calificaciones) {
		this.calificaciones = calificaciones;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	@Override
	public String toString() {
		return "Calificaciones [id_t_calificaciones=" + id_t_calificaciones + ", id_t_materias=" + id_t_materias
				+ ", id_t_usuarios=" + id_t_usuarios + ", calificaciones=" + calificaciones + ", fecha_registro="
				+ fecha_registro + "]";
	}
	
	
}
