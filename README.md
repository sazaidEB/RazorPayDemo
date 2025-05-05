# Razorpay Demo App

This is a simple Android demo app built using **Kotlin**, **XML**, and **MVVM architecture**. The app demonstrates basic form input handling, data passing between screens, and integration with **Razorpay Checkout** for payment processing.

---

## 📱 App Features

- **Screen 1: User Input Form**
  - Collects user details: **Name**, **Email**, and **Mobile Number**.
  - Basic input validation included.

- **Screen 2: User Summary Card**
  - Displays the entered details in a styled card view.
  - Uses MVVM to pass and retain user data cleanly between screens.

- **Screen 3: Razorpay Checkout**
  - Redirects user to Razorpay's payment gateway.
  - Payment initiated using Razorpay’s Android SDK.

---

## 🛠 Tech Stack

- **Language**: Kotlin
- **UI**: XML Layouts
- **Architecture**: MVVM (Model-View-ViewModel)
- **Payment Gateway**: Razorpay Android SDK
- **Navigation**: Manual Intent-based screen transitions

---

## 🔐 Security Note

For demo purposes, the Razorpay key is injected securely using `BuildConfig` via `local.properties` and **is not hardcoded** in the source code.

---

## 🚀 How to Run the Project

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/razorpay-demo-app.git
   cd razorpay-demo-app

  2: **Add your Razorpay Key to local.properties:**
     RAZORPAY_KEY=your_actual_razorpay_key_here
