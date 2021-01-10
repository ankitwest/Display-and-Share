 package com.example.kotlin1.activites

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin1.Constants
import com.example.kotlin1.R
import com.example.kotlin1.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        val TAG : String = MainActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            Log.i(TAG, "Button was Clicked !")
            showToast("Button was Clicked! ", Toast.LENGTH_LONG)
        }

        btnSendMsgToNextActivity.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra(Constants.USER_MSG_KEY, message)

            startActivity(intent)
        }

        btnShareToOtherApps.setOnClickListener {

            val message: String = etUserMessage.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(
                Intent.EXTRA_TEXT,
                message
            )       //  key pair   //Intent.E    predefined key
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Please Select an app : "))

        }

        btnRecyclerViewDemo.setOnClickListener {

            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}
 //Contest 1: Round #688 (Div 2)	 Rank 6 score 403
 //div 2 681 683