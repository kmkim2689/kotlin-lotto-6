package domain.result

import constants.Constants.NOTIFICATION_FIFTH
import constants.Constants.NOTIFICATION_FIRST
import constants.Constants.NOTIFICATION_FOURTH
import constants.Constants.NOTIFICATION_SECOND
import constants.Constants.NOTIFICATION_THIRD
import constants.Constants.REWARD_FIFTH
import constants.Constants.REWARD_FIRST
import constants.Constants.REWARD_FOURTH
import constants.Constants.REWARD_SECOND
import constants.Constants.REWARD_THIRD
import constants.Constants.WINNING_COUNT_FIFTH
import constants.Constants.WINNING_COUNT_FIRST
import constants.Constants.WINNING_COUNT_FOURTH
import constants.Constants.WINNING_COUNT_SECOND
import constants.Constants.WINNING_COUNT_THIRD

enum class Rank(
    val winningCount: Int,
    val bonus: Boolean,
    val reward: Int,
    val notification: String,
) {
    FIFTH(WINNING_COUNT_FIFTH, false, REWARD_FIFTH, NOTIFICATION_FIFTH),
    FOURTH(WINNING_COUNT_FOURTH, false, REWARD_FOURTH, NOTIFICATION_FOURTH),
    THIRD(WINNING_COUNT_THIRD, false, REWARD_THIRD, NOTIFICATION_THIRD),
    SECOND(WINNING_COUNT_SECOND, true, REWARD_SECOND, NOTIFICATION_SECOND),
    FIRST(WINNING_COUNT_FIRST, false, REWARD_FIRST, NOTIFICATION_FIRST)
}