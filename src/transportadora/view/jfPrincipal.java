
package transportadora.view;

public class jfPrincipal extends javax.swing.JFrame {

    
    public jfPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jbManifesto = new javax.swing.JButton();
        jbCTRC = new javax.swing.JButton();
        jbCliReme = new javax.swing.JButton();
        jbCliDest = new javax.swing.JButton();
        jbMotorista = new javax.swing.JButton();
        jbVeiculo = new javax.swing.JButton();
        jbVeiculo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROJETO TRANSPORTADORA");

        jdpPrincipal.setPreferredSize(new java.awt.Dimension(1380, 800));

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1380, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jbManifesto.setText("Manifesto");
        jbManifesto.setActionCommand("");
        jbManifesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbManifestoActionPerformed(evt);
            }
        });

        jbCTRC.setText("CTRC");
        jbCTRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCTRCActionPerformed(evt);
            }
        });

        jbCliReme.setText("Cliente Remetente");
        jbCliReme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCliRemeActionPerformed(evt);
            }
        });

        jbCliDest.setText("Cliente Destinatário");
        jbCliDest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCliDestActionPerformed(evt);
            }
        });

        jbMotorista.setText("Motorista");
        jbMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMotoristaActionPerformed(evt);
            }
        });

        jbVeiculo.setText("Veículo");
        jbVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVeiculoActionPerformed(evt);
            }
        });

        jbVeiculo1.setText("Relatório");
        jbVeiculo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVeiculo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCliReme, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCliDest, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCTRC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbManifesto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVeiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jdpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbManifesto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbCTRC, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jbCliReme, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jbCliDest, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jbMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jbVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jbVeiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbManifestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbManifestoActionPerformed
      jifManifesto janela = new jifManifesto();
      jdpPrincipal.add(janela);
      janela.setVisible(true);
    }//GEN-LAST:event_jbManifestoActionPerformed

    private void jbCTRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCTRCActionPerformed
      jifCTRC janela = new jifCTRC();
      jdpPrincipal.add(janela);
      janela.setVisible(true);
    }//GEN-LAST:event_jbCTRCActionPerformed

    private void jbCliRemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCliRemeActionPerformed
      jifClienteRemetente janela = new jifClienteRemetente();
      jdpPrincipal.add(janela);
      janela.setVisible(true);
    }//GEN-LAST:event_jbCliRemeActionPerformed

    private void jbCliDestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCliDestActionPerformed
      jifClienteDestinatario janela = new jifClienteDestinatario();
      jdpPrincipal.add(janela);
      janela.setVisible(true);
    }//GEN-LAST:event_jbCliDestActionPerformed

    private void jbMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMotoristaActionPerformed
      jifMotorista janela = new jifMotorista();
      jdpPrincipal.add(janela);
      janela.setVisible(true); 
    }//GEN-LAST:event_jbMotoristaActionPerformed

    private void jbVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVeiculoActionPerformed
      jifVeiculo janela = new jifVeiculo();
      jdpPrincipal.add(janela);
      janela.setVisible(true);
    }//GEN-LAST:event_jbVeiculoActionPerformed

    private void jbVeiculo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVeiculo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbVeiculo1ActionPerformed

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
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCTRC;
    private javax.swing.JButton jbCliDest;
    private javax.swing.JButton jbCliReme;
    private javax.swing.JButton jbManifesto;
    private javax.swing.JButton jbMotorista;
    private javax.swing.JButton jbVeiculo;
    private javax.swing.JButton jbVeiculo1;
    private javax.swing.JDesktopPane jdpPrincipal;
    // End of variables declaration//GEN-END:variables
}
