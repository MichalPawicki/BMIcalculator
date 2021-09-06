package michal.pawicki.bmicalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import michal.pawicki.bmicalculator.databinding.ActivityMainBinding

class MainActivity :AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.displayResult
        binding.addHeight
        binding.addWeight

        binding.buttonCalculate.setOnClickListener{
            binding.displayResult.text = "Your BMI value:"
        }



    }
    /*
    1. Przeczytać o viewBinding
    2. Użyć viewBinding w tej aplikacji
    3. Podpiąc akcje pod zdarzenie klikniecia na przycisk, wynikiem klikniecia ma byc wyswietlenie wartosci Bmi w polu tekstowym
    4. Przeniesc ekran z Bmi do fragmentu
     */
}