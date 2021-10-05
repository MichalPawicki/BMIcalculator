package michal.pawicki.bmicalculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import michal.pawicki.bmicalculator.databinding.ActivityMainBinding
import michal.pawicki.bmicalculator.databinding.FragmentMainBinding
import michal.pawicki.bmicalculator.databinding.FragmentSplashBinding

class FragmentMain : Fragment() {

    private var fragmentMain: FragmentMainBinding? = null
    private val binding get() = fragmentMain!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentMain = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonCalculate.setOnClickListener {

            val height = binding.addHeight.text.toString().toFloat()
            if (height == 0f ) {
                binding.addHeight.error = "Podaj wartość większą od 0"
                return@setOnClickListener
            }
            val weight = binding.addWeight.text.toString().toFloat()
            if (weight == 0f) {
                binding.addWeight.error = "Podaj wartość większą od 0"
                return@setOnClickListener
            }
            val bmi = calculateBmi(height, weight)
//            binding.textview.text = "Twoja wartość BMI wynosi: $bmi"
//            binding.bmiInfo.text = bmiInfo(bmi)
        }

    }

    private fun calculateBmi (height: Float, weight: Float) = weight/(height*height)

    private fun bmiInfo (bmi: Float): String {
        return when (bmi) {
            in 0f..15.99f -> "Wychudzenie!! Zyjesz jeszcze? :)"
            in 16f..17.99f -> "Wygłodzenie - czas by odwiedzić babcię!! "
            in 18f..18.49f -> "Niedowaga - jeden obiadek więcej nie zaszkodzi "
            in 18.5f..24.99f -> "Wszystko w normie! Tak trzymaj!!"
            in 25f..29.99f -> "Nadwaga! Teraz obiadek mniej!"
            in 30f..34.99f -> "Otyłość! Wypada pomyśleć nad dietą"
            else -> "Otyłość klinicza!! Caasu udać się do lekarza!!!"
        }

            findNavController().navigate(R.id.action_fragmentMain_to_fragmentResult)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        fragmentMain = null
    }
}