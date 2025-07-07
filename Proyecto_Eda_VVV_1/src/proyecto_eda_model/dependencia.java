/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eda_model;

/**
 *
 * @author USUARIO
 */
public class dependencia {
    private final int id;
    private final String nombre;

    // Constructor
    public dependencia(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Métodos para obtener los datos (getters)
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        // Esto nos ayudará a imprimir la información fácilmente
        return "ID: " + id + ", Nombre: " + nombre;
    }
}

