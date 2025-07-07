/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_eda_main;

// Importamos las clases de otros paquetes que vamos a usar
import proyecto_eda_controlador.SistemaGestion;
import GUI.LoginFrame;

public class Main {

    public static void main(String[] args) {
        
       
        SistemaGestion miSistema = new SistemaGestion();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame(miSistema).setVisible(true);
            }
        });
    }
}
