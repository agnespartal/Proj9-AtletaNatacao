package com.example.proj9_atletanatacao;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.proj9_atletanatacao.model.Outros;


public class OutrosAtletasFragment extends Fragment {

    private EditText txtNome;
    private EditText txtdtNascimento;
    private EditText txtBairro;
    private EditText txtnomeAcademia;
    private EditText txtRecorde;
    private View view;


    public OutrosAtletasFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_atleta_outros, container, false);

        txtNome = view.findViewById(R.id.txtNome);
        txtBairro = view.findViewById(R.id.txtBairro);
        txtdtNascimento = view.findViewById(R.id.txtdtNascimento);
        txtnomeAcademia = view.findViewById(R.id.txtnomeAcademia);
        txtRecorde = view.findViewById(R.id.txtRecorde);

        Button btnCadastro = view.findViewById(R.id.btnCadastrar);
        btnCadastro.setOnClickListener(op-> Cadastrar());

        return view;
    }

    private void Cadastrar() {
        String nome = txtNome.getText().toString();
        String dtNasc = txtdtNascimento.getText().toString();
        String bairro = txtBairro.getText().toString();
        String nomeAcademia = txtnomeAcademia.getText().toString();
        int recorde = Integer.parseInt(txtRecorde.getText().toString());

        Outros outros = new Outros(nome, dtNasc,bairro,nomeAcademia,recorde);
        outros.setNome(nome);
        outros.setBairro(bairro);
        outros.setDtNascimento(dtNasc);
        outros.setRecorde(recorde);
        outros.setNomeAcademia(nomeAcademia);

        Toast.makeText(view.getContext(), outros.toString(), Toast.LENGTH_LONG).show();
    }
}