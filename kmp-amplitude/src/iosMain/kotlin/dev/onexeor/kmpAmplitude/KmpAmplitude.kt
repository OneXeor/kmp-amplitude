@file:OptIn(ExperimentalForeignApi::class)
@file:Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")

package dev.onexeor.kmpAmplitude

import cocoapods.Amplitude.Amplitude
import kotlinx.cinterop.ExperimentalForeignApi

actual class KmpAmplitude private actual constructor() {
    @Suppress("unchecked_cast")
    actual fun logEvent(
        eventName: String,
        properties: Map<String, Any?>?,
    ) {
        val props: Map<Any?, *>? =
            properties as Map<Any?, *>? // ?.map { (it.key as Any?) to it.value }?.toMap()
        Amplitude.instance().logEvent(eventType = eventName, withEventProperties = props)
    }

    actual fun identify(
        identify: KmpAmplitudeIdentify,
        outOfSession: Boolean,
    ) {
        Amplitude.instance().identify(identify.identify, outOfSession)
    }

    actual fun setUserId(
        userId: String?,
        startNewSession: Boolean,
    ) {
        Amplitude.instance().setUserId(userId, startNewSession)
    }

    actual companion object {
        actual fun configure(configuration: KmpAmplitudeConfiguration): KmpAmplitude {
            require(configuration.apiKey.isNotBlank()) { "ApiKey cannot be empty" }
            Amplitude.instance()
                .initializeApiKey(apiKey = configuration.apiKey, userId = configuration.userId)
            return KmpAmplitude()
        }
    }
}
