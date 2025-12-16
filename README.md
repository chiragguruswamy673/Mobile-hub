# 📱 Mobile Hub – Appium Test Suite

[![Quick CI](https://github.com/chiragguruswamy673/Mobile-hub/actions/workflows/ci.yml/badge.svg)](https://github.com/chiragguruswamy673/Mobile-hub/actions/workflows/ci.yml)

A lightweight mobile automation framework built with **Appium** + **TestNG** to validate core flows (Login, Cart, Checkout) and resilience scenarios (Chaos triggers, Accessibility checks).  
This project demonstrates how to set up, run, and scale mobile tests on Android emulators or real devices.

---

## 🚀 Features
- **Login flow tests** – valid and invalid credentials.
- **Cart & Checkout tests** – button visibility and clickability.
- **Chaos engineering triggers** – simulate network drop/restore.
- **Accessibility tests** – verify `contentDescription` and UI hierarchy.
- **CI/CD ready** – GitHub Actions workflow included for automated runs.

---

## 🛠 Tech Stack
- **Java 17**
- **Appium Java Client 9.x**
- **TestNG 7.x**
- **Maven** for build & dependency management
- **Android Emulator** (Pixel 6, API 36)
- **Allure TestNG** 


---

## ⚡ CI/CD Integration

This repo includes a GitHub Actions workflow (.github/workflows/ci.yml) that:
- Sets up JDK 17 + Android SDK.
- Builds the project with Maven.
- Runs all TestNG suites automatically on every push/pull request.

## ✅ Current Coverage
- 7 tests implemented:
- Login success
- Login failure (empty credentials)
- Cart button visibility
- Checkout button visibility
- Chaos: network drop → offline banner
- Chaos: network restore → success message
- Accessibility checks

## 👤 Author

### Chirag Guruswamy 
