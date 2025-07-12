/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eda_estructuras;

/**
 *
 * @author USUARIO
 */
public class listaSimpleHijos {
    private nodoDeLista cabeza;

    public listaSimpleHijos() {
        this.cabeza = null;
    }

    public void insertar(nodoArbol hijo) {
        nodoDeLista nuevoNodo = new nodoDeLista(hijo);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            nodoDeLista actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    // Getter para poder recorrer la lista desde afuera
    public nodoDeLista getCabeza() {
        return cabeza;
    }
}
