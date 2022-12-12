package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import static br.senai.sp.jandira.dao.EspecialidadeDAO.listarTodos;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
import br.senai.sp.jandira.model.Medico;
import java.util.List;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class DialogMedico extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Medico medico;

    private DefaultListModel listaTodosModel = new DefaultListModel<>();
    ArrayList<String> espStr = new ArrayList<>();

    private DefaultListModel<String> selecionadosModel = new DefaultListModel<>();
    ArrayList<String> selecionados = new ArrayList<>();

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

        carregarEspecialidades();
        carregarEspecialidadesDoMedico();
    }

    private void preencherFormulario() {
        labelTitulo.setText("Médico - " + tipoOperacao);
        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/medico.png")));
        textCodigo.setText(medico.getCodigo().toString());
        textNomeDoMedico.setText(medico.getNome());
        textTelefone.setText(medico.getTelefone());
        textCRM.setText(medico.getCrm());
        textEmail.setText(medico.getEmail());
        textDataNascimento.setText(medico.getDataNascimento());
        
    }

    private void carregarEspecialidades() {

        for (Especialidade e : EspecialidadeDAO.listarTodos()) {
            espStr.add(e.getNome());
        }

        listaTodosModel.addAll(espStr);
        listTodasEspecialidades.setModel(listaTodosModel);
    }
    
    private void carregarEspecialidadesDoMedico(){
        
        for (Especialidade e : EspecialidadeDAO.listarEspMedico()) {
            selecionados.add(e.getCodigo().toString());
        }
        
        selecionadosModel.addAll(selecionados);
        listEspecialidadesDoMedico.setModel(selecionadosModel);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelIcon = new javax.swing.JLabel();
        detalhesDoMedico = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textTelefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textCRM = new javax.swing.JTextField();
        buttonAdd = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        textDataNascimento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textNomeDoMedico = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listTodasEspecialidades = new javax.swing.JList<>();
        buttonCancelar1 = new javax.swing.JButton();
        buttonRemover = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listEspecialidadesDoMedico = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(72, 135, 195));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(150, 204, 255));
        labelTitulo.setText("Médico - Adicionar ");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(60, 10, 280, 48);

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        jPanel1.add(labelIcon);
        labelIcon.setBounds(20, 10, 50, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 60);

        detalhesDoMedico.setBackground(new java.awt.Color(255, 255, 255));
        detalhesDoMedico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        detalhesDoMedico.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Detalhes do Médico");
        detalhesDoMedico.add(jLabel3);
        jLabel3.setBounds(20, 10, 140, 40);

        jLabel4.setText("Código");
        detalhesDoMedico.add(jLabel4);
        jLabel4.setBounds(20, 60, 60, 16);

        textCodigo.setEditable(false);
        textCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoActionPerformed(evt);
            }
        });
        detalhesDoMedico.add(textCodigo);
        textCodigo.setBounds(20, 80, 100, 40);

        jLabel5.setText("Telefone");
        detalhesDoMedico.add(jLabel5);
        jLabel5.setBounds(20, 130, 50, 16);
        detalhesDoMedico.add(textTelefone);
        textTelefone.setBounds(20, 150, 150, 40);

        jLabel6.setText("Data Nascimento");
        detalhesDoMedico.add(jLabel6);
        jLabel6.setBounds(540, 120, 120, 30);

        textCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCRMActionPerformed(evt);
            }
        });
        detalhesDoMedico.add(textCRM);
        textCRM.setBounds(540, 80, 120, 40);

        buttonAdd.setBackground(java.awt.SystemColor.activeCaption);
        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/proximo.png"))); // NOI18N
        buttonAdd.setToolTipText("Cancelar cadastro");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
        detalhesDoMedico.add(buttonAdd);
        buttonAdd.setBounds(300, 240, 90, 50);

        buttonSalvar.setBackground(java.awt.SystemColor.activeCaption);
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salve- (1).png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar cadastro");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        detalhesDoMedico.add(buttonSalvar);
        buttonSalvar.setBounds(590, 480, 90, 50);

        jLabel7.setText("CRM");
        detalhesDoMedico.add(jLabel7);
        jLabel7.setBounds(540, 60, 80, 16);

        textDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDataNascimentoActionPerformed(evt);
            }
        });
        detalhesDoMedico.add(textDataNascimento);
        textDataNascimento.setBounds(540, 150, 140, 40);

        jLabel8.setText("Nome do Médico ");
        detalhesDoMedico.add(jLabel8);
        jLabel8.setBounds(140, 60, 130, 16);

        textNomeDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeDoMedicoActionPerformed(evt);
            }
        });
        detalhesDoMedico.add(textNomeDoMedico);
        textNomeDoMedico.setBounds(140, 80, 370, 40);

        jLabel9.setText("E-mail");
        detalhesDoMedico.add(jLabel9);
        jLabel9.setBounds(190, 130, 130, 16);
        detalhesDoMedico.add(textEmail);
        textEmail.setBounds(190, 150, 330, 40);

        listTodasEspecialidades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listTodasEspecialidades);

        detalhesDoMedico.add(jScrollPane2);
        jScrollPane2.setBounds(50, 210, 200, 260);

        buttonCancelar1.setBackground(java.awt.SystemColor.activeCaption);
        buttonCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar.png"))); // NOI18N
        buttonCancelar1.setToolTipText("Cancelar cadastro");
        buttonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelar1ActionPerformed(evt);
            }
        });
        detalhesDoMedico.add(buttonCancelar1);
        buttonCancelar1.setBounds(480, 480, 90, 50);

        buttonRemover.setBackground(java.awt.SystemColor.activeCaption);
        buttonRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/anterior.png"))); // NOI18N
        buttonRemover.setToolTipText("Cancelar cadastro");
        buttonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverActionPerformed(evt);
            }
        });
        detalhesDoMedico.add(buttonRemover);
        buttonRemover.setBounds(300, 310, 90, 50);

        listEspecialidadesDoMedico.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listEspecialidadesDoMedico);

        detalhesDoMedico.add(jScrollPane3);
        jScrollPane3.setBounds(430, 210, 200, 260);

        getContentPane().add(detalhesDoMedico);
        detalhesDoMedico.setBounds(0, 60, 700, 570);

        setBounds(0, 0, 713, 636);
    }// </editor-fold>//GEN-END:initComponents

    private void textCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoActionPerformed

    }//GEN-LAST:event_textCodigoActionPerformed

    private void textCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCRMActionPerformed

    }//GEN-LAST:event_textCRMActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed

        List<String> es = listTodasEspecialidades.getSelectedValuesList();

        for (String e : es) {
            selecionados.add(e);
        }

        selecionadosModel.clear();
        selecionadosModel.addAll(selecionados);
        listEspecialidadesDoMedico.setModel(selecionadosModel);

    }//GEN-LAST:event_buttonAddActionPerformed

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
        medico.setCrm(textCRM.getText());
        medico.setEmail(textEmail.getText());
        medico.setDataNascimento(textDataNascimento.getText());

        if (validarCadastro()) {
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
        //        Criar um objeto Médico
        Medico medico = new Medico();
        medico.setNome(textNomeDoMedico.getText());
        medico.setTelefone(textTelefone.getText());
        medico.setCrm(textCRM.getText());
        medico.setEmail(textEmail.getText());
        medico.setDataNascimento(textDataNascimento.getText());
        

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

    }//GEN-LAST:event_textDataNascimentoActionPerformed

    private void buttonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelar1ActionPerformed

    }//GEN-LAST:event_buttonCancelar1ActionPerformed

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed

        List<String> es = listTodasEspecialidades.getSelectedValuesList();

        for (String e : es) {
            selecionados.remove(e);
        }

        selecionadosModel.clear();
    }//GEN-LAST:event_buttonRemoverActionPerformed

    private void textNomeDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeDoMedicoActionPerformed

    }//GEN-LAST:event_textNomeDoMedicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCancelar1;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JPanel detalhesDoMedico;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<String> listEspecialidadesDoMedico;
    private javax.swing.JList<String> listTodasEspecialidades;
    private javax.swing.JTextField textCRM;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textDataNascimento;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNomeDoMedico;
    private javax.swing.JTextField textTelefone;
    // End of variables declaration//GEN-END:variables

}
