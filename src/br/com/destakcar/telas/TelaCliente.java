/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.destakcar.telas;

/**
 *
 * @author lucas.goncalves
 */
import java.sql.*;
import br.com.destakcar.dal.ModuloConexao;
import javax.swing.JOptionPane;

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
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            } else {

                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
                    // Limpando os campos
                    txtUserId.setText(null);
                    txtUserNome.setText(null);
                    txtUserTelefone.setText(null);
                    txtUserLogin.setText(null);
                    txtUserSenha.setText(null);
                }
            }
        } catch (SQLException e) {
            jOptionPane.showMessageDialog(null, e);
        }
    }

    private void consultar() {
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

            }
        } catch (SQLException e) {
            jOptionPane.showMessageDialog(null, e);
        }
    }

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

    private void excluir() {
        // Metodo de exclusão de usuário
        int confirma;
        confirma = JOptionPane.showConfirmDialog(null, "Deseja mesmo exclui este usuário?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
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

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cliente");
        setPreferredSize(new java.awt.Dimension(550, 480));
        setRequestFocusEnabled(false);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        getContentPane().setLayout(null);

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
    // End of variables declaration//GEN-END:variables
}
