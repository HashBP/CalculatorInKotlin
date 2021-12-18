/*
Here, This is a basic calculator app for android, In this I have learned
*(AnyName : view) in a function which finds the id of the button we clicked on.
*The editText view in which we can use the numbers available on screen to directlyuse it as a number by "edittxt.text.toString()" and "edittxt.setText()"
*/
package com.example.calculatorinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var edittxt: EditText
    var number1: Float = 0.0f
    var isplus: Boolean = false
    var ism: Boolean = false
    var isd: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edittxt = findViewById(R.id.cal_display)
    }

    fun clickme(v: View) {
        when (v.id) {
            R.id.btn_1 -> {
                val number = edittxt.text.toString() + "1"
                edittxt.setText(number)
            }

            R.id.btn_2 -> {
                val number = edittxt.text.toString() + "2"
                edittxt.setText(number)
            }
            R.id.btn_3 -> {
                val number = edittxt.text.toString() + "3"
                edittxt.setText(number)
            }
            R.id.btn_4 -> {
                val number = edittxt.text.toString() + "4"
                edittxt.setText(number)
            }
            R.id.btn_5 -> {
                val number = edittxt.text.toString() + "5"
                edittxt.setText(number)
            }
            R.id.btn_6 -> {
                val number = edittxt.text.toString() + "6"
                edittxt.setText(number)
            }
            R.id.btn_7 -> {
                val number = edittxt.text.toString() + "7"
                edittxt.setText(number)
            }
            R.id.btn_8 -> {
                val number = edittxt.text.toString() + "8"
                edittxt.setText(number)
            }
            R.id.btn_9 -> {
                val number = edittxt.text.toString() + "9"
                edittxt.setText(number)
            }
            R.id.btn_z -> {
                val number = edittxt.text.toString() + "0"
                edittxt.setText(number)
            }
            R.id.btn_n -> {
                val number = edittxt.text.toString() + "."
                edittxt.setText(number)
            }
            R.id.btn_C -> {
                edittxt.setText("")
            }
            R.id.btn_p -> {
                number1 = edittxt.text.toString().toFloat()
                edittxt.setText("")
                isplus = true
            }
            R.id.btn_m -> {
                number1 = edittxt.text.toString().toFloat()
                edittxt.setText("")
                ism = true
            }
            R.id.btn_d -> {
                number1 = edittxt.text.toString().toFloat()
                edittxt.setText("")
                isd = true
            }
            R.id.btn_e -> {
                val number2 = edittxt.text.toString().toFloat()
                when {
                    isplus -> {
                        val result = number1 + number2
                        edittxt.setText(result.toString())
                        isplus = false
                    }
                    ism -> {
                        val result = number1 * number2
                        edittxt.setText(result.toString())
                        ism = false
                    }
                    isd -> {
                        val result = number1 / number2
                        edittxt.setText(result.toString())
                        isd = false
                    }
                }

            }

        }
    }
}