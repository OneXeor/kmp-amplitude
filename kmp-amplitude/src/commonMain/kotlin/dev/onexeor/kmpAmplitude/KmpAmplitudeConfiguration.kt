package dev.onexeor.kmpAmplitude

data class KmpAmplitudeConfiguration(
    val apiKey: String,
    val userId: String? = null,
    val flushIntervalMillis: Int = 50000,
    val flushQueueSize: Int = 20,
)
