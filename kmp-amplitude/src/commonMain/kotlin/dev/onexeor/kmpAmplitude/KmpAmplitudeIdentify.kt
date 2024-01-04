@file:Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")

package dev.onexeor.kmpAmplitude

expect class KmpAmplitudeIdentify constructor() {
    /**
     *
     */
    fun add(
        property: String,
        value: Any?,
    ): KmpAmplitudeIdentify

    /**
     *
     */
    fun set(
        property: String,
        value: Any?,
    ): KmpAmplitudeIdentify

    /**
     *
     */
    fun setOnce(
        property: String,
        value: Any?,
    ): KmpAmplitudeIdentify

    /**
     *
     */
    fun unset(property: String): KmpAmplitudeIdentify

    /**
     *
     */
    fun remove(
        property: String,
        value: Any?,
    ): KmpAmplitudeIdentify

    /**
     *
     */
    fun postInsert(
        property: String,
        value: Any?,
    ): KmpAmplitudeIdentify

    /**
     *
     */
    fun preInsert(
        property: String,
        value: Any?,
    ): KmpAmplitudeIdentify

    /**
     *
     */
    fun prepend(
        property: String,
        value: Any?,
    ): KmpAmplitudeIdentify

    /**
     *
     */
    fun userPropertyOperations(): MutableMap<String, Any?>

    /**
     *
     */
    fun clearAll()
}
