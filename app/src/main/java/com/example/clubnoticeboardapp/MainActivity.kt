package com.example.clubnoticeboardapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Navigation buttons
        val eventsBtn = findViewById<LinearLayout>(R.id.eventsBtn)
        val profileBtn = findViewById<LinearLayout>(R.id.profileBtn)
        val membersBtn = findViewById<LinearLayout>(R.id.membersBtn)
        val noticeBtn = findViewById<LinearLayout>(R.id.noticeBtn)
        val walletBtn = findViewById<LinearLayout>(R.id.walletBtn)
        val earnBtn = findViewById<LinearLayout>(R.id.earnBtn)

        // Know More section (now a LinearLayout)
        val knowMoreBtn = findViewById<LinearLayout>(R.id.knowMoreBtn)

        // Click listeners for navigation
        eventsBtn.setOnClickListener {
            Log.d("MainActivity", "Events button clicked")
            startActivity(Intent(this, EventsActivity::class.java))
        }

        profileBtn.setOnClickListener {
            Log.d("MainActivity", "Profile button clicked")
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        membersBtn.setOnClickListener {
            Log.d("MainActivity", "Members button clicked")
            startActivity(Intent(this, MembersActivity::class.java))
        }

        noticeBtn.setOnClickListener {
            Log.d("MainActivity", "Notice button clicked")
            startActivity(Intent(this, NoticeActivity::class.java))
        }

        walletBtn.setOnClickListener {
            Log.d("MainActivity", "Wallet button clicked")
            startActivity(Intent(this, WalletActivity::class.java))
        }

        earnBtn.setOnClickListener {
            Log.d("MainActivity", "Earn Money button clicked")
            startActivity(Intent(this, EarnMoneyActivity::class.java))
        }

        // Know More click opens university clubs link
        knowMoreBtn.setOnClickListener {
            Log.d("MainActivity", "Know More clicked")
            val url = "https://www.galgotiasuniversity.edu.in/p/campus-life/societies-clubs"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}
