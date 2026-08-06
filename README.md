# SLIITShuttle

A Kotlin Android UI prototype for an SLIIT student shuttle/booking concept: an onboarding flow, sign-in/up screens, route selection, a stub QR screen, and payment/profile screens. It is a front-end-only prototype — there is no backend integration, live bus tracking, or payment processing.

## Project Status

Coursework project — UI prototype only. The activities wire screen-to-screen navigation with `Intents` and local layouts; no network, database, maps, QR generation, or payment logic is implemented. Not under active development.

> **Ownership note:** The application package is `com.example.sliitshuttle` and the project is coursework-named, so ownership beyond Dilan Dilruksha has not been confirmed. No open-source license has been added. See [License](#license).

## Key Features (UI only)

- Splash, welcome, and three onboarding screens
- Sign-in and sign-up screens
- Home with bus-route selection (Negombo–Malabe, Panadura–Malabe, Kolpity–Malabe)
- Bus detail, QR, payment, and profile screens
- Bottom navigation between screens via `ImageButton` clicks and `Intent` navigation

## Architecture

A set of unrelated activities, each binding a layout with `findViewById` and starting the next activity on click. No `ViewModel`, no `LiveData`, no `Room`, no repository. Dependencies are limited to AndroidX core/appcompat, Material, ConstraintLayout, and `play-services-maps` (declared but not used).

## Technology Stack

- **Language**: Kotlin
- **Platform**: Android (`minSdk` 24, `compileSdk`/`targetSdk` 34), Java 8 compatibility
- **UI**: AndroidX appcompat, Material Components, ConstraintLayout
- **Build**: Gradle Kotlin DSL, AGP 8.2.2, Kotlin 1.9.22
- **Maps dependency**: `com.google.android.gms:play-services-maps:18.2.0` is declared but currently unused — no `GoogleMap`/`MapView`/`SupportMapFragment` is used in any activity
- **Testing**: JUnit 4 and Espresso (template test stubs only)

## Repository Structure

```
.
├── app/
│   ├── build.gradle.kts
│   └── src/
│       ├── main/
│       │   ├── java/com/example/sliitshuttle/   # activities
│       │   │   ├── MainActivity.kt
│       │   │   ├── welcome.kt / SplashScreen (~manifest)
│       │   │   ├── onboard_screen_1.kt / 2.kt / 3.kt
│       │   │   ├── Sign_In.kt / Sign_Up.kt
│       │   │   ├── Home.kt / Bus_detail.kt
│       │   │   ├── select_bus_screen.kt
│       │   │   ├── QR_code.kt / payment.kt / profile.kt
│       │   ├── res/                  # layouts, drawables, strings, themes
│       │   └── AndroidManifest.xml
│       ├── test/                     # ExampleUnitTest.kt (stub)
│       └── androidTest/              # ExampleInstrumentedTest.kt (stub)
├── build.gradle.kts
├── settings.gradle.kts
├── gradle/ gradlew gradlew.bat
└── README.md
```

## Prerequisites

- Android Studio
- Android SDK 34 (build tools)
- An emulator or physical device running Android `minSdk` 24 (Android 7.0) or newer

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/dilrukshax/SLIITShuttle
   cd SLIITShuttle
   ```

2. Open the project in Android Studio (File → Open → select the project root) and let Gradle sync.

3. Build and run on an emulator or physical device:

   ```bash
   ./gradlew assembleDebug
   ./gradlew installDebug     # device/emulator must be connected
   ```

## Testing

Only the Android Studio template test stubs (`ExampleUnitTest.kt`, `ExampleInstrumentedTest.kt`) are present; there are no project-specific tests. Tests were not executed as part of this documentation update.

```bash
./gradlew test               # unit tests
./gradlew connectedCheck     # instrumented tests (needs device/emulator)
```

## Screenshots

<p align="center">
  <img src="https://github.com/dilrukshax/SLIITShuttle/assets/100220079/22abb884-a4fe-4846-9d51-8cfe5af21463" alt="SLIITShuttle concept" width="380" />
</p>

## Deployment

This is an Android application; "deployment" means building the APK/AAB and installing on a device. No backend or deployment URL.

## Limitations

- UI prototype only — no live bus tracking, payment, or QR generation logic.
- The `play-services-maps` dependency is declared but no map is rendered in any activity.
- No automated tests beyond Android Studio template stubs.

## Contributing

This is a coursework project and not accepting external contributions.

## License

No license file is present. Because this repository appears to be coursework (`com.example.sliitshuttle`), ownership has not been confirmed and no open-source license has been added. If you intend to use this code, first clarify ownership with the contributors.

## Author

Dilan Dilruksha  
Software Engineer | Backend & Full-Stack Development  
Portfolio: https://dilandilruksha.dev  
LinkedIn: https://www.linkedin.com/in/dilan-dilruksha  
GitHub: https://github.com/dilrukshax
