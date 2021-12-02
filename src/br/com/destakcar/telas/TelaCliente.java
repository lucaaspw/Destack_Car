/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.destakcar.telas;

<<<<<<< HEAD
/**
 *
 * @author lucas.goncalves
 */
=======
>>>>>>> 724f9f5ae8b8abe1d4c5b980e4051d00d3b87f8f
import java.sql.*;
import br.com.destakcar.dal.ModuloConexao;
import javax.swing.JOptionPane;

<<<<<<< HEAD
=======
/**
 *
 * @author Igor Pierine Santos
 */
>>>>>>> 724f9f5ae8b8abe1d4c5b980e4051d00d3b87f8f
public class TelaCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaUsuario
     */
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaCliente() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

    @SuppressWarnings("empty-statement")
    private void adicionar() {
<<<<<<< HEAD
        String sql = "insert into tbusers(iduser, usuario, phone, login, senha, perfil) values(?, ?, ?, ?, ?, ?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtUserId.getText());
            pst.setString(2, txtUserNome.getText());
            pst.setString(3, txtUserTelefone.getText());
            pst.setString(4, txtUserLogin.getText());
            pst.setString(5, txtUserSenha.getText());
            pst.setString(6, cboUserPerfil.getSelectedItem().toString());

            // Validando os campos
            if (txtUserId.getText().isEmpty() || txtUserNome.getText().isEmpty() || txtUserTelefone.getText().isEmpty() || txtUserLogin.getText().isEmpty() || txtUserSenha.getText().isEmpty()) {
=======
        String sql = "insert into tbcliente(cpfcli, dnscli, nomecli, enderecocli, numcli, phonecli, emailcli, cidadecli, cepcli) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtClienteCPF.getText());
            pst.setString(2, txtClienteDNS.getText());
            pst.setString(3, txtClienteNome.getText());
            pst.setString(4, txtClienteEndereco.getText());
            pst.setString(5, txtClienteNumero.getText());
            pst.setString(6, txtClienteTel.getText());
            pst.setString(7, txtClienteEmail.getText());
            pst.setString(8, txtClienteCidade.getText());
            pst.setString(9, txtClienteCep.getText());

            // Validando os campos
            if (txtClienteCPF.getText().isEmpty() || txtClienteDNS.getText().isEmpty() || txtClienteNome.getText().isEmpty() || txtClienteEndereco.getText().isEmpty() || txtClienteNumero.getText().isEmpty() || txtClienteTel.getText().isEmpty() || txtClienteEmail.getText().isEmpty() || txtClienteCidade.getText().isEmpty() || txtClienteCep.getText().isEmpty()) {
>>>>>>> 724f9f5ae8b8abe1d4c5b980e4051d00d3b87f8f
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            } else {

                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
                    // Limpando os campos
<<<<<<< HEAD
                    txtUserId.setText(null);
                    txtUserNome.setText(null);
                    txtUserTelefone.setText(null);
                    txtUserLogin.setText(null);
                    txtUserSenha.setText(null);
=======
                    txtClienteNome.setText(null);
                    txtClienteEndereco.setText(null);
                    txtClienteTel.setText(null);
                    txtClienteCPF.setText(null);
                    txtClienteEmail.setText(null);
                    txtClienteNumero.setText(null);
                    txtClienteCep.setText(null);
                    txtClienteCidade.setText(null);
                    txtClienteDNS.setText(null);
>>>>>>> 724f9f5ae8b8abe1d4c5b980e4051d00d3b87f8f
                }
            }
        } catch (SQLException e) {
            jOptionPane.showMessageDialog(null, e);
        }
    }

    private void consultar() {
<<<<<<< HEAD
        String sql = "select * from tbusers where iduser=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtUserId.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txtUserNome.setText(rs.getString(2));
                txtUserTelefone.setText(rs.getString(3));
                txtUserLogin.setText(rs.getString(4));
                txtUserSenha.setText(rs.getString(5));
                cboUserPerfil.setSelectedItem(rs.getString(6));

            } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado");
                // Limpando os campos
                txtUserNome.setText(null);
                txtUserTelefone.setText(null);
                txtUserLogin.setText(null);
                txtUserSenha.setText(null);
