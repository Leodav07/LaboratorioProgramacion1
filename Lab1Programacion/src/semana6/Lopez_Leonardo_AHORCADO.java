/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package semana6;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author hnleo
 */
public class Lopez_Leonardo_AHORCADO extends javax.swing.JFrame {

    
    public Lopez_Leonardo_AHORCADO() {
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelPadre = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jugarButton = new javax.swing.JButton();
        cambiarButton = new javax.swing.JButton();
        panelJugar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelCambiar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPadre.setLayout(new java.awt.CardLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("AHORCADOS");

        jugarButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jugarButton.setText("Jugar");
        jugarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarButtonActionPerformed(evt);
            }
        });

        cambiarButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cambiarButton.setText("Cambiar Palabras");
        cambiarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(cambiarButton))))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jugarButton)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addGap(46, 46, 46)
                .addComponent(jugarButton)
                .addGap(44, 44, 44)
                .addComponent(cambiarButton)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        panelPadre.add(panelMenu, "card4");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("AHORCADOS");

        javax.swing.GroupLayout panelJugarLayout = new javax.swing.GroupLayout(panelJugar);
        panelJugar.setLayout(panelJugarLayout);
        panelJugarLayout.setHorizontalGroup(
            panelJugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJugarLayout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        panelJugarLayout.setVerticalGroup(
            panelJugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJugarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addContainerGap(289, Short.MAX_VALUE))
        );

        panelPadre.add(panelJugar, "card2");

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout panelCambiarLayout = new javax.swing.GroupLayout(panelCambiar);
        panelCambiar.setLayout(panelCambiarLayout);
        panelCambiarLayout.setHorizontalGroup(
            panelCambiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCambiarLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(268, Short.MAX_VALUE))
        );
        panelCambiarLayout.setVerticalGroup(
            panelCambiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCambiarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(290, Short.MAX_VALUE))
        );

        panelPadre.add(panelCambiar, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPadre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPadre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    String[] palabras = {"EDUCACION", "PLAYA", "METODOS", "APODO", "COMPUTADORA", "SISTEMA", "VIRTUAL", "LAPTOP", "LEONARDO", "PROGRAMACION"};
   Random random = new Random();
   Scanner leer = new Scanner(System.in);
   
    private void jugarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarButtonActionPerformed
        // TODO add your handling code here:
        panelPadre.removeAll();
        panelPadre.add(panelJugar);
        panelPadre.repaint();
        panelPadre.revalidate();
        
        int numRandom = random.nextInt(1, 11);
        String numActual = "";
        palabras[numRandom] = numActual;
        
    }//GEN-LAST:event_jugarButtonActionPerformed

    private void cambiarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarButtonActionPerformed
        // TODO add your handling code here:
         panelPadre.removeAll();
        panelPadre.add(panelJugar);
      
        
    }//GEN-LAST:event_cambiarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Lopez_Leonardo_AHORCADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lopez_Leonardo_AHORCADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lopez_Leonardo_AHORCADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lopez_Leonardo_AHORCADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lopez_Leonardo_AHORCADO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambiarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jugarButton;
    private javax.swing.JPanel panelCambiar;
    private javax.swing.JPanel panelJugar;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPadre;
    // End of variables declaration//GEN-END:variables
}
