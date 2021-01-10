package com.example.kotlin1.activites

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin1.Constants
import com.example.kotlin1.R
import com.example.kotlin1.showToast
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity :AppCompatActivity() {

    companion object{
        val TAG : String = SecondActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras

        bundle?.let{
            val msg = bundle.getString(Constants.USER_MSG_KEY )

            msg?.let { showToast(it) }

            txvUserMessage.text = msg
        }


    }
}

