package com.learning.testingcasemgmt2;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Empleado2 implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "EMPLEADO2_ID_GENERATOR")
    @javax.persistence.Id
    @javax.persistence.SequenceGenerator(name = "EMPLEADO2_ID_GENERATOR", sequenceName = "EMPLEADO2_ID_SEQ")
    private java.lang.Long id;

    public Empleado2() {
    }
    
    public Empleado2(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Long getId() {
        return this.id;
    }
    
    public void setId(java.lang.Long id) {
        this.id = id;
    }




}