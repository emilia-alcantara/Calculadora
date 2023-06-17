package cl.individual.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonSumar = findViewById(R.id.botonSumar);
        Button botonRestar = findViewById(R.id.botonRestar);
        Button botonMultiplicar = findViewById(R.id.botonMultiplicar);
        Button botonDividir = findViewById(R.id.botonDividir);

        EditText numero1 = findViewById(R.id.editTextNum1);
        EditText numero2 = findViewById(R.id.editTextNum2);

        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = numero1.getText().toString();
                String num2 = numero2.getText().toString();

                if (num1.trim().isEmpty() || num2.trim().isEmpty()) {
                    Toast.makeText(getBaseContext(), "Debe ingresar ambos numeros", Toast.LENGTH_LONG).show();
                } else {
                    int number1 = Integer.parseInt(num1);
                    int number2 = Integer.parseInt(num2);
                    Toast.makeText(getBaseContext(), "El resultado es: " + add(number1, number2), Toast.LENGTH_LONG).show();
                }
            }
        });

        botonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = numero1.getText().toString();
                String num2 = numero2.getText().toString();
                if (num1.trim().isEmpty() || num2.trim().isEmpty()) {
                    Toast.makeText(getBaseContext(), "Debe ingresar ambos numeros", Toast.LENGTH_LONG).show();
                } else {
                    int number1 = Integer.parseInt(num1);
                    int number2 = Integer.parseInt(num2);
                    Toast.makeText(getBaseContext(), "El resultado es: " + subtract(number1, number2), Toast.LENGTH_LONG).show();
                }
            }
        });

        botonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = numero1.getText().toString();
                String num2 = numero2.getText().toString();
                if (num1.trim().isEmpty() || num2.trim().isEmpty()) {
                    Toast.makeText(getBaseContext(), "Debe ingresar ambos numeros", Toast.LENGTH_LONG).show();
                } else {
                    int number1 = Integer.parseInt(num1);
                    int number2 = Integer.parseInt(num2);
                    Toast.makeText(getBaseContext(), "El resultado es: " + multiply(number1, number2), Toast.LENGTH_LONG).show();
                }
            }
        });

        botonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = numero1.getText().toString();
                String num2 = numero2.getText().toString();

                if (num1.trim().isEmpty() || num2.trim().isEmpty()) {
                    Toast.makeText(getBaseContext(), "Debe ingresar ambos numeros", Toast.LENGTH_LONG).show();
                    return;
                }
                int number1 = Integer.parseInt(num1);
                int number2 = Integer.parseInt(num2);
                if (number2 == 0) {
                    Toast.makeText(getBaseContext(),  "Ingrese un divisor distinto de 0!" , Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getBaseContext(), "El resultado es: " + divide(number1, number2), Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public int add(int num1, int num2) {
        int result = 0;
        result = num1 + num2;
        return result;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}