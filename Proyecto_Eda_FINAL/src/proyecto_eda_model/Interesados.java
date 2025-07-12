/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eda_model;

/**
 *
 * @author USUARIO
 */
public class Interesados {

    private String dni; // Puede ser DNI o RUC. Usamos String para flexibilidad.
    private String nombres;
    private String telefono;
    private String email;
    private String tipo; // "Trabajador ULima" o "Externo" [cite: 14]

    public Interesados(String dni, String nombres, String telefono, String email, String tipo) {
        this.dni = dni;
        this.nombres = nombres;
        this.telefono = telefono;
        this.email = email;
        this.tipo = tipo;
    }

    // Getters 
    public String getDni() { return dni; }
    public String getNombres() { return nombres; }
    public String getTelefono() { return telefono; }
    public String getEmail() { return email; }
    public String getTipo() { return tipo; }
    
    // Representación en texto del interesado 
    @Override
    public String toString() {
        return nombres + " (DNI: " + dni + ")";
    }
    
    
    
    
    
}

