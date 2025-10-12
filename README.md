# KMP-Amplitude

A Kotlin Multiplatform (KMP) wrapper for Amplitude Analytics that provides a unified API for Android and iOS platforms.

[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)
[![Kotlin](https://img.shields.io/badge/kotlin-2.2.20-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![Platform](https://img.shields.io/badge/platform-Android%20%7C%20iOS-lightgrey.svg)](https://kotlinlang.org/docs/multiplatform.html)

## Supported Platforms

- ✅ Android (API 21+)
- ✅ iOS (12.0+)
    - iOS x64
    - iOS ARM64
    - iOS Simulator ARM64

## Installation

### Step 1: Create GitHub Personal Access Token

KMP-Amplitude is published on GitHub Packages. You need a GitHub token to download it (one-time setup):

1. Go to GitHub Settings → [Personal access tokens](https://github.com/settings/tokens)
2. Generate new token (classic)
3. Select scope: `read:packages`
4. Copy the token

### Step 2: Add Credentials

Add to `~/.gradle/gradle.properties`:
```properties
gpr.user=YOUR_GITHUB_USERNAME
gpr.key=YOUR_PERSONAL_ACCESS_TOKEN
```
### Step 3: Add Repository and Dependency

`settings.gradle.kts`:

```kotlin
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven {
            name = "kmp-amplitude"
            url = uri("https://maven.pkg.github.com/OneXeor/kmp-amplitude")
            credentials {
                username = providers.gradleProperty("gpr.user").orNull
                password = providers.gradleProperty("gpr.key").orNull
            }
        }
    }
}
```

`build.gradle.kts`:

```kotlin
kotlin { 
  // ...
  sourceSets {
    // ...  
    commonMain.dependencies {
      implementation("dev.onexeor:kmp-amplitude:1.0.0")
    }
  }
}
```

## Quick Start

### 1. Initialize Amplitude

```kotlin
val amplitude = KmpAmplitude.configure(
    KmpAmplitudeConfiguration(
        apiKey = "YOUR_API_KEY",
        userId = "user-123", // Optional
        flushIntervalMillis = 50000,
        flushQueueSize = 20
    )
)
```

### 2. Track Events

```kotlin
// Simple event
amplitude.logEvent("button_clicked")

// Event with properties
amplitude.logEvent(
    eventName = "purchase_completed",
    properties = mapOf(
        "product_id" to "12345",
        "price" to 29.99,
        "currency" to "USD"
    )
)
```

### 3. Identify Users

```kotlin
// Set user ID
amplitude.setUserId("user-123")

// Set user properties
val identify = KmpAmplitudeIdentify()
    .set("email", "user@example.com")
    .set("subscription_tier", "premium")
    .add("login_count", 1)

amplitude.identify(identify)
```

## API Reference

### KmpAmplitude

Main class for tracking events and managing users.

#### Configuration

```kotlin
fun configure(configuration: KmpAmplitudeConfiguration): KmpAmplitude
```

Creates and configures an Amplitude instance.

#### Methods

- **`logEvent(eventName: String, properties: Map<String, Any?>? = null)`**  
  Tracks an event with optional properties.

- **`identify(identify: KmpAmplitudeIdentify, outOfSession: Boolean = false)`**  
  Updates user properties.

- **`setUserId(userId: String?, startNewSession: Boolean = false)`**  
  Sets or updates the user ID.

### KmpAmplitudeConfiguration

Configuration options for Amplitude.

```kotlin
data class KmpAmplitudeConfiguration(
    val apiKey: String,
    val userId: String? = null,
    val flushIntervalMillis: Int = 50000,
    val flushQueueSize: Int = 20
)
```

### KmpAmplitudeIdentify

Builder for user property operations.

#### Methods

- **`set(property: String, value: Any?)`** - Set a user property value
- **`setOnce(property: String, value: Any?)`** - Set only if not already set
- **`add(property: String, value: Any?)`** - Increment a numeric property
- **`unset(property: String)`** - Remove a user property
- **`remove(property: String, value: Any?)`** - Remove value from array property
- **`prepend(property: String, value: Any?)`** - Prepend to array property
- **`postInsert(property: String, value: Any?)`** - Append to array property
- **`preInsert(property: String, value: Any?)`** - Prepend to array property
- **`clearAll()`** - Clear all user properties

## Examples

### Tracking User Sign-up

```kotlin
amplitude.logEvent(
    eventName = "user_signup",
    properties = mapOf(
        "method" to "email",
        "referral_source" to "google"
    )
)

val identify = KmpAmplitudeIdentify()
    .set("email", "newuser@example.com")
    .set("signup_date", System.currentTimeMillis())
    .setOnce("first_platform", "android")

amplitude.identify(identify)
```

### Tracking In-App Purchase

```kotlin
amplitude.logEvent(
    eventName = "purchase",
    properties = mapOf(
        "product_name" to "Premium Subscription",
        "price" to 9.99,
        "currency" to "USD",
        "quantity" to 1
    )
)

val identify = KmpAmplitudeIdentify()
    .add("total_revenue", 9.99)
    .add("purchase_count", 1)
    .set("subscription_status", "active")

amplitude.identify(identify)
```

## Requirements

- Kotlin 2.2.20 or higher
- Android: minSdk 21
- iOS: deployment target 12.0
- Gradle 9.1.0 or higher

## Building from Source

```bash
# Clone the repository
git clone https://github.com/OneXeor/kmp-amplitude.git
cd kmp-amplitude

# Build the library
./gradlew build

# Run tests
./gradlew test
```

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Built with [Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html)
- Uses [Amplitude Analytics](https://amplitude.com/) SDKs
- Android SDK: [amplitude-android](https://github.com/amplitude/Amplitude-Kotlin)
- iOS SDK: [Amplitude-iOS](https://github.com/amplitude/Amplitude-iOS)

## Support

- 📧 Email: support@onexeor.dev
- 🐛 Issues: [GitHub Issues](https://github.com/OneXeor/kmp-amplitude/issues)
- 💬 Discussions: [GitHub Discussions](https://github.com/OneXeor/kmp-amplitude/discussions)

## Changelog

See [CHANGELOG.md](CHANGELOG.md) for a list of changes in each version.

---

Made with ❤️ by [OneXeor](https://github.com/OneXeor)

