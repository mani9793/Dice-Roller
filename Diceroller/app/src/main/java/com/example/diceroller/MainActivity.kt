package com.example.diceroller

import android.animation.Animator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dice.addAnimatorListener(object : Animator.AnimatorListener{
            override fun onAnimationStart(animator: Animator) {
            }
            override fun onAnimationEnd(animator: Animator){
                hideDice()
                val random = (1..6).random()
                textView3.text = random.toString()
            }
            override fun onAnimationCancel(animator: Animator){

            }
            override fun onAnimationRepeat(animator: Animator){

            }

        })
    }
    private  fun showDice(){
        dice.visibility = View.VISIBLE
        textView3.visibility = View.GONE
        button.isEnabled=false
    }

    private fun hideDice(){
        dice.visibility = View.GONE
        textView3.visibility= View.VISIBLE
        button.isEnabled= true
    }

    fun onButtonClick(view: View) {
      showDice()
        dice.playAnimation()

    }
}