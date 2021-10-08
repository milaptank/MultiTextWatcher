package com.mpt.android.multitextwatcherdemo

import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.mpt.android.multitextwatcher.MultiTextWatcher
import com.mpt.android.multitextwatcher.OnTextWatcher


class MainActivity : AppCompatActivity(), OnTextWatcher {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName: EditText = findViewById<View>(R.id.etMainName) as EditText
        val etEmail: EditText = findViewById<View>(R.id.etMainEmail) as EditText
        val etPassword: EditText = findViewById<View>(R.id.etMainPassword) as EditText
        val etPhone: EditText = findViewById<View>(R.id.etMainPhone) as EditText


        MultiTextWatcher(etName).setOnTextWatcher(this)
        MultiTextWatcher(etEmail).setOnTextWatcher(this)
        MultiTextWatcher(etPassword).setOnTextWatcher(this)
        MultiTextWatcher(etPhone).setOnTextWatcher(this)
    }

    override fun beforeTextChanged(
        editText: EditText,
        s: CharSequence,
        start: Int,
        count: Int,
        after: Int
    ) {
        when (editText.id) {
            R.id.etMainEmail -> {
            }
        }
        Log.i(TAG, "beforeTextChanged: " + s.toString() + "Hint--" + editText.hint)
    }

    override fun onTextChanged(
        editText: EditText,
        s: CharSequence,
        start: Int,
        before: Int,
        count: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun afterTextChanged(editText: EditText, editable: Editable) {
        TODO("Not yet implemented")
    }


    companion object{
        private const val TAG: String = "MultiTextWatcher"
    }
}