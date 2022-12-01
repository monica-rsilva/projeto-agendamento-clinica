package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    private Especialidade especialidade;
    private static ArrayList<Especialidade> especialidadeList = new ArrayList<>();
    
    private Especialidade especialidadeMedico;
    private static ArrayList<Especialidade> especialidadeListMedico = new ArrayList<>();
    
    
    private static final String ARQUIVO = "C:\\Users\\22282167\\java\\especialidade.txt";
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282167\\java\\especialidade_temp.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);
    
//    private static final String ARQUIVOMEDICO = "C:\\Users\\22282167\\java\\especialidadeMedico.txt";
//    private static final Path PATHMEDICO = Paths.get(ARQUIVOMEDICO);

    public EspecialidadeDAO(Especialidade especialidade) {
        this.especialidadeList.add(especialidade);
    }

    public EspecialidadeDAO() {

    }

    public static void gravar(Especialidade especialidade) {
        especialidadeList.add(especialidade);

        try {
            //Gravar o plano de saúde no arquivo texto
            BufferedWriter bw = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            bw.write(especialidade.getEspecialidadeSeparadoPorPontoEVirgula());
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
    
//    public static void gravarEspMedico(Especialidade especialidadeMedico) {
//        especialidadeListMedico.add(especialidadeMedico);
//
//        try {
//            //Gravar o plano de saúde no arquivo texto
//            BufferedWriter bw = Files.newBufferedWriter(PATHMEDICO,
//                    StandardOpenOption.APPEND,
//                    StandardOpenOption.WRITE);
//
//            bw.write(especialidadeMedico.getEspecialidadeSeparadoPorPontoEVirgula());
//            bw.newLine();
//            bw.close();
//
//        } catch (IOException ex) {
//            JOptionPane.showMessageDialog(
//                    null,
//                    "Ocorreu um erro ao gravar.\n\nEntre em contato com o suporte",
//                    "Erro ao gravar",
//                    JOptionPane.ERROR_MESSAGE);
//        }
//
//    }

    public static boolean excluir(Integer codigo) {

        for (Especialidade esp : especialidadeList) {
            if (esp.getCodigo().equals(codigo)) {
                especialidadeList.remove(esp);
                break;
            }
        }
        
        atualizarArquivo();

        return false;
    }
    
    private static void atualizarArquivo(){
        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_TEMP);

        try {

            arquivoTemp.createNewFile();

            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            for (Especialidade e : especialidadeList) {
                bwTemp.write(e.getEspecialidadeSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }

            bwTemp.close();

            arquivoAtual.delete();

            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao criar o arquivo",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);

        }
    }

    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade esp : especialidadeList) {
            if (esp.getCodigo().equals(codigo)) {
                return esp;
            }
        }
        return null;
    }

    public static void atualizar(Especialidade especialidade) {
        for (Especialidade esp : especialidadeList) {
            if (esp.getCodigo().equals(especialidade.getCodigo())) {
                especialidadeList.set(especialidadeList.indexOf(esp), especialidade);
                break;
            }
        }
        
        atualizarArquivo();
    }

    public static ArrayList<Especialidade> listarTodos() {
        return especialidadeList;
    }
    
    public static ArrayList<Especialidade> listarEspMedico(){
        return especialidadeListMedico;
    }
    
    public static void getListaEspecialidade() {

        try {

            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");
                Especialidade novaEspecialidade = new Especialidade(
                        Integer.valueOf(linhaVetor[0]),
                        linhaVetor[1],
                        linhaVetor[2]);

                especialidadeList.add(novaEspecialidade);

                linha = br.readLine();

            }

            br.close();

        } catch (IOException ex) {
            JOptionPane.showConfirmDialog(
                    null,
                    "Ocorreu um erro ao abrir o arquivo",
                    "Erro ao ler o arquivo",
                    JOptionPane.ERROR_MESSAGE);
        }
        
    }

    public static DefaultTableModel getTableModel() {

        Object[][] dados = new Object[especialidadeList.size()][3];

        int i = 0;
        for (Especialidade esp : especialidadeList) {
            dados[i][0] = esp.getCodigo();
            dados[i][1] = esp.getNome();
            dados[i][2] = esp.getDescricao();
            i++;
        }

        String[] titulos = {"Código", "Especialidade", "Descrição"};

        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;

    }

}
