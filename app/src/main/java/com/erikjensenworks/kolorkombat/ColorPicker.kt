package com.erikjensenworks.kolorkombat

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.skydoves.colorpickerview.ColorEnvelope
import com.skydoves.colorpickerview.ColorPickerView
import com.skydoves.colorpickerview.listeners.ColorEnvelopeListener
import com.skydoves.colorpickerview.sliders.AlphaSlideBar
import com.skydoves.colorpickerview.sliders.BrightnessSlideBar
import yuku.ambilwarna.AmbilWarnaDialog

private const val TAG = "ColorPicker"

class ColorPicker : AppCompatActivity() {
    private lateinit var tvTitle: TextView
    private lateinit var tvHexValue: TextView
    private lateinit var viewSelectedColor: View
    private lateinit var colorPickerView: ColorPickerView
    private lateinit var alphaSlideBar: AlphaSlideBar
    private lateinit var brightnessSlide: BrightnessSlideBar

    private var color = 0
    private var defaultHex = "0000000"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.color_picker)

        tvTitle = findViewById(R.id.tvTitle)
        tvHexValue = findViewById(R.id.tvHexValue)
        colorPickerView = findViewById(R.id.colorPickerView)
        alphaSlideBar = findViewById(R.id.alphaSlideBar)
        brightnessSlide = findViewById(R.id.brightnessSlide)

        colorPickerView.attachAlphaSlider(alphaSlideBar)
        colorPickerView.attachBrightnessSlider(brightnessSlide)

        colorPickerView.setColorListener(object : ColorEnvelopeListener {
            override fun onColorSelected(envelope: ColorEnvelope, fromUser: Boolean) {
                color = envelope.color
                defaultHex = envelope.hexCode
                tvTitle.setTextColor(color)
                tvHexValue.text = "#$defaultHex"
            }

        })
    }

    private fun openColorPickerDialogue() {
        val colorPickerDialogue = AmbilWarnaDialog(this, color, object :
            AmbilWarnaDialog.OnAmbilWarnaListener {
            override fun onCancel(dialog: AmbilWarnaDialog?) {
                //Purposefully left blank
            }

            override fun onOk(dialog: AmbilWarnaDialog?, color: Int) {
                Log.i(TAG, "onOk $color")
                this@ColorPicker.color = color
                viewSelectedColor.setBackgroundColor(this@ColorPicker.color)
            }
        })
        colorPickerDialogue.show()
    }
}