=======
        String sql = "select * from tbcliente where cpfcli=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtClienteCPF.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txtClienteDNS.setText(rs.getString(3));
                txtClienteNome.setText(rs.getString(4));
                txtClienteEndereco.setText(rs.getString(5));
                txtClienteNumero.setText(rs.getString(6));
                txtClienteTel.setText(rs.getString(7));
                txtClienteEmail.setText(rs.getString(8));
                txtClienteCidade.setText(rs.getString(9));
                txtClienteCep.setText(rs.getString(10));
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado");
                // Limpando os campos
                txtClienteDNS.setText(null);
                txtClienteNome.setText(null);
                txtClienteEndereco.setText(null);
                txtClienteNumero.setText(null);
                txtClienteTel.setText(null);
                txtClienteEmail.setText(null);
                txtClienteCidade.setText(null);
                txtClienteCep.setText(null);
>>>>>>> 724f9f5ae8b8abe1d4c5b980e4051d00d3b87f8f

            }
        } catch (SQLException e) {
            jOptionPane.showMessageDialog(null, e);
        }
    }

<<<<<<< HEAD
    private void editar() {
        String sql = "update tbusers set usuario=?, phone=?, login=?, senha=?,perfil=? where iduser=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtUserNome.getText());
            pst.setString(2, txtUserTelefone.getText());
            pst.setString(3, txtUserLogin.getText());
            pst.setString(4, txtUserSenha.getText());
            pst.setString(5, cboUserPerfil.getSelectedItem().toString());
            pst.setString(6, txtUserId.getText());
            if (txtUserId.getText().isEmpty() || txtUserNome.getText().isEmpty() || txtUserTelefone.getText().isEmpty() || txtUserLogin.getText().isEmpty() || txtUserSenha.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            } else {

                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Dados alterados");
                    // Limpando os campos
                    txtUserId.setText(null);
                    txtUserNome.setText(null);
                    txtUserTelefone.setText(null);
                    txtUserLogin.setText(null);
                    txtUserSenha.setText(null);
                }
            }

        } catch (Exception e) {
            jOptionPane.showMessageDialog(null, e);
        }
    }

=======
>>>>>>> 724f9f5ae8b8abe1d4c5b980e4051d00d3b87f8f
    private void excluir() {
        // Metodo de exclusão de usuário
        int confirma;
        confirma = JOptionPane.showConfirmDialog(null, "Deseja mesmo exclui este usuário?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
<<<<<<< HEAD
            String sql = "delete from tbusers where iduser=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtUserId.getText());
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso!");
                txtUserId.setText(null);
                txtUserNome.setText(null);
                txtUserTelefone.setText(null);
                txtUserLogin.setText(null);
                txtUserSenha.setText(null);
=======
            String sql = "delete from tbcliente where emailcli=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtClienteEmail.getText());
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso!");
                    // Limpando os campos
                    txtClienteDNS.setText(null);
                    txtClienteNome.setText(null);
                    txtClienteEndereco.setText(null);
                    txtClienteNumero.setText(null);
                    txtClienteTel.setText(null);
                    txtClienteEmail.setText(null);
                    txtClienteCidade.setText(null);
                    txtClienteCep.setText(null);
                }
>>>>>>> 724f9f5ae8b8abe1d4c5b980e4051d00d3b87f8f
            } catch (SQLException e) {
                jOptionPane.showMessageDialog(null, e);
            }
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

<<<<<<< HEAD
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        txtUserNome = new javax.swing.JTextField();
        txtUserLogin = new javax.swing.JTextField();
        txtUserTelefone = new javax.swing.JTextField();
        cboUserPerfil = new javax.swing.JComboBox<>();
        txtUserSenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
=======
        txtClienteCidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtClienteCep = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtClienteNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtClienteTel = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtClienteEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtClienteNumero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtClienteDNS = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        txtClienteCPF = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        txtClienteEndereco = new javax.swing.JTextField();
        btnAdicionarCli = new javax.swing.JButton();
        btnConsultarCli = new javax.swing.JButton();
        btnExcluirCli = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
>>>>>>> 724f9f5ae8b8abe1d4c5b980e4051d00d3b87f8f

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
<<<<<<< HEAD
        setTitle("Cliente");
