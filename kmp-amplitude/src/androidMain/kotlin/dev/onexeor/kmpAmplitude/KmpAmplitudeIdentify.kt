@file:Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING", "UNCHECKED_CAST")

package dev.onexeor.kmpAmplitude

import com.amplitude.android.events.Identify

actual class KmpAmplitudeIdentify {
    internal val identify = Identify()

    actual fun add(
        property: String,
        value: Any?,
    ): KmpAmplitudeIdentify {
        when (value) {
            is Double -> identify.add(property, value)
            is Long -> identify.add(property, value)
            is Float -> identify.add(property, value)
            is Int -> identify.add(property, value)
            else -> println("Incorrect type `${value?.javaClass}` (Double, Long, Float or Int excpected)")
        }
        return this
    }

    actual fun set(
        property: String,
        value: Any?,
    ): KmpAmplitudeIdentify {
        when (value) {
            is Double -> identify.set(property, value)
            is Long -> identify.set(property, value)
            is Float -> identify.set(property, value)
            is Int -> identify.set(property, value)
            is Array<*> -> identify.set(property, value)
            is List<*> -> identify.set(property, value)
            is Map<*, *> -> identify.set(property, value)
            is String -> identify.set(property, value)
            is Boolean -> identify.set(property, value)
            is Any -> identify.set(property, value)
            else -> println("Set incorrect type `null` (Double, Long, Float or Int excpected)")
        }
        return this
    }

    actual fun setOnce(
        property: String,
        value: Any?,
    ): KmpAmplitudeIdentify {
        when (value) {
            is Double -> identify.setOnce(property, value)
            is Long -> identify.setOnce(property, value)
            is Float -> identify.setOnce(property, value)
            is Int -> identify.setOnce(property, value)
            isTypedValue<Array<Boolean>>() -> identify.setOnce(property, value as Array<Boolean>)
            isTypedValue<Array<Long>>() -> identify.setOnce(property, value as Array<Long>)
            isTypedValue<Array<String>>() -> identify.setOnce(property, value as Array<String>)
            isTypedValue<Array<Double>>() -> identify.setOnce(property, value as Array<Double>)
            isTypedValue<Array<Float>>() -> identify.setOnce(property, value as Array<Float>)
            isTypedValue<Array<Int>>() -> identify.setOnce(property, value as Array<Int>)
            isTypedValue<List<Any>>() -> identify.setOnce(property, value as List<Any>)
            isTypedValue<Map<String, Any>>() ->
                identify.setOnce(
                    property,
                    value as Map<String, Any>,
                )

            is String -> identify.setOnce(property, value)
            is Boolean -> identify.setOnce(property, value)
            else -> println("SetOnce incorrect type `null` (Double, Long, Float or Int excpected)")
        }
        return this
    }

    actual fun unset(property: String): KmpAmplitudeIdentify {
        identify.unset(property)
        return this
    }

    actual fun remove(
        property: String,
        value: Any?,
    ): KmpAmplitudeIdentify {
        when (value) {
            is Double -> identify.remove(property, value)
            is Long -> identify.remove(property, value)
            is Float -> identify.remove(property, value)
            is Int -> identify.remove(property, value)
            isTypedValue<Array<Boolean>>() -> identify.remove(property, value as Array<Boolean>)
            isTypedValue<Array<Long>>() -> identify.remove(property, value as Array<Long>)
            isTypedValue<Array<String>>() -> identify.remove(property, value as Array<String>)
            isTypedValue<Array<Double>>() -> identify.remove(property, value as Array<Double>)
            isTypedValue<Array<Float>>() -> identify.remove(property, value as Array<Float>)
            isTypedValue<Array<Int>>() -> identify.remove(property, value as Array<Int>)
            isTypedValue<List<Any>>() -> identify.remove(property, value as List<Any>)
            isTypedValue<Map<String, Any>>() -> identify.remove(property, value as Map<String, Any>)
            is String -> identify.remove(property, value)
            is Boolean -> identify.remove(property, value)
            else -> println("Remove incorrect type `null` (Double, Long, Float or Int excpected)")
        }
        return this
    }

    actual fun userPropertyOperations(): MutableMap<String, Any?> {
        return identify.properties
    }

    actual fun postInsert(
        property: String,
        value: Any?,
    ): KmpAmplitudeIdentify {
        when (value) {
            is Double -> identify.postInsert(property, value)
            is Long -> identify.postInsert(property, value)
            is Float -> identify.postInsert(property, value)
            is Int -> identify.postInsert(property, value)
            isTypedValue<Array<Boolean>>() -> identify.postInsert(property, value as Array<Boolean>)
            isTypedValue<Array<Long>>() -> identify.postInsert(property, value as Array<Long>)
            isTypedValue<Array<String>>() -> identify.postInsert(property, value as Array<String>)
            isTypedValue<Array<Double>>() -> identify.postInsert(property, value as Array<Double>)
            isTypedValue<Array<Float>>() -> identify.postInsert(property, value as Array<Float>)
            isTypedValue<Array<Int>>() -> identify.postInsert(property, value as Array<Int>)
            isTypedValue<List<Any>>() -> identify.postInsert(property, value as List<Any>)
            isTypedValue<Map<String, Any>>() ->
                identify.postInsert(
                    property,
                    value as Map<String, Any>,
                )

            is String -> identify.postInsert(property, value)
            is Boolean -> identify.postInsert(property, value)
            else -> println("postInsert incorrect type `null` (Double, Long, Float or Int excpected)")
        }
        return this
    }

    actual fun preInsert(
        property: String,
        value: Any?,
    ): KmpAmplitudeIdentify {
        when (value) {
            is Double -> identify.preInsert(property, value)
            is Long -> identify.preInsert(property, value)
            is Float -> identify.preInsert(property, value)
            is Int -> identify.preInsert(property, value)
            isTypedValue<Array<Boolean>>() -> identify.preInsert(property, value as Array<Boolean>)
            isTypedValue<Array<Long>>() -> identify.preInsert(property, value as Array<Long>)
            isTypedValue<Array<String>>() -> identify.preInsert(property, value as Array<String>)
            isTypedValue<Array<Double>>() -> identify.preInsert(property, value as Array<Double>)
            isTypedValue<Array<Float>>() -> identify.preInsert(property, value as Array<Float>)
            isTypedValue<Array<Int>>() -> identify.preInsert(property, value as Array<Int>)
            isTypedValue<List<Any>>() -> identify.preInsert(property, value as List<Any>)
            isTypedValue<Map<String, Any>>() ->
                identify.preInsert(
                    property,
                    value as Map<String, Any>,
                )

            is String -> identify.preInsert(property, value)
            is Boolean -> identify.preInsert(property, value)
            else -> println("preInsert incorrect type `null` (Double, Long, Float or Int excpected)")
        }
        return this
    }

    actual fun prepend(
        property: String,
        value: Any?,
    ): KmpAmplitudeIdentify {
        when (value) {
            is Double -> identify.prepend(property, value)
            is Long -> identify.prepend(property, value)
            is Float -> identify.prepend(property, value)
            is Int -> identify.prepend(property, value)
            isTypedValue<Array<Boolean>>() -> identify.prepend(property, value as Array<Boolean>)
            isTypedValue<Array<Long>>() -> identify.prepend(property, value as Array<Long>)
            isTypedValue<Array<String>>() -> identify.prepend(property, value as Array<String>)
            isTypedValue<Array<Double>>() -> identify.prepend(property, value as Array<Double>)
            isTypedValue<Array<Float>>() -> identify.prepend(property, value as Array<Float>)
            isTypedValue<Array<Int>>() -> identify.prepend(property, value as Array<Int>)
            isTypedValue<List<Any>>() -> identify.prepend(property, value as List<Any>)
            isTypedValue<Map<String, Any>>() ->
                identify.prepend(
                    property,
                    value as Map<String, Any>,
                )

            is String -> identify.prepend(property, value)
            is Boolean -> identify.prepend(property, value)
            else -> println("preInsert incorrect type `null` (Double, Long, Float or Int excpected)")
        }
        return this
    }

    actual fun clearAll() {
        identify.clearAll()
    }
}

private inline fun <reified T> Any?.isTypedValue(): Boolean {
    return this is T
}
