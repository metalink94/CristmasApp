package ru.lapov.cristmasapp.utils

import android.support.v7.app.AppCompatActivity
import com.facebook.appevents.AppEventsLogger
import ru.lapov.cristmasapp.CristmasApp

open class BaseActivity: AppCompatActivity() {

    fun getLogger(): AppEventsLogger =
        (application as CristmasApp).logger
}