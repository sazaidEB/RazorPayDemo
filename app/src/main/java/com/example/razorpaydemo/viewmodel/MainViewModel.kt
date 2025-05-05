package com.example.razorpaydemo.viewmodel
import android.app.Application
import android.content.Context
import android.content.Intent
import android.util.Patterns
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.razorpaydemo.PreviewActivity


class MainViewModel(application: Application) : AndroidViewModel(application) {
    val name = MutableLiveData("")
    val designation = MutableLiveData("")
    val mobile = MutableLiveData("")
    val email = MutableLiveData("")
    val company = MutableLiveData("")

    fun onSubmitClick() {
        val context = getApplication<Application>().applicationContext

        // Check if any of the fields are empty or invalid
        when {
            name.value.isNullOrEmpty() -> {
                showToast(context, "Name is required")
                return
            }
            designation.value.isNullOrEmpty() -> {
                showToast(context, "Designation is required")
                return
            }
            mobile.value.isNullOrEmpty() -> {
                showToast(context, "Mobile number is required")
                return
            }
            email.value.isNullOrEmpty() -> {
                showToast(context, "Email is required")
                return
            }
            !Patterns.EMAIL_ADDRESS.matcher(email.value!!).matches() -> {
                showToast(context, "Invalid email format")
                return
            }
            company.value.isNullOrEmpty() -> {
                showToast(context, "Company name is required")
                return
            }
        }

        // If all validations pass, proceed with the Intent
        val intent = Intent(context, PreviewActivity::class.java).apply {
            putExtra("name", name.value)
            putExtra("designation", designation.value)
            putExtra("mobile", mobile.value)
            putExtra("email", email.value)
            putExtra("company", company.value)
        }
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }

    // Helper function to show Toast messages
    private fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}

