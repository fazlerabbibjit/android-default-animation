package com.fazlerabbikhan.animation

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var buttonOne: Button
    private lateinit var buttonTwo: Button
    private lateinit var buttonThree: Button
    private lateinit var buttonFour: Button
    private lateinit var bjitacadImage: ImageView
    private lateinit var bjitacadText: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonOne = findViewById(R.id.button_one)
        buttonTwo = findViewById(R.id.button_two)
        buttonThree = findViewById(R.id.button_three)
        buttonFour = findViewById(R.id.button_four)
        bjitacadImage = findViewById(R.id.image_bjitacad)
        bjitacadText = findViewById(R.id.text_bjitacad)

        buttonOne.setOnClickListener{
            Toast.makeText(this, "Button One clicked.", Toast.LENGTH_SHORT).show()
            val rotateAnimation = ObjectAnimator.ofFloat(bjitacadImage, View.ROTATION, 0f,360f)
            rotateAnimation.repeatCount = 2
            rotateAnimation.duration = 1000
            rotateAnimation.repeatMode = ObjectAnimator.REVERSE
            rotateAnimation.start()
        }

        buttonTwo.setOnClickListener{
            Toast.makeText(this, "Button Two clicked.", Toast.LENGTH_SHORT).show()
            val fadeOutAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            bjitacadText.startAnimation(fadeOutAnimation)
        }

        buttonThree.setOnClickListener{
            Toast.makeText(this, "Button Three clicked.", Toast.LENGTH_SHORT).show()
            val bounceAnimation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            bjitacadImage.startAnimation(bounceAnimation)
        }

        buttonFour.setOnClickListener{
            Toast.makeText(this, "Button Four clicked.", Toast.LENGTH_SHORT).show()
            val zoomInAnimation = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            bjitacadText.startAnimation(zoomInAnimation)
        }
    }
}