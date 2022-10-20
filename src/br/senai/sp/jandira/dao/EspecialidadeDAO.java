package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    private Especialidade especialidade;
    private static ArrayList<Especialidade> especialidadeList = new ArrayList<>();

    public EspecialidadeDAO(Especialidade especialidade) {
        this.especialidadeList.add(especialidade);
    }

    public EspecialidadeDAO() {

    }

    public static void gravar(Especialidade especialidade) {
        especialidadeList.add(especialidade);
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
    
    public static void atualizar(Especialidade especialidade){
        for(Especialidade esp : especialidadeList){
            if(esp.getCodigo().equals(especialidade.getCodigo())){
            especialidadeList.set(especialidadeList.indexOf(esp), especialidade);
            break;
            }
        }
    }
    
    public static ArrayList<Especialidade> listarTodos() {
        return especialidadeList;
    }
    
    public static void especialidadeTeste(){
        Especialidade esp1 = new Especialidade("cardiologia", "cuida do coracao");
        Especialidade esp2 = new Especialidade("neurologia", "cuida da cabeça");
        Especialidade esp3 = new Especialidade("pediatria", "cuida das crianças");
        Especialidade esp4 = new Especialidade("clinico geral", "cuida do geral");
        
        especialidadeList.add(esp1);
        especialidadeList.add(esp2);
        especialidadeList.add(esp3);
        especialidadeList.add(esp4);
    }
    
    public static DefaultTableModel getTableModel(){
        
        Object [][] dados = new Object [especialidadeList.size()] [3];
        
        int i = 0;
        for(Especialidade esp : especialidadeList) {
            dados[i][0] = esp.getCodigo();
            dados[i][1] = esp.getNome();
            dados[i][2] = esp.getDescricao();
            i++;
        }
        
        String [] titulos = {"Código" , "Especialidade" , "Descrição"};
        
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
                
        return tableModel;
        
    }
        
}
