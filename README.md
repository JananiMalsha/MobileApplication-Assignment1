# Android Assignment: Activities and Explicit Intents

An Android application developed in Kotlin demonstrating activity navigation using an **Explicit Intent** from `MainActivity` to `SecondActivity`.

## Features
- **MainActivity:** Features a centered button labeled "Second Activity".
- **Navigation:** Explicit `Intent` triggered via button click to launch `SecondActivity`.
- **SecondActivity:** Destination screen confirming navigation.
- **Manifest:** Both activities properly registered in `AndroidManifest.xml` with `MainActivity` as the launcher.

## Key Concepts Explained
1. **Activity:** Represents a single screen with a user interface.
2. **Button Click:** Handled using an `OnClickListener` that triggers the navigation code.
3. **Intent:** An asynchronous message object used to request an action from another app component.
4. **Explicit Intent:** Explicitly specifies the destination component (`SecondActivity::class.java`).
5. **AndroidManifest.xml:** The central app declaration file registering all activities, permissions, and launcher entry point.
