
package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import java.time.format.DateTimeParseException;


public class Pessoa {
    private String nome;
    private String telefone;
    private String email;
    private LocalDate dataNascimento;
    
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento.format(formatter);
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = LocalDate.parse(dataNascimento, formatter);
    }
    
}

