package br.com.zup.tabuada

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import br.com.zup.tabuada.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var numeroDigitado: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val buttonCalc = binding.btnCalcTabuada
        buttonCalc.setOnClickListener {
            numeroDigitado = binding.etNumeroValorDigitado.text.toString()

            if (verificarEntradas(numeroDigitado)) {
                val intent = Intent(this, ResultadoActivity::class.java).apply {
                    putExtra("Numero", numeroDigitado)

                }
                startActivity(intent)

            }else{
                mostrarMsgErro(numeroDigitado.isNotBlank(),
                binding.etNumeroValorDigitado, "campo obrigatório")
            }


        }
    }
    fun verificarEntradas(valor: String): Boolean {
        if (valor.isNotBlank()) {
            numeroDigitado
        }
        return valor.isNotBlank()
    }
    fun mostrarMsgErro(ehValido: Boolean, editText: EditText, msg: String) {
        if (!ehValido) {
            editText.error = msg
        }
    }
}
