package com.example.proj9_atletanatacao;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.proj9_atletanatacao.model.Senior;


public class AtletaSeniorFragment extends Fragment {

    private EditText txtNome;
    private EditText txtdtNascimento;
    private EditText txtBairro;
    private CheckBox cbProblema;
    private View view;

    public AtletaSeniorFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_atleta_senior, container, false);
        txtNome = view.findViewById(R.id.txtNome);
        txtBairro = view.findViewById(R.id.txtBairro);
        txtdtNascimento = view.findViewById(R.id.txtdtNascimento);
        cbProblema = view.findViewById(R.id.cbProblema);
        Button btnCadastro = view.findViewById(R.id.btnCadastrar);
        btnCadastro.setOnClickListener(op-> Cadastrar());


        return view;
    }

    private void Cadastrar() {
        String nome = txtNome.getText().toString();
        String dtNasc = txtdtNascimento.getText().toString();
        String bairro = txtBairro.getText().toString();
        String problema = "";
        if(cbProblema.isChecked()){
            problema = "Sim";
        }
        else {
            problema = "Não";
        }
        Senior senior = new Senior(nome, dtNasc,bairro,problema);
        senior.setNome(nome);
        senior.setBairro(bairro);
        senior.setProblemaCardiaco(problema);
        senior.setDtNascimento(dtNasc);


        Toast.makeText(view.getContext(), senior.toString(), Toast.LENGTH_LONG).show();
    }
}