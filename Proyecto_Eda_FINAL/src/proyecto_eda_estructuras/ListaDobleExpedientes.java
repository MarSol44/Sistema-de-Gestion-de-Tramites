/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eda_estructuras;

import Alertas.ListaCircularAlertas;
import proyecto_eda_model.Expediente;

/**
 *
 * @author USUARIO
 */

//Para la navegación entre expedientes registrados.
public class ListaDobleExpedientes {
    private NodoDobleExpediente cabeza;
    private NodoDobleExpediente cola;

     //Inserta un expediente por la cola
    //Cabeza-><-Cola
    public void insertar(Expediente expediente) {
        NodoDobleExpediente nuevoNodo = new NodoDobleExpediente(expediente);
         //Si la lista está vacía (no hay expedientes):
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } 
         //Si ya hay nodos:
        else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
    }
    
     // imprime todos los expedientes y su seguimiento
    public void imprimirTodo() {
        NodoDobleExpediente actual = cabeza;
        if (actual == null) {
            System.out.println("No hay expedientes registrados en el sistema.");
            return;
        }
        while (actual != null) {
            System.out.println("======================================================");
            System.out.println(actual.dato.toString());
            System.out.println("--- Historial de Seguimiento ---");
            actual.dato.getSeguimiento().imprimirMovimientos();
            actual = actual.siguiente;
        }
        System.out.println("======================================================");
    }
    
    public void insertarFinal(Expediente expediente) {
        NodoDobleExpediente nuevoNodo = new NodoDobleExpediente(expediente);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.setSig(nuevoNodo);
            nuevoNodo.setAnt(cola);
            cola = nuevoNodo;
    }
}

public Expediente buscarPorId(String id) {
    NodoDobleExpediente actual = cabeza;
    while (actual != null) {
        // Usamos .equals() para comparar Strings
        if (actual.dato.getIdUnico().equals(id)) {
            return actual.dato; // ¡Encontrado!
        }
        actual = actual.siguiente;
    }
    return null; // No se encontró el expediente
}    
    public NodoDobleExpediente getCabeza() {
    return cabeza; // asegúrate de que `cabeza` sea el nombre de tu primer nodo
}
     
    

}
