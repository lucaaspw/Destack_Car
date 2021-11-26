/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.destakcar.telas;

/**
 *
 * @author Igor Pierine Santos
 */
public class TelaVeiculos extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCarro
     */
    public TelaVeiculos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCleinteNome = new javax.swing.JTextField();
        txtCleinteCPF = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCleinteEndereco = new javax.swing.JTextField();
        btnEditarCli = new javax.swing.JButton();
        btnAdicionarCli = new javax.swing.JButton();
        btnConsultarCli = new javax.swing.JButton();
        btnExcluirCli = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCleinteCPF2 = new javax.swing.JFormattedTextField();
        cboCleinteUf1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        cboCleinteUf3 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txtCleinteNome1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Veículos");
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
        jLabel2.setBounds(40, 250, 50, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Serviço");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 330, 50, 17);

        txtCleinteNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCleinteNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCleinteNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtCleinteNome);
        txtCleinteNome.setBounds(90, 320, 430, 30);

        try {
            txtCleinteCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCleinteCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCleinteCPFActionPerformed(evt);
            }
        });
        getContentPane().add(txtCleinteCPF);
        txtCleinteCPF.setBounds(260, 280, 140, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Versão");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(210, 250, 50, 17);

        txtCleinteEndereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCleinteEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCleinteEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCleinteEndereco);
        txtCleinteEndereco.setBounds(260, 240, 260, 30);

        btnEditarCli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditarCli.setForeground(new java.awt.Color(0, 102, 255));
        btnEditarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/destakcar/icones/pencil_add.png"))); // NOI18N
        btnEditarCli.setText("Editar");
        btnEditarCli.setToolTipText("Editar");
        btnEditarCli.setBorder(null);
        btnEditarCli.setBorderPainted(false);
        btnEditarCli.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditarCli.setPreferredSize(new java.awt.Dimension(20, 40));
        getContentPane().add(btnEditarCli);
        btnEditarCli.setBounds(230, 380, 100, 30);

        btnAdicionarCli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdicionarCli.setForeground(new java.awt.Color(0, 102, 255));
        btnAdicionarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/destakcar/icones/car_add.png"))); // NOI18N
        btnAdicionarCli.setText("Adicionar");
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
        btnAdicionarCli.setBounds(70, 380, 100, 30);

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
        btnConsultarCli.setBounds(90, 200, 30, 30);

        btnExcluirCli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExcluirCli.setForeground(new java.awt.Color(0, 102, 255));
        btnExcluirCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/destakcar/icones/car_delete.png"))); // NOI18N
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
        btnExcluirCli.setBounds(400, 380, 100, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/destakcar/icones/icone-carro.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(180, 10, 160, 170);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("CPF");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(40, 210, 30, 17);

        try {
            txtCleinteCPF2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCleinteCPF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCleinteCPF2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtCleinteCPF2);
        txtCleinteCPF2.setBounds(120, 200, 90, 30);

        cboCleinteUf1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboCleinteUf1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Selecionar-", "FIAT", "Volkswagen", "GM", "Hyundai", "Jeep", "Renault", "Toyota", "Ford", "Honda", "Nissan", "Caoa Chery", "Peugeot", "Mitsubishi", "Citroen", "BMW", "Volvo", "Mercedes", "Audi", "Kia", "RAM", "Iveco", "Land Rover", "Porsche", "Suzuki", "Mini", "JAC", "Troler", "Subaru", "Jaguar", "Dodge", "Foton", "Lexus", " " }));
        cboCleinteUf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCleinteUf1ActionPerformed(evt);
            }
        });
        getContentPane().add(cboCleinteUf1);
        cboCleinteUf1.setBounds(90, 240, 91, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText(" Ano");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(40, 290, 40, 17);

        cboCleinteUf3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboCleinteUf3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Selecionar-", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", " " }));
        cboCleinteUf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCleinteUf3ActionPerformed(evt);
            }
        });
        getContentPane().add(cboCleinteUf3);
        cboCleinteUf3.setBounds(90, 280, 90, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText(" Nome");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(210, 210, 60, 17);

        txtCleinteNome1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCleinteNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCleinteNome1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtCleinteNome1);
        txtCleinteNome1.setBounds(260, 200, 260, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Placa");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(220, 290, 40, 17);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCleinteNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCleinteNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCleinteNomeActionPerformed

    private void txtCleinteCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCleinteCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCleinteCPFActionPerformed

    private void txtCleinteEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCleinteEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCleinteEnderecoActionPerformed

    private void btnAdicionarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCliActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnAdicionarCliActionPerformed

    private void btnConsultarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCliActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnConsultarCliActionPerformed

    private void btnExcluirCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirCliActionPerformed

    private void txtCleinteCPF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCleinteCPF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCleinteCPF2ActionPerformed

    private void cboCleinteUf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCleinteUf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCleinteUf1ActionPerformed

    private void cboCleinteUf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCleinteUf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCleinteUf3ActionPerformed

    private void txtCleinteNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCleinteNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCleinteNome1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCli;
    private javax.swing.JButton btnConsultarCli;
    private javax.swing.JButton btnEditarCli;
    private javax.swing.JButton btnExcluirCli;
    private javax.swing.JComboBox<String> cboCleinteUf1;
    private javax.swing.JComboBox<String> cboCleinteUf3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JFormattedTextField txtCleinteCPF;
    private javax.swing.JFormattedTextField txtCleinteCPF2;
    private javax.swing.JTextField txtCleinteEndereco;
    private javax.swing.JTextField txtCleinteNome;
    private javax.swing.JTextField txtCleinteNome1;
    // End of variables declaration//GEN-END:variables
}
