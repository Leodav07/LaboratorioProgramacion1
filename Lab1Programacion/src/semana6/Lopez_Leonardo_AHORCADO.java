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
        palabraOculta = new javax.swing.JLabel();
        letraBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ingresarLetra = new javax.swing.JButton();
        regresarBoton = new javax.swing.JButton();
        estado = new javax.swing.JLabel();
        oportunidad = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        panelCambiar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nuevaPalabra = new javax.swing.JTextField();
        reemplazarButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        antiguoArreglo = new javax.swing.JLabel();
        nuevoArreglo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

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
                        .addGap(168, 168, 168)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(cambiarButton)))
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jugarButton)
                .addGap(212, 212, 212))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(56, 56, 56)
                .addComponent(jugarButton)
                .addGap(36, 36, 36)
                .addComponent(cambiarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        panelPadre.add(panelMenu, "card4");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("AHORCADOS");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Ingresa una letra:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("ADIVINA PALABRA");

        ingresarLetra.setText("Ingresar");
        ingresarLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarLetraActionPerformed(evt);
            }
        });

        regresarBoton.setText("Regresar");
        regresarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelJugarLayout = new javax.swing.GroupLayout(panelJugar);
        panelJugar.setLayout(panelJugarLayout);
        panelJugarLayout.setHorizontalGroup(
            panelJugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJugarLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(panelJugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJugarLayout.createSequentialGroup()
                        .addGroup(panelJugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelJugarLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(letraBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(ingresarLetra)
                        .addGap(182, 182, 182))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJugarLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJugarLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJugarLayout.createSequentialGroup()
                        .addComponent(regresarBoton)
                        .addContainerGap())))
            .addGroup(panelJugarLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(panelJugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelJugarLayout.createSequentialGroup()
                        .addGroup(panelJugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oportunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(palabraOculta, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelJugarLayout.setVerticalGroup(
            panelJugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJugarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(panelJugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letraBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(ingresarLetra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(oportunidad)
                .addGap(20, 20, 20)
                .addComponent(estado)
                .addGap(18, 18, 18)
                .addComponent(palabraOculta)
                .addGap(44, 44, 44)
                .addComponent(regresarBoton)
                .addContainerGap())
        );

        panelPadre.add(panelJugar, "card2");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("CAMBIAR PALABRA");

        reemplazarButton.setText("Reemplazar");
        reemplazarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reemplazarButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Antiguo Listado");

        antiguoArreglo.setText(" ");

        nuevoArreglo.setText(" ");

        jLabel10.setText("Nuevo Listado");

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCambiarLayout = new javax.swing.GroupLayout(panelCambiar);
        panelCambiar.setLayout(panelCambiarLayout);
        panelCambiarLayout.setHorizontalGroup(
            panelCambiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCambiarLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addGroup(panelCambiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reemplazarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCambiarLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(panelCambiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCambiarLayout.createSequentialGroup()
                        .addGroup(panelCambiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nuevaPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCambiarLayout.createSequentialGroup()
                        .addGroup(panelCambiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nuevoArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(antiguoArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCambiarLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCambiarLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap())))
        );
        panelCambiarLayout.setVerticalGroup(
            panelCambiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCambiarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(nuevaPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reemplazarButton)
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(antiguoArreglo)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nuevoArreglo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
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
   String palabraActual="", palabraOcu="";
    private void jugarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarButtonActionPerformed
        // TODO add your handling code here:
        panelPadre.removeAll();
        panelPadre.add(panelJugar);
        panelPadre.repaint();
        panelPadre.revalidate();
        
        int numRandom = random.nextInt(1, 11);
       palabraActual = palabras[numRandom];
       palabraOcu = "";
        for(int i = 0; i<palabraActual.length(); i++){
            palabraOcu+="_"+" ";
        }
       
        palabraOculta.setText(palabraOcu);
        
        
    }//GEN-LAST:event_jugarButtonActionPerformed

    private void cambiarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarButtonActionPerformed
        // TODO add your handling code here:
         panelPadre.removeAll();
        panelPadre.add(panelCambiar);
        panelPadre.repaint();
        panelPadre.revalidate();
         String palabra ="";
        
      
        
    }//GEN-LAST:event_cambiarButtonActionPerformed
     int contador = 5;
    private void ingresarLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarLetraActionPerformed
      
        boolean oportunidades = false;
        String letraText = letraBox.getText().toUpperCase();
        
        if(letraText.length()!=1){
            errorLabel.setText("Ingrese solo 1 letra");
            letraBox.setText("");
            return;
        }
        String palabraOcultaActual = palabraOculta.getText();
        String[] textoOculto = palabraOcultaActual.split(" ");
        
        for(int i = 0; i<palabraActual.length();i++){
            if (String.valueOf(palabraActual.charAt(i)).equals(letraText)) {
            textoOculto[i] = letraText;
            oportunidad.setText("Oportunidad: "+contador);
            estado.setText("¡Le pegaste a un carácter!");
            oportunidades = true;
        }
        }
        
        if(!oportunidades){
            contador--;
            oportunidad.setText("Oportunidad: "+ contador);
            estado.setText("Incorrecto.");
        }
        
        if(contador == 0){
            oportunidad.setText("Sin oportunidades");
            estado.setText("No lograste adivinar la palabra");
            ingresarLetra.setEnabled(false);
        }
        
        String palabraResul = String.join(" ", textoOculto);
        palabraOculta.setText(palabraResul);
        
        String palabraComparar = palabraResul.replace(" ","");
        if(palabraComparar.equals(palabraActual)){
            estado.setText("¡Adivinaste la palabra, felicidades!");
            ingresarLetra.setEnabled(false);
        }
        letraBox.setText("");
        
    }//GEN-LAST:event_ingresarLetraActionPerformed

    private void regresarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBotonActionPerformed
       
        panelPadre.removeAll();
        panelPadre.add(panelMenu);
        panelPadre.repaint();
        panelPadre.revalidate();
        palabraOculta.setText("");
        letraBox.setText("");
        estado.setText("");
        contador = 5;
        ingresarLetra.setEnabled(true);
        oportunidad.setText("Oportunidad: "+contador);
    }//GEN-LAST:event_regresarBotonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       panelPadre.removeAll();
        panelPadre.add(panelMenu);
        panelPadre.repaint();
        panelPadre.revalidate();
        antiguoArreglo.setText("");
        nuevoArreglo.setText("");
        nuevaPalabra.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed
   
    private void reemplazarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reemplazarButtonActionPerformed
    
    }//GEN-LAST:event_reemplazarButtonActionPerformed

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
    private javax.swing.JLabel antiguoArreglo;
    private javax.swing.JButton cambiarButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel estado;
    private javax.swing.JButton ingresarLetra;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jugarButton;
    private javax.swing.JTextField letraBox;
    private javax.swing.JTextField nuevaPalabra;
    private javax.swing.JLabel nuevoArreglo;
    private javax.swing.JLabel oportunidad;
    private javax.swing.JLabel palabraOculta;
    private javax.swing.JPanel panelCambiar;
    private javax.swing.JPanel panelJugar;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPadre;
    private javax.swing.JButton reemplazarButton;
    private javax.swing.JButton regresarBoton;
    // End of variables declaration//GEN-END:variables
}
