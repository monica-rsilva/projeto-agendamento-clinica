package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelPlanosDeSaude extends javax.swing.JPanel {

    int linha;

    public PanelPlanosDeSaude() {
        initComponents();
        criarTabelaPlanosDeSaude();
    }

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
        buttonEditarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonEditarPlanoDeSaude);
        buttonEditarPlanoDeSaude.setBounds(530, 330, 90, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarPlanoDeSaudeActionPerformed

        DialogPlanosDeSaude dialogPlanoDeSaude = new DialogPlanosDeSaude(
                null,
                true,
                TipoOperacao.ADICIONAR,
                null);
        dialogPlanoDeSaude.setVisible(true);

        criarTabelaPlanosDeSaude();
    }//GEN-LAST:event_buttonAdicionarPlanoDeSaudeActionPerformed

    private void buttonDeletarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletarPlanoDeSaudeActionPerformed

//      Obtemos o indice da linha selecionada na tabela 
        linha = tablePlanos.getSelectedRow();

//        verificamos se a linha é diferente de -1
//        -1 significa que o usuário não selecionou nada 
        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione o plano que você deseja excluir!",
                    "Plano de Saúde",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonDeletarPlanoDeSaudeActionPerformed

    private void buttonEditarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarPlanoDeSaudeActionPerformed

        linha = tablePlanos.getSelectedRow();

        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione um Plano de Saúde para editar",
                    "Planos de Saúde",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonEditarPlanoDeSaudeActionPerformed

    private void editar() {
        
        PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanoDeSaude(getCodigo());
        
        DialogPlanosDeSaude dialogPlanosDeSaude = new DialogPlanosDeSaude(
                null,
                true,
                TipoOperacao.EDITAR,
                planoDeSaude);
        
        dialogPlanosDeSaude.setVisible(true);
    }

    private void excluir() {

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão do Plano de Saúde selecionado?",
                "Plano de Saúde",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {

            PlanoDeSaudeDAO.excluir(getCodigo());
            criarTabelaPlanosDeSaude();

        }

    }
    
    private Integer getCodigo(){
        String codigoStr = tablePlanos.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
    }

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

//Escopo de visibilidade
//a variável é visivel somente dentro do bloco de código que ela foi criada
//if (true){
// int a = 10;
//}
//sysout(a); 
//Assim não irá funcionar, pois o "a" está dentro do método e o sysout está chamando ele fora 
