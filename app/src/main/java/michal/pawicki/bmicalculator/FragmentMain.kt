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
            findNavController().navigate(R.id.action_fragmentMain_to_fragmentResult)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        fragmentMain = null
    }
}