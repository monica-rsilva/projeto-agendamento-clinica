package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        initComponents();
        PlanoDeSaudeDAO.getListaPlanosDeSaude();
        EspecialidadeDAO.getListaEspecialidade();
        initPanels();
        
    }
    
//    Atributos da classe
    PanelPlanosDeSaude panelPlanosDeSaude;
    PanelEspecialidade panelEspecialidade;
    
//    Constantes da classe 
    private final int POSICAO_X = 10;
    private final int POSICAO_Y= 140;
    private final int LARGURA= 740;
    private final int ALTURA= 390;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelIcone = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPlanosDeSaude = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buttonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(72, 135, 195));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(150, 204, 255));
        labelTitulo.setText("Sistema de Agendamento de Consultas");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(90, 10, 530, 40);

        labelIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/calendario.png"))); // NOI18N
        jPanel1.add(labelIcone);
        labelIcone.setBounds(40, 10, 50, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 770, 60);

        buttonSair.setBackground(java.awt.SystemColor.activeCaption);
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/sair (1).png"))); // NOI18N
        buttonSair.setToolTipText("Sair");
        getContentPane().add(buttonSair);
        buttonSair.setBounds(660, 70, 90, 50);
        buttonSair.getAccessibleContext().setAccessibleDescription("");

        buttonAgenda.setBackground(java.awt.SystemColor.activeCaption);
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/contato.png"))); // NOI18N
        buttonAgenda.setToolTipText("Agenda");
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(110, 70, 90, 50);

        buttonPacientes.setBackground(java.awt.SystemColor.activeCaption);
        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/paciente.png"))); // NOI18N
        buttonPacientes.setToolTipText("Pacientes");
        buttonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(210, 70, 90, 50);

        buttonMedicos.setBackground(java.awt.SystemColor.activeCaption);
        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/medico.png"))); // NOI18N
        buttonMedicos.setToolTipText("Médicos");
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(310, 70, 90, 50);

        buttonEspecialidades.setBackground(java.awt.SystemColor.activeCaption);
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/especialista.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Especialidades");
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(410, 70, 90, 50);

        buttonPlanosDeSaude.setBackground(java.awt.SystemColor.activeCaption);
        buttonPlanosDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plano-de-saude.png"))); // NOI18N
        buttonPlanosDeSaude.setToolTipText("Planos de Saúde");
        buttonPlanosDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanosDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanosDeSaude);
        buttonPlanosDeSaude.setBounds(510, 70, 90, 50);

        panelHome.setBackground(java.awt.SystemColor.activeCaption);
        panelHome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(153, 0, 0))); // NOI18N
        panelHome.setToolTipText("");
        panelHome.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("SISACON");
        panelHome.add(jLabel1);
        jLabel1.setBounds(60, 70, 220, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Sistema para Agendamento de Consultas");
        panelHome.add(jLabel2);
        jLabel2.setBounds(60, 110, 340, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Dados para Contato");
        panelHome.add(jLabel3);
        jLabel3.setBounds(60, 220, 180, 20);

        jLabel4.setText("E-mail suporte@sisacon.com.br");
        panelHome.add(jLabel4);
        jLabel4.setBounds(60, 250, 200, 16);

        jLabel5.setText("Telefone (11) 95555-5555");
        panelHome.add(jLabel5);
        jLabel5.setBounds(60, 270, 170, 16);

        jLabel6.setText("Site www.sisacon.com.br");
        panelHome.add(jLabel6);
        jLabel6.setBounds(60, 290, 170, 16);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 140, 740, 390);

        buttonHome.setBackground(java.awt.SystemColor.activeCaption);
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/botao-home.png"))); // NOI18N
        buttonHome.setToolTipText("Voltar ao início");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(10, 70, 90, 50);

        setBounds(0, 0, 779, 573);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMedicosActionPerformed

    private void buttonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacientesActionPerformed

    private void buttonPlanosDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanosDeSaudeActionPerformed
//        JOptionPane.showMessageDialog(this, "teste");
        panelHome.setVisible(false);
        panelPlanosDeSaude.setVisible(true);
        buttonPlanosDeSaude.setBackground(new java.awt.Color(72, 135, 195));
        buttonHome.setBackground(java.awt.SystemColor.activeCaption);
        buttonEspecialidades.setBackground(java.awt.SystemColor.activeCaption);
        
    }//GEN-LAST:event_buttonPlanosDeSaudeActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
         panelHome.setVisible(true);
         panelPlanosDeSaude.setVisible(false);
         buttonHome.setBackground(new java.awt.Color(72, 135, 195));
         buttonPlanosDeSaude.setBackground(java.awt.SystemColor.activeCaption);
         buttonEspecialidades.setBackground(java.awt.SystemColor.activeCaption);
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        panelHome.setVisible(false);
        panelPlanosDeSaude.setVisible(false);
        panelEspecialidade.setVisible(true);
        buttonEspecialidades.setBackground(new java.awt.Color(72, 135, 195));
        buttonPlanosDeSaude.setBackground(java.awt.SystemColor.activeCaption);
        buttonHome.setBackground(java.awt.SystemColor.activeCaption);
        
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanosDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelIcone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        panelPlanosDeSaude = new PanelPlanosDeSaude();
        panelPlanosDeSaude.setBounds(POSICAO_X, POSICAO_Y, LARGURA, ALTURA);
        getContentPane().add(panelPlanosDeSaude);
        panelPlanosDeSaude.setVisible(false);
        
        panelEspecialidade = new PanelEspecialidade();
        panelEspecialidade.setBounds(POSICAO_X, POSICAO_Y, LARGURA, ALTURA);
        getContentPane().add(panelEspecialidade);
        panelEspecialidade.setVisible(false);
        
    }   
}
