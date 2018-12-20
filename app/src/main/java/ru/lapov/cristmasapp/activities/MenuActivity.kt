package ru.lapov.cristmasapp.activities

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.menu_activity.*
import ru.lapov.cristmasapp.R
import ru.lapov.cristmasapp.utils.BaseActivity

class MenuActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_activity)
        space.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        lotery.setOnClickListener {
            startActivity(Intent(this, LoteryActivity::class.java))
        }
    }
}