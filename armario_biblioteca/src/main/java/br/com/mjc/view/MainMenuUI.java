package br.com.mjc.view;
import br.com.mjc.view.login.AdmLoginUI;
import br.com.mjc.controller.EmprestimoController;

import javax.swing.*;

public class MainMenuUI extends javax.swing.JFrame {
    
    public MainMenuUI() {
        initComponents();
        initComplements();
        setExtendedState(MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top = new javax.swing.JPanel();
        rigthSide = new javax.swing.JPanel();
        footer = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        leftSide = new javax.swing.JPanel();
        bodyArea = new javax.swing.JPanel();
        emprestimoArea = new javax.swing.JPanel();
        admLogin = new javax.swing.JPanel();
        btnAdmLogin = new javax.swing.JButton();
        titleAdm = new javax.swing.JLabel();
        emprestimoForm = new javax.swing.JPanel();
        titleLogin = new javax.swing.JLabel();
        labelArmario = new javax.swing.JLabel();
        txtArmario = new javax.swing.JTextField();
        labelRa = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnEmprestar = new javax.swing.JButton();
        btnDevolver = new javax.swing.JButton();
        labelSenha = new javax.swing.JLabel();
        txtRa = new javax.swing.JTextField();
        imgArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MenuPrincipal");
        setName("frame"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1229, Short.MAX_VALUE)
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(top, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout rigthSideLayout = new javax.swing.GroupLayout(rigthSide);
        rigthSide.setLayout(rigthSideLayout);
        rigthSideLayout.setHorizontalGroup(
            rigthSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        rigthSideLayout.setVerticalGroup(
            rigthSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );

        getContentPane().add(rigthSide, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1229, Short.MAX_VALUE)
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(footer, java.awt.BorderLayout.PAGE_END);

        jPanel6.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout leftSideLayout = new javax.swing.GroupLayout(leftSide);
        leftSide.setLayout(leftSideLayout);
        leftSideLayout.setHorizontalGroup(
            leftSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        leftSideLayout.setVerticalGroup(
            leftSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );

        jPanel6.add(leftSide, java.awt.BorderLayout.LINE_START);

        bodyArea.setLayout(new java.awt.BorderLayout());

        emprestimoArea.setLayout(new java.awt.BorderLayout());

        admLogin.setBackground(new java.awt.Color(250, 250, 250));

        btnAdmLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnAdmLogin.setText("Acessar");
        btnAdmLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmLoginActionPerformed(evt);
            }
        });

        titleAdm.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        titleAdm.setText("Administrativo");

        javax.swing.GroupLayout admLoginLayout = new javax.swing.GroupLayout(admLogin);
        admLogin.setLayout(admLoginLayout);
        admLoginLayout.setHorizontalGroup(
            admLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, admLoginLayout.createSequentialGroup()
                .addContainerGap(207, Short.MAX_VALUE)
                .addComponent(titleAdm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdmLogin)
                .addContainerGap())
        );
        admLoginLayout.setVerticalGroup(
            admLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(admLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdmLogin)
                    .addComponent(titleAdm))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        emprestimoArea.add(admLogin, java.awt.BorderLayout.PAGE_START);

        emprestimoForm.setBackground(new java.awt.Color(250, 250, 250));

        titleLogin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titleLogin.setText("EMPRESTIMO");

        labelArmario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelArmario.setText("Armário");

        labelRa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelRa.setText("RA:");

        btnEmprestar.setBackground(new java.awt.Color(153, 255, 153));
        btnEmprestar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEmprestar.setText("Emprestar");

        btnDevolver.setBackground(new java.awt.Color(153, 153, 255));
        btnDevolver.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDevolver.setText("Devolver");

        labelSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelSenha.setText("Senha:");

        javax.swing.GroupLayout emprestimoFormLayout = new javax.swing.GroupLayout(emprestimoForm);
        emprestimoForm.setLayout(emprestimoFormLayout);
        emprestimoFormLayout.setHorizontalGroup(
            emprestimoFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emprestimoFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(emprestimoFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtArmario)
                    .addComponent(txtSenha)
                    .addGroup(emprestimoFormLayout.createSequentialGroup()
                        .addGroup(emprestimoFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLogin)
                            .addComponent(labelArmario)
                            .addComponent(labelRa)
                            .addComponent(btnEmprestar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(emprestimoFormLayout.createSequentialGroup()
                        .addComponent(labelSenha)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtRa))
                .addContainerGap())
        );
        emprestimoFormLayout.setVerticalGroup(
            emprestimoFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emprestimoFormLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(titleLogin)
                .addGap(52, 52, 52)
                .addComponent(labelArmario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtArmario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelRa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(emprestimoFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDevolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmprestar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        emprestimoArea.add(emprestimoForm, java.awt.BorderLayout.CENTER);

        bodyArea.add(emprestimoArea, java.awt.BorderLayout.LINE_END);

        imgArea.setBackground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout imgAreaLayout = new javax.swing.GroupLayout(imgArea);
        imgArea.setLayout(imgAreaLayout);
        imgAreaLayout.setHorizontalGroup(
            imgAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );
        imgAreaLayout.setVerticalGroup(
            imgAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );

        bodyArea.add(imgArea, java.awt.BorderLayout.CENTER);

        jPanel6.add(bodyArea, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel6, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdmLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmLoginActionPerformed
        new AdmLoginUI().setVisible(true);
    }//GEN-LAST:event_btnAdmLoginActionPerformed

    private void initComplements(){
        this.setLocationRelativeTo(null);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel admLogin;
    private javax.swing.JPanel bodyArea;
    private javax.swing.JButton btnAdmLogin;
    private javax.swing.JButton btnDevolver;
    private javax.swing.JButton btnEmprestar;
    private javax.swing.JPanel emprestimoArea;
    private javax.swing.JPanel emprestimoForm;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel imgArea;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelArmario;
    private javax.swing.JLabel labelRa;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JPanel leftSide;
    private javax.swing.JPanel rigthSide;
    private javax.swing.JLabel titleAdm;
    private javax.swing.JLabel titleLogin;
    private javax.swing.JPanel top;
    private javax.swing.JTextField txtArmario;
    private javax.swing.JTextField txtRa;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
