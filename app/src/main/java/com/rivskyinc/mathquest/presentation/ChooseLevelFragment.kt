package com.rivskyinc.mathquest.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rivskyinc.mathquest.databinding.FragmentChooseLevelBinding

class ChooseLevelFragment : Fragment() {
    private var _binding: FragmentChooseLevelBinding? = null
    private val binding: FragmentChooseLevelBinding
        get() = _binding ?: throw RuntimeException("FragmentChooseLevelBinding == null ")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChooseLevelBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        fun newInstance() : ChooseLevelFragment {
            return ChooseLevelFragment()
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}