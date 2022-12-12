package br.senai.sp.jandira.model;

import java.time.LocalDate;
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
        getNome();
        getTelefone();
        atualizarCodigo();
    }
     
    public Medico(Integer codigo, String nome, String telefone){
        this.codigo = codigo;
        super.setNome(nome);
        super.setTelefone(telefone);
    }
    
    public Medico(Integer codigo, String nome, String crm, String telefone, String email, String dataNascimento, ArrayList especialidades) {
        this.codigo = codigo;
        super.setNome(nome);
        this.crm = crm;
        super.setTelefone(telefone);
        super.setEmail(email);
        super.setDataNascimento(dataNascimento);
        this.especialidades = especialidades;
        this.contador =codigo;
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
        return this.codigo + ";" + super.getNome() + ";" + this.getCrm() + ";" + super.getTelefone() + ";" + super.getEmail() + ";" + super.getDataNascimento() + this.getEspecialidade();
    }

}
