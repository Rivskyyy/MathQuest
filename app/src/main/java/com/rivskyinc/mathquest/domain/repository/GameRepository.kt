package com.rivskyinc.mathquest.domain.repository

import com.rivskyinc.mathquest.domain.entity.GameSettings
import com.rivskyinc.mathquest.domain.entity.Level
import com.rivskyinc.mathquest.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue : Int,
        countOfOptions : Int
    ) : Question

    fun getGameSettings( level : Level) : GameSettings
}