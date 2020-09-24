package com.learning.testingcasemgmt2;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Empleado implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "EMPLEADO_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "EMPLEADO_ID_GENERATOR", sequenceName = "EMPLEADO_ID_SEQ")
	private java.lang.Long id;

	private java.lang.String nombre;

	public Empleado() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getNombre() {
		return this.nombre;
	}

	public void setNombre(java.lang.String nombre) {
		this.nombre = nombre;
	}

	public Empleado(java.lang.Long id, java.lang.String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

}