package michal.pawicki.bmicalculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import michal.pawicki.bmicalculator.databinding.FragmentResultBinding


class FragmentResult : Fragment (R.layout.fragment_result) {

    private val args: FragmentResultArgs by navArgs()
    private var fragmentResult: FragmentResultBinding? = null
    private val binding get() = fragmentResult!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentResult = FragmentResultBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textViewFragResult.text = "Twoja wartość BMI wynosi: ${args.textargs}"

        val bmi = args.textargs
        binding.bmiInfo.text = bmiInfo(bmi)
    }
    private fun bmiInfo (bmi: String): String {
        return when (bmi.toFloat()) {
            in 0f..15.99f -> "Wychudzenie!! Zyjesz jeszcze? :)"
            in 16f..17.99f -> "Wygłodzenie - czas by odwiedzić babcię!! "
            in 18f..18.49f -> "Niedowaga - jeden obiadek więcej nie zaszkodzi "
            in 18.5f..24.99f -> "Wszystko w normie! Tak trzymaj!!"
            in 25f..29.99f -> "Nadwaga! Teraz obiadek mniej!"
            in 30f..34.99f -> "Otyłość! Wypada pomyśleć nad dietą"
            else -> "Otyłość klinicza!! Caasu udać się do lekarza!!!"
        }
    }

}