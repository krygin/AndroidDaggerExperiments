package com.avito.android.android_dagger_experiments

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v(LOG_TAG, "onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.v(LOG_TAG, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.v(LOG_TAG, "onResume()")

    }

    override fun onPause() {
        super.onPause()
        Log.v(LOG_TAG, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.v(LOG_TAG, "onStop()")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(LOG_TAG, "onDestroy()")


    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        Log.v(LOG_TAG, "onSaveInstanceState()")

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.v(LOG_TAG, "onRestoreInstanceState()")

    }
}

private const val LOG_TAG = "LIFECYCLE"
