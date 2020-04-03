package com.example.movieapp.utils

import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun Fragment.setUpActionBar(title: String, enableBackButton: Boolean, hasMenu: Boolean) {
    (activity as AppCompatActivity).supportActionBar?.title = title
    (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(enableBackButton)
    setHasOptionsMenu(hasMenu)
}

fun ProgressBar.hide() {
    visibility = View.GONE
}

fun ProgressBar.show() {
    visibility = View.VISIBLE
}
