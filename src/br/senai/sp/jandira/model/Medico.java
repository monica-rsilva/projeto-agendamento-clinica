package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Medico extends Pessoa {

    private static int contador = 100;
    private String crm;
    private ArrayList<Especialidade> especialidades;
    private Integer codigo;
    
    public ArrayList<Especialidade> getEspecialidade() {
        return especialidades;
    }

    public Medico() {
        atualizarCodigo();
    }
    
     public Medico(String nome, String telefone) {
        super.getNome();
        super.getTelefone();
        atualizarCodigo();
    }
    
    public Medico(Integer codigo, String nome, String telefone) {
        this.codigo = codigo;
        super.getNome();
        super.getTelefone();
        this.contador = this.codigo;
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

    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public String getMedicoSeparadoPorPontoEVirgula() {
        return this.codigo + ";" + getNome() + ";" + getTelefone();
    }

}
