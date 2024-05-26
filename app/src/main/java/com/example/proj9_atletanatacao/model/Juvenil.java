package com.example.proj9_atletanatacao.model;

import androidx.annotation.NonNull;

import java.util.Date;

public class Juvenil extends Atleta{

    private int qtdAnos;


    public Juvenil(String nome, String dtNascimento, String bairro, int qtdAnos) {
        super(nome, dtNascimento, bairro);
        this.qtdAnos = qtdAnos;
    }

    public int getQtdAnos() {
        return qtdAnos;
    }

    public void setQtdAnos(int qtdAnos) {
        this.qtdAnos = qtdAnos;
    }

    @NonNull
    @Override
    public String toString() {
        return "Quantidade de anos:" + qtdAnos;
    }
}
