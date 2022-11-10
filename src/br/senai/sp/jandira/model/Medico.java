package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Medico extends Pessoa {

    private String crm;
    private ArrayList<Especialidade> especialidades;
    private Integer codigo;
    private static int contador = 100;

    public ArrayList<Especialidade> getEspecialidade() {
        return especialidades;
    }

    public void setEspecialidade(ArrayList<Especialidade> especialidade) {
        this.especialidades = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public static int getContador() {
        return contador;
    }

//    private void atualizarCodigo() {
//        contador++;
//        this.codigo = contador;
//    }
    public Integer getCodigo() {
        return codigo;
    }

    public String getMedicoSeparadoPorPontoEVirgula() {
        return this.codigo + ";" + getNome() + ";" + getTelefone();
    }

}
