package com.mpt.android.multitextwatcherdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.util.Log;
import android.widget.EditText;

import com.mpt.android.multitextwatcher.MultiTextWatcher;
import com.mpt.android.multitextwatcher.OnTextWatcher;

public class MainActivity extends AppCompatActivity implements OnTextWatcher {


    private static final String TAG = "MultiTextWatcher";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etName = (EditText) findViewById(R.id.etMainName);
        EditText etEmail = (EditText) findViewById(R.id.etMainEmail);
        EditText etPassword = (EditText) findViewById(R.id.etMainPassword);
        EditText etPhone = (EditText) findViewById(R.id.etMainPhone);

        new MultiTextWatcher()
                .setEditText(etEmail)
                .setOnTextWatcher(this);
        new MultiTextWatcher()
                .setEditText(etName)
                .setOnTextWatcher(this);
        new MultiTextWatcher()
                .setEditText(etPassword)
                .setOnTextWatcher(this);
        new MultiTextWatcher()
                .setEditText(etPhone)
                .setOnTextWatcher(this);


    }

    @Override
    public void beforeTextChanged(EditText editText, CharSequence s, int start, int count, int after) {


        switch (editText.getId()) {
            case R.id.etMainEmail:
                // TODO: your task
                break;

        }

        Log.i(TAG, "beforeTextChanged: " + s + "Hint--" + editText.getHint());
    }

    @Override
    public void onTextChanged(EditText editText, CharSequence s, int start, int before, int count) {

        switch (editText.getId()) {
            case R.id.etMainEmail:
                // TODO: your task
                break;

        }
        Log.i(TAG, "onTextChanged: " + s + "Hint--" + editText.getHint());
    }

    @Override
    public void afterTextChanged(EditText editText, Editable editable) {

        switch (editText.getId()) {
            case R.id.etMainEmail:
                // TODO: your task
                break;

        }
        Log.i(TAG, "afterTextChanged: " + editable.toString() + "Hint--" + editText.getHint());
    }
}
