# MultiTextWatcher
Add multiple `TextWatcher` on multiple `EditText` and receive callback at one place

Usage
--------
```java
public class MainActivity extends AppCompatActivity implements OnTextWatcher {
 private static final String TAG = "MultiTextWatcher";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText etName = (EditText) findViewById(R.id.etMainName);
        EditText etEmail = (EditText) findViewById(R.id.etMainEmail);
        new MultiTextWatcher()
                .setEditText(etEmail)
                .setOnTextWatcher(this);
        new MultiTextWatcher()
                .setEditText(etName)
                .setOnTextWatcher(this);

  @Override
  public void beforeTextChanged(EditText editText, CharSequence s, int start, int count, int after) {
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
    public void afterTextChanged(EditText editText, Editable editable)
        Log.i(TAG, "afterTextChanged: " + editable.toString() + "Hint--" + editText.getHint());
    }
}
```
