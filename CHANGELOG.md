# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Planned
- Add sample project
- Add Desktop (JVM) support
- Add JavaScript/Web support
- Add comprehensive test coverage
- Add more configuration options

## [1.0.0] - 2025-10-11

### Added
- Initial release of KMP-Amplitude
- Android platform support (API 21+)
- iOS platform support (iOS 12.0+)
- Event tracking with `logEvent()`
- User identification with `setUserId()`
- User property management with `KmpAmplitudeIdentify`
- Configuration options for flush interval and queue size
- CocoaPods integration for iOS
- Support for all Amplitude Identify operations:
    - `set()` - Set user properties
    - `setOnce()` - Set properties once
    - `add()` - Increment numeric properties
    - `unset()` - Remove properties
    - `remove()` - Remove from array properties
    - `prepend()` - Prepend to arrays
    - `postInsert()` - Append to arrays
    - `preInsert()` - Prepend with duplicate check
    - `clearAll()` - Clear all properties

### Dependencies
- Kotlin 2.2.20
- Android: Amplitude Analytics 1.22.4
- iOS: Amplitude SDK 8.21.0

[Unreleased]: https://github.com/OneXeor/kmp-amplitude/compare/v1.0.0...HEAD
[1.0.0]: https://github.com/OneXeor/kmp-amplitude/releases/tag/v1.0.0