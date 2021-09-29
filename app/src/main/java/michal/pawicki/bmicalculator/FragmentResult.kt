package michal.pawicki.bmicalculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import michal.pawicki.bmicalculator.databinding.FragmentResultBinding


class FragmentResult : Fragment (R.layout.fragment_result) {

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

    override fun onDestroyView() {
        super.onDestroyView()
        fragmentResult = null
    }
}