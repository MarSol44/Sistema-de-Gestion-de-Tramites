/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alertas;
import proyecto_eda_model.Expediente;
/**
 *
 * @author USUARIO
 */
// Archivo: ListaCircularAlertas.java
public class ListaCircularAlertas {
    private NodoCircular cabeza;

    public ListaCircularAlertas() {
        this.cabeza = null;
    }

    // El método clave para insertar manteniendo el orden
    public void insertarOrdenado(Expediente expediente) {
        NodoCircular nuevoNodo = new NodoCircular(expediente);

        // Caso 1: La lista está vacía
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.siguiente = cabeza; // Apunta a sí mismo
            return;
        }

        // Comparador para el nuevo nodo
        Comparable<Expediente> nuevoComparable = nuevoNodo.dato;

        // Caso 2: El nuevo nodo debe ser la nueva cabeza
        if (nuevoComparable.compareTo(cabeza.dato) < 0) {
            NodoCircular ultimo = cabeza;
            while (ultimo.siguiente != cabeza) {
                ultimo = ultimo.siguiente;
            }
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
            ultimo.siguiente = cabeza; // El último ahora apunta a la nueva cabeza
            return;
        }

        // Caso 3: Insertar en medio o al final
        NodoCircular actual = cabeza;
        while (actual.siguiente != cabeza && nuevoComparable.compareTo(actual.siguiente.dato) >= 0) {
            actual = actual.siguiente;
        }
        
        nuevoNodo.siguiente = actual.siguiente;
        actual.siguiente = nuevoNodo;
    }

    
    
    public void mostrarAlertas() {
        if (cabeza == null) {
            System.out.println("No hay expedientes pendientes.");
            return;
        }
        System.out.println("--- ALERTAS DE EXPEDIENTES PENDIENTES ---");
        System.out.println("(Orden: Prioridad ascendente, luego por antigüedad)");

        NodoCircular actual = cabeza;
        do {
            System.out.println(" -> " + actual.dato.toString());
            actual = actual.siguiente;
        } while (actual != cabeza);
        System.out.println("------------------------------------------");
    }
    
    // Método para eliminar un expediente (necesario cuando se finaliza un trámite)
    public void remover(String idExpediente) {
        if (cabeza == null) return;

        // Caso 1: El nodo a eliminar es la cabeza
        if (cabeza.dato.getIdUnico().equals(idExpediente)) {
            if (cabeza.siguiente == cabeza) { // Solo hay un nodo
                cabeza = null;
            } else {
                NodoCircular ultimo = cabeza;
                while (ultimo.siguiente != cabeza) {
                    ultimo = ultimo.siguiente;
                }
                cabeza = cabeza.siguiente;
                ultimo.siguiente = cabeza;
            }
            return;
        }

        // Caso 2: El nodo está en otra parte
        NodoCircular actual = cabeza;
        while (actual.siguiente != cabeza && !actual.siguiente.dato.getIdUnico().equals(idExpediente)) {
            actual = actual.siguiente;
        }

        if (actual.siguiente.dato.getIdUnico().equals(idExpediente)) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }
    
    public NodoCircular getCabeza() {
    return cabeza;
}
}