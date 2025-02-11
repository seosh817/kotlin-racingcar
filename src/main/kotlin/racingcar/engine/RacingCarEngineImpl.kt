package racingcar.engine

import racingcar.random.RacingRandomGenerator
import racingcar.random.RandomGenerator

class RacingCarEngineImpl(
    private var randomGenerator: RandomGenerator = RacingRandomGenerator()
) : CarEngine {

    override fun execute(): Boolean {
        return randomGenerator.randomNum(MAX) >= RACING_CAR_MOVE_CRITERIA
    }

    companion object {
        const val RACING_CAR_MOVE_CRITERIA = 4
        const val MAX = 9
    }
}
