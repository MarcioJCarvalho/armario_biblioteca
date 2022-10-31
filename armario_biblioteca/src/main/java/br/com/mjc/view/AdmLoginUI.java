package br.com.mjc.view;

import br.com.mjc.controller.AdminController;
import br.com.mjc.dto.AdminDTO;
import br.com.mjc.enums.Retorno;

import javax.swing.JOptionPane;

public class AdmLoginUI extends javax.swing.JFrame {
    private AdminController adminController;
    public AdmLoginUI() {
        initComponents();
        initComplements();
    }

    private void initComplements(){
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtSiape = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnBibliotecarioLoginCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(247, 247, 247));

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel1.setText("BIBLIOTECÁRIO");

        jLabel2.setText("Siape:");

        jLabel3.setText("Senha:");

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("Criar cadastro?");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnBibliotecarioLoginCancelar.setBackground(new java.awt.Color(255, 204, 204));
        btnBibliotecarioLoginCancelar.setText("Cancelar");
        btnBibliotecarioLoginCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBibliotecarioLoginCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBibliotecarioLoginCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(txtSiape)
                            .addComponent(jLabel3)
                            .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSiape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnBibliotecarioLoginCancelar))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String senha = new String(txtSenha.getPassword());

        AdminDTO adminDTO = new AdminDTO();
        adminDTO.setSenha(senha);
        adminDTO.setEmail(txtSiape.getText());
        adminController.logar(adminDTO);
        if(adminController.logar(adminDTO).getStatus().equals("SUCESSO")){
            new AdmMenuUI().setVisible(true);
            new AdmLoginUI().setVisible(false);
            new MainMenuUI().setVisible(false);
            dispose();
        }

//        if (adminController.logar(adminDTO) != null) {
//            JOptionPane.showMessageDialog(null, adminController.logar(txtSiape.getText(), senha), "Erro!", JOptionPane.ERROR_MESSAGE);
//        }else{
//            new AdmMenuUI().setVisible(true);
//            new AdmLoginUI().setVisible(false);
//            new MainMenuUI().setVisible(false);
//            dispose();
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBibliotecarioLoginCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBibliotecarioLoginCancelarActionPerformed
        new AdmLoginUI().setVisible(false);
        dispose(); 
    }//GEN-LAST:event_btnBibliotecarioLoginCancelarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBibliotecarioLoginCancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSiape;
    // End of variables declaration//GEN-END:variables
}
