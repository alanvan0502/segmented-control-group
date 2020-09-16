package com.alanvan.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.alanvan.segmented_control.SegmentedControlGroup

class MainActivity : AppCompatActivity() {

    private lateinit var segmentedControlGroup: SegmentedControlGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        segmentedControlGroup = findViewById(R.id.segmented_control_group)

        segmentedControlGroup.apply {
            setOnSelectedOptionChangeCallback {
                Toast.makeText(context, "Button ${it + 1} selected", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
