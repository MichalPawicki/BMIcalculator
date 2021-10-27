package michal.pawicki.bmicalculator

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
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

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textViewFragResult.text = "Twoje BMI wynosi: ${args.textargs}"

        val bmi = args.textargs
        binding.bmiInfo.text = bmiInfo(bmi)
    }
    @SuppressLint("SetTextI18n")
    private fun bmiInfo (bmi: String): String {
        return when (bmi.toFloat()) {
            in 0f..18.49f -> {
                val s = "Niedowaga - jeden obiadek więcej nie zaszkodzi "
                s.run {
                    binding.linearLayout.setBackgroundResource(R.drawable.underweight).toString()
                    toString()
                }
            }
            in 18.5f..24.99f -> {
                val s = "Wszystko w normie! Tak trzymaj!!"
                s.run {
                    binding.linearLayout.setBackgroundResource(R.drawable.normal).toString()
                    toString()
                }
            }
            in 25f..29.99f -> {
                val s = "Nadwaga! Teraz obiadek mniej!"
                s.run {
                    binding.linearLayout.setBackgroundResource(R.drawable.obese).toString()
                    toString()
                }
            }
            in 30f..34.99f -> {
                val s = "Otyłość! Wypada pomyśleć nad dietą"
                s.run {
                    binding.linearLayout.setBackgroundResource(R.drawable.overweight).toString()
                    toString()
                }
            }
            else -> {
                val s = "Otyłość klinicza!! Czas udać się do lekarza!!!"
                s.run {
                    binding.linearLayout.setBackgroundResource(R.drawable.extremaly_obese).toString()
                    toString()
                }
            }
        }
    }
}