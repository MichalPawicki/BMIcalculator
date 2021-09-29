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


//        binding.buttonCalculate.setOnClickListener{
//            val height = binding.addHeight.text.toString().toFloat()
//            if (height == 0f ) {
//                binding.addHeight.error = "Podaj wartość większą od 0"
//                return@setOnClickListener
//            }
//            val weight = binding.addWeight.text.toString().toFloat()
//            if (weight == 0f) {
//                binding.addWeight.error = "Podaj wartość większą od 0"
//                return@setOnClickListener
//            }
//            val bmi = calculateBmi(height, weight)
//            binding.displayResult.text = "Twoja wartość BMI wynosi: $bmi"
//            binding.bmiInfo.text = bmiInfo(bmi)
//        }
//
//    }
//
//    private fun calculateBmi (height: Float, weight: Float) = weight/(height*height)
//
//    private fun bmiInfo (bmi: Float): String {
//        return when (bmi) {
//            in 0f..15.99f -> "Wychudzenie!! Zyjesz jeszcze? :)"
//            in 16f..17.99f -> "Wygłodzenie - czas by odwiedzić babcię!! "
//            in 18f..18.49f -> "Niedowaga - jeden obiadek więcej nie zaszkodzi "
//            in 18.5f..24.99f -> "Wszystko w normie! Tak trzymaj!!"
//            in 25f..29.99f -> "Nadwaga! Teraz obiadek mniej!"
//            in 30f..34.99f -> "Otyłość! Wypada pomyśleć nad dietą"
//            else -> "Otyłość klinicza!! Caasu udać się do lekarza!!!"
//        }


    }


    /*
    1. To co zakomentowane uzyc w fragmencie main i fragmencie result (mozna uzyc pluginu safe args)
    2.
    3.
     */
}