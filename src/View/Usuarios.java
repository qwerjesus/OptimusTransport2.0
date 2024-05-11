package View;

import View.*;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import config.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;

public class Usuarios extends javax.swing.JFrame {

   Conexion con1 = new Conexion();
   Connection conet;
   DefaultTableModel modelo;
   Statement st;
   ResultSet rs;
   
    
   
    int xMouse, yMouse;

    public Usuarios() {
        
        initComponents();
        this.setLocationRelativeTo(null);
  setIconImage(new ImageIcon(getClass().getResource("/imagenes/newlogo.png")).getImage());
         this.Soli.setVisible(false);
        this.vertable.setVisible(false);
        this.aceptar.setVisible(false);
        this.rechazar.setVisible(false);
        consultar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rechazar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        vertable = new javax.swing.JButton();
        versolicitudes = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        Soli = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Tablausu = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        fondoL = new javax.swing.JLabel();
        CURSOR = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rechazar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rechazar.png"))); // NOI18N
        rechazar.setBorder(null);
        rechazar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rechazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechazarActionPerformed(evt);
            }
        });
        jPanel1.add(rechazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 100, -1));

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        eliminar.setBorder(null);
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 100, -1));

        vertable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Vertablausu.png"))); // NOI18N
        vertable.setBorder(null);
        vertable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vertable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vertableActionPerformed(evt);
            }
        });
        jPanel1.add(vertable, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, -1));

        versolicitudes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/versolicitar.png"))); // NOI18N
        versolicitudes.setBorder(null);
        versolicitudes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        versolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                versolicitudesActionPerformed(evt);
            }
        });
        jPanel1.add(versolicitudes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, -1));

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar2.png"))); // NOI18N
        guardar.setBorder(null);
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 100, -1));

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar (2).png"))); // NOI18N
        regresar.setBorder(null);
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 100, -1));

        aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Aceptar.png"))); // NOI18N
        aceptar.setBorder(null);
        aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        jPanel1.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 100, -1));

        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        modificar.setBorder(null);
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPanel1.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 100, -1));

        Table.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "SOLICITUD"
            }
        ));
        Table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Soli.setViewportView(Table);

        jPanel1.add(Soli, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 420, 440));

        jTable1.setFont(new java.awt.Font("Open Sans", 1, 10)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOMBRE", "CONTRASEÑA", "ROL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Tablausu.setViewportView(jTable1);

        jPanel1.add(Tablausu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 420, 440));

        fondoL.setBackground(new java.awt.Color(255, 255, 255));
        fondoL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MYE.png"))); // NOI18N
        fondoL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(fondoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 620, 540));

        CURSOR.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                CURSORMouseDragged(evt);
            }
        });
        CURSOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CURSORMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CURSORMousePressed(evt);
            }
        });
        jPanel1.add(CURSOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CURSORMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CURSORMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_CURSORMouseDragged

    private void CURSORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CURSORMouseClicked

    }//GEN-LAST:event_CURSORMouseClicked

    private void CURSORMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CURSORMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();


    }//GEN-LAST:event_CURSORMousePressed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

    }//GEN-LAST:event_guardarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        Admin verA = new Admin();
        verA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed

    }//GEN-LAST:event_modificarActionPerformed

    private void versolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_versolicitudesActionPerformed
        this.Soli.setVisible(true);
        this.Tablausu.setVisible(false);
        this.vertable.setVisible(true);
        this.aceptar.setVisible(true);
        this.rechazar.setVisible(true);
        this.aceptar.setVisible(true);
        this.modificar.setVisible(false);
        this.eliminar.setVisible(false);
    }//GEN-LAST:event_versolicitudesActionPerformed

    private void vertableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vertableActionPerformed
        this.vertable.setVisible(false);
        this.Soli.setVisible(false);
        this.Tablausu.setVisible(true);
        this.aceptar.setVisible(false);
        this.rechazar.setVisible(false);
        this.modificar.setVisible(true);
        this.eliminar.setVisible(true);
    }//GEN-LAST:event_vertableActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aceptarActionPerformed

    private void rechazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechazarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rechazarActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }
    
    void consultar(){
        String sql="SELECT * FROM `datosu` WHERE 1";
        
        try {
            conet= con1.gConnection();
            st=conet.createStatement();
            rs=st.executeQuery(sql);
            Object[] datos = new Object[3];
            modelo=(DefaultTableModel) Table.getModel();
            while (rs.next()) {                
                datos [0] = rs.getInt("ID");
                datos [1] = rs.getString("NOMBRE");
                datos [2] = rs.getString("SOLICITUD");
                
                modelo.addRow(datos);
            }
            Table.setModel(modelo);
            
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CURSOR;
    private javax.swing.JScrollPane Soli;
    private javax.swing.JScrollPane Tablausu;
    private javax.swing.JTable Table;
    private javax.swing.JButton aceptar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel fondoL;
    private javax.swing.JButton guardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modificar;
    private javax.swing.JButton rechazar;
    private javax.swing.JButton regresar;
    private javax.swing.JButton versolicitudes;
    private javax.swing.JButton vertable;
    // End of variables declaration//GEN-END:variables

}
