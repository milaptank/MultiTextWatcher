# MultiTextWatcher
Add multiple `TextWatcher` on multiple `Editext` and receive callback at one place


Usage
--------
```kotlin
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


