/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eda_estructuras;

/**
 *
 * @author USUARIO
 */
public class nodoDeLista {
    public nodoArbol dato; // El dato que guarda es un NODO DE ÁRBOL
    public nodoDeLista siguiente;

    public nodoDeLista(nodoArbol dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
