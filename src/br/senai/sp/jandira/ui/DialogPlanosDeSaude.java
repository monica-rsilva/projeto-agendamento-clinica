package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;

public class DialogPlanosDeSaude extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private PlanoDeSaude planoDeSaude;

    public DialogPlanosDeSaude(
            java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            PlanoDeSaude planoDeSaude) {

        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.planoDeSaude = planoDeSaude;

        //Preencher os campos, caso o tipo de operação for EDITAR
        if (tipoOperacao == TipoOperacao.EDITAR) {
            preencherFormulario();
        }

    }

    private void preencherFormulario() {
        labelTitulo.setText("Planos de Saúde - " + tipoOperacao);
        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png")));
        textCodigo.setText(planoDeSaude.getCodigo().toString());
        textNomeDaOperadora.setText(planoDeSaude.getOperadora());
        textTipoDoPlano.setText(planoDeSaude.getTipoDoPlano());
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
        textNomeDaOperadora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textTipoDoPlano = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(72, 135, 195));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(150, 204, 255));
        labelTitulo.setText("Planos de Saúde - Adicionar ");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(90, 10, 380, 48);

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        jPanel1.add(labelIcon);
        labelIcon.setBounds(40, 10, 50, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 550, 60);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Detalhes do Plano de Saúde");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 10, 190, 40);

        jLabel4.setText("Código");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 70, 60, 16);

        textCodigo.setEditable(false);
        textCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(textCodigo);
        textCodigo.setBounds(20, 90, 110, 40);

        jLabel5.setText("Nome da Operadora ");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 140, 130, 16);
        jPanel2.add(textNomeDaOperadora);
        textNomeDaOperadora.setBounds(20, 160, 490, 40);

        jLabel6.setText("Tipo do Plano");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 210, 110, 30);

        textTipoDoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTipoDoPlanoActionPerformed(evt);
            }
        });
        jPanel2.add(textTipoDoPlano);
        textTipoDoPlano.setBounds(20, 240, 490, 40);

        buttonCancelar.setBackground(java.awt.SystemColor.activeCaption);
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar cadastro");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(320, 320, 90, 50);

        buttonSalvar.setBackground(java.awt.SystemColor.activeCaption);
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salve- (1).png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar cadastro");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(420, 320, 90, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 70, 530, 390);

        setBounds(0, 0, 567, 503);
    }// </editor-fold>//GEN-END:initComponents

    private void textCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoActionPerformed

    }//GEN-LAST:event_textCodigoActionPerformed

    private void textTipoDoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTipoDoPlanoActionPerformed

    }//GEN-LAST:event_textTipoDoPlanoActionPerformed

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
        planoDeSaude.setOperadora(textNomeDaOperadora.getText());
        planoDeSaude.setTipoDoPlano(textTipoDoPlano.getText());
        PlanoDeSaudeDAO.atualizar(planoDeSaude);
        JOptionPane.showMessageDialog(
                null, 
                "Plano de Saúde atualizado com sucesso!", 
                "Plano de Saúde", 
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }

    private void gravar() {
        //        Criar um objeto plano de saúde 
        PlanoDeSaude planoDeSaude = new PlanoDeSaude();
        planoDeSaude.setOperadora(textNomeDaOperadora.getText());
        planoDeSaude.setTipoDoPlano(textTipoDoPlano.getText());

        if (validarCadastro()) {
            PlanoDeSaudeDAO.gravar(planoDeSaude);

            JOptionPane.showMessageDialog(
                    this,
                    "Plano de saúde gravado",
                    "Plano de Saúde",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
    }

    private boolean validarCadastro() {
        if (textNomeDaOperadora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o campo Nome da Operadora!",
                    "Plano de saúde",
                    JOptionPane.INFORMATION_MESSAGE);

            textNomeDaOperadora.requestFocus();

            return false;
        }
        if (textTipoDoPlano.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o campo Tipo da Operadora!",
                    "Plano de saúde",
                    JOptionPane.INFORMATION_MESSAGE);

            textTipoDoPlano.requestFocus();

            return false;
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textNomeDaOperadora;
    private javax.swing.JTextField textTipoDoPlano;
    // End of variables declaration//GEN-END:variables
}
