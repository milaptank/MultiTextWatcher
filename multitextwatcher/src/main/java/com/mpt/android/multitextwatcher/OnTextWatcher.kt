package com.mpt.android.multitextwatcher

import android.text.Editable
import android.widget.EditText

interface OnTextWatcher {
    fun beforeTextChanged(editText: EditText, s: CharSequence, start: Int, count: Int, after: Int)
    fun onTextChanged(editText: EditText, s: CharSequence, start: Int, before: Int, count: Int)
    fun afterTextChanged(editText: EditText, editable: Editable)
}