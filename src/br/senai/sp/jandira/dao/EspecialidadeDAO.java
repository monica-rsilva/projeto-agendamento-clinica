package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    private Especialidade especialidade;
    private static ArrayList<Especialidade> especialidadeList = new ArrayList<>();
    private static final String ARQUIVO = "C:\\Users\\22282167\\java\\especialidade.txt";
    private static final Path PATH = Paths.get(ARQUIVO);

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

    public static boolean excluir(Integer codigo) {

        for (Especialidade esp : especialidadeList) {
            if (esp.getCodigo().equals(codigo)) {
                especialidadeList.remove(esp);
                return true;
            }
        }
        return false;
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
    }

    public static ArrayList<Especialidade> listarTodos() {
        return especialidadeList;
    }

    public static void especialidadeTeste() {
        
        try {
            BufferedReader br = Files.newBufferedReader(PATH);
            
            String linha = "";
            
            linha = br.readLine();
            
            while(linha != null){
                String[] linhaVetor = linha.split(";");
                System.out.println(linhaVetor[0]);
                System.out.println(linhaVetor[1]);
                System.out.println(linhaVetor[2]);
                System.out.println("__________________________________");
                linha = br.readLine();
            }
            
            br.close();
            
        } catch (IOException e) {
            JOptionPane.showConfirmDialog(null, "Ocorreu um erro!");
        }
        
//        Especialidade esp1 = new Especialidade("cardiologia", "cuida do coracao");
//        Especialidade esp2 = new Especialidade("neurologia", "cuida da cabeça");
//        Especialidade esp3 = new Especialidade("pediatria", "cuida das crianças");
//        Especialidade esp4 = new Especialidade("clinico geral", "cuida do geral");
//
//        especialidadeList.add(esp1);
//        especialidadeList.add(esp2);
//        especialidadeList.add(esp3);
//        especialidadeList.add(esp4);
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
