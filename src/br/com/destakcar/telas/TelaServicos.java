/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.destakcar.telas;

import java.sql.*;
import br.com.destakcar.dal.ModuloConexao;
import javax.swing.JOptionPane;

/**
 *
 * @author Igor Pierine Santos
 */
public class TelaServicos extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCarro
     */
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaServicos() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    private void cadastrar() {
        String sql = "insert into tbos(marca, modelo, ano, placa, servico, idcli)values(?, ?, ?, ?, ?, ?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cboServicoMarca.getSelectedItem().toString());
            pst.setString(2, txtServicoModelo.getText());
            pst.setString(3, cboServicoAno.getSelectedItem().toString());
            pst.setString(4, txtServicoPlaca.getText());
            pst.setString(5, txtareaServico.getText());
            pst.setString(6, txtServicoId.getText());

            // Validando os campos
            if (txtServicoPlaca.getText().isEmpty() || txtServicoPlaca.getText().isEmpty() || txtServicoId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            } else {

                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Serviço cadastrado com sucesso");
                    // Limpando os campos
                    txtServicoPlaca.setText(null);
                    txtServicoModelo.setText(null);
                    txtareaServico.setText(null);
                    cboServicoMarca.setSelectedItem(null);
                    cboServicoAno.setSelectedItem(null);
                    txtServicoCPF.setText(null);
                    txtServicoNome.setText(null);
                }
            }
        } catch (SQLException e) {
            jOptionPane.showMessageDialog(null, e);
        }
    }

    private void consultar() {
        String sql = "select * from tbcliente where cpfcli=?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtServicoCPF.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txtServicoId.setText(rs.getString(1));
                txtServicoNome.setText(rs.getString(4));
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado");
                // Limpando os campos
                txtServicoCPF.setText(null);
                txtServicoNome.setText(null);
                txtServicoId.setText(null);

            }
        } catch (SQLException e) {
            jOptionPane.showMessageDialog(null, e);
        }
    }

    private void buscarServico() {
        String sql = "select * from tbos where idcli=?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtServicoId.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                cboServicoMarca.setSelectedItem(rs.getString(2));
                txtServicoModelo.setText(rs.getString(3));
                cboServicoAno.setSelectedItem(rs.getString(4));
                txtServicoPlaca.setText(rs.getString(5));
                txtareaServico.setText(rs.getString(6));

            } else {
                JOptionPane.showMessageDialog(null, "Serviço não encontrado");
                // Limpando os campos

            }
        } catch (SQLException e) {
            jOptionPane.showMessageDialog(null, e);
        }
    }

    private void editar() {
        String sql = "update tbos set marca=?, modelo=?, ano=?, placa=?, servico=? where idcli=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cboServicoMarca.getSelectedItem().toString());
            pst.setString(2, txtServicoModelo.getText());
            pst.setString(3, cboServicoAno.getSelectedItem().toString());
            pst.setString(4, txtServicoPlaca.getText());
            pst.setString(5, txtareaServico.getText());
            pst.setString(6, txtServicoId.getText());
            if (cboServicoMarca.getSelectedItem().toString().isEmpty() || txtServicoModelo.getText().isEmpty() || cboServicoAno.getSelectedItem().toString().isEmpty() || txtServicoPlaca.getText().isEmpty() || txtareaServico.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            } else {

                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Dados alterados");
                    // Limpando os campos
                    txtServicoModelo.setText(null);
                    txtServicoPlaca.setText(null);
                    txtareaServico.setText(null);
                    txtServicoCPF.setText(null);
                    txtServicoId.setText(null);
                }
            }

        } catch (SQLException e) {
            jOptionPane.showMessageDialog(null, e);
        }
    }

    private void excluir() {
        int confirma;
        confirma = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir este serviço?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from tbos where idcli=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtServicoId.getText());
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Serviço excluído com sucesso!");
                txtServicoModelo.setText(null);
                txtServicoPlaca.setText(null);
                txtareaServico.setText(null);
                txtServicoCPF.setText(null);
                txtServicoId.setText(null);
            } catch (SQLException e) {
                jOptionPane.showMessageDialog(null, e);
            }
        }

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtServicoPlaca = new javax.swing.JTextField();
        btnEditarServ = new javax.swing.JButton();
        btnAdicionarServ = new javax.swing.JButton();
        btnConsultarServ = new javax.swing.JButton();
        btnExcluirServ = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtServicoCPF = new javax.swing.JFormattedTextField();
        cboServicoMarca = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        cboServicoAno = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txtServicoNome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaServico = new javax.swing.JTextArea();
        txtServicoId = new javax.swing.JTextField();
        txtServicoModelo = new javax.swing.JTextField();
        btnBuscarServico = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Serviço");
        setPreferredSize(new java.awt.Dimension(550, 480));
        setRequestFocusEnabled(false);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Marca");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 200, 60, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Serviço");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 270, 80, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Modelo");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(270, 200, 60, 30);

        txtServicoPlaca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtServicoPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServicoPlacaActionPerformed(evt);
            }
        });
        getContentPane().add(txtServicoPlaca);
        txtServicoPlaca.setBounds(340, 240, 190, 30);

        btnEditarServ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditarServ.setForeground(new java.awt.Color(0, 102, 255));
        btnEditarServ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/destakcar/icones/pencil_add.png"))); // NOI18N
        btnEditarServ.setText("Editar");
        btnEditarServ.setToolTipText("Editar");
        btnEditarServ.setBorder(null);
        btnEditarServ.setBorderPainted(false);
        btnEditarServ.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditarServ.setPreferredSize(new java.awt.Dimension(20, 40));
        btnEditarServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarServActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarServ);
        btnEditarServ.setBounds(320, 380, 100, 30);

        btnAdicionarServ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdicionarServ.setForeground(new java.awt.Color(0, 102, 255));
        btnAdicionarServ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/destakcar/icones/car_add.png"))); // NOI18N
        btnAdicionarServ.setText("Adicionar");
        btnAdicionarServ.setToolTipText("Adicionar");
        btnAdicionarServ.setBorder(null);
        btnAdicionarServ.setBorderPainted(false);
        btnAdicionarServ.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdicionarServ.setPreferredSize(new java.awt.Dimension(20, 40));
        btnAdicionarServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarServActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionarServ);
        btnAdicionarServ.setBounds(100, 380, 100, 30);

        btnConsultarServ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultarServ.setForeground(new java.awt.Color(0, 102, 255));
        btnConsultarServ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/destakcar/icones/magnifier.png"))); // NOI18N
        btnConsultarServ.setToolTipText("Consultar");
        btnConsultarServ.setBorder(null);
        btnConsultarServ.setBorderPainted(false);
        btnConsultarServ.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConsultarServ.setPreferredSize(new java.awt.Dimension(20, 40));
        btnConsultarServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarServActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultarServ);
        btnConsultarServ.setBounds(100, 160, 40, 30);

        btnExcluirServ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExcluirServ.setForeground(new java.awt.Color(0, 102, 255));
        btnExcluirServ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/destakcar/icones/car_delete.png"))); // NOI18N
        btnExcluirServ.setText("Deletar");
        btnExcluirServ.setToolTipText("Excluir");
        btnExcluirServ.setBorder(null);
        btnExcluirServ.setBorderPainted(false);
        btnExcluirServ.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExcluirServ.setPreferredSize(new java.awt.Dimension(20, 40));
        btnExcluirServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirServActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluirServ);
        btnExcluirServ.setBounds(430, 380, 100, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/destakcar/icones/icone-carro.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(200, 0, 160, 140);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("CPF");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(40, 160, 50, 30);

        try {
            txtServicoCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtServicoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServicoCPFActionPerformed(evt);
            }
        });
        getContentPane().add(txtServicoCPF);
