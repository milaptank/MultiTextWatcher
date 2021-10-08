package com.mpt.android.multitextwatcher

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText


/**
 * Created by Milap Tank on 07/10/21
 *for milaptank
 *Email:milaptank@gmail.com
 */
class MultiTextWatcher constructor(private var editText: EditText) : TextWatcher {

    private lateinit var onTextWatcher: OnTextWatcher
    
    fun setOnTextWatcher(onTextWatcher: OnTextWatcher): MultiTextWatcher {
        this.onTextWatcher = onTextWatcher
        return this
    }


    override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
        onTextWatcher.beforeTextChanged(editText, s, start, count, after)

    }

    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
        onTextWatcher.onTextChanged(editText, s, start, before, count)
    }

    override fun afterTextChanged(editable: Editable) {
        onTextWatcher.afterTextChanged(editText, editable)

    }


    init {
        editText.addTextChangedListener(this)
    }


}