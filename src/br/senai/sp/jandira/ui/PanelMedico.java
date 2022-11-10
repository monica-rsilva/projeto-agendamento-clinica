package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import javax.swing.JOptionPane;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JTable;

public class PanelMedico extends javax.swing.JPanel {
    
    int linha;

    public PanelMedico() {
        initComponents();
        criarTabelaMedico();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableMedicos = new javax.swing.JTable();
        buttonDeletarMedico = new javax.swing.JButton();
        buttonEditarMedico = new javax.swing.JButton();
        buttonAdicionarMedico = new javax.swing.JButton();

        setBackground(java.awt.SystemColor.activeCaption);
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(740, 390));
        setLayout(null);

        tableMedicos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableMedicos);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 720, 290);

        buttonDeletarMedico.setBackground(new java.awt.Color(72, 135, 195));
        buttonDeletarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir (1).png"))); // NOI18N
        buttonDeletarMedico.setToolTipText("Deletar plano de saúde selecionado");
        buttonDeletarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeletarMedicoActionPerformed(evt);
            }
        });
        add(buttonDeletarMedico);
        buttonDeletarMedico.setBounds(430, 330, 90, 50);

        buttonEditarMedico.setBackground(new java.awt.Color(72, 135, 195));
        buttonEditarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        buttonEditarMedico.setToolTipText("Editar plano de saúde selecionado");
        buttonEditarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarMedicoActionPerformed(evt);
            }
        });
        add(buttonEditarMedico);
        buttonEditarMedico.setBounds(530, 330, 90, 50);

        buttonAdicionarMedico.setBackground(new java.awt.Color(72, 135, 195));
        buttonAdicionarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        buttonAdicionarMedico.setToolTipText("Adicionar um novo plano de saúde");
        buttonAdicionarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarMedicoActionPerformed(evt);
            }
        });
        add(buttonAdicionarMedico);
        buttonAdicionarMedico.setBounds(630, 330, 90, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDeletarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletarMedicoActionPerformed

        //      Obtemos o indice da linha selecionada na tabela
        linha = tableMedicos.getSelectedRow();

        //        verificamos se a linha é diferente de -1
        //        -1 significa que o usuário não selecionou nada
        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(
                this,
                "Por favor, selecione o Médico que você deseja excluir!",
                "Médico",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonDeletarMedicoActionPerformed

    private void buttonEditarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarMedicoActionPerformed

        linha = tableMedicos.getSelectedRow();

        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(
                this,
                "Por favor, selecione um Médico para editar",
                "Médico",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonEditarMedicoActionPerformed

    private void editar() {
        
//        Medico medico = MedicoDAO.getMedico(getCodigo());
//        
//        DialogPlanosDeSaude dialogPlanosDeSaude = new DialogPlanosDeSaude(
//                null,
//                true,
//                TipoOperacao.EDITAR,
//                medico);
//        
//        dialogPlanosDeSaude.setVisible(true);
        
        criarTabelaMedico();
        
    }
    
    private void excluir() {

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão do Plano de Saúde selecionado?",
                "Plano de Saúde",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {

            MedicoDAO.excluir(getCodigo());
            criarTabelaMedico();

        }

    }
    
    private void buttonAdicionarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarMedicoActionPerformed

        DialogPlanosDeSaude dialogPlanoDeSaude = new DialogPlanosDeSaude(
            null,
            true,
            TipoOperacao.ADICIONAR,
            null);
        dialogPlanoDeSaude.setVisible(true);

        criarTabelaMedico();
        
    }//GEN-LAST:event_buttonAdicionarMedicoActionPerformed

    private Integer getCodigo(){
        String codigoStr = tableMedicos.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarMedico;
    private javax.swing.JButton buttonDeletarMedico;
    private javax.swing.JButton buttonEditarMedico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMedicos;
    // End of variables declaration//GEN-END:variables
        
    private void criarTabelaMedico() {

        tableMedicos.setModel(MedicoDAO.getTableModel());

        // Desativar o redimensionamento da JTable
        tableMedicos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        //Definir a largura de cada coluna
        tableMedicos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableMedicos.getColumnModel().getColumn(1).setPreferredWidth(309);
        tableMedicos.getColumnModel().getColumn(2).setPreferredWidth(308);

        //impedir/bloquear a movimentação das colunas
        tableMedicos.getTableHeader().setReorderingAllowed(false);
        //bloquear edição das células 
        tableMedicos.setDefaultEditor(Object.class, null);
    }
}