=======
        setTitle("Clientes");
        setMinimumSize(new java.awt.Dimension(124, 34));
        setNormalBounds(new java.awt.Rectangle(0, 0, 124, 0));
>>>>>>> 724f9f5ae8b8abe1d4c5b980e4051d00d3b87f8f
        setPreferredSize(new java.awt.Dimension(550, 480));
        setRequestFocusEnabled(false);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        getContentPane().setLayout(null);

<<<<<<< HEAD
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 190, 20, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 230, 50, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Telefone");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 310, 60, 20);

        lblSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(290, 270, 50, 20);

        lblPerfil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPerfil.setText("Perfil");
        getContentPane().add(lblPerfil);
        lblPerfil.setBounds(300, 310, 40, 20);

        txtUserId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtUserId);
        txtUserId.setBounds(100, 180, 120, 30);

        txtUserNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtUserNome);
        txtUserNome.setBounds(100, 220, 390, 30);

        txtUserLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtUserLogin);
        txtUserLogin.setBounds(100, 260, 160, 30);

        txtUserTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtUserTelefone);
        txtUserTelefone.setBounds(100, 300, 160, 30);

        cboUserPerfil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cboUserPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "user" }));
        cboUserPerfil.setPreferredSize(new java.awt.Dimension(7, 23));
        cboUserPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboUserPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(cboUserPerfil);
        cboUserPerfil.setBounds(350, 300, 140, 30);

        txtUserSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtUserSenha);
        txtUserSenha.setBounds(350, 260, 140, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Login");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 270, 40, 20);

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 102, 255));
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setPreferredSize(new java.awt.Dimension(20, 40));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(280, 370, 100, 30);

        btnAdicionar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(0, 102, 255));
        btnAdicionar.setText("Criar");
        btnAdicionar.setToolTipText("Adicionar");
        btnAdicionar.setBorder(null);
        btnAdicionar.setBorderPainted(false);
        btnAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionar.setPreferredSize(new java.awt.Dimension(20, 40));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar);
        btnAdicionar.setBounds(60, 370, 100, 30);

        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(0, 102, 255));
        btnConsultar.setText("Buscar");
        btnConsultar.setToolTipText("Consultar");
        btnConsultar.setBorder(null);
        btnConsultar.setBorderPainted(false);
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultar.setPreferredSize(new java.awt.Dimension(20, 40));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(170, 370, 100, 30);

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(0, 102, 255));
        btnExcluir.setText("Deletar");
        btnExcluir.setToolTipText("Excluir");
        btnExcluir.setBorder(null);
        btnExcluir.setBorderPainted(false);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.setPreferredSize(new java.awt.Dimension(20, 40));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(390, 370, 100, 30);

        setBounds(0, 0, 550, 484);
    }// </editor-fold>//GEN-END:initComponents

    private void cboUserPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboUserPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboUserPerfilActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        adicionar();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        consultar();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        excluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        editar();
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> cboUserPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JTextField txtUserLogin;
    private javax.swing.JTextField txtUserNome;
    private javax.swing.JPasswordField txtUserSenha;
    private javax.swing.JTextField txtUserTelefone;
