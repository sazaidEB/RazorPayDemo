package com.example.razorpaydemo.viewmodel
import android.app.Activity
import android.app.Application
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.razorpay.Checkout
import org.json.JSONObject

class PreviewViewModel(application: Application) : AndroidViewModel(application) {
    val name = MutableLiveData("")
    val designation = MutableLiveData("")
    val mobile = MutableLiveData("")
    val email = MutableLiveData("")
    val company = MutableLiveData("")

    fun onPayClick() {
//        val checkout = Checkout()
//        checkout.setKeyID("rzp_live_FJpeuNPo9t3LI4") // Replace with your Razorpay API Key
//
//        try {
//            val options = JSONObject()
//            options.put("name", "Visiting Card Payment")
//            options.put("description", "Pay for your visiting card")
//            options.put("currency", "INR")
//            options.put("amount", 10000) // Amount in paise (₹100)
//
//            checkout.open(getApplication(), options)
//        } catch (e: Exception) {
//            Toast.makeText(getApplication(), "Error: ${e.message}", Toast.LENGTH_SHORT).show()
//        }

//        val checkout = Checkout()
//        checkout.setKeyID("<YOUR_KEY_ID>")
//
//        val activity: Activity = this // Ensure 'this' is an Activity
//        val paymentOptions = JSONObject()
//
//        try {
//            paymentOptions.put("name", "Your App Name")
//            paymentOptions.put("description", "Test Payment")
//            paymentOptions.put("currency", "INR")
//            paymentOptions.put("amount", "100") // Amount in paise (e.g., ₹1.00)
//
//            checkout.open(activity, paymentOptions) // Use Activity, not Application
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }
//
//    }
}}
