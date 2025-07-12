/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eda_estructuras;

import proyecto_eda_model.dependencia;

/**
 *
 * @author USUARIO
 */
public class nodoArbol {
    private final dependencia dato;
        private final listaSimpleHijos hijos; // <-- ¡CAMBIO CLAVE!

    public nodoArbol(dependencia dato) {
        this.dato = dato;
        this.hijos = new listaSimpleHijos(); // <-- Se inicializa nuestra lista
    }

    public dependencia getDato() {
        return dato;
    }

    public listaSimpleHijos getHijos() {
        return hijos;
    }

    public void agregarHijo(nodoArbol hijo) {
        this.hijos.insertar(hijo); // <-- Usa el método de nuestra lista
    }
}

