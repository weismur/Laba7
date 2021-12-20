package com.example.lab7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun show(v: View){
        val editText: EditText = findViewById(R.id.editText);
        val checkBox: CheckBox = findViewById(R.id.checkBox)
        val checked:String
        val toggle:ToggleButton = findViewById(R.id.toggleButton)
        val t_checked:String
        if (checkBox.isChecked){
            checked = "ON"
        }
        else{
            checked = "OFF"
        }
        if(toggle.isChecked){
            t_checked = "ON"
        }
        else{
            t_checked = "OFF"
        }
        val radioGroup: RadioGroup = findViewById(R.id.radioGroup);
        var r_checked:String = ""
        when (radioGroup.checkedRadioButtonId) {
            R.id.radioButton -> r_checked = "RadioButton 1"
            R.id.radioButton2 -> r_checked = "RadioButton 2"
        }
        val string:String = "EditText: ${editText.text}\n" +
                            "CheckBox: $checked\n" +
                            "ToggleButton: $t_checked\n" +
                            "RadioGroup: $r_checked"
        val text:TextView = findViewById(R.id.textView)
        text.setText(string)
    }
}