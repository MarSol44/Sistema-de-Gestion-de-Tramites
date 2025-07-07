/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eda_estructuras;

import proyecto_eda_model.Expediente;

/**
 *
 * @author USUARIO
 */
public class NodoDobleExpediente {
    public Expediente dato;
    public NodoDobleExpediente siguiente;
    public NodoDobleExpediente anterior;

    public NodoDobleExpediente(Expediente dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
    public Expediente getDato() {
        return dato;
    }

    public void setDato(Expediente dato) {
        this.dato = dato;
    }

    public NodoDobleExpediente getSig() {
        return siguiente;
    }

    public void setSig(NodoDobleExpediente sig) {
        this.siguiente = sig;
    }

    public NodoDobleExpediente getAnt() {
        return anterior;
    }

    public void setAnt(NodoDobleExpediente ant) {
        this.anterior = ant;
    }
    
    
    public Expediente getExpediente() {
    return dato; // asegúrate de que `dato` es donde almacenas el Expediente
}
    
}
