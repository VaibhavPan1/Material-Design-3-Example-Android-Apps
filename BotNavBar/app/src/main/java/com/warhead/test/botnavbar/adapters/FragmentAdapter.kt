package com.warhead.test.botnavbar.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.warhead.test.botnavbar.R
import com.warhead.test.botnavbar.fragments.LabelOneFragment
import com.warhead.test.botnavbar.fragments.LabelTwoFragment

class FragmentAdapter(private val fm: FragmentManager){


    fun replaceFragment(fragment: Fragment){
        val transaction:FragmentTransaction = fm.beginTransaction()
        transaction.replace(R.id.frame_main, fragment)
        transaction.commit()
    }
}