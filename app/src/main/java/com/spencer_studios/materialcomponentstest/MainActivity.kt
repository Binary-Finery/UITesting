package com.spencer_studios.materialcomponentstest

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var buttons: Array<Button>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        buttons = arrayOf(item_1, item_2, item_3, item_4, item_5, item_6, item_7, item_8)

        buttons.forEach {button ->
            button.setOnClickListener(this)
            setButtonUI(button, false)
        }
    }

    private fun setButtonUI(b : Button, isSelected : Boolean){
        b.setBackgroundResource(if(isSelected) R.drawable.button_selected else R.drawable.button_unselected)
        b.setTextColor(if(isSelected) Color.WHITE else Color.BLACK)
    }

    override fun onClick(view: View?) {
        buttons.forEach {button ->
            if (view == button) {
                setButtonUI(button, true)
                commitAction(button)
            } else {
               setButtonUI(button, false)
            }
        }
    }

    private fun commitAction(button: Button) {
        when(button) {
            item_1 -> {
                //todo
                tv.text = "item 1"
            }
            item_2 -> {
                //todo
                tv.text = "item 2"
            }
            item_3 -> {
                //todo
                tv.text = "item 3"
            }
            item_4 -> {
                //todo
                tv.text = "item 4"
            }
            item_5 -> {
                //todo
                tv.text = "item 5"
            }
            item_6 -> {
                //todo
                tv.text = "item 6"
            }
            item_5 -> {
                //todo
                tv.text = "item 7"
            }
            item_6 -> {
                //todo
                tv.text = "item 8"
            }
        }
    }
}