/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package include;

/**
 *
 * @author pc
 */
public class Viaje {
    private String nombre;
    private String apellido;
     private int dni;
    private int idviaje;
    private int cantidad;

    /**
     * @return the idviaje
     */
    
    
    public Viaje() {
    }

    public Viaje(String nombre, String apellido, int dni, int idviaje, int cantidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.idviaje = idviaje;
        this.cantidad = cantidad;
    }

    

    public int getIdviaje() {
        return idviaje;
    }

    /**
     * @param idviaje the idviaje to set
     */
    public void setIdviaje(int idviaje) {
        this.idviaje = idviaje;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }
    
    
}
