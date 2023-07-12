package cl.individual.calculadora

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botonSumar = findViewById<Button>(R.id.botonSumar)
        val botonRestar = findViewById<Button>(R.id.botonRestar)
        val botonMultiplicar = findViewById<Button>(R.id.botonMultiplicar)
        val botonDividir = findViewById<Button>(R.id.botonDividir)
        val numero1 = findViewById<EditText>(R.id.editTextNum1)
        val numero2 = findViewById<EditText>(R.id.editTextNum2)

        botonSumar.setOnClickListener {
            val num1 = numero1.text.toString()
            val num2 = numero2.text.toString()
            if (num1.trim { it <= ' ' }.isEmpty() || num2.trim { it <= ' ' }.isEmpty()) {
                Toast.makeText(baseContext, "Debe ingresar ambos numeros", Toast.LENGTH_LONG).show()
            } else {
                val number1 = num1.toInt()
                val number2 = num2.toInt()
                Toast.makeText(
                    baseContext,
                    "El resultado es:  " + add(number1, number2),
                    Toast.LENGTH_LONG
                ).show()
            }
        }
        botonRestar.setOnClickListener {
            val num1 = numero1.text.toString()
            val num2 = numero2.text.toString()
            if (num1.trim { it <= ' ' }.isEmpty() || num2.trim { it <= ' ' }.isEmpty()) {
                Toast.makeText(baseContext, "Debe ingresar ambos numeros", Toast.LENGTH_LONG).show()
            } else {
                val number1 = num1.toInt()
                val number2 = num2.toInt()
                Toast.makeText(
                    baseContext,
                    "El resultado es: " + subtract(number1, number2),
                    Toast.LENGTH_LONG
                ).show()
            }
        }
        botonMultiplicar.setOnClickListener {
            val num1 = numero1.text.toString()
            val num2 = numero2.text.toString()
            if (num1.trim { it <= ' ' }.isEmpty() || num2.trim { it <= ' ' }.isEmpty()) {
                Toast.makeText(baseContext, "Debe ingresar ambos numeros", Toast.LENGTH_LONG).show()
            } else {
                val number1 = num1.toInt()
                val number2 = num2.toInt()
                Toast.makeText(
                    baseContext,
                    "El resultado es: " + multiply(number1, number2),
                    Toast.LENGTH_LONG
                ).show()
            }
        }
        botonDividir.setOnClickListener(View.OnClickListener {
            val num1 = numero1.text.toString()
            val num2 = numero2.text.toString()
            if (num1.trim { it <= ' ' }.isEmpty() || num2.trim { it <= ' ' }.isEmpty()) {
                Toast.makeText(baseContext, "Debe ingresar ambos numeros", Toast.LENGTH_LONG).show()
                return@OnClickListener
            }
            val number1 = num1.toInt()
            val number2 = num2.toInt()
            if (number2 == 0) {
                Toast.makeText(baseContext, "Ingrese un divisor distinto de 0!", Toast.LENGTH_SHORT)
                    .show()
            } else {
                Toast.makeText(
                    baseContext,
                    "El resultado es: " + divide(number1, number2),
                    Toast.LENGTH_LONG
                ).show()
            }
        })
    }

    private fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    private fun subtract(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    private fun multiply(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    private fun divide(num1: Int, num2: Int): Int {
        return num1 / num2
    }
}