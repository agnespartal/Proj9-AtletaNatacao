package com.example.proj9_atletanatacao.model;

import androidx.annotation.NonNull;

import java.util.Date;

public class Senior extends Atleta{

    private String problemaCardiaco;

    public Senior(String nome, String dtNascimento, String bairro, String problemaCardiaco) {
        super(nome, dtNascimento, bairro);
        this.problemaCardiaco = problemaCardiaco;
    }

    public String getProblemaCardiaco() {
        return problemaCardiaco;
    }

    public void setProblemaCardiaco(String problemaCardiaco) {
        this.problemaCardiaco = problemaCardiaco;
    }

    @NonNull
    @Override
    public String toString() {
        return "Possui problema cardiáco: " + problemaCardiaco;
    }
}