<<<<<<< HEAD
        txtServicoCPF.setBounds(150, 160, 130, 30);
=======
        txtServicoCPF.setBounds(120, 160, 51, 30);
>>>>>>> 66ea3fc7c02d0f6f651de5a587e7a87b7db19ad6

        cboServicoMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboServicoMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Selecionar-", "FIAT", "Volkswagen", "GM", "Hyundai", "Jeep", "Renault", "Toyota", "Ford", "Honda", "Nissan", "Caoa Chery", "Peugeot", "Mitsubishi", "Citroen", "BMW", "Volvo", "Mercedes", "Audi", "Kia", "RAM", "Iveco", "Land Rover", "Porsche", "Suzuki", "Mini", "JAC", "Troler", "Subaru", "Jaguar", "Dodge", "Foton", "Lexus", " " }));
        cboServicoMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboServicoMarcaActionPerformed(evt);
            }
        });
        getContentPane().add(cboServicoMarca);
        cboServicoMarca.setBounds(100, 200, 140, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText(" Ano");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(40, 240, 50, 30);

        cboServicoAno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboServicoAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Selecionar-", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", " ", " " }));
        cboServicoAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboServicoAnoActionPerformed(evt);
            }
        });
        getContentPane().add(cboServicoAno);
        cboServicoAno.setBounds(100, 240, 120, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText(" Nome");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(280, 160, 50, 30);

        txtServicoNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtServicoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServicoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtServicoNome);
        txtServicoNome.setBounds(340, 160, 150, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Placa");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(290, 240, 50, 30);

        txtareaServico.setColumns(20);
        txtareaServico.setRows(5);
        jScrollPane1.setViewportView(txtareaServico);

        getContentPane().add(jScrollPane1);
<<<<<<< HEAD
        jScrollPane1.setBounds(100, 280, 430, 86);
=======
        jScrollPane1.setBounds(70, 280, 450, 96);
>>>>>>> 66ea3fc7c02d0f6f651de5a587e7a87b7db19ad6

        txtServicoId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtServicoId.setDoubleBuffered(true);
        txtServicoId.setEnabled(false);
        txtServicoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServicoIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtServicoId);
        txtServicoId.setBounds(490, 160, 40, 30);

        txtServicoModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtServicoModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServicoModeloActionPerformed(evt);
            }
        });
        getContentPane().add(txtServicoModelo);
        txtServicoModelo.setBounds(340, 200, 190, 30);

        btnBuscarServico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarServico.setForeground(new java.awt.Color(0, 102, 255));
        btnBuscarServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/destakcar/icones/magnifier.png"))); // NOI18N
        btnBuscarServico.setText("Buscar");
        btnBuscarServico.setToolTipText("Editar");
        btnBuscarServico.setBorder(null);
        btnBuscarServico.setBorderPainted(false);
        btnBuscarServico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarServico.setPreferredSize(new java.awt.Dimension(20, 40));
        btnBuscarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarServicoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarServico);
        btnBuscarServico.setBounds(210, 380, 100, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtServicoPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServicoPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServicoPlacaActionPerformed

    private void btnAdicionarServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarServActionPerformed
        // TODO add your handling code here:
        cadastrar();
    }//GEN-LAST:event_btnAdicionarServActionPerformed

    private void btnConsultarServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarServActionPerformed
        // TODO add your handling code here:
        consultar();
    }//GEN-LAST:event_btnConsultarServActionPerformed

    private void btnExcluirServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirServActionPerformed
        // TODO add your handling code here:
        excluir();
    }//GEN-LAST:event_btnExcluirServActionPerformed

    private void txtServicoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServicoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServicoCPFActionPerformed

    private void cboServicoMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboServicoMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboServicoMarcaActionPerformed

    private void cboServicoAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboServicoAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboServicoAnoActionPerformed

    private void txtServicoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServicoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServicoNomeActionPerformed

    private void txtServicoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServicoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServicoIdActionPerformed

    private void txtServicoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServicoModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServicoModeloActionPerformed

    private void btnEditarServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarServActionPerformed
        // TODO add your handling code here:
        editar();
    }//GEN-LAST:event_btnEditarServActionPerformed

    private void btnBuscarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarServicoActionPerformed
        // TODO add your handling code here:
        buscarServico();
    }//GEN-LAST:event_btnBuscarServicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarServ;
    private javax.swing.JButton btnBuscarServico;
    private javax.swing.JButton btnConsultarServ;
    private javax.swing.JButton btnEditarServ;
    private javax.swing.JButton btnExcluirServ;
    private javax.swing.JComboBox<String> cboServicoAno;
    private javax.swing.JComboBox<String> cboServicoMarca;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txtServicoCPF;
    private javax.swing.JTextField txtServicoId;
    private javax.swing.JTextField txtServicoModelo;
    private javax.swing.JTextField txtServicoNome;
    private javax.swing.JTextField txtServicoPlaca;
    private javax.swing.JTextArea txtareaServico;
    // End of variables declaration//GEN-END:variables
}
