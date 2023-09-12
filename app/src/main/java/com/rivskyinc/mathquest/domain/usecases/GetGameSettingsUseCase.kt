package com.rivskyinc.mathquest.domain.usecases

import com.rivskyinc.mathquest.domain.entity.GameSettings
import com.rivskyinc.mathquest.domain.entity.Level
import com.rivskyinc.mathquest.domain.repository.GameRepository

class GetGameSettingsUseCase (private val  repository : GameRepository){


    operator fun invoke(level : Level) : GameSettings {
        return repository.getGameSettings(level)
    }
}