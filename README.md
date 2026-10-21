# Android Assignment 1: Activities and Explicit Intents

An Android application developed using **Kotlin and Jetpack Compose** to demonstrate activity navigation using an **Explicit Intent** from `MainActivity` to `SecondActivity`.

## Features

- **MainActivity:** Displays a centered button labeled **"Second Activity"**.
- **Explicit Intent Navigation:** Opens `SecondActivity` when the button is clicked.
- **SecondActivity:** Displays a destination screen confirming successful navigation.
- **Android Manifest:** Registers both activities, with `MainActivity` configured as the launcher activity.

## Technologies Used

- Kotlin
- Android Studio
- Jetpack Compose
- Android SDK

## Key Concepts Explained

1. **Activity:** A component that represents a screen in an Android application.
2. **Button Click:** An event handled using a click callback to execute an action when the user presses a button.
3. **Intent:** A messaging object used to request an action from another Android component.
4. **Explicit Intent:** An Intent that specifies the exact component to open, such as `SecondActivity::class.java`.
5. **AndroidManifest.xml:** Declares essential application information and registers activities and other app components.

## How to Run the Project

1. Clone or download this repository.
2. Open the project in Android Studio.
3. Allow Gradle synchronization to finish.
4. Run the application on an Android emulator or a connected Android device.
5. Tap **"Second Activity"** to navigate to the second screen.

## Learning Objective

The objective of this assignment is to understand Android activities, button click handling, explicit Intents, and activity registration in the Android manifest.
