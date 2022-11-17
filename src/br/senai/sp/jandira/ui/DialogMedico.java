package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.TipoOperacao;
import br.senai.sp.jandira.model.Medico;
import javax.swing.JOptionPane;


public class DialogMedico extends javax.swing.JDialog {
    
    private TipoOperacao tipoOperacao;
    private Medico medico;

    public DialogMedico(java.awt.Frame parent, 
            boolean modal, 
            TipoOperacao tipoOperacao, 
            Medico medico) {
        
        
        
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.medico = medico;
        
        //Preencher os campos, caso o tipo de operação for EDITAR
        if (tipoOperacao == TipoOperacao.EDITAR) {
                preencherFormulario();
        }
    }
    
    private void preencherFormulario(){
        labelTitulo.setText("Médico - " + tipoOperacao);
        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/medico.png")));
        textCodigo.setText(medico.getCodigo().toString());
        textNomeDoMedico.setText(medico.getNome());
        textTelefone.setText(medico.getTelefone());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelIcon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textTelefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textCRM = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        textDataNascimento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textNomeDoMedico = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        buttonCancelar1 = new javax.swing.JButton();
        buttonCancelar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(72, 135, 195));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(150, 204, 255));
        labelTitulo.setText("Médico - Adicionar ");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(60, 0, 280, 48);

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        jPanel1.add(labelIcon);
        labelIcon.setBounds(10, 0, 50, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 550, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Detalhes do Médico");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 0, 190, 40);

        jLabel4.setText("Código");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 30, 60, 16);

        textCodigo.setEditable(false);
        textCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(textCodigo);
        textCodigo.setBounds(20, 50, 80, 40);

        jLabel5.setText("Telefone");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 100, 50, 16);
        jPanel2.add(textTelefone);
        textTelefone.setBounds(20, 120, 130, 40);

        jLabel6.setText("Data Nascimento");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(420, 90, 120, 30);

        textCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCRMActionPerformed(evt);
            }
        });
        jPanel2.add(textCRM);
        textCRM.setBounds(440, 50, 100, 40);

        buttonCancelar.setBackground(java.awt.SystemColor.activeCaption);
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar cadastro");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(240, 220, 80, 30);

        buttonSalvar.setBackground(java.awt.SystemColor.activeCaption);
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salve- (1).png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar cadastro");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(440, 370, 90, 50);

        jLabel7.setText("CRM");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(440, 30, 60, 16);

        textDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDataNascimentoActionPerformed(evt);
            }
        });
        jPanel2.add(textDataNascimento);
        textDataNascimento.setBounds(420, 120, 120, 40);

        jLabel8.setText("Nome do Médico ");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(110, 30, 96, 16);
        jPanel2.add(textNomeDoMedico);
        textNomeDoMedico.setBounds(110, 50, 320, 40);

        jLabel9.setText("E-mail");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(160, 100, 50, 16);
        jPanel2.add(textEmail);
        textEmail.setBounds(160, 120, 250, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 180, 210, 170);
        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(340, 180, 200, 170);

        buttonCancelar1.setBackground(java.awt.SystemColor.activeCaption);
        buttonCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar.png"))); // NOI18N
        buttonCancelar1.setToolTipText("Cancelar cadastro");
        buttonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelar1ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar1);
        buttonCancelar1.setBounds(340, 370, 90, 50);

        buttonCancelar2.setBackground(java.awt.SystemColor.activeCaption);
        buttonCancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar.png"))); // NOI18N
        buttonCancelar2.setToolTipText("Cancelar cadastro");
        buttonCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelar2ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar2);
        buttonCancelar2.setBounds(240, 180, 80, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 40, 550, 460);

        setBounds(0, 0, 567, 503);
    }// </editor-fold>//GEN-END:initComponents

    private void textCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoActionPerformed

    }//GEN-LAST:event_textCodigoActionPerformed

    private void textCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCRMActionPerformed

    }//GEN-LAST:event_textCRMActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        if (tipoOperacao == TipoOperacao.ADICIONAR) {
               gravar();
        } else {
               atualizar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void atualizar() {
        medico.setNome(textNomeDoMedico.getText());
        medico.setTelefone(textTelefone.getText());
        
        if(validarCadastro()){
            MedicoDAO.atualizar(medico);
            
            JOptionPane.showMessageDialog(
                null, 
                "Médico atualizado com sucesso!", 
                "Médico", 
                    JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
        } 
    }
    
    private void gravar() {
        //        Criar um objeto plano de saúde 
        Medico medico = new Medico();
        medico.setNome(textNomeDoMedico.getText());
        medico.setTelefone(textTelefone.getText());

        if (validarCadastro()) {
            MedicoDAO.gravar(medico);

            JOptionPane.showMessageDialog(
                    this,
                    "Médico gravado",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
    }
    
    private boolean validarCadastro() {
        
        if (textNomeDoMedico.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o campo Nome do Médico!",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);

            textNomeDoMedico.requestFocus();

            return false;
        }
        
        if (textTelefone.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o campo Telefone!",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);

            textTelefone.requestFocus();

            return false;
        }
        return true;
    }
    
    private void textDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDataNascimentoActionPerformed

    private void buttonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelar1ActionPerformed

    private void buttonCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonCancelar1;
    private javax.swing.JButton buttonCancelar2;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textCRM;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textDataNascimento;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNomeDoMedico;
    private javax.swing.JTextField textTelefone;
    // End of variables declaration//GEN-END:variables
}
