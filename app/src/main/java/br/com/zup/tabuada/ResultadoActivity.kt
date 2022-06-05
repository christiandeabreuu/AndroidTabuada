package br.com.zup.tabuada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import br.com.zup.tabuada.databinding.ActivityResultadoBinding

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val numero = intent.getStringExtra("Numero") ?:""

        mostrarResultado(binding, numero)

    }

    fun mostrarResultado(binding: ActivityResultadoBinding, numeroDigitado : String){
        binding.tvCalcZero.text = getString(R.string.resultado, "0", numeroDigitado, (numeroDigitado.toInt()*0).toString())
        binding.tvCalcUm.text = getString(R.string.resultado, "1", numeroDigitado, (numeroDigitado.toInt()*1).toString())
        binding.tvCalcDois.text = getString(R.string.resultado, "2", numeroDigitado, (numeroDigitado.toInt()*2).toString())
        binding.tvCalcTres.text = getString(R.string.resultado, "3", numeroDigitado, (numeroDigitado.toInt()*3).toString())
        binding.tvCalcQuatro.text = getString(R.string.resultado, "4", numeroDigitado, (numeroDigitado.toInt()*4).toString())
        binding.tvCalcCinco.text = getString(R.string.resultado, "5", numeroDigitado, (numeroDigitado.toInt()*5).toString())
        binding.tvCalcSeis.text = getString(R.string.resultado, "6", numeroDigitado, (numeroDigitado.toInt()*6).toString())
        binding.tvCalcSete.text = getString(R.string.resultado, "7", numeroDigitado, (numeroDigitado.toInt()*7).toString())
        binding.tvCalcOito.text = getString(R.string.resultado, "8", numeroDigitado, (numeroDigitado.toInt()*8).toString())
        binding.tvCalcNove.text = getString(R.string.resultado, "9", numeroDigitado, (numeroDigitado.toInt()*9).toString())
        binding.tvCalcDez.text = getString(R.string.resultado, "10", numeroDigitado, (numeroDigitado.toInt()*10).toString())

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean { //funcao botao voltar
        if (item.itemId == android.R.id.home) {
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}