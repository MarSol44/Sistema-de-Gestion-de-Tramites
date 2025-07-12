/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eda_model;
import java.time.LocalDateTime;
import proyecto_eda_estructuras.ListaSimpleMovimientos;
/**
 *
 * @author USUARIO
 */
public class Expediente implements Comparable<Expediente>{
    private String idUnico;
    private int prioridad;
    private String asunto;
    private String docReferencia;
    private Interesados interesado; // Un expediente TIENE UN interesado
    private ListaSimpleMovimientos seguimiento; // Un expediente TIENE UNA lista de seguimiento
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private String estado; // "En Trámite", "Finalizado"

    
    
    
    
    public Expediente(String idUnico, int prioridad, String asunto, String docReferencia, Interesados interesado) {
        this.idUnico = idUnico;
        this.prioridad = prioridad;
        this.asunto = asunto;
        this.docReferencia = docReferencia;
        this.interesado = interesado;
        this.seguimiento = new ListaSimpleMovimientos(); // Cada expediente nuevo tiene su propia lista de seguimiento vacía
        this.fechaInicio = LocalDateTime.now(); // Se asigna la fecha y hora actual al crear [cite: 12]
        this.fechaFin = null;
        this.estado = "En Trámite";
    }
    
    
    // Getters y setters principales
    public ListaSimpleMovimientos getSeguimiento() { return seguimiento; }
    public void setFechaFin(LocalDateTime fechaFin) { this.fechaFin = fechaFin; }
    public void setEstado(String estado) { this.estado = estado; }
   
    // Muestra un resumen del expediente (usado en mostrarAlertas)
    @Override
    public String toString() {
        return "Expediente: " + idUnico + "\n" +
               "Interesado: " + interesado.getNombres() + "\n" +
               "Asunto: " + asunto + "\n" +
               "Prioridad: " + prioridad + " | Estado: " + estado;
    }
    

// Compara dos expedientes por prioridad y fecha de inicio
    @Override
    public int compareTo(Expediente otro) {
        // 1. Compara por prioridad (menor número = mayor prioridad)
        if (this.getPrioridad() < otro.getPrioridad()) {
            return -1; // this es más importante
        }
        if (this.getPrioridad() > otro.getPrioridad()) {
            return 1; // otro es más importante
        }
        // Si las prioridades son iguales, compara por fecha (antigüedad)
        // El más antiguo (fecha menor) es más importante
        return this.getFechaInicio().compareTo(otro.getFechaInicio());
    }
    
     // Getters 
    public LocalDateTime getFechaInicio() {
        return this.fechaInicio;
    }
    
    public Interesados getInteresados() {
    return this.interesado;
    }

    public String getIdUnico() {
        return idUnico;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getDocReferencia() {
        return docReferencia;
    }

    public Interesados getInteresado() {
        return interesado;
    }

    public LocalDateTime getFechaFin() {
        return this.fechaFin;
    }

    public String getEstado() {
        return estado;
}
    
    
    
    
}