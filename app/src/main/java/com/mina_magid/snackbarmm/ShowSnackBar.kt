package com.mina_magid.snackbarmm

import android.app.Activity
import android.content.Context
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar

object ShowSnackBar {
    fun showSnackBar(activity: Activity ,message: String, errorMessage: Boolean) {
        val snackBar =
            Snackbar.make(activity.findViewById(android.R.id.content), message, Snackbar.LENGTH_LONG)

        val snackBarView = snackBar.view

        if (errorMessage) {
            snackBarView.setBackgroundColor(
                ContextCompat.getColor(
                    activity,
                    R.color.red
                )
            )
        } else {
            snackBarView.setBackgroundColor(
                ContextCompat.getColor(
                    activity,
                    R.color.green
                )
            )
        }
        snackBar.show()
    }

}