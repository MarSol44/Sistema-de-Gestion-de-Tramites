/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import javax.swing.JOptionPane;
import proyecto_eda_controlador.SistemaGestion;
import proyecto_eda_model.Expediente;
import proyecto_eda_model.Movimiento;
/**
 *
 * @author maris
 */
public class RegistrarMovimientoFrame extends javax.swing.JFrame {

    private SistemaGestion miSistema;
    
    public RegistrarMovimientoFrame(SistemaGestion sistema) {
        initComponents();
        this.miSistema = sistema; // Lo guarda
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtIdExpediente = new javax.swing.JTextPane();
        comboDependenciaDestino = new java.awt.Choice();
        textAsunto = new java.awt.TextArea();
        txtDependenciaActual = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("ID Expediente");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Dependencia Destino");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Dependencia Actual");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Comentario");

        btnNuevo.setBackground(new java.awt.Color(204, 255, 255));
        btnNuevo.setText("Registrar Movimiento");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(txtIdExpediente);

        txtDependenciaActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDependenciaActualActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setText("Cargar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro Movimiento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboDependenciaDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textAsunto, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtDependenciaActual))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevo)
                .addGap(20, 20, 20))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDependenciaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboDependenciaDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnNuevo)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String idExpediente = txtIdExpediente.getText().trim();
    if (idExpediente.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID de expediente.");
        return;
    }

    // 1. Buscamos el expediente en el sistema
    Expediente exp = miSistema.buscarPorId(idExpediente);

    if (exp != null) {
        // 2. Obtenemos su último movimiento para saber la dependencia actual
        Movimiento ultimoMov = exp.getSeguimiento().getUltimoMovimiento();
        if (ultimoMov != null) {
            txtDependenciaActual.setText(ultimoMov.getDescripcion());
        }

        comboDependenciaDestino.removeAll(); // Limpiamos por si acaso
        java.util.ArrayList<String> dependencias = miSistema.getNombresDeDependencias();
        for (String nombre : dependencias) {
            comboDependenciaDestino.addItem(nombre);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Expediente no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        String idExpediente = txtIdExpediente.getText().trim();
        String dependenciaDestino = (String) comboDependenciaDestino.getSelectedItem();
        // El comentario es opcional, puedes añadir un campo de texto para él

        if (idExpediente.isEmpty() || dependenciaDestino == null) {
            JOptionPane.showMessageDialog(this, "Debe cargar un expediente y seleccionar un destino.");
            return;
        }

        // Llamamos al método del backend que ya habíamos creado
        miSistema.moverExpediente(idExpediente, dependenciaDestino);

        JOptionPane.showMessageDialog(this, "Movimiento registrado con éxito.");
        this.dispose(); // Cierra la ventana
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtDependenciaActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDependenciaActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDependenciaActualActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevo;
    private java.awt.Choice comboDependenciaDestino;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.TextArea textAsunto;
    private javax.swing.JTextField txtDependenciaActual;
    private javax.swing.JTextPane txtIdExpediente;
    // End of variables declaration//GEN-END:variables
}
