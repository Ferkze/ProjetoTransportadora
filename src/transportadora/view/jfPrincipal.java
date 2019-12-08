
package transportadora.view;

import model.Usuario;

public class jfPrincipal extends javax.swing.JFrame {

    private Usuario usuario;
    
    public jfPrincipal() {
        initComponents();
        jifLogin janela = new jifLogin(this);
        jdpPrincipal.add(janela);
        janela.setVisible(true);
        janela.setClosable(false);
        jbCTRC.setEnabled(false);
        jbManifesto.setEnabled(false);
        jbCliente.setEnabled(false);
        jbSair.setEnabled(false);
        jbVeiculo.setEnabled(false);
        jbMotorista.setEnabled(false);
    }
    public jfPrincipal(Usuario u) {
        initComponents();
        jlLogin.setText("Logado como "+u.getApelido());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jbManifesto = new javax.swing.JButton();
        jbCTRC = new javax.swing.JButton();
        jbCliente = new javax.swing.JButton();
        jbMotorista = new javax.swing.JButton();
        jbVeiculo = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jlLogin = new java.awt.Label();

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

        jbCliente.setText("Cliente");
        jbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClienteActionPerformed(evt);
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

        jbSair.setBackground(new java.awt.Color(255, 51, 51));
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCTRC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbManifesto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jdpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbManifesto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbCTRC, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSair)))
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

    private void jbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClienteActionPerformed
      jifCliente janela = new jifCliente();
      jdpPrincipal.add(janela);
      janela.setVisible(true);
    }//GEN-LAST:event_jbClienteActionPerformed

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

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        jfPrincipal f = new jfPrincipal();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

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
    private javax.swing.JButton jbCliente;
    private javax.swing.JButton jbManifesto;
    private javax.swing.JButton jbMotorista;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbVeiculo;
    private javax.swing.JDesktopPane jdpPrincipal;
    private java.awt.Label jlLogin;
    // End of variables declaration//GEN-END:variables
}
