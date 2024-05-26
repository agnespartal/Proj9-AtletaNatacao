package com.example.proj9_atletanatacao.model;

import androidx.annotation.NonNull;

import java.util.Date;

public class Outros extends Atleta{

    private String nomeAcademia;
    private int recorde;

    public Outros(String nome, String dtNascimento, String bairro, String nomeAcademia, int recorde) {
        super(nome, dtNascimento, bairro);
        this.nomeAcademia = nomeAcademia;
        this.recorde = recorde;
    }

    public String getNomeAcademia() {
        return nomeAcademia;
    }

    public void setNomeAcademia(String nomeAcademia) {
        this.nomeAcademia = nomeAcademia;
    }

    public int getRecorde() {
        return recorde;
    }

    public void setRecorde(int recorde) {
        this.recorde = recorde;
    }

    @NonNull
    @Override
    public String toString() {
        return "Nome da Academia: " + nomeAcademia + "\nRecorde: " + recorde + "s";
    }
}
