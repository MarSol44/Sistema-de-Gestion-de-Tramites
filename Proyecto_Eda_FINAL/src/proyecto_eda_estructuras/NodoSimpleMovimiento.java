/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eda_estructuras;

import proyecto_eda_model.Movimiento;

/**
 *
 * @author USUARIO
 */
public class NodoSimpleMovimiento {
    public Movimiento dato;
    public NodoSimpleMovimiento siguiente;

    public NodoSimpleMovimiento(Movimiento dato) {
        this.dato = dato;
        this.siguiente = null;
    }   
}
