package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import javax.swing.JOptionPane;
import br.senai.sp.jandira.model.Especialidade;
import javax.swing.JTable;
import br.senai.sp.jandira.model.TipoOperacao;

public class PanelEspecialidade extends javax.swing.JPanel {

    int linha;
    
    public PanelEspecialidade() {
        
        initComponents();
        criarTabelaEspecialidades();  
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttonDeletarEspecialidade = new javax.swing.JButton();
        buttonEditarEspecialidade = new javax.swing.JButton();
        buttonAdicionarEspecialidade = new javax.swing.JButton();

        setBackground(java.awt.SystemColor.activeCaption);
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(740, 390));
        setLayout(null);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(300, 80));

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableEspecialidades);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 720, 290);

        buttonDeletarEspecialidade.setBackground(new java.awt.Color(72, 135, 195));
        buttonDeletarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir (1).png"))); // NOI18N
        buttonDeletarEspecialidade.setToolTipText("Deletar plano de saúde selecionado");
        buttonDeletarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeletarEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonDeletarEspecialidade);
        buttonDeletarEspecialidade.setBounds(430, 330, 90, 50);

        buttonEditarEspecialidade.setBackground(new java.awt.Color(72, 135, 195));
        buttonEditarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        buttonEditarEspecialidade.setToolTipText("Editar plano de saúde selecionado");
        buttonEditarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonEditarEspecialidade);
        buttonEditarEspecialidade.setBounds(530, 330, 90, 50);

        buttonAdicionarEspecialidade.setBackground(new java.awt.Color(72, 135, 195));
        buttonAdicionarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar.png"))); // NOI18N
        buttonAdicionarEspecialidade.setToolTipText("Adicionar um novo plano de saúde");
        buttonAdicionarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonAdicionarEspecialidade);
        buttonAdicionarEspecialidade.setBounds(630, 330, 90, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDeletarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletarEspecialidadeActionPerformed

        //      Obtemos o indice da linha selecionada na tabela
        linha = tableEspecialidades.getSelectedRow();

        //        verificamos se a linha é diferente de -1
        //        -1 significa que o usuário não selecionou nada
        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(
                this,
                "Por favor, selecione a especialidade que você deseja excluir!",
                "Especialidade",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonDeletarEspecialidadeActionPerformed

    private void buttonEditarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarEspecialidadeActionPerformed

        linha = tableEspecialidades.getSelectedRow();

        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(
                this,
                "Por favor, selecione uma especialidade para editar",
                "Planos de Saúde",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonEditarEspecialidadeActionPerformed

    private void buttonAdicionarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadeActionPerformed

        DialogEspecialidades dialogEspecialidade = new DialogEspecialidades(
            null,
            true,
            TipoOperacao.ADICIONAR,
            null);
        dialogEspecialidade.setVisible(true);

        criarTabelaEspecialidades();
    }//GEN-LAST:event_buttonAdicionarEspecialidadeActionPerformed

    private void editar() {
        
        Especialidade especialidade = EspecialidadeDAO.getEspecialidade(getCodigo());
        
        DialogEspecialidades dialogEspecialidade = new DialogEspecialidades(
                null,
                true,
                TipoOperacao.EDITAR,
                especialidade);
        
        dialogEspecialidade.setVisible(true);
        
        criarTabelaEspecialidades();
        
    }

    private void excluir() {

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão da Especialidade?",
                "Especialidade",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {

            EspecialidadeDAO.excluir(getCodigo());
            criarTabelaEspecialidades();

        }

    }
    
    private Integer getCodigo(){
        String codigoStr = tableEspecialidades.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarEspecialidade;
    private javax.swing.JButton buttonDeletarEspecialidade;
    private javax.swing.JButton buttonEditarEspecialidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaEspecialidades(){
        tableEspecialidades.setModel(EspecialidadeDAO.getTableModel());
        
        tableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(309);
        tableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(308);
        
        tableEspecialidades.getTableHeader().setReorderingAllowed(false);
        
        tableEspecialidades.setDefaultEditor(Object.class, null);
        
    }

}
