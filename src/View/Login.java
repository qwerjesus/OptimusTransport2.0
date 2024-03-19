
package View;
import java.applet.AudioClip;

public class Login extends javax.swing.JFrame {

   int xMouse,yMouse;
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.Infoyin.setVisible(false);
         this.regresar.setVisible(false);
        
         AudioClip musica;
        musica = java.applet.Applet.newAudioClip(getClass().getResource("/sonido/cancion.wav"));
        musica.play();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Infoyin = new javax.swing.JPanel();
        regresar = new javax.swing.JButton();
        desactivarso = new javax.swing.JButton();
        activarso = new javax.swing.JButton();
        invitados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JTextField();
        X = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        iniciarsesion = new javax.swing.JButton();
        info = new javax.swing.JButton();
        fondoL = new javax.swing.JLabel();
        CURSOR = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Infoyin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regreso.png"))); // NOI18N
        regresar.setBorder(null);
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        Infoyin.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 40, 40));

        desactivarso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sonido 2.png"))); // NOI18N
        desactivarso.setBorder(null);
        desactivarso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desactivarso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desactivarsoActionPerformed(evt);
            }
        });
        Infoyin.add(desactivarso, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 40, 40));

        activarso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sonido 1.png"))); // NOI18N
        activarso.setBorder(null);
        activarso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        activarso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activarsoActionPerformed(evt);
            }
        });
        Infoyin.add(activarso, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 40, 40));

        invitados.setBackground(new java.awt.Color(255, 255, 255));
        invitados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/invitados.png"))); // NOI18N
        invitados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        invitados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invitadosActionPerformed(evt);
            }
        });
        Infoyin.add(invitados, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/informaci.png"))); // NOI18N
        jLabel1.setText("fonodoin");
        Infoyin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 220, 500));

        jPanel1.add(Infoyin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 490));

        usuario.setBackground(new java.awt.Color(255, 255, 255));
        usuario.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 0, 0));
        usuario.setToolTipText("");
        usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 170, 30));

        contraseña.setBackground(new java.awt.Color(255, 255, 255));
        contraseña.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        contraseña.setForeground(new java.awt.Color(0, 0, 0));
        contraseña.setToolTipText("");
        contraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 170, 30));

        X.setBackground(new java.awt.Color(255, 255, 255));
        X.setForeground(new java.awt.Color(0, 0, 0));
        X.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SALIIR.png"))); // NOI18N
        X.setBorder(null);
        X.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });
        jPanel1.add(X, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 50, 50));

        registrar.setBackground(new java.awt.Color(255, 255, 255));
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/REGISTRAR.png"))); // NOI18N
        registrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        jPanel1.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        iniciarsesion.setBackground(new java.awt.Color(255, 255, 255));
        iniciarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/INIciar.png"))); // NOI18N
        iniciarsesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        iniciarsesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarsesionActionPerformed(evt);
            }
        });
        jPanel1.add(iniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/info.png"))); // NOI18N
        info.setBorder(null);
        info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });
        jPanel1.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        fondoL.setBackground(new java.awt.Color(255, 255, 255));
        fondoL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Usuario_1.png"))); // NOI18N
        fondoL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(fondoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 620, 530));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
      System.exit(0);
    }//GEN-LAST:event_XActionPerformed

    private void CURSORMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CURSORMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_CURSORMouseDragged

    private void CURSORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CURSORMouseClicked

    }//GEN-LAST:event_CURSORMouseClicked

    private void CURSORMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CURSORMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
        

    }//GEN-LAST:event_CURSORMousePressed

    private void iniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarsesionActionPerformed
      Conductor con = new Conductor();
      String ingresar = usuario.getText();
      String contra = contraseña.getText();
       if (ingresar.contentEquals("conductor") && contra.contentEquals("admin")){
           con.setVisible(true);
           this.dispose();
       }
    }//GEN-LAST:event_iniciarsesionActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
       Registrar registra = new Registrar();
       registra.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_registrarActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
    this.Infoyin.setVisible(true);
    this.regresar.setVisible(true);
    }//GEN-LAST:event_infoActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
         this.Infoyin.setVisible(false);
         this.regresar.setVisible(false);      
    }//GEN-LAST:event_regresarActionPerformed

    private void invitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invitadosActionPerformed
       Sinregistrar sr = new Sinregistrar();
       sr.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_invitadosActionPerformed

    private void desactivarsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desactivarsoActionPerformed
             this.activarso.setVisible(true);
              this.desactivarso.setVisible(false);
              AudioClip musica;
        musica = java.applet.Applet.newAudioClip(getClass().getResource("/sonido/cancion.wav"));
        musica.stop();
    }//GEN-LAST:event_desactivarsoActionPerformed

    private void activarsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activarsoActionPerformed
       this.desactivarso.setVisible(true);
       this.activarso.setVisible(false);
        AudioClip musica;
        musica = java.applet.Applet.newAudioClip(getClass().getResource("/sonido/cancion.wav"));
        musica.play();
    }//GEN-LAST:event_activarsoActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CURSOR;
    private javax.swing.JPanel Infoyin;
    private javax.swing.JButton X;
    private javax.swing.JButton activarso;
    private javax.swing.JTextField contraseña;
    private javax.swing.JButton desactivarso;
    private javax.swing.JLabel fondoL;
    private javax.swing.JButton info;
    private javax.swing.JButton iniciarsesion;
    private javax.swing.JButton invitados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registrar;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
