package com.example.trabalhoa2;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    //Criando as variáveis.
    EditText name, valor;
    TextView res;
    Button btvoltar;
    RadioGroup Radiogroup;
    Button btdolar, bteuro, btlibra;
    String NomeRecebido;
    Double ValorRecebido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Ligando os ouvintes(IDs).
        name = findViewById(R.id.name);
        valor = findViewById(R.id.valor);
        res = findViewById(R.id.res);
        btvoltar = findViewById(R.id.btvoltar);
        btdolar = findViewById(R.id.btdolar);
        bteuro = findViewById(R.id.bteuro);
        btlibra = findViewById(R.id.btlibra);
        //Botão do Dólar
        btdolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Exceção do Java para evitar erros.
                try {
                    NomeRecebido = name.getText().toString();
                    ValorRecebido = Double.parseDouble(valor.getText().toString().trim());
                    //Cotação do Dólar.
                    Double Dolar = 5.89;
                    //Criando variável para conversão.
                    Double ValorConvertido = ValorRecebido * Dolar;
                    //Exibe a resposta.
                    res.setText(String.format(
                            "Prezado! %s\n Se você receber tanto em U$ %.2f,\n você vai ter R$ %.2f em reais.",
                            NomeRecebido, ValorRecebido, ValorConvertido));
                } catch (Exception e) {
                    res.setText("Insira valores corretos!");
                }
            }
        });
        //Botão da Libra.
        btlibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Exceção do Java para evitar erros.
                try {
                    NomeRecebido = name.getText().toString();
                    ValorRecebido = Double.parseDouble(valor.getText().toString().trim());
                    //Cotação da Libra.
                    Double Libra = 7.73;
                    //Criando variável para conversão.
                    Double ValorConvertido = ValorRecebido * Libra;
                    //Exibe a resposta.
                    res.setText(String.format(
                            "Prezado! %s\n Se você receber tanto em GBP %.2f, \n você vai ter R$ %.2f em reais.",
                            NomeRecebido, ValorRecebido, ValorConvertido));
                } catch (Exception e) {
                    res.setText("Insira valores corretos!");
                }
            }
        });
        //Botão do Euro.
        bteuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Exceção do Java para evitar erros.
                try {
                    NomeRecebido = name.getText().toString();
                    ValorRecebido = Double.parseDouble(valor.getText().toString());
                    // Cotação do Euro.
                    Double Euro = 6.64;
                    // Criando variável para conversão.
                    Double ValorConvertido = ValorRecebido * Euro;
                    //Exibe a resposta.
                    res.setText(String.format(
                            "Prezado! %s\n Se você receber tanto em EUR %.2f, \n você vai ter %.2f em reais.",
                            NomeRecebido, ValorRecebido, ValorConvertido));
                } catch (Exception e) {
                    res.setText("Insira valores corretos!");
                }
            }
        });
        //Botão voltar.
        btvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}