=======
        txtClienteCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtClienteCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(txtClienteCidade);
        txtClienteCidade.setBounds(90, 320, 220, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("E-mail");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 280, 50, 30);

        try {
            txtClienteCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtClienteCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteCepActionPerformed(evt);
            }
        });
        getContentPane().add(txtClienteCep);
        txtClienteCep.setBounds(430, 320, 100, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Data Nasc.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(340, 160, 80, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nome");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 200, 50, 30);

        txtClienteNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtClienteNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtClienteNome);
        txtClienteNome.setBounds(90, 200, 440, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("CPF");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 160, 30, 30);

        try {
            txtClienteTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)  ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtClienteTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteTelActionPerformed(evt);
            }
        });
        getContentPane().add(txtClienteTel);
        txtClienteTel.setBounds(90, 280, 150, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("CEP");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(380, 320, 30, 30);

        txtClienteEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtClienteEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtClienteEmail);
        txtClienteEmail.setBounds(310, 280, 220, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Numero");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(370, 240, 56, 30);

        txtClienteNumero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtClienteNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(txtClienteNumero);
        txtClienteNumero.setBounds(430, 240, 100, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Cidade");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 320, 50, 30);

        try {
            txtClienteDNS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtClienteDNS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteDNSActionPerformed(evt);
            }
        });
        getContentPane().add(txtClienteDNS);
        txtClienteDNS.setBounds(430, 160, 100, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Telefone");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 280, 59, 30);

        try {
            txtClienteCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtClienteCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteCPFActionPerformed(evt);
            }
        });
        getContentPane().add(txtClienteCPF);
        txtClienteCPF.setBounds(90, 160, 110, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Endereço");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 240, 70, 30);

        txtClienteEndereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtClienteEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(txtClienteEndereco);
        txtClienteEndereco.setBounds(90, 240, 230, 30);

        btnAdicionarCli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdicionarCli.setForeground(new java.awt.Color(0, 102, 255));
        btnAdicionarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/destakcar/icones/accept.png"))); // NOI18N
        btnAdicionarCli.setText("Confirmar");
        btnAdicionarCli.setToolTipText("Adicionar");
        btnAdicionarCli.setBorder(null);
        btnAdicionarCli.setBorderPainted(false);
        btnAdicionarCli.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdicionarCli.setPreferredSize(new java.awt.Dimension(20, 40));
        btnAdicionarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCliActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionarCli);
        btnAdicionarCli.setBounds(180, 390, 100, 30);

        btnConsultarCli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultarCli.setForeground(new java.awt.Color(0, 102, 255));
        btnConsultarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/destakcar/icones/magnifier.png"))); // NOI18N
        btnConsultarCli.setToolTipText("Consultar");
        btnConsultarCli.setBorder(null);
        btnConsultarCli.setBorderPainted(false);
        btnConsultarCli.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConsultarCli.setPreferredSize(new java.awt.Dimension(20, 40));
        btnConsultarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCliActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultarCli);
        btnConsultarCli.setBounds(60, 160, 30, 30);

        btnExcluirCli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExcluirCli.setForeground(new java.awt.Color(0, 102, 255));
        btnExcluirCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/destakcar/icones/user_delete.png"))); // NOI18N
        btnExcluirCli.setText("Deletar");
        btnExcluirCli.setToolTipText("Excluir");
        btnExcluirCli.setBorder(null);
        btnExcluirCli.setBorderPainted(false);
        btnExcluirCli.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExcluirCli.setPreferredSize(new java.awt.Dimension(20, 40));
        btnExcluirCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCliActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluirCli);
        btnExcluirCli.setBounds(300, 390, 100, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/destakcar/icones/icone-cliente.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(160, 0, 220, 140);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteCidadeActionPerformed

    private void txtClienteCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteCepActionPerformed

    private void txtClienteNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteNomeActionPerformed

    private void txtClienteTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteTelActionPerformed

    private void txtClienteEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteEmailActionPerformed

    private void txtClienteNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteNumeroActionPerformed

    private void txtClienteDNSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteDNSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteDNSActionPerformed

    private void txtClienteCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteCPFActionPerformed

    private void txtClienteEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteEnderecoActionPerformed

    private void btnAdicionarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCliActionPerformed
        // TODO add your handling code here:
        adicionar();
    }//GEN-LAST:event_btnAdicionarCliActionPerformed

    private void btnConsultarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCliActionPerformed
        // TODO add your handling code here:
        consultar();
    }//GEN-LAST:event_btnConsultarCliActionPerformed

    private void btnExcluirCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCliActionPerformed
        // TODO add your handling code here:
        excluir();
    }//GEN-LAST:event_btnExcluirCliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCli;
    private javax.swing.JButton btnConsultarCli;
    private javax.swing.JButton btnExcluirCli;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField txtClienteCPF;
    private javax.swing.JFormattedTextField txtClienteCep;
    private javax.swing.JTextField txtClienteCidade;
    private javax.swing.JFormattedTextField txtClienteDNS;
    private javax.swing.JTextField txtClienteEmail;
    private javax.swing.JTextField txtClienteEndereco;
    private javax.swing.JTextField txtClienteNome;
    private javax.swing.JTextField txtClienteNumero;
    private javax.swing.JFormattedTextField txtClienteTel;
>>>>>>> 724f9f5ae8b8abe1d4c5b980e4051d00d3b87f8f
    // End of variables declaration//GEN-END:variables
}
