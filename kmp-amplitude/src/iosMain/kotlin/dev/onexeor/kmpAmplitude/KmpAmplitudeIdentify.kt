@file:Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING", "UNCHECKED_CAST")
@file:OptIn(ExperimentalForeignApi::class, ExperimentalForeignApi::class)

package dev.onexeor.kmpAmplitude

import cocoapods.Amplitude.AMPIdentify
import kotlinx.cinterop.ExperimentalForeignApi
import platform.darwin.NSObject

actual class KmpAmplitudeIdentify {
    internal val identify = AMPIdentify()

    actual fun add(
        property: String,
        value: Any?,
    ): KmpAmplitudeIdentify {
        identify.add(property, value as NSObject?)
        return this
    }

    actual fun set(
        property: String,
        value: Any?,
    ): KmpAmplitudeIdentify {
        identify.set(property, value as NSObject?)
        return this
    }

    actual fun setOnce(
        property: String,
        value: Any?,
    ): KmpAmplitudeIdentify {
        identify.setOnce(property, value as NSObject?)
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
        identify.remove(property, value as NSObject?)
        return this
    }

    actual fun userPropertyOperations(): MutableMap<String, Any?> {
        return identify.userPropertyOperations() as MutableMap<String, Any?>
    }

    actual fun postInsert(
        property: String,
        value: Any?,
    ): KmpAmplitudeIdentify {
        identify.postInsert(property, value as NSObject?)
        return this
    }

    actual fun preInsert(
        property: String,
        value: Any?,
    ): KmpAmplitudeIdentify {
        identify.preInsert(property, value as NSObject?)
        return this
    }

    actual fun prepend(
        property: String,
        value: Any?,
    ): KmpAmplitudeIdentify {
        identify.prepend(property, value as NSObject?)
        return this
    }

    actual fun clearAll() {
        identify.clearAll()
    }
}
