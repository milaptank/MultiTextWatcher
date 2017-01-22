package com.mpt.android.multitextwatcher;

import android.text.Editable;
import android.widget.EditText;

public interface OnTextWatcher {
    void beforeTextChanged(EditText editText, CharSequence s, int start, int count, int after);

    void onTextChanged(EditText editText, CharSequence s, int start, int before, int count);

    void afterTextChanged(EditText editText, Editable editable);
}