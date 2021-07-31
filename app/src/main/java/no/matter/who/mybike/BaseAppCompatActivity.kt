package no.matter.who.mybike

import androidx.appcompat.app.AppCompatActivity

open class BaseAppCompatActivity: AppCompatActivity() {
    protected var me = this

    private var mPaused = false

    override fun onResume() {
        super.onResume()
        mPaused = false
    }

    override fun onPause() {
        mPaused = true
        super.onPause()
    }

    fun isPaused(): Boolean {
        return mPaused
    }
}