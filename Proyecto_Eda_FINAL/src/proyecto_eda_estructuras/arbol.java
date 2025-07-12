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
public class arbol {
    private nodoArbol raiz;
    // ... el constructor se mantiene igual ...
    
    // El método insertar se mantiene igual en su lógica externa
    public void insertar(dependencia nuevaDependencia, int idPadre) {
        // ... la lógica no cambia porque la complejidad se encapsuló en las otras clases
        nodoArbol nuevoNodo = new nodoArbol(nuevaDependencia);
        if (raiz == null) {
            raiz = nuevoNodo;
        } else {
            nodoArbol padre = buscarNodo(raiz, idPadre);
            if (padre != null) {
                padre.agregarHijo(nuevoNodo);
            } else {
                System.out.println("Error: No se encontró la dependencia padre con ID: " + idPadre);
            }
        }
    }

    // Método buscarNodo con el bucle manual
    private nodoArbol buscarNodo(nodoArbol nodoActual, int idBuscado) {
        if (nodoActual == null) return null;
        if (nodoActual.getDato().getId() == idBuscado) return nodoActual;

        // Bucle manual para recorrer nuestra lista simple de hijos
        nodoDeLista hijoActualEnLista = nodoActual.getHijos().getCabeza();
        while (hijoActualEnLista != null) {
            nodoArbol encontrado = buscarNodo(hijoActualEnLista.dato, idBuscado);
            if (encontrado != null) {
                return encontrado;
            }
            hijoActualEnLista = hijoActualEnLista.siguiente;
        }
        return null;
    }

    // Método imprimirJerarquia con el bucle manual
    public void imprimirJerarquia() {
        imprimirJerarquiaRecursivo(raiz, 0);
    }

    private void imprimirJerarquiaRecursivo(nodoArbol nodo, int nivel) {
        if (nodo == null) return;

        for (int i = 0; i < nivel; i++) {
            System.out.print("  ");
        }
        System.out.println("- " + nodo.getDato().getNombre());
        
        // Bucle manual para recorrer nuestra lista simple de hijos
        nodoDeLista hijoActualEnLista = nodo.getHijos().getCabeza();
        while (hijoActualEnLista != null) {
            imprimirJerarquiaRecursivo(hijoActualEnLista.dato, nivel + 1);
            hijoActualEnLista = hijoActualEnLista.siguiente;
        }
    }
    
    public void llenarNombres(java.util.ArrayList<String> lista) {
    llenarNombresRecursivo(raiz, lista);
}

    private void llenarNombresRecursivo(nodoArbol nodo, java.util.ArrayList<String> lista) {
    if (nodo == null) return;
    lista.add(nodo.getDato().getNombre());
    
    nodoDeLista hijoActual = nodo.getHijos().getCabeza();
    while (hijoActual != null) {
        llenarNombresRecursivo(hijoActual.dato, lista);
        hijoActual = hijoActual.siguiente;
    }
}
}
