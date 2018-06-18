package com.example.billy.firstappkotlin.kotlinforandroidDeveloper.startnewactivity

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import android.widget.Toast
import com.example.billy.firstappkotlin.MainActivity
import com.example.billy.firstappkotlin.R
import com.example.billy.firstappkotlin.kotlinforandroidDeveloper.recycleAdapter.RecycleAdapter
import kotlinx.android.synthetic.main.new_activity.*

class newActivity : AppCompatActivity() {
    private val items = listOf(
            "Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Foggy - 21/8",
            "Wed 6/25 - Cloudy - 22/17", "Thurs 6/26 - Rainy - 18/11",
            "Fri 6/27 - Foggy - 21/10",
            "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
            "Sun 6/29 - Sunny - 20/7"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_activity)
        tvSayHello.text = "say hi!"
        niceToast("hello hihi")
        setUpRecycleView()
        toast("hello it's me")
    }

    fun Context.toast(message: String, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, duration).show()

    }

    fun setUpRecycleView() {
        val mRecycleView = findViewById<RecyclerView>(R.id.recycleViewM)
        mRecycleView.layoutManager = LinearLayoutManager(this)
        mRecycleView.setHasFixedSize(true)
        mRecycleView.adapter = RecycleAdapter(items)
    }

    /* fun toast(message: String = "hello", length: Int = Toast.LENGTH_LONG) {
         Toast.makeText(this, message, length).show()
     }*/

    fun niceToast(message: String, tag: String = newActivity::class.java.simpleName, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, "message is $message $tag  ", length).show()
    }
}