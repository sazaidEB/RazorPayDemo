package com.example.razorpaydemo

import android.app.Activity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.razorpaydemo.databinding.ActivityPreviewBinding
import com.example.razorpaydemo.viewmodel.PreviewViewModel
import com.razorpay.BuildConfig
import com.razorpay.Checkout
import org.json.JSONObject

class PreviewActivity : AppCompatActivity() {
    private val viewModel: PreviewViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityPreviewBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_preview)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        // Pass received data to ViewModel
        intent.extras?.let {
            viewModel.name.value = it.getString("name")
            viewModel.designation.value = it.getString("designation")
            viewModel.mobile.value = it.getString("mobile")
            viewModel.email.value = it.getString("email")
            viewModel.company.value = it.getString("company")
        }
        binding.payBtn.setOnClickListener {
            razorPay()
        }


    }
    private fun razorPay() {
        val checkout = Checkout()
        checkout.setKeyID(BuildConfig.RAZORPAY_KEY)

        val activity: Activity = this // Ensure 'this' is an Activity
        val paymentOptions = JSONObject()

        try {
            paymentOptions.put("name", "RazorDemo")
            paymentOptions.put("description", "Test Payment")
            paymentOptions.put("currency", "INR")
            paymentOptions.put("amount", "100") // Amount in paise (e.g., ₹1.00)

            checkout.open(activity, paymentOptions)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}
