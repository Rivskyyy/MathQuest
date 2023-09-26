package com.rivskyinc.mathquest.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rivskyinc.mathquest.databinding.FragmentGameFinishBinding
import com.rivskyinc.mathquest.domain.entity.GameResult

class GameFinishFragment : Fragment() {
    private lateinit var gameResult: GameResult
    private var _binding : FragmentGameFinishBinding? = null
    private val binding : FragmentGameFinishBinding
        get() = _binding ?: throw RuntimeException("FragmentGameFinishBinding == null ")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        parseArgs()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGameFinishBinding.inflate(inflater, container, false )
        return binding.root
    }
    private fun parseArgs(){
        gameResult = requireArguments().getSerializable(KEY_GAME_RESULT) as GameResult
    }
    companion object{

        private const val KEY_GAME_RESULT = "game_result"

        fun newInstance(gameResult : GameResult) : GameFinishFragment {
            return GameFinishFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(KEY_GAME_RESULT, gameResult)
                }
            }
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}