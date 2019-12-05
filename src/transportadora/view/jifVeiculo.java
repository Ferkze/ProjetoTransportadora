/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora.view;

import dao.VeiculoData;
import javax.swing.JOptionPane;
import model.Veiculo;

/**
 *
 * @author Dell
 */
public class jifVeiculo extends javax.swing.JInternalFrame {

    private Veiculo obj;
    private VeiculoData DAO;
    /**
     * Creates new form jifManifesto
     */
    public jifVeiculo() {
        initComponents();
        estadoInicialCampos();
        obj = new Veiculo();
        try {
            DAO = new VeiculoData();
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
        jlDescricao = new javax.swing.JLabel();
        jtDescricao = new javax.swing.JTextField();
        jbNovo = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jlPlaca = new javax.swing.JLabel();
        jtPlaca = new javax.swing.JTextField();
        jtId = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Veículos");

        jlId.setText("Código");

        jlDescricao.setText("Descrição");

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

        jlPlaca.setText("Placa");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDescricao)
                    .addComponent(jlPlaca)
                    .addComponent(jlId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtDescricao)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar)
                    .addComponent(jbNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDescricao)
                    .addComponent(jtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPlaca)
                    .addComponent(jtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExcluir)
                    .addComponent(jbCancelar)
                    .addComponent(jbSalvar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            if (jtId.getText().equals("")) {
                jtId.requestFocus();
                JOptionPane.showMessageDialog(this, "Digite um código");
                return;
            }
            obj = DAO.buscar(Integer.parseInt(jtId.getText()));
            if (obj.getId() == 0) {
                JOptionPane.showMessageDialog(this, "Não encontrado");
                return;
            }
            atualizarCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao Buscar: " + e.getMessage(), "Buscar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        limparCampos();
        
        jtId.setText("0");

        jtId.setEnabled(false);
        jtPlaca.setEnabled(true);
        jtDescricao.setEnabled(true);

        jbBuscar.setEnabled(false);
        jbNovo.setEnabled(false);
        jbCancelar.setEnabled(true);
        jbExcluir.setEnabled(false);
        jbSalvar.setEnabled(true);
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        estadoInicialCampos();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        try {
            if (DAO.deletar(Integer.parseInt(jtId.getText()))) {
                JOptionPane.showMessageDialog(this, "Excluído com Sucesso!");
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao Excluir");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao Excluir: " + e.getMessage(), "Excluir", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        try {
            if (validarCampos()) {
                preencherObjeto();
                if (obj.getId() > 0) {
                    if (DAO.editar(obj)) {
                        JOptionPane.showMessageDialog(this, "Editado com Sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao Editar");
                    }
                } else {
                    obj = DAO.inserir(obj);
                    if (obj.getId() != 0) {
                        atualizarCampos();
                        JOptionPane.showMessageDialog(this, "Salvo com Sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao Salvar");
                    }
                }
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao Salvar: " + e.getMessage(), "Salvar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlPlaca;
    private javax.swing.JTextField jtDescricao;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtPlaca;
    // End of variables declaration//GEN-END:variables
    
    public void atualizarCampos() {
        jtId.setText(obj.getId()+"");
        jtPlaca.setText(obj.getNumeroPlaca());
        jtDescricao.setText(obj.getDesc());
            
        jtId.setEnabled(false);
        jtPlaca.setEnabled(true);
        jtDescricao.setEnabled(true);

        jbBuscar.setEnabled(false);
        jbNovo.setEnabled(false);
        jbCancelar.setEnabled(true);
        jbExcluir.setEnabled(true);
        jbSalvar.setEnabled(true);
    }
    
    private void estadoInicialCampos() {
        limparCampos();

        jtId.setEnabled(true);
        jtPlaca.setEnabled(false);
        jtDescricao.setEnabled(false);
        
        jbBuscar.setEnabled(true);
        jbNovo.setEnabled(true);
        jbCancelar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbSalvar.setEnabled(false);
    }
    
    private void limparCampos() {
        jtId.setText("");
        jtPlaca.setText("");
        jtDescricao.setText("");
    }

    private void preencherObjeto() {
        obj.setId(Integer.parseInt(jtId.getText()));
        obj.setNumeroPlaca(jtPlaca.getText());
        obj.setDesc(jtDescricao.getText());
    }

    private boolean validarCampos() {
        if (jtDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite uma descrição para o veículo");
            jtDescricao.requestFocus();
            return false;
        }
        if (jtPlaca.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite um valor para a placa no formato AAA-1234");
            jtPlaca.requestFocus();
            return false;
        }
        return true;
    }
}
