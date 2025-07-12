/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eda_controlador;
import java.time.LocalDateTime;
import Alertas.ListaCircularAlertas;
import proyecto_eda_model.Expediente;
import proyecto_eda_model.Interesados;
import proyecto_eda_estructuras.ListaDobleExpedientes;
import proyecto_eda_model.Movimiento;
import proyecto_eda_estructuras.arbol;
import proyecto_eda_model.dependencia;

/**
 *
 * @author USUARIO
 */
public class SistemaGestion {
    // Estructuras principales del sistema
    private ListaDobleExpedientes listaGeneralExpedientes;// Contiene todos los expedientes
    private arbol arbolDependencias;// Árbol jerárquico de dependencias
    private ListaCircularAlertas listaAlertas;// Lista de expedientes pendientes por prioridad
    private int correlativoExpediente = 0;// Para generar IDs únicos
    
    
    // Constructor principal
    public SistemaGestion() {
        this.listaGeneralExpedientes = new ListaDobleExpedientes();
        this.arbolDependencias = new arbol();
        this.listaAlertas = new ListaCircularAlertas();
        
        
        System.out.println("Sistema de Gestión inicializado.");
        cargarDatosDeDependencias(); 
    }
    
    
    //  crea un árbol jerárquico de dependencias administrativas usando tu clase arbol.
    private void cargarDatosDeDependencias() {
        System.out.println("[Sistema] Iniciando carga de datos de prueba...");

        // --- 1. Carga de Dependencias en el Árbol ---
        this.arbolDependencias.insertar(new dependencia(1, "Rectorado"), 0);
        this.arbolDependencias.insertar(new dependencia(10, "Vicerrectorado Académico"), 1);
        this.arbolDependencias.insertar(new dependencia(20, "Administración General"), 1);
        this.arbolDependencias.insertar(new dependencia(101, "Facultad de Ingeniería"), 10);
        this.arbolDependencias.insertar(new dependencia(102, "Facultad de Derecho"), 10);
        this.arbolDependencias.insertar(new dependencia(1011, "Dirección de Ingeniería de Sistemas"), 101);
        
        //Dependencia "Tesoreria" con ID 201 y su padre tiene ID 20
        this.arbolDependencias.insertar(new dependencia(201, "Tesorería"), 20);
        this.arbolDependencias.insertar(new dependencia(202, "Mesa de Partes"), 20);
        System.out.println("[Sistema] -> Árbol de dependencias cargado.");
    }

    
    //imprime el historial de movimientos(seguimiento) de un expediente especifico
    public void consultarSeguimiento(String idExpediente) {
        System.out.println("\n--- CONSULTA DE SEGUIMIENTO PARA " + idExpediente + " ---");
        Expediente expediente = this.listaGeneralExpedientes.buscarPorId(idExpediente);

        if (expediente != null) {
            // (el resto de tu método)
        } else {
            System.out.println("[Error] No se encontró un expediente con el ID: " + idExpediente);
        }
        System.out.println("--- FIN DE LA CONSULTA ---");
    }
    
    
    //Marca un expediente como finalizado y registra su doo final
    public Expediente finalizarExpediente(String idExpediente, String documentoFinal) {
    System.out.println("\n[Acción] Finalizando expediente " + idExpediente);
    
    
    Expediente expedienteAFinalizar = this.listaGeneralExpedientes.buscarPorId(idExpediente);
    
    
    //Verifica que el exp. exista
    //Que no este marcado como Finalizado
    if (expedienteAFinalizar != null && !expedienteAFinalizar.getEstado().equals("Finalizado")) {
        expedienteAFinalizar.setEstado("Finalizado");
        //Registra fecha y hora actual como momento de finalizacion
        LocalDateTime fechaDeFinalizacion = java.time.LocalDateTime.now();
        expedienteAFinalizar.setFechaFin(fechaDeFinalizacion);
        
        //Crea un nuevo movimientoFinal y pone que el expediente ya esta finalizado
        String descripcion = "Trámite finalizado. Documento generado: " + documentoFinal;
        Movimiento movimientoFinal = new Movimiento(fechaDeFinalizacion, descripcion);
        
        //Agrega el movimientoFinal al historial del expediente
        expedienteAFinalizar.getSeguimiento().insertar(movimientoFinal);
        //lo elimina de la lista de Alertas
        this.listaAlertas.remover(idExpediente);

        
        System.out.println("[Info] Expediente " + idExpediente + " ha sido marcado como Finalizado.");
        //devuelve el expediente actualizado
        return expedienteAFinalizar; 
    }
    return null;
}
    
