package com.examen.escuela.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_alumnos")
public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_t_usuarios;
	private String nombre;
	private String ap_paterno;
	private String ap_materno;
	private Integer activo;
	
	@OneToMany(mappedBy = "alumno")
	private List<Calificaciones> calificaciones;
	
	public Alumno() {
		
	}
	
	public Alumno(Integer id_t_usuarios, String nombre, String ap_paterno, String ap_materno, Integer activo) {
		super();
		this.id_t_usuarios = id_t_usuarios;
		this.nombre = nombre;
		this.ap_paterno = ap_paterno;
		this.ap_materno = ap_materno;
		this.activo = activo;
	}
	public Integer getId_t_usuarios() {
		return id_t_usuarios;
	}
	public void setId_t_usuarios(Integer id_t_usuarios) {
		this.id_t_usuarios = id_t_usuarios;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAp_paterno() {
		return ap_paterno;
	}
	public void setAp_paterno(String ap_paterno) {
		this.ap_paterno = ap_paterno;
	}
	public String getAp_materno() {
		return ap_materno;
	}
	public void setAp_materno(String ap_materno) {
		this.ap_materno = ap_materno;
	}
	public Integer getActivo() {
		return activo;
	}
	public void setActivo(Integer activo) {
		this.activo = activo;
	}
	
	

	public List<Calificaciones> getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(List<Calificaciones> calificaciones) {
		this.calificaciones = calificaciones;
	}

	@Override
	public String toString() {
		return "Alumno [id_t_usuarios=" + id_t_usuarios + ", nombre=" + nombre + ", ap_paterno=" + ap_paterno
				+ ", ap_materno=" + ap_materno + ", activo=" + activo + "]";
	}
	 
	

}
