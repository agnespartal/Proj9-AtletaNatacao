package com.example.proj9_atletanatacao;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.proj9_atletanatacao.model.Juvenil;


public class AtletaJuvenilFragment extends Fragment {

    private EditText txtNome;
    private EditText txtdtNascimento;
    private EditText txtBairro;
    private EditText txtqtdAnos;
    private View view;

    public AtletaJuvenilFragment() {
      super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_atleta_juvenil, container, false);
        txtNome = view.findViewById(R.id.txtNome);
        txtBairro = view.findViewById(R.id.txtBairro);
        txtdtNascimento = view.findViewById(R.id.txtdtNascimento);
        txtqtdAnos = view.findViewById(R.id.txtqtdAnos);

        Button btnCadastro = view.findViewById(R.id.btnCadastrar);
        btnCadastro.setOnClickListener(op -> Cadastrar());

        return view;
    }

    private void Cadastrar() {
        String nome = txtNome.getText().toString();
        String dtNasc = txtdtNascimento.getText().toString();
        String bairro = txtBairro.getText().toString();
        int qtdAnos = Integer.parseInt(txtqtdAnos.getText().toString());
        Juvenil juvenil = new Juvenil(nome, dtNasc, bairro, qtdAnos);
        juvenil.setBairro(bairro);
        juvenil.setQtdAnos(qtdAnos);
        juvenil.setNome(nome);
        juvenil.setDtNascimento(dtNasc);

        Toast.makeText(view.getContext(), juvenil.toString(), Toast.LENGTH_LONG).show();
    }
}