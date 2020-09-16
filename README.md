# Segmented Control Group
Segmented Control Group is a fully customisable ViewGroup for Android which is inspired (and has the same features as the [iOS Segmented Controls](https://developer.apple.com/design/human-interface-guidelines/ios/controls/segmented-controls/))

## Sample UI


## Sample Usage

### In your XML layout file

Include the SegmentedControlGroup in your layout file. Just add as many SegmentedControlButton as needed.
The SegmentedControlGroup has the following custom colors that you can adjust:
`customSliderColor`, `customDividerColor`, `customShadowColor`

    <com.alanvan.segmented_control.SegmentedControlGroup
        android:id="@+id/segmented_control_group"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="16dp"
        app:customSliderColor="#0277BD"
        app:customDividerColor="#0277BD"
        app:customShadowColor="#01579B"
        android:backgroundTint="#03A9F4"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <com.alanvan.segmented_control.SegmentedControlButton
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:textColor="#E1F5FE"
            android:id="@+id/button1"
            android:text="@string/button_1"/>

        <com.alanvan.segmented_control.SegmentedControlButton
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:textColor="#E1F5FE"
            android:id="@+id/button2"
            android:text="@string/button_2"/>

        <com.alanvan.segmented_control.SegmentedControlButton
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:textColor="#E1F5FE"
            android:id="@+id/button3"
            android:text="@string/button_3"/>

    </com.alanvan.segmented_control.SegmentedControlGroup>
    
### In your Kotlin/Java file

Below is one of the ways you can use the SegmentedControlGroup in your Activity/Fragment

        segmentedControlGroup = findViewById(R.id.segmented_control_group)

        segmentedControlGroup.apply {
            setSelectedIndex(2, false)
            setOnSelectedOptionChangeCallback {
                Toast.makeText(context, "Button ${it + 1} selected", Toast.LENGTH_SHORT).show()
            }
        }
