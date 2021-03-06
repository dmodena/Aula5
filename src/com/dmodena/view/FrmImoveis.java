/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view;

import com.dmodena.model.Imovel;
import com.dmodena.model.Apartamento;
import com.dmodena.model.Chacara;
import com.dmodena.model.Loja;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Aluno
 */
public class FrmImoveis extends javax.swing.JFrame {
    private ArrayList<Imovel> imoveis;
    private DefaultListModel<String> modelImoveis;
    
    /**
     * Creates new form FrmImoveis
     */
    public FrmImoveis() {
        initComponents();
        btnApartamento.setSelected(true);
        imoveis = new ArrayList<>();
        modelImoveis = new DefaultListModel<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupTipoImovel = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfIdentificacao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnApartamento = new javax.swing.JRadioButton();
        btnChacara = new javax.swing.JRadioButton();
        btnLoja = new javax.swing.JRadioButton();
        lblAtributoExtra = new javax.swing.JLabel();
        tfAtributoExtra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstImoveis = new javax.swing.JList();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Imóvel"));

        jLabel1.setText("Identificacao");

        jLabel2.setText("Endereço");

        jLabel3.setText("Tipo de Imóvel");

        btnGroupTipoImovel.add(btnApartamento);
        btnApartamento.setText("Apartamento");
        btnApartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApartamentoActionPerformed(evt);
            }
        });

        btnGroupTipoImovel.add(btnChacara);
        btnChacara.setText("Chácara");
        btnChacara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChacaraActionPerformed(evt);
            }
        });

        btnGroupTipoImovel.add(btnLoja);
        btnLoja.setText("Loja");
        btnLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLojaActionPerformed(evt);
            }
        });

        lblAtributoExtra.setText("Número de Quartos");

        jScrollPane1.setViewportView(lstImoveis);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnApartamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnChacara)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLoja))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(tfIdentificacao))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAtributoExtra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAtributoExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(btnCadastrar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnApartamento)
                    .addComponent(btnChacara)
                    .addComponent(btnLoja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAtributoExtra)
                    .addComponent(tfAtributoExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnApartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApartamentoActionPerformed
        lblAtributoExtra.setText("Número de Quartos");
    }//GEN-LAST:event_btnApartamentoActionPerformed

    private void btnChacaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChacaraActionPerformed
        lblAtributoExtra.setText("Número de Participantes");
    }//GEN-LAST:event_btnChacaraActionPerformed

    private void btnLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLojaActionPerformed
        lblAtributoExtra.setText("Metros Quadrados");
    }//GEN-LAST:event_btnLojaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        modelImoveis.clear();
        
        if(btnApartamento.isSelected()){
            Apartamento i = new Apartamento(tfIdentificacao.getText(), tfEndereco.getText(), Integer.parseInt(tfAtributoExtra.getText()));
            imoveis.add(i);
        }
        else if(btnChacara.isSelected()) {
            Chacara i = new Chacara(tfIdentificacao.getText(), tfEndereco.getText(), Integer.parseInt(tfAtributoExtra.getText()));
            imoveis.add(i);
        }
        else {
            Loja i = new Loja(tfIdentificacao.getText(), tfEndereco.getText(), Integer.parseInt(tfAtributoExtra.getText()));
            imoveis.add(i);
        }
        
        for(Imovel im : imoveis) {            
            modelImoveis.addElement(im.toString());
        }
        
        lstImoveis.setModel(modelImoveis);
        
        limparCampos();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void limparCampos() {
        tfIdentificacao.setText("");
        tfEndereco.setText("");
        btnApartamento.setSelected(true);
        tfAtributoExtra.setText("");
        tfIdentificacao.requestFocus();
    }
    
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
            java.util.logging.Logger.getLogger(FrmImoveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmImoveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmImoveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmImoveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmImoveis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnApartamento;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JRadioButton btnChacara;
    private javax.swing.ButtonGroup btnGroupTipoImovel;
    private javax.swing.JRadioButton btnLoja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAtributoExtra;
    private javax.swing.JList lstImoveis;
    private javax.swing.JTextField tfAtributoExtra;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfIdentificacao;
    // End of variables declaration//GEN-END:variables
}