    //Mueve expediente de Dependencia Actual a Dependencia Destino
    public void moverExpediente(String idExpediente, String nombreDependenciaDestino) {
    System.out.println("\n[Acción] Moviendo expediente " + idExpediente + " a " + nombreDependenciaDestino);

    // 1. Buscar el expediente en la lista principal del sistema por ID
    Expediente expedienteAMover = this.listaGeneralExpedientes.buscarPorId(idExpediente);

    // 2. Validar si el expediente existe.
    if (expedienteAMover != null) {
        // 3. Crear nuevo movimiento con fecha actual y una descrip. diciendo a donde se mueve
        String descripcion = "Expediente derivado a " + nombreDependenciaDestino;
        Movimiento nuevoMovimiento = new Movimiento(java.time.LocalDateTime.now(), descripcion);

        // 4. Añadir el movimiento al historial del expediente.
        expedienteAMover.getSeguimiento().insertar(nuevoMovimiento);

        System.out.println("[Info] Movimiento registrado correctamente.");
    } else {
        System.out.println("[Error] No se encontró un expediente con el ID: " + idExpediente);
    }
}
    
    
    //Imprime por consola todos los expedientes registrados
    public void mostrarTodosLosExpedientes() {
    System.out.println("\n--- LISTA GENERAL DE EXPEDIENTES EN EL SISTEMA ---");
    // Simplemente le delegamos la tarea a la lista doble.
    this.listaGeneralExpedientes.imprimirTodo();
}
    
    
    //Valida el inicio de sesion, el Login
    public boolean validarCredenciales(String usuario, String clave) {
    return usuario.equals("admin") && clave.equals("ulima2025");
}
    
    
    
    //Crea y registra un expediente NUEVO desde cero
    public void registrarNuevoExpediente(String dni, String nombres, String telefono, String email, String tipo,
                                       String asunto, int prioridad, String docReferencia) {
    
    System.out.println("\n[Acción] Registrando nuevo expediente para: " + nombres);

    // 1. Crear el objeto Interesados
    Interesados nuevoInteresado = new Interesados(dni, nombres, telefono, email, tipo);

    // 2. Generar un ID único para el expediente
    String nuevoId = generarSiguienteId();//
    Expediente nuevoExpediente = new Expediente(nuevoId, prioridad, asunto, docReferencia, nuevoInteresado);

    // 3. Registrar el primer movimiento por defecto
    String descripcionMovimiento = "Ingreso inicial: Mesa de Partes.";
    nuevoExpediente.getSeguimiento().insertar(new Movimiento(java.time.LocalDateTime.now(), descripcionMovimiento));

    // 4. Añadir el nuevo expediente a la lista doble principal
    this.listaGeneralExpedientes.insertar(nuevoExpediente);

    // 5. Añadirlo a la lista de alertas si está "En Trámite"
    if (nuevoExpediente.getEstado().equals("En Trámite")) {
        this.listaAlertas.insertarOrdenado(nuevoExpediente);
    }
}
    
    
    
   //Getter
    public ListaDobleExpedientes getListaGeneralExpedientes() {
    return this.listaGeneralExpedientes;
}

    
    //
    private String generarSiguienteId() {
        // 1. Incrementa el contador que tenemos como atributo en la clase.
        this.correlativoExpediente++;

        // 2. Obtiene el año actual para incluirlo en el ID.
        int añoActual = java.time.Year.now().getValue();

        // 3. Formatea el num. para que siempre tenga min 3 dígitos (ej: 5 -> "005").
        String numeroFormateado = String.format("%03d", this.correlativoExpediente);

        // 4. Construye y devuelve el código completo.
        return "EXP-" + añoActual + "-" + numeroFormateado;
    }
    
    
    //Devuelve una lista de los nombres de todas las dependencias registradas en el arbol de depndencias
    public java.util.ArrayList<String> getNombresDeDependencias() {
        //Crea un array List vacio
        java.util.ArrayList<String> nombres = new java.util.ArrayList<>();
        
        if (arbolDependencias != null) {
            //recorre todo el arbol y agrega los nombres de todas las dependencias al ArrayList
            arbolDependencias.llenarNombres(nombres);
        }
        return nombres;
    }
    
    
    
    
    public Expediente buscarPorId(String idExpediente) {
    // Simplemente le pasa la tarea a la lista doble.
    return this.listaGeneralExpedientes.buscarPorId(idExpediente);
}
}
