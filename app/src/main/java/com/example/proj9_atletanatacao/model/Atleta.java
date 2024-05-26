package com.example.proj9_atletanatacao.model;

import androidx.annotation.NonNull;

import java.util.Date;

public class Atleta {

    private String nome;
    private String dtNascimento;
    private String bairro;


    public Atleta(String nome, String dtNascimento, String bairro) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.bairro = bairro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @NonNull
    @Override
    public String toString() {
        return "Nome: " + nome + "\nData Nascimento: " + dtNascimento + "\nBairro: " + bairro + "\n";
    }
}
