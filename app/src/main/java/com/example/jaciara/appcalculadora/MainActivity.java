package com.example.jaciara.appcalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private final String N0 = "0";
    private final String N1 = "1";
    private final String N2 = "2";
    private final String N3 = "3";
    private final String N4 = "4";
    private final String N5 = "5";
    private final String N6 = "6";
    private final String N7 = "7";
    private final String N8 = "8";
    private final String N9 = "9";

    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnMais, btnMenos,
            btnMult, btnDivisao, btnLog, btnLimpa, btnRaiz, btnAC, btnVirgula, btnIgual;

    private EditText editNumeros, idDisplay;

    double valor1 = 0.0, valor2 = 0.0, total;

    String operacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);

        btnMais = (Button)findViewById(R.id.btnMais);
        btnMenos = (Button)findViewById(R.id.btnMenos);
        btnMult = (Button)findViewById(R.id.btnMulti);
        btnDivisao = (Button)findViewById(R.id.btnDivisao);
        btnLog = (Button)findViewById(R.id.btnLog);
        //btnLimpa = (Button)findViewById(R.id.btnLimpar);
        btnRaiz = (Button)findViewById(R.id.btnRaiz);
        btnAC = (Button)findViewById(R.id.btnAC);
        btnVirgula = (Button)findViewById(R.id.btnVirgula);
        btnIgual = (Button)findViewById(R.id.btnIgual);

        idDisplay = (EditText) findViewById(R.id.idDisplay);
        editNumeros = (EditText)findViewById(R.id.editNumeros);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idDisplay = (EditText)findViewById(R.id.editNumeros);
                editNumeros.setText(idDisplay.getText().toString() + N0);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idDisplay = (EditText)findViewById(R.id.editNumeros);
                editNumeros.setText(idDisplay.getText().toString() + N1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idDisplay = (EditText)findViewById(R.id.editNumeros);
                editNumeros.setText(idDisplay.getText().toString() + N2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idDisplay = (EditText)findViewById(R.id.editNumeros);
                editNumeros.setText(idDisplay.getText().toString() + N3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idDisplay = (EditText)findViewById(R.id.editNumeros);
                editNumeros.setText(idDisplay.getText().toString() + N4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idDisplay = (EditText)findViewById(R.id.editNumeros);
                editNumeros.setText(idDisplay.getText().toString() + N5);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idDisplay = (EditText)findViewById(R.id.editNumeros);
                editNumeros.setText(idDisplay.getText().toString() + N6);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idDisplay = (EditText)findViewById(R.id.editNumeros);
                editNumeros.setText(idDisplay.getText().toString() + N7);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idDisplay = (EditText)findViewById(R.id.editNumeros);
                editNumeros.setText(idDisplay.getText().toString() + N8);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idDisplay = (EditText)findViewById(R.id.editNumeros);
                editNumeros.setText(idDisplay.getText().toString() + N9);
            }
        });

        btnVirgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idDisplay = (EditText)findViewById(R.id.editNumeros);
                editNumeros.setText(idDisplay.getText().toString() + ".");
            }
        });

        btnMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "+";
                idDisplay = (EditText)findViewById(R.id.editNumeros);
                valor1 = Double.parseDouble(idDisplay.getText().toString());
                editNumeros.setText("");
            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "-";
                idDisplay = (EditText)findViewById(R.id.editNumeros);
                valor1 = Double.parseDouble(idDisplay.getText().toString());
                editNumeros.setText("");
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "*";
                idDisplay = (EditText)findViewById(R.id.editNumeros);
                valor1 = Double.parseDouble(idDisplay.getText().toString());
                editNumeros.setText("");
            }
        });

        btnDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "/";
                idDisplay = (EditText)findViewById(R.id.editNumeros);
                valor1 = Double.parseDouble(idDisplay.getText().toString());
                editNumeros.setText("");
            }
        });

        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "raiz";
                idDisplay = (EditText)findViewById(R.id.editNumeros);
                valor1 = Double.parseDouble(idDisplay.getText().toString());
                editNumeros.setText("");
                total = Math.sqrt(valor1);
                editNumeros.setText(String.valueOf(total));
            }
        });

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "log";
                idDisplay = (EditText)findViewById(R.id.editNumeros);
                valor1 = Double.parseDouble(idDisplay.getText().toString());
                editNumeros.setText("");
                total = Math.log10(valor1);
                editNumeros.setText(String.valueOf(total));
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1 = 0;
                valor2 = 0;
                editNumeros.setText("");
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idDisplay = (EditText)findViewById(R.id.idDisplay);
                valor2 = Double.parseDouble(editNumeros.getText().toString());
                if(operacao.equals("+")){
                    editNumeros.setText("");
                    total = valor1 + valor2;
                }
                if(operacao.equals("-")){
                    editNumeros.setText("");
                    total = valor1 - valor2;
                }
                if(operacao.equals("*")){
                    editNumeros.setText("");
                    total = valor1 * valor2;
                }
                if(operacao.equals("raiz")){
                    editNumeros.setText("");
                    total = Math.sqrt(valor1);
                }

                if(operacao.equals("log")){
                    editNumeros.setText("");
                    total = Math.log(valor1);
                }
                if(operacao.equals("/")){
                    editNumeros.setText("");
                    if(valor2 == 0){
                        idDisplay.setText("Erro matemático - Impossível dividir por zero");
                    }else {
                        total = valor1 / valor2;
                    }
                }
                editNumeros.setText(String.valueOf(total));
            }
        });
    }
}
