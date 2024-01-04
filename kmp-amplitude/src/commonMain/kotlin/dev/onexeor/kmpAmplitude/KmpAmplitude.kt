@file:Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")

package dev.onexeor.kmpAmplitude

expect class KmpAmplitude private constructor() {
    fun logEvent(
        eventName: String,
        properties: Map<String, Any?>? = null,
    )

    fun identify(
        identify: KmpAmplitudeIdentify,
        outOfSession: Boolean = false,
    )

    fun setUserId(
        userId: String?,
        startNewSession: Boolean = false,
    )

    companion object {
        fun configure(configuration: KmpAmplitudeConfiguration): KmpAmplitude
    }
}
