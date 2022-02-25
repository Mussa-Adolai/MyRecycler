
package com.example.kt9

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView



class MainActivity : AppCompatActivity() {

    var frameLayout : FrameLayout? = null
    var bottomNavigationView : BottomNavigationView? = null
    var recycler: RecyclerView? =null
     //var Custom_dapter: RecyclerView.Adapter<Custom_dapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        frameLayout = findViewById(R.id.fContainer)
        bottomNavigationView = findViewById(R.id.bottomNav)
        recycler = findViewById(R.id.recycler)
        //recycler?.adapter = Custom_Adapter()




        bottomNavClick()
    }
    fun bottomNavClick(){
        bottomNavigationView?.setOnItemSelectedListener(){

            when(it.itemId){
                R.id.home -> {
                    chooseFragment(PersonFragment(),"HOME")
                }

                R.id.profile->{
                    chooseFragment(RecyclerFragment(),"PROFILE")
                }
            }
            true

        }


    }
  fun chooseFragment(fragment:Fragment,tag:String){
      val fragmentTransaction : FragmentTransaction = supportFragmentManager.beginTransaction()
      fragmentTransaction.replace(R.id.fContainer,fragment,tag)
      fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
      fragmentTransaction.commit()

  }

}