package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO { // Simular nosso banco de dados

    private PlanoDeSaude planoDeSaude;
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();
    private static final String ARQUIVO = "C:\\Users\\22282167\\java\\plano_de_saude.txt";
    private static final Path PATH = Paths.get(ARQUIVO);

    public PlanoDeSaudeDAO(PlanoDeSaude planoDeSaude) {
        this.planos.add(planoDeSaude);
    }

    public PlanoDeSaudeDAO() {

    }

    public static void gravar(PlanoDeSaude planoDeSaude) {
        planos.add(planoDeSaude);

        try {
            //Gravar o plano de saúde no arquivo texto
            BufferedWriter bw = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            bw.write(planoDeSaude.getPlanoDeSaudeSeparadoPorPontoEVirgula());
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao gravar.\n\nEntre em contato com o suporte",
                    "Erro ao gravar",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static boolean excluir(Integer codigo) {

        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(codigo)) {
                planos.remove(p);
                return true;
            }
        }
        return false;
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {

        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }

        return null;
    }

    public static void atualizar(PlanoDeSaude planoDeSaude) {
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(planoDeSaude.getCodigo())) {
                planos.set(planos.indexOf(p), planoDeSaude);
                break;
            }
        }
    }

    public static ArrayList<PlanoDeSaude> listarTodos() {
        return planos;
    }

    public static void criarPlanosDeSaudeTeste() {
        PlanoDeSaude p1 = new PlanoDeSaude("Unimed", "Bronze");
        PlanoDeSaude p2 = new PlanoDeSaude("Unimed", "Ouro");
        PlanoDeSaude p3 = new PlanoDeSaude("Amil", "Advanced");
        PlanoDeSaude p4 = new PlanoDeSaude("Bradesco", "Exclusive");

        planos.add(p1);
        planos.add(p2);
        planos.add(p3);
        planos.add(p4);
    }

    public static DefaultTableModel getTableModel() {

        //Matriz que receberá os planos de saúde
        //que serão utilizados na Tabela(JTable)
        Object[][] dados = new Object[planos.size()][3];

        //for Each, para extrair cada objeto plano de saúde do
        //arraylist planos e separar cada dado na matriz dados
        int i = 0;
        for (PlanoDeSaude p : planos) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getTipoDoPlano();
            i++;
        }

        //Definir um vetor com os nomes da tabela
        String[] titulos = {"Código", "Nome da Operadora", "Tipo do Plano"};

        //Criar um modelo que será utilizado pela Jtable
        //para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;
    }

}
