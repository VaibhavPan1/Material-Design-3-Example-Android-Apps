package com.warhead.test.botnavbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import com.warhead.test.botnavbar.adapters.FragmentAdapter
import com.warhead.test.botnavbar.databinding.ActivityMainBinding
import com.warhead.test.botnavbar.databinding.FragmentLabelOneBinding
import com.warhead.test.botnavbar.fragments.LabelOneFragment
import com.warhead.test.botnavbar.fragments.LabelTwoFragment

class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    private lateinit var fragmentAdapter: FragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fragmentAdapter = FragmentAdapter(supportFragmentManager)
        fragmentAdapter.replaceFragment(LabelOneFragment()) //Fragment1 loads when app starts

        //click listeners on each navigation buttons
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.item_1 -> {
                    fragmentAdapter.replaceFragment(LabelOneFragment())

                    //Include your logic here

                    Toast.makeText(this, "Label 1 selected", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.item_2 -> {
                    fragmentAdapter.replaceFragment(LabelTwoFragment())


                    //Include you logic here

                    Toast.makeText(this, "Label 2 selected", Toast.LENGTH_SHORT).show()
                    true
                }


                else -> false
            }
        }


    }
}