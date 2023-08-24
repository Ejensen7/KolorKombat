package com.erikjensenworks.kolorkombat

import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skydoves.colorpickerview.ColorPickerView
import java.io.FileNotFoundException

class ColorMatcher : AppCompatActivity() {
    private lateinit var viewColorPicker: ColorPickerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_matcher)

        val photoPickerIntent = Intent(Intent.ACTION_PICK)
        photoPickerIntent.type = "image/*"
        startActivityForResult(photoPickerIntent, 1000)
        viewColorPicker = findViewById(R.id.colorPickerView)

        try {
            // Attach bitmap to color picker
            val imageUri = Uri.parse("android.resource://com.erikjensenworks.kolorkombat/drawable/colormatcher")
            //val imageUri: Uri = android.R.attr.data
            val imageStream = contentResolver.openInputStream(imageUri)
            val selectedImage = BitmapFactory.decodeStream(imageStream)
            val drawable: Drawable = BitmapDrawable(resources, selectedImage)
            viewColorPicker.setPaletteDrawable(drawable)
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
    }
}