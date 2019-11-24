
package transportadora.view;

import dao.CTRCData;
import javax.swing.JOptionPane;
import model.CTRC;


public class jifCTRC extends javax.swing.JInternalFrame {

    private CTRC ctrc;
    private CTRCData DAO;
    /**
     * Creates new form jifManifesto
     */
    public jifCTRC() {
        initComponents();
        estadoInicialCampos();
        ctrc = new CTRC();
        try {
            DAO = new CTRCData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlId = new javax.swing.JLabel();
        jlCliReme = new javax.swing.JLabel();
        jtCliReme = new javax.swing.JTextField();
        jbNovo = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jlCliDest = new javax.swing.JLabel();
        jtCliDest = new javax.swing.JTextField();
        jlDataEmissao = new javax.swing.JLabel();
        jlPesoFrete = new javax.swing.JLabel();
        jlValorFrete = new javax.swing.JLabel();
        jtDataEmissao = new javax.swing.JTextField();
        jtPesoFrete = new javax.swing.JTextField();
        jtValorFrete = new javax.swing.JTextField();
        jtId = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("CTRCs");

        jlId.setText("Código");

        jlCliReme.setText("Cliente Remetente");

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jlCliDest.setText("Cliente Destinatário");

        jlDataEmissao.setText("Data de Emissão");

        jlPesoFrete.setText("Peso do Frete");

        jlValorFrete.setText("Valor do Frete");

        jtId.setColumns(6);

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDataEmissao)
                            .addComponent(jlCliDest)
                            .addComponent(jlValorFrete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jlPesoFrete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtPesoFrete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtCliDest)
                            .addComponent(jtValorFrete, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCliReme)
                            .addComponent(jlId))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCliReme))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jbBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbSalvar)))
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCliReme)
                    .addComponent(jtCliReme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCliDest)
                    .addComponent(jtCliDest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDataEmissao)
                    .addComponent(jlPesoFrete)
                    .addComponent(jtPesoFrete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlValorFrete)
                    .addComponent(jtValorFrete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo)
                    .addComponent(jbCancelar)
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEditar)
                    .addComponent(jbExcluir)
                    .addComponent(jbSalvar))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        try {
            if (validarCampos()) {
                preencherObjeto();
                if (DAO.inserir(ctrc)) {
                    JOptionPane.showMessageDialog(this, "Salvo com Sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao Salvar");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao Salvar: " + e.getMessage(), "Salvar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            ctrc = DAO.buscar(Integer.parseInt(jtId.getText()));
            atualizarCampos();
            
            jtId.setEnabled(false);
            jtCliDest.setEnabled(true);
            jtCliReme.setEnabled(true);
            jtDataEmissao.setEnabled(true);
            jtPesoFrete.setEnabled(true);
            jtValorFrete.setEnabled(true);

            jbBuscar.setEnabled(false);
            jbNovo.setEnabled(false);
            jbCancelar.setEnabled(true);
            jbEditar.setEnabled(true);
            jbExcluir.setEnabled(true);
            jbSalvar.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao Buscar: " + e.getMessage(), "Buscar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        try {
            if (DAO.deletar(Integer.parseInt(jtId.getText()))) {
                JOptionPane.showMessageDialog(this, "Salvo com Sucesso!");
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao Excluir");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao Excluir: " + e.getMessage(), "Excluir", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        try {
            if (validarCampos()) {
                preencherObjeto();
                if (DAO.editar(ctrc)) {
                    JOptionPane.showMessageDialog(this, "Editad com Sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao Editar");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao Editar: " + e.getMessage(), "Editar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        estadoInicialCampos();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        limparCampos();
        
        jtId.setText("0");

        jtId.setEnabled(false);
        jtCliDest.setEnabled(true);
        jtCliReme.setEnabled(true);
        jtDataEmissao.setEnabled(true);
        jtPesoFrete.setEnabled(true);
        jtValorFrete.setEnabled(true);

        jbBuscar.setEnabled(false);
        jbNovo.setEnabled(false);
        jbCancelar.setEnabled(true);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbSalvar.setEnabled(true);
    }//GEN-LAST:event_jbNovoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlCliDest;
    private javax.swing.JLabel jlCliReme;
    private javax.swing.JLabel jlDataEmissao;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlPesoFrete;
    private javax.swing.JLabel jlValorFrete;
    private javax.swing.JTextField jtCliDest;
    private javax.swing.JTextField jtCliReme;
    private javax.swing.JTextField jtDataEmissao;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtPesoFrete;
    private javax.swing.JTextField jtValorFrete;
    // End of variables declaration//GEN-END:variables
    
    public void atualizarCampos() {
        jtId.setText(ctrc.getId()+"");
        jtCliDest.setText(ctrc.getNomeDest());
        jtCliReme.setText(ctrc.getNomeReme());
        jtDataEmissao.setText(ctrc.getDataEmissao());
        jtPesoFrete.setText(ctrc.getPeso()+"");
        jtValorFrete.setText(ctrc.getValor()+"");
    }
    
    private void estadoInicialCampos() {
        limparCampos();

        jtId.setEnabled(true);
        jtCliDest.setEnabled(false);
        jtCliReme.setEnabled(false);
        jtDataEmissao.setEnabled(false);
        jtPesoFrete.setEnabled(false);
        jtValorFrete.setEnabled(false);
        
        jbBuscar.setEnabled(true);
        jbNovo.setEnabled(true);
        jbCancelar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbSalvar.setEnabled(false);
    }
    
    private void limparCampos() {
        jtId.setText("");
        jtCliDest.setText("");
        jtCliReme.setText("");
        jtDataEmissao.setText("");
        jtPesoFrete.setText("");
        jtValorFrete.setText("");
    }

    private void preencherObjeto() {
        ctrc.setNomeDest(jtCliDest.getText());
        ctrc.setNomeReme(jtCliReme.getText());
        ctrc.setDataEmissao(jtDataEmissao.getText());
        ctrc.setPeso(Integer.parseInt(jtPesoFrete.getText()));
        ctrc.setValor(Float.parseFloat(jtValorFrete.getText()));
    }

    private boolean validarCampos() {
        if (jtCliDest.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite a Filial de Origem");
            jtCliDest.requestFocus();
            return false;
        }
        if (jtCliReme.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite a Filial de Destino");
            jtCliReme.requestFocus();
            return false;
        }
        if (!jtDataEmissao.getText().matches("^\\d{4}-\\d{2}-\\d{2}$")) {
            JOptionPane.showMessageDialog(this, "Digite a data no formado AAAA-MM-DD");
            jtDataEmissao.requestFocus();
            return false;
        }
        if (Integer.parseInt(jtPesoFrete.getText()) <= 0) {
            JOptionPane.showMessageDialog(this, "Digite peso em gramas");
            jtPesoFrete.requestFocus();
            return false;
        }
        if (Float.parseFloat(jtValorFrete.getText()) < 0) {
            JOptionPane.showMessageDialog(this, "Digite um valor maior ou igual a zero");
            jtValorFrete.requestFocus();
            return false;
        }
        return true;
    }
}
