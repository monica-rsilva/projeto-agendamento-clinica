package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

    private Medico medico;
    private static ArrayList<Medico> medicoList = new ArrayList<>();

    public MedicoDAO(Medico medico) {
        this.medicoList.add(medico);
    }

    public MedicoDAO() {

    }

    public static void gravar(Medico medico) {
        medicoList.add(medico);
    }

    public static boolean excluir(Integer codigo) {
        for (Medico m : medicoList) {
            if (m.getCodigo().equals(codigo)) {
                medicoList.remove(m);
                break;
            }
        }
        return false;
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
//        atualizarArquivo();
    }

    public static ArrayList<Medico> listarTodos() {
        return medicoList;
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
