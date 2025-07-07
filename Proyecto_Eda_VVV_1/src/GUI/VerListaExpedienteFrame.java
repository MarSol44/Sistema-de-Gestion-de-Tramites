/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.table.DefaultTableModel;
import proyecto_eda_model.Expediente;
import proyecto_eda_model.Interesados;
import proyecto_eda_estructuras.ListaDobleExpedientes;
import proyecto_eda_estructuras.NodoDobleExpediente;
import proyecto_eda_controlador.SistemaGestion;
/**
 *
 * @author maris
 */
public class VerListaExpedienteFrame extends javax.swing.JFrame {
    private DefaultTableModel modeloTabla;
    private SistemaGestion miSistema;
    /**
     * Creates new form VerListaExpedienteFrame
     */
  
    public VerListaExpedienteFrame(SistemaGestion sistema) {
        initComponents();
        this.miSistema = sistema; // Guarda la referencia al sistema
        
        // Configura el modelo de la tabla
        configurarTabla();
        // Carga los datos desde el sistema
        cargarDatosTabla();
    }
    
    private void configurarTabla() {
        modeloTabla = new DefaultTableModel();
        // Definimos las columnas que queremos mostrar
        modeloTabla.addColumn("ID Expediente");
        modeloTabla.addColumn("Asunto");
        modeloTabla.addColumn("Prioridad");
        modeloTabla.addColumn("Estado");
        modeloTabla.addColumn("Interesado");
        modeloTabla.addColumn("DNI");
        
        this.tablaListaAlumnos.setModel(modeloTabla);
    }

    private void cargarDatosTabla() {
        // Pide al SistemaGestion la lista de expedientes.
        // OJO: Necesitamos un método en SistemaGestion para esto. ¡Lo crearemos ahora!
        ListaDobleExpedientes lista = miSistema.getListaGeneralExpedientes();
        
        // Recorremos la lista y añadimos cada expediente a la tabla
        NodoDobleExpediente actual = lista.getCabeza();
        while (actual != null) {
            Expediente e = actual.getDato(); // Cambiado de getExpediente a getDato
            Interesados i = e.getInteresado(); // Cambiado de getInteresados a getInteresado
            
            Object[] fila = new Object[6];
            fila[0] = e.getIdUnico();
            fila[1] = e.getAsunto();
            fila[2] = e.getPrioridad();
            fila[3] = e.getEstado();
            fila[4] = i.getNombres();
            fila[5] = i.getDni();
            
            modeloTabla.addRow(fila);
            actual = actual.siguiente; // Asumiendo que el nodo tiene un puntero 'siguiente'
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListaAlumnos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaListaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaListaAlumnos);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Lista de Tramites registrados en el Sistema");

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(191, 191, 191))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaListaAlumnos;
    // End of variables declaration//GEN-END:variables
}
