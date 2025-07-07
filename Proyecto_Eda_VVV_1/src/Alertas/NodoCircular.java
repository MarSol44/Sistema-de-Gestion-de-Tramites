/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alertas;
import proyecto_eda_model.Expediente;

public class NodoCircular {
    public Expediente dato;
    public NodoCircular siguiente;

    public NodoCircular(Expediente dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

