/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB4o.Ventanas;

import DB4o.Clases.Empleado;
import DB4o.Clases.Pelicula;
import DB4o.Clases.Sala;
import DB4o.Clases.Historico;
import DB4o.Conexion.Conexion;

/**
 *
 * @author morfe
 */
public class Eleccion extends javax.swing.JFrame {

    public SQL.Ventanas.Main ventanaMain;
    
    /**
     * Creates new form Eleccion
     */
    public Eleccion() {
        initComponents();

        Pelicula p1 = new Pelicula(1, "Star Wars Una Nueva Esperanza", "1977", "George Lucas", "Mark Hammyl", "Harrison Ford", "96", "Direccion http");
        Pelicula p2 = new Pelicula(2, "Star Wars El Imperio Contraataca", "1980", "Irvin Kershner", "Mark Hammyl", "Harrison Ford", "100", "Direccion http");
        Pelicula p3 = new Pelicula(3, "Star Wars El Retorno del Jedi", "1983", "Richard Marquand", "Mark Hammyl", "Harrison Ford", "133", "Direccion http");
        
        Empleado e1 = new Empleado (1,"David","Nuño","Velez del Burgo","21/10/1985","20/01/2012","20/01/2018","España","Encargado");
        Empleado e2 = new Empleado (2,"Lauren","Nuño","Velez del Burgo","06/08/1979","15/01/2010","28/03/2019","España","Peon");
        Empleado e3 = new Empleado (3,"Beatriz","Moro","Hernández","24/05/1986","01/01/2011","25/01/2019","España","Jefe");
        
        Sala s1 = new Sala (1,58,254,"17:00","17:30-19:30 / 20:00-22:00 / 22:30-00:30");
        Sala s2 = new Sala (2,63,300,"17:00","17:30-19:30 / 20:00-22:00 / 22:30-00:30");
        Sala s3 = new Sala (3,52,185,"17:00","17:30-19:30 / 20:00-22:00 / 22:30-00:30");
        
        Historico h1= new Historico ("12/12/2018","17:30-19:30",s1,e1,p1);
        Historico h2= new Historico ("11/11/2018","22:30-00:30",s2,e2,p2);
        Historico h3= new Historico ("10/10/2018","22:30-00:30",s3,e3,p3);
        Historico h4= new Historico ("19/09/2018","20:00-22:00",s1,e2,p3);
        Historico h5= new Historico ("18/11/2018","22:30-00:30",s3,e2,p1);
        Historico h6= new Historico ("17/12/2018","17:30-19:30",s2,e1,p2);
        
        
        
        /*Conexion conexion = new Conexion();
        conexion.guardarPelicula(p1); 
        conexion.guardarPelicula(p2); 
        conexion.guardarPelicula(p3);
        
        conexion.guardarEmpleado(e1);
        conexion.guardarEmpleado(e2);
        conexion.guardarEmpleado(e3);
        
        conexion.guardarSala(s1);
        conexion.guardarSala(s2);
        conexion.guardarSala(s3);
        
        conexion.guardarHistorico(h1);
        conexion.guardarHistorico(h2);
        conexion.guardarHistorico(h3);
        conexion.guardarHistorico(h4);
        conexion.guardarHistorico(h5);
        conexion.guardarHistorico(h6);*/
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonSalas = new javax.swing.JButton();
        botonEmpleado = new javax.swing.JButton();
        botonPelis = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonReg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        botonSalas.setFont(new java.awt.Font("Magneto", 1, 24)); // NOI18N
        botonSalas.setText("Salas");
        botonSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalasActionPerformed(evt);
            }
        });

        botonEmpleado.setFont(new java.awt.Font("Magneto", 1, 24)); // NOI18N
        botonEmpleado.setText("Empleados");
        botonEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleadoActionPerformed(evt);
            }
        });

        botonPelis.setFont(new java.awt.Font("Magneto", 1, 24)); // NOI18N
        botonPelis.setText("Películas");
        botonPelis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPelisActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Magneto", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡Bienvenido!");

        botonReg.setFont(new java.awt.Font("Magneto", 1, 24)); // NOI18N
        botonReg.setText("Registros");
        botonReg.setActionCommand("Empleados");
        botonReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonReg, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(botonPelis, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPelis, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonReg, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalasActionPerformed
        AMB ambSalas = new AMB("sala");
        ambSalas.cambiarVentanaSalas();
        ambSalas.tablaResultados.hide();
        ambSalas.tablaResultadosSalas.show();
        ambSalas.tablaResultadosEmpleados.hide();
        ambSalas.eleccion=this;
        ambSalas.show();

        this.hide();
    }//GEN-LAST:event_botonSalasActionPerformed

    private void botonPelisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPelisActionPerformed

        AMB ambPelis = new AMB("pelicula");
        ambPelis.cambiarVentanaPelis();
        ambPelis.tablaResultados.show();
        ambPelis.tablaResultadosSalas.hide();
        ambPelis.tablaResultadosEmpleados.hide();
        ambPelis.eleccion=this;
        ambPelis.show();
        this.hide();
    }//GEN-LAST:event_botonPelisActionPerformed

    private void botonEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleadoActionPerformed
        AMB ambEmple = new AMB("empleado");
        ambEmple.cambiarVentanaEmpleadoss();
        ambEmple.tablaResultados.hide();
        ambEmple.tablaResultadosSalas.hide();
        ambEmple.tablaResultadosEmpleados.show();
        ambEmple.eleccion=this;
        ambEmple.show();
        this.hide();
    }//GEN-LAST:event_botonEmpleadoActionPerformed

    private void botonRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegActionPerformed
        HistoricoVentana historico = new HistoricoVentana();
        historico.show();
          this.hide();
    }//GEN-LAST:event_botonRegActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
           //volver a atras, dejando la anterior disponible OJO que se usa dispose por si se quiere acceder a otro local (bbdd)
        ventanaMain.setEnabled(true);
        ventanaMain.toFront();
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Eleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botonEmpleado;
    public static javax.swing.JButton botonPelis;
    public static javax.swing.JButton botonReg;
    public static javax.swing.JButton botonSalas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
