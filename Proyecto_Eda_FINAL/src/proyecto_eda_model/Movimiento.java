/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eda_model;
import java.time.LocalDateTime;
/**
 *
 * @author USUARIO
 */
public class Movimiento {
    private LocalDateTime fechaHora;// Fecha y hora exacta del movimiento
    private String descripcion; //Dependencia Destino

    public Movimiento(LocalDateTime fechaHora, String descripcion) {
        this.fechaHora = fechaHora;
        this.descripcion = descripcion;
    }
    
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public java.time.LocalDateTime getFechaHora() {
    return this.fechaHora;
}

    @Override
    public String toString() {
        return "[" + fechaHora.toString() + "] " + descripcion;
    }
}
