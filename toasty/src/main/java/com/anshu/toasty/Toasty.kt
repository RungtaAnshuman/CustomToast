package com.anshu.toasty

import android.content.Context
import android.widget.Toast

object Toasty {
    fun showToast(context: Context, string: String) {
        Toast.makeText(context, string, Toast.LENGTH_SHORT).show()
    }
}