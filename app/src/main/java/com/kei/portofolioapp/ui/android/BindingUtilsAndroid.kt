package com.kei.portofolioapp.ui.android

import android.widget.ImageView
import android.widget.TextView
import coil.Coil
import coil.load
import androidx.databinding.BindingAdapter
import com.kei.portofolioapp.data.android.Android

@BindingAdapter("androidTitle")
fun TextView.setTitleAndroid(data: Android?){
    data?.let {
        text = data.title
    }
}

@BindingAdapter("androidImage")
fun ImageView.setAndroidImage(data: Android){
    load(data.poster){
        crossfade(1000)
    }
}