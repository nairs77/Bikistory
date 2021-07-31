package no.matter.who.mybike

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import no.matter.who.mybike.ui.main.MainFragment
import no.matter.who.mybike.BaseAppCompatActivity

class MainActivity : BaseAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}