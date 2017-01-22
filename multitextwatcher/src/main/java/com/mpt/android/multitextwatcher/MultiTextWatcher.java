package com.mpt.android.multitextwatcher;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class MultiTextWatcher implements TextWatcher {

    private OnTextWatcher onTextWatcher;
    private EditText editText;

    public MultiTextWatcher setOnTextWatcher(OnTextWatcher onTextWatcher) {
        this.onTextWatcher = onTextWatcher;
        return this;
    }

    public MultiTextWatcher setEditText(EditText editText) {

        this.editText = editText;
        this.editText.addTextChangedListener(this);
        return this;
    }


    /*public MultiTextWatcher setEditTexts(final EditText editText) {

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                onTextWatcher.beforeTextChanged(editText, s, start, count, after);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                onTextWatcher.onTextChanged(editText, s, start, before, count);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                onTextWatcher.afterTextChanged(editText, editable);
            }
        });
        return this;
    }*/

    /**
     * This method is called to notify you that, within <code>s</code>,
     * the <code>count</code> characters beginning at <code>start</code>
     * are about to be replaced by new text with length <code>after</code>.
     * It is an error to attempt to make changes to <code>s</code> from
     * this callback.
     *
     * @param s
     * @param start
     * @param count
     * @param after
     */
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        onTextWatcher.beforeTextChanged(editText, s, start, count, after);
    }

    /**
     * This method is called to notify you that, within <code>s</code>,
     * the <code>count</code> characters beginning at <code>start</code>
     * have just replaced old text that had length <code>before</code>.
     * It is an error to attempt to make changes to <code>s</code> from
     * this callback.
     *
     * @param s
     * @param start
     * @param before
     * @param count
     */
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        onTextWatcher.onTextChanged(editText, s, start, before, count);
    }

    /**
     * This method is called to notify you that, somewhere within
     * <code>s</code>, the text has been changed.
     * It is legitimate to make further changes to <code>s</code> from
     * this callback, but be careful not to get yourself into an infinite
     * loop, because any changes you make will cause this method to be
     * called again recursively.
     * (You are not told where the change took place because other
     * afterTextChanged() methods may already have made other changes
     * and invalidated the offsets.  But if you need to know here,
     * you can use {@link -Spannable setSpan} in {@link #onTextChanged}
     * to mark your place and then look up from here where the span
     * ended up.
     *
     * @param editable
     */
    @Override
    public void afterTextChanged(Editable editable) {
        onTextWatcher.afterTextChanged(editText, editable);
    }


}