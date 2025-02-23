/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ConfiguracoesCanaisTokenController;
import Helper.SelecionarCanalHelper;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author nicol
 */
public class ConfiguracoesCanaisToken extends javax.swing.JFrame {

    private final ConfiguracoesCanaisTokenController controller;

    /**
     * Creates new form MainLogin
     */
    public ConfiguracoesCanaisToken() {
        initComponents();
        controller = new ConfiguracoesCanaisTokenController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        minhaConta = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        salvarButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        editCanalToken = new javax.swing.JTextField();
        editToken = new javax.swing.JTextField();
        editIDToken = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configurações de Canais");
        setMaximumSize(new java.awt.Dimension(1365, 767));
        setMinimumSize(new java.awt.Dimension(850, 530));
        setPreferredSize(new java.awt.Dimension(1220, 692));

        jPanel3.setBackground(new java.awt.Color(255, 62, 21));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(45, 18, 75));
        jPanel2.setPreferredSize(new java.awt.Dimension(920, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/logo.png"))); // NOI18N
        jPanel5.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel12.setPreferredSize(new java.awt.Dimension(260, 30));

        minhaConta.setBackground(new java.awt.Color(255, 255, 255));
        minhaConta.setFont(new java.awt.Font("Inter", 1, 22)); // NOI18N
        minhaConta.setText("USER");
        minhaConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minhaContaMouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/logged.png"))); // NOI18N
        jLabel8.setText("jLabel7");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setOpaque(true);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minhaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minhaConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.add(jPanel12, java.awt.BorderLayout.LINE_END);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setToolTipText("");
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(920, 40));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel2.setText("Configurações de Canais");
        jPanel7.add(jLabel2, new java.awt.GridBagConstraints());

        jPanel6.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel3.setText("Canal:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 231, 0, 0);
        jPanel8.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel4.setText("Token:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 231, 0, 0);
        jPanel8.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel5.setText("Id da conta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 226, 0, 0);
        jPanel8.add(jLabel5, gridBagConstraints);

        salvarButton.setBackground(new java.awt.Color(252, 121, 0));
        salvarButton.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        salvarButton.setForeground(new java.awt.Color(255, 255, 255));
        salvarButton.setText("SALVAR");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 196, 0, 0);
        jPanel8.add(salvarButton, gridBagConstraints);

        voltarButton.setBackground(new java.awt.Color(45, 18, 75));
        voltarButton.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        voltarButton.setForeground(new java.awt.Color(255, 255, 255));
        voltarButton.setText("VOLTAR");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 88, 0, 0);
        jPanel8.add(voltarButton, gridBagConstraints);

        editCanalToken.setEditable(false);
        editCanalToken.setBackground(new java.awt.Color(217, 217, 217));
        editCanalToken.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        editCanalToken.setAutoscrolls(false);
        editCanalToken.setMaximumSize(new java.awt.Dimension(15, 27));
        editCanalToken.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 245;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 231, 0, 0);
        jPanel8.add(editCanalToken, gridBagConstraints);

        editToken.setBackground(new java.awt.Color(217, 217, 217));
        editToken.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        editToken.setAutoscrolls(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 245;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 231, 0, 0);
        jPanel8.add(editToken, gridBagConstraints);

        editIDToken.setBackground(new java.awt.Color(217, 217, 217));
        editIDToken.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        editIDToken.setAutoscrolls(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 245;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 226, 0, 275);
        jPanel8.add(editIDToken, gridBagConstraints);

        jPanel6.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minhaContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minhaContaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_minhaContaMouseClicked

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        this.controller.voltarSelecionarCanais();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        this.controller.acessarConfiguracoesAtivas();
    }//GEN-LAST:event_salvarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ConfiguracoesCanaisToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfiguracoesCanaisToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfiguracoesCanaisToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfiguracoesCanaisToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new ConfiguracoesCanaisToken().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField editCanalToken;
    private javax.swing.JTextField editIDToken;
    private javax.swing.JTextField editToken;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel minhaConta;
    private javax.swing.JButton salvarButton;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables

    public JTextField getEditIDToken() {
        return editIDToken;
    }

    public void setEditIDToken(JTextField editIDToken) {
        this.editIDToken = editIDToken;
    }

    public JTextField getEditToken() {
        return editToken;
    }

    public void setEditToken(JTextField editToken) {
        this.editToken = editToken;
    }

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null,mensagem);
    }


    public void exportar(SelecionarCanalHelper selecionarCanalHelper) {
        editCanalToken.setText(selecionarCanalHelper.getItemSelect());
    }

    public JTextField getEditCanalToken() {
        return editCanalToken;
    }

    public void setEditCanalToken(JTextField editCanalToken) {
        this.editCanalToken = editCanalToken;
    } 

    public JLabel getMinhaConta() {
        return minhaConta;
    }

    public void setMinhaConta(JLabel minhaConta) {
        this.minhaConta = minhaConta;
    }
    
    public void exportar2(SelecionarCanalHelper selecionarCanalHelper) {
        minhaConta.setText(selecionarCanalHelper.getUser());
    }
}
