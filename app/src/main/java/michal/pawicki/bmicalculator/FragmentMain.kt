package michal.pawicki.bmicalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import michal.pawicki.bmicalculator.databinding.ActivityMainBinding
import michal.pawicki.bmicalculator.databinding.FragmentMainBinding
import michal.pawicki.bmicalculator.databinding.FragmentResultBinding
import michal.pawicki.bmicalculator.databinding.FragmentSplashBinding
import org.w3c.dom.Text

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
            val action = FragmentMainDirections.actionFragmentMainToFragmentResult(bmi.toString())

            findNavController().navigate(action)
        }

    }

    private fun calculateBmi (height: Float, weight: Float) = weight/(height*height)

    }