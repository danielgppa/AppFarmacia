package com.example.provacic1danielandrade;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText remedio1 = findViewById(R.id.remedio1);
        final EditText doses1 = findViewById(R.id.doses1);
        final EditText caixa1 = findViewById(R.id.caixa1);

        final EditText remedio2 = findViewById(R.id.remedio2);
        final EditText doses2 = findViewById(R.id.doses2);
        final EditText caixa2 = findViewById(R.id.caixa2);

        final EditText remedio3 = findViewById(R.id.remedio3);
        final EditText doses3 = findViewById(R.id.doses3);
        final EditText caixa3 = findViewById(R.id.caixa3);

        final EditText remedio4 = findViewById(R.id.remedio4);
        final EditText doses4 = findViewById(R.id.doses4);
        final EditText caixa4 = findViewById(R.id.caixa4);

        final EditText remedio5 = findViewById(R.id.remedio5);
        final EditText doses5 = findViewById(R.id.doses5);
        final EditText caixa5 = findViewById(R.id.caixa5);

        final EditText remedio6 = findViewById(R.id.remedio6);
        final EditText doses6 = findViewById(R.id.doses6);
        final EditText caixa6 = findViewById(R.id.caixa6);

        Button calcular = findViewById(R.id.calcular);
        final TextView resultado = findViewById(R.id.resultado);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String resumo = "Caixas necessárias:\n";

                if (!TextUtils.isEmpty(remedio1.getText()) && !TextUtils.isEmpty(doses1.getText()) && !TextUtils.isEmpty(caixa1.getText())) {
                    String nome1 = remedio1.getText().toString();
                    int dosesPorDia1 = Integer.parseInt(doses1.getText().toString());
                    int quantidadePorCaixa1 = Integer.parseInt(caixa1.getText().toString());
                    int caixas1 = (dosesPorDia1 * 30 + quantidadePorCaixa1 - 1) / quantidadePorCaixa1;
                    resumo += nome1 + ": " + caixas1 + "\n";
                }

                if (!TextUtils.isEmpty(remedio2.getText()) && !TextUtils.isEmpty(doses2.getText()) && !TextUtils.isEmpty(caixa2.getText())) {
                    String nome2 = remedio2.getText().toString();
                    int dosesPorDia2 = Integer.parseInt(doses2.getText().toString());
                    int quantidadePorCaixa2 = Integer.parseInt(caixa2.getText().toString());
                    int caixas2 = (dosesPorDia2 * 30 + quantidadePorCaixa2 - 1) / quantidadePorCaixa2;
                    resumo += nome2 + ": " + caixas2 + "\n";
                }

                if (!TextUtils.isEmpty(remedio3.getText()) && !TextUtils.isEmpty(doses3.getText()) && !TextUtils.isEmpty(caixa3.getText())) {
                    String nome3 = remedio3.getText().toString();
                    int dosesPorDia3 = Integer.parseInt(doses3.getText().toString());
                    int quantidadePorCaixa3 = Integer.parseInt(caixa3.getText().toString());
                    int caixas3 = (dosesPorDia3 * 30 + quantidadePorCaixa3 - 1) / quantidadePorCaixa3;
                    resumo += nome3 + ": " + caixas3 + "\n";
                }

                if (!TextUtils.isEmpty(remedio4.getText()) && !TextUtils.isEmpty(doses4.getText()) && !TextUtils.isEmpty(caixa4.getText())) {
                    String nome4 = remedio4.getText().toString();
                    int dosesPorDia4 = Integer.parseInt(doses4.getText().toString());
                    int quantidadePorCaixa4 = Integer.parseInt(caixa4.getText().toString());
                    int caixas4 = (dosesPorDia4 * 30 + quantidadePorCaixa4 - 1) / quantidadePorCaixa4;
                    resumo += nome4 + ": " + caixas4 + "\n";
                }

                if (!TextUtils.isEmpty(remedio5.getText()) && !TextUtils.isEmpty(doses5.getText()) && !TextUtils.isEmpty(caixa5.getText())) {
                    String nome5 = remedio5.getText().toString();
                    int dosesPorDia5 = Integer.parseInt(doses5.getText().toString());
                    int quantidadePorCaixa5 = Integer.parseInt(caixa5.getText().toString());
                    int caixas5 = (dosesPorDia5 * 30 + quantidadePorCaixa5 - 1) / quantidadePorCaixa5;
                    resumo += nome5 + ": " + caixas5 + "\n";
                }

                if (!TextUtils.isEmpty(remedio6.getText()) && !TextUtils.isEmpty(doses6.getText()) && !TextUtils.isEmpty(caixa6.getText())) {
                    String nome6 = remedio6.getText().toString();
                    int dosesPorDia6 = Integer.parseInt(doses6.getText().toString());
                    int quantidadePorCaixa6 = Integer.parseInt(caixa6.getText().toString());
                    int caixas6 = (dosesPorDia6 * 30 + quantidadePorCaixa6 - 1) / quantidadePorCaixa6;
                    resumo += nome6 + ": " + caixas6;
                }

                resultado.setText(resumo);
            }
        });
    }
}
