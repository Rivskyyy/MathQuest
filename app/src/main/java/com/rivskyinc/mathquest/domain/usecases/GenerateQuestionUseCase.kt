package com.rivskyinc.mathquest.domain.usecases

import com.rivskyinc.mathquest.domain.entity.Question
import com.rivskyinc.mathquest.domain.repository.GameRepository

class GenerateQuestionUseCase( private val repository: GameRepository) {

    operator fun invoke(maxSumValue : Int) : Question{
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object{

        private const val COUNT_OF_OPTIONS = 6
    }
}