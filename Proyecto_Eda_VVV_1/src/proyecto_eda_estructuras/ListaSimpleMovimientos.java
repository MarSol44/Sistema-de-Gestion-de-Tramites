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
public class ListaSimpleMovimientos {
     private NodoSimpleMovimiento cabeza;

    public void insertar(Movimiento movimiento) {
        NodoSimpleMovimiento nuevoNodo = new NodoSimpleMovimiento(movimiento);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoSimpleMovimiento actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public void imprimirMovimientos() {
        NodoSimpleMovimiento actual = cabeza;
        if(actual == null) {
            System.out.println("    - Sin movimientos registrados.");
            return;
        }
        while (actual != null) {
            System.out.println("    - " + actual.dato.toString());
            actual = actual.siguiente;
        }
    }
    public Movimiento getUltimoMovimiento() {
        if (cabeza == null) return null;
            NodoSimpleMovimiento actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }
    
    public NodoSimpleMovimiento getCabeza() {
    return this.cabeza;
    }
}
