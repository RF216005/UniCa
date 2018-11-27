package com.example.enpit_p3.unica
import android.os.Bundle
import com.journeyapps.barcodescanner.CaptureActivity

class CaptureActivityOrientation : CaptureActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capture_orientation)
    }
}
