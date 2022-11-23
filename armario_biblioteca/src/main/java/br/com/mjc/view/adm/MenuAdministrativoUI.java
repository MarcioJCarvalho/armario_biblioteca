/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.mjc.view.adm;

import br.com.mjc.controller.BibliotecarioController;
import br.com.mjc.dto.BibliotecarioDTO;
import br.com.mjc.dto.InfoDTO;
import br.com.mjc.enums.Status;
import br.com.mjc.utils.Validador;
import br.com.mjc.view.MainMenuUI;
import javax.swing.JOptionPane;

/**
 *
 * @author moska
 */
public class MenuAdministrativoUI extends javax.swing.JFrame {

    private BibliotecarioController bibliotecarioController;

    /**
     * Creates new form MenuAdministrativoUI
     */
    public MenuAdministrativoUI() {
        initComponents();
        initComplements();
        setExtendedState(MAXIMIZED_BOTH);
        radioGrupo.add(radioNome);
        radioGrupo.add(radioSiape);
        bibliotecarioController = new BibliotecarioController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGrupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tab = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        headerEmprestimo = new javax.swing.JPanel();
        bodyEmprestimo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        bodyBibliotecario = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        radioNome = new javax.swing.JRadioButton();
        radioSiape = new javax.swing.JRadioButton();
        txtFiltro = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        titleContato = new javax.swing.JLabel();
        labelDDD = new javax.swing.JLabel();
        txtDDD = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        titleDadosBibliotecario = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        labelSiape = new javax.swing.JLabel();
        txtSiape = new javax.swing.JTextField();
        labelSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        labelConfirmarSenha = new javax.swing.JLabel();
        txtConfirmacaoSenha = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        heaerEstudante = new javax.swing.JPanel();
        bodyEstudante = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        headerArmario = new javax.swing.JPanel();
        bodyArmario = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        sair = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout headerEmprestimoLayout = new javax.swing.GroupLayout(headerEmprestimo);
        headerEmprestimo.setLayout(headerEmprestimoLayout);
        headerEmprestimoLayout.setHorizontalGroup(
            headerEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );
        headerEmprestimoLayout.setVerticalGroup(
            headerEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel2.add(headerEmprestimo, java.awt.BorderLayout.PAGE_START);

        bodyEmprestimo.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Armário", "Estudante", "Data Empréstimo", "Data Devlução"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        bodyEmprestimo.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.add(bodyEmprestimo, java.awt.BorderLayout.CENTER);

        tab.addTab("Empréstimos", jPanel2);

        jPanel3.setLayout(new java.awt.BorderLayout());

        bodyBibliotecario.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.BorderLayout());

        radioNome.setText("Nome");

        radioSiape.setText("Siape");
        radioSiape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSiapeActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(radioNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioSiape)
                .addGap(270, 270, 270)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnBuscar)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(radioNome)
                .addComponent(radioSiape))
        );

        jPanel6.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        jPanel16.setLayout(new java.awt.BorderLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "E-mail", "Siape", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel16.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel16, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Bibliotecários", jPanel6);

        jPanel7.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel9, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel10, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel11, java.awt.BorderLayout.LINE_START);

        jPanel12.setLayout(new java.awt.BorderLayout());

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        jPanel12.add(jPanel13, java.awt.BorderLayout.PAGE_END);

        labelNome.setText("Nome:");

        labelEmail.setText("E-mail:");

        titleContato.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        titleContato.setText("Contato");

        labelDDD.setText("DDD:");

        labelNumero.setText("Telefone:");

        titleDadosBibliotecario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        titleDadosBibliotecario.setText("Dados do Bibliotecário");

        labelCpf.setText("CPF:");

        labelSiape.setText("Siape:");

        labelSenha.setText("Senha:");

        labelConfirmarSenha.setText("Confirmar Senha:");

        txtConfirmacaoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmacaoSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(txtEmail)
                    .addComponent(txtNome)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleContato)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(labelDDD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelEmail)
                            .addComponent(titleDadosBibliotecario)
                            .addComponent(labelNome)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtSiape, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(labelCpf)
                            .addComponent(labelSiape))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(txtConfirmacaoSenha)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelConfirmarSenha)
                                    .addComponent(labelSenha))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleDadosBibliotecario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCpf)
                    .addComponent(labelSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSiape)
                    .addComponent(labelConfirmarSenha))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSiape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfirmacaoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDDD)
                    .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel12.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel12, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Cadastro", jPanel7);

        bodyBibliotecario.add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        jPanel3.add(bodyBibliotecario, java.awt.BorderLayout.CENTER);

        tab.addTab("Bibliotecário", jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout heaerEstudanteLayout = new javax.swing.GroupLayout(heaerEstudante);
        heaerEstudante.setLayout(heaerEstudanteLayout);
        heaerEstudanteLayout.setHorizontalGroup(
            heaerEstudanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );
        heaerEstudanteLayout.setVerticalGroup(
            heaerEstudanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel4.add(heaerEstudante, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout bodyEstudanteLayout = new javax.swing.GroupLayout(bodyEstudante);
        bodyEstudante.setLayout(bodyEstudanteLayout);
        bodyEstudanteLayout.setHorizontalGroup(
            bodyEstudanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );
        bodyEstudanteLayout.setVerticalGroup(
            bodyEstudanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        jPanel4.add(bodyEstudante, java.awt.BorderLayout.CENTER);

        tab.addTab("Estudantes", jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout headerArmarioLayout = new javax.swing.GroupLayout(headerArmario);
        headerArmario.setLayout(headerArmarioLayout);
        headerArmarioLayout.setHorizontalGroup(
            headerArmarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );
        headerArmarioLayout.setVerticalGroup(
            headerArmarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel5.add(headerArmario, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout bodyArmarioLayout = new javax.swing.GroupLayout(bodyArmario);
        bodyArmario.setLayout(bodyArmarioLayout);
        bodyArmarioLayout.setHorizontalGroup(
            bodyArmarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );
        bodyArmarioLayout.setVerticalGroup(
            bodyArmarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        jPanel5.add(bodyArmario, java.awt.BorderLayout.CENTER);

        tab.addTab("Armários", jPanel5);

        jPanel1.add(tab, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        fileMenu.setText("File");

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        fileMenu.add(sair);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");
        jMenuBar1.add(editMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initComplements() {
        this.setLocationRelativeTo(null);
    }

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        new MainMenuUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void txtConfirmacaoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmacaoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmacaoSenhaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (radioNome.isSelected()) {
            System.out.println("Nome:");
        } else if (radioSiape.isSelected()) {
            System.out.println("Siape:");
        } else {
            JOptionPane.showMessageDialog(null, "Filtro não selecionado!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void radioSiapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSiapeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSiapeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        BibliotecarioDTO bibliotecarioDTO = new BibliotecarioDTO();
        InfoDTO infoDTO = new InfoDTO();
        String senha = new String(txtSenha.getPassword());
        String confirmacaoSenha = new String(txtConfirmacaoSenha.getPassword());
        infoDTO = Validador.confirmarSenha(senha, confirmacaoSenha);
        if (infoDTO.getStatus().equals(Status.SUCESSO)) {
            bibliotecarioDTO.setSenha(infoDTO.getObject().toString());
        } else {
            JOptionPane.showMessageDialog(null, infoDTO.getMensagem(), infoDTO.getStatus().toString(), JOptionPane.ERROR_MESSAGE);
            return;
        }

        bibliotecarioDTO.setNome(txtNome.getText());
        bibliotecarioDTO.setEmail(txtEmail.getText());
        bibliotecarioDTO.setCpf(txtCpf.getText());
        bibliotecarioDTO.setSiape(txtSiape.getText());
        bibliotecarioDTO.setTelefone(txtDDD.getText() + txtTelefone.getText());
        bibliotecarioDTO.setCpf(txtCpf.getText());
        bibliotecarioDTO.setSiape(txtSiape.getText());
        bibliotecarioDTO.setTelefone(txtDDD.getText() + txtTelefone.getText());

        infoDTO = bibliotecarioController.cadastar(bibliotecarioDTO);
        if(infoDTO.getStatus().equals(Status.SUCESSO)){
            JOptionPane.showMessageDialog(null, infoDTO.getMensagem(), infoDTO.getStatus().toString(), JOptionPane.OK_CANCEL_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, infoDTO.getMensagem(), infoDTO.getStatus().toString(), JOptionPane.ERROR_MESSAGE);
        }

        infoDTO = bibliotecarioController.cadastar(bibliotecarioDTO);
        if (infoDTO.getStatus().equals(Status.SUCESSO)) {
            JOptionPane.showMessageDialog(null, infoDTO.getMensagem(), infoDTO.getStatus().toString(), JOptionPane.OK_CANCEL_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, infoDTO.getMensagem(), infoDTO.getStatus().toString(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyArmario;
    private javax.swing.JPanel bodyBibliotecario;
    private javax.swing.JPanel bodyEmprestimo;
    private javax.swing.JPanel bodyEstudante;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPanel headerArmario;
    private javax.swing.JPanel headerEmprestimo;
    private javax.swing.JPanel heaerEstudante;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel labelConfirmarSenha;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelDDD;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelSiape;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.ButtonGroup radioGrupo;
    private javax.swing.JRadioButton radioNome;
    private javax.swing.JRadioButton radioSiape;
    private javax.swing.JMenuItem sair;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JLabel titleContato;
    private javax.swing.JLabel titleDadosBibliotecario;
    private javax.swing.JPasswordField txtConfirmacaoSenha;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDDD;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSiape;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
