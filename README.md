# MultiTextWatcher
Add multiple `TextWatcher` on multiple `Editext` and recive callback at one place


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
    }

    @Override
    public void beforeTextChanged(EditText editText, CharSequence s, int start, int count, int after) {
        Log.i(TAG, "beforeTextChanged: " + s + "Hint--" + editText.getHint());
    }
    @Override
    public void onTextChanged(EditText editText, CharSequence s, int start, int before, int count){
        switch (editText.getId()) {
            case R.id.etMainEmail:
                // TODO: your task
                break;
        }
        Log.i(TAG, "onTextChanged: " + s + "Hint--" + editText.getHint());
    }

    @Override
    public void afterTextChanged(EditText editText, Editable editable){
        Log.i(TAG, "afterTextChanged: " + editable.toString() + "Hint--" + editText.getHint());
    }
}
```
License
--------

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


