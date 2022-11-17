package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

    private Medico medico;
    private static ArrayList<Medico> medicoList = new ArrayList<>();
    private static final String ARQUIVO = "C:\\Users\\22282167\\java\\medico.txt";
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282167\\java\\medico_temp.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);
    
    public MedicoDAO(Medico medico) {
        this.medicoList.add(medico);
    }

    public MedicoDAO() {

    }

    public static void gravar(Medico medico) {
        medicoList.add(medico);
        
        try {
            //Gravar o Médico no arquivo texto
            BufferedWriter bw = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            bw.write(medico.getMedicoSeparadoPorPontoEVirgula());
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
        for (Medico m : medicoList) {
            if (m.getCodigo().equals(codigo)) {
                medicoList.remove(m);
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
//          Criar o arquivo temporário para escrita 
            arquivoTemp.createNewFile();

            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
//          Iterar na lista para adicionar os planos no arquivo temporário
            for (Medico m : medicoList) {
                bwTemp.write(m.getMedicoSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }

            bwTemp.close();

//            Excluir o arquivo atual - plano_de_saude.txt
            arquivoAtual.delete();

//            Renomear o arquivo temporário
            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException ex) {
            JOptionPane.showConfirmDialog(
                    null,
                    "Ocorreu um erro ao criar o arquivo",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static Medico getMedico(Integer codigo) {
        for (Medico m : medicoList) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;
    }

    public static void atualizar(Medico medico) {
        for (Medico m : medicoList) {
            if (m.getCodigo().equals(medico.getCodigo())) {
                medicoList.set(medicoList.indexOf(m), medico);
                break;
            }
        }
        atualizarArquivo();
    }
    
    public static ArrayList<Medico> listarTodos() {
        return medicoList;
    }
    
    public static void getListaMedicos() {

        try {
            // Abrir o arquivo para leitura - Leitor

            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");
                Medico novoMedico = new Medico(
                        Integer.valueOf(linhaVetor[0]),
                        linhaVetor[1],
                        linhaVetor[2]);

                medicoList.add(novoMedico);

                linha = br.readLine();
            }

            br.close();

        } catch (IOException ex) {
            JOptionPane.showConfirmDialog(
                    null,
                    "Ocorreu um erro ao abrir o arquivo",
                    "Erro de leitura",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static DefaultTableModel getTableModel() {
        Object[][] dados = new Object[medicoList.size()][3];

        int i = 0;
        for (Medico m : medicoList) {
            dados[i][0] = m.getCodigo();
            dados[i][1] = m.getNome();
            dados[i][2] = m.getTelefone();
            i++;
        }

        String[] titulos = {"Código", "Nome", "Telefone"};

        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
        return tableModel;
    }

}
