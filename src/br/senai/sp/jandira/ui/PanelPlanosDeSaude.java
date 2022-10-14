/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author 22282167
 */
public class PanelPlanosDeSaude extends javax.swing.JPanel {

    /**
     * Creates new form PanelPlanosDeSaude
     */
    public PanelPlanosDeSaude() {
        initComponents();
        criarTabelaPlanosDeSaude();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablePlanos = new javax.swing.JTable();
        buttonAdicionarPlanoDeSaude = new javax.swing.JButton();
        buttonDeletarPlanoDeSaude = new javax.swing.JButton();
        buttonEditarPlanoDeSaude = new javax.swing.JButton();

        setBackground(java.awt.SystemColor.activeCaption);
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(740, 390));
        setLayout(null);

        tablePlanos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablePlanos);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 720, 290);

        buttonAdicionarPlanoDeSaude.setBackground(new java.awt.Color(72, 135, 195));
        buttonAdicionarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        buttonAdicionarPlanoDeSaude.setToolTipText("Adicionar um novo plano de saúde");
        buttonAdicionarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonAdicionarPlanoDeSaude);
        buttonAdicionarPlanoDeSaude.setBounds(630, 330, 90, 50);

        buttonDeletarPlanoDeSaude.setBackground(new java.awt.Color(72, 135, 195));
        buttonDeletarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir (1).png"))); // NOI18N
        buttonDeletarPlanoDeSaude.setToolTipText("Deletar plano de saúde selecionado");
        buttonDeletarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeletarPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonDeletarPlanoDeSaude);
        buttonDeletarPlanoDeSaude.setBounds(430, 330, 90, 50);

        buttonEditarPlanoDeSaude.setBackground(new java.awt.Color(72, 135, 195));
        buttonEditarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        buttonEditarPlanoDeSaude.setToolTipText("Editar plano de saúde selecionado");
        add(buttonEditarPlanoDeSaude);
        buttonEditarPlanoDeSaude.setBounds(530, 330, 90, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarPlanoDeSaudeActionPerformed

        DialogPlanosDeSaude dialogPlanoDeSaude = new DialogPlanosDeSaude(null, true);
        dialogPlanoDeSaude.setVisible(true);
        
        criarTabelaPlanosDeSaude();
    }//GEN-LAST:event_buttonAdicionarPlanoDeSaudeActionPerformed

    private void buttonDeletarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletarPlanoDeSaudeActionPerformed
        
        
        int resposta = JOptionPane.showConfirmDialog(
                this, 
                "Você confirma a exclusão do Plano de Saúde selecionado?", 
                "Plano de Saúde", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
        
        int linha = tablePlanos.getSelectedRow();
        
        if(linha != -1){
            //excluir o plano de saude
            String codigoStr = tablePlanos.getValueAt(linha, 0).toString();
            Integer codigo = Integer.valueOf(codigoStr);
            PlanoDeSaudeDAO.excluir(codigo);
            criarTabelaPlanosDeSaude();
            
        } else {
            JOptionPane.showMessageDialog(
                    this, 
                    "Por favor, selecione o plano que você deseja excluir!", 
                    "Plano de Saúde", 
                    JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_buttonDeletarPlanoDeSaudeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarPlanoDeSaude;
    private javax.swing.JButton buttonDeletarPlanoDeSaude;
    private javax.swing.JButton buttonEditarPlanoDeSaude;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePlanos;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaPlanosDeSaude() {

        tablePlanos.setModel(PlanoDeSaudeDAO.getTableModel());

        // Desativar o redimensionamento da JTable
        tablePlanos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        //Definir a largura de cada coluna
        tablePlanos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablePlanos.getColumnModel().getColumn(1).setPreferredWidth(309);
        tablePlanos.getColumnModel().getColumn(2).setPreferredWidth(308);

        //impedir/bloquear a movimentação das colunas
        tablePlanos.getTableHeader().setReorderingAllowed(false);
        //bloquear edição das células 
        tablePlanos.setDefaultEditor(Object.class, null);
    }

}
