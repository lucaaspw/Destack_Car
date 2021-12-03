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
    
    private void adicionar() {
        String sql = "insert into tbos(marca, modelo, ano, placa, servico, idcli) values(?, ?, ?, ?, ?, ?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cboServicoMarca.getSelectedItem().toString());
            pst.setString(2, txtServicoPlaca.getText());
            pst.setString(3, cboServicoAno.getSelectedItem().toString());
            pst.setString(4, txtServicoPlaca.getText());
            pst.setString(5, txtServicoId.getText());

            // Validando os campos
            if (cboServicoMarca.getSelectedItem().toString().isEmpty() || txtServicoPlaca.getText().isEmpty() || cboServicoAno.getSelectedItem().toString().isEmpty() || txtServicoPlaca.getText().isEmpty() || txtServicoId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            } else {

                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Serviço cadastrado com sucesso");
                    // Limpando os campos
                    txtServicoPlaca.setText(null);
                    txtServicoPlaca.setText(null);
                    txtServicoId.setText(null);
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
                JOptionPane.showMessageDialog(null, "Usuário não encontrado");
                // Limpando os campos
                txtServicoCPF.setText(null);
                txtServicoNome.setText(null);

            }
        } catch (SQLException e) {
            jOptionPane.showMessageDialog(null, e);
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
        txtServicoModelo1 = new javax.swing.JTextField();

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
        jLabel2.setBounds(10, 200, 50, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Serviço");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 277, 50, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Modelo");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(220, 200, 50, 30);

        txtServicoPlaca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtServicoPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServicoPlacaActionPerformed(evt);
            }
        });
        getContentPane().add(txtServicoPlaca);
        txtServicoPlaca.setBounds(290, 240, 230, 30);

        btnEditarServ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditarServ.setForeground(new java.awt.Color(0, 102, 255));
        btnEditarServ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/destakcar/icones/pencil_add.png"))); // NOI18N
        btnEditarServ.setText("Editar");
        btnEditarServ.setToolTipText("Editar");
        btnEditarServ.setBorder(null);
        btnEditarServ.setBorderPainted(false);
        btnEditarServ.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditarServ.setPreferredSize(new java.awt.Dimension(20, 40));
        getContentPane().add(btnEditarServ);
        btnEditarServ.setBounds(250, 380, 100, 30);

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
        btnAdicionarServ.setBounds(70, 380, 100, 30);

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
        btnConsultarServ.setBounds(70, 160, 40, 30);

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
        btnExcluirServ.setBounds(420, 380, 100, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/destakcar/icones/icone-carro.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(190, 0, 160, 140);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("CPF");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(30, 160, 30, 30);

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
        txtServicoCPF.setBounds(120, 160, 70, 30);

        cboServicoMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboServicoMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Selecionar-", "FIAT", "Volkswagen", "GM", "Hyundai", "Jeep", "Renault", "Toyota", "Ford", "Honda", "Nissan", "Caoa Chery", "Peugeot", "Mitsubishi", "Citroen", "BMW", "Volvo", "Mercedes", "Audi", "Kia", "RAM", "Iveco", "Land Rover", "Porsche", "Suzuki", "Mini", "JAC", "Troler", "Subaru", "Jaguar", "Dodge", "Foton", "Lexus", " " }));
        cboServicoMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboServicoMarcaActionPerformed(evt);
            }
        });
        getContentPane().add(cboServicoMarca);
        cboServicoMarca.setBounds(70, 200, 120, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText(" Ano");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 240, 40, 30);

        cboServicoAno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboServicoAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Selecionar-", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", " " }));
        cboServicoAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboServicoAnoActionPerformed(evt);
            }
        });
        getContentPane().add(cboServicoAno);
        cboServicoAno.setBounds(70, 240, 120, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText(" Nome");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(230, 157, 60, 30);

        txtServicoNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtServicoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServicoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtServicoNome);
        txtServicoNome.setBounds(290, 160, 190, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Placa");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(230, 240, 40, 30);

        txtareaServico.setColumns(20);
        txtareaServico.setRows(5);
        jScrollPane1.setViewportView(txtareaServico);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 280, 450, 96);

        txtServicoId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtServicoId.setDoubleBuffered(true);
        txtServicoId.setEnabled(false);
        txtServicoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServicoIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtServicoId);
        txtServicoId.setBounds(480, 160, 40, 30);

        txtServicoModelo1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtServicoModelo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServicoModelo1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtServicoModelo1);
        txtServicoModelo1.setBounds(290, 200, 230, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtServicoPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServicoPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServicoPlacaActionPerformed

    private void btnAdicionarServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarServActionPerformed
        // TODO add your handling code here:
        adicionar();
    }//GEN-LAST:event_btnAdicionarServActionPerformed

    private void btnConsultarServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarServActionPerformed
        // TODO add your handling code here:
        consultar();
    }//GEN-LAST:event_btnConsultarServActionPerformed

    private void btnExcluirServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirServActionPerformed
        // TODO add your handling code here:
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

    private void txtServicoModelo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServicoModelo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServicoModelo1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarServ;
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
    private javax.swing.JTextField txtServicoModelo1;
    private javax.swing.JTextField txtServicoNome;
    private javax.swing.JTextField txtServicoPlaca;
    private javax.swing.JTextArea txtareaServico;
    // End of variables declaration//GEN-END:variables
}
