package dev.onexeor.kmpAmplitude

import com.amplitude.core.Amplitude
import kotlin.properties.Delegates

actual class KmpAmplitude private actual constructor() {
    private var amplitude: Amplitude by Delegates.notNull()

    actual fun logEvent(
        eventName: String,
        properties: Map<String, Any?>?,
    ) {
        amplitude.track(eventName, properties)
    }

    actual fun identify(
        identify: KmpAmplitudeIdentify,
        outOfSession: Boolean,
    ) {
        amplitude.identify(identify = identify.identify)
    }

    actual fun setUserId(
        userId: String?,
        startNewSession: Boolean,
    ) {
        amplitude.setUserId(userId)
    }

    actual companion object {
        actual fun configure(configuration: KmpAmplitudeConfiguration): KmpAmplitude {
            val amplitude =
                Amplitude(
                    apiKey = configuration.apiKey,
                    configs = {
                        flushIntervalMillis = configuration.flushIntervalMillis
                        flushQueueSize = configuration.flushQueueSize
                    },
                )
            return KmpAmplitude().apply {
                this.amplitude = amplitude
            }
        }
    }
}
