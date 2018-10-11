package com.bca.muciter.presenter.bcaofficer

import android.os.Bundle
import android.support.v4.app.Fragment
import com.bca.muciter.R
import com.bca.muciter.base.BaseActivity
import com.bca.muciter.presenter.bcaofficer.homebca.HomeBCAFragment
import com.bca.muciter.presenter.bcaofficer.motor.MotorFragment
import com.luseen.spacenavigation.SpaceItem
import com.luseen.spacenavigation.SpaceOnClickListener
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.design.bottomNavigationView
import org.jetbrains.anko.toast

class MainActivity : BaseActivity(){

    private var fragments: MutableList<Fragment> = mutableListOf()


    val FRAGMENT_HOME = 0
    val FRAGMENT_ORDER = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setup(savedInstanceState)
    }

    override fun setup(savedInstanceState: Bundle?) {
        initFragment(savedInstanceState)

        bottom_navigation.initWithSaveInstanceState(savedInstanceState)
        bottom_navigation.addSpaceItem(SpaceItem("Home",R.drawable.ic_home))
        bottom_navigation.addSpaceItem(SpaceItem("Notification",R.drawable.ic_notifications))

        bottom_navigation.setCentreButtonIcon(R.drawable.ic_person)
        bottom_navigation.setCentreButtonColor(resources.getColor(android.R.color.black))

        bottom_navigation.setSpaceOnClickListener(object : SpaceOnClickListener{
            override fun onCentreButtonClick() {

            }

            override fun onItemClick(itemIndex: Int, itemName: String?) {
                val fragment = fragments[itemIndex]
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.main_container, fragment).commit()
            }

            override fun onItemReselected(itemIndex: Int, itemName: String?) {

            }
        })


//        bottom_navigation.setOnNavigationItemSelectedListener {item ->
//            var index = 0
//            when(item.itemId){
//                R.id.homeMenu ->{
//                    index = 0
//                }
//                R.id.orderMenu ->{
//                    index = 1
//                }
//
//            }
//            val fragment = fragments[index]
//            val transaction = supportFragmentManager.beginTransaction()
//            transaction.replace(R.id.main_container, fragment).commit()
//
//            invalidateOptionsMenu()
//            true
//        }
//        bottom_navigation.selectedItemId = R.id.homeMenu
    }

    private fun initFragment(savedInstanceState: Bundle?){
        fragments.add(FRAGMENT_HOME, HomeBCAFragment.getInstance())
        fragments.add(FRAGMENT_ORDER, MotorFragment.getInstance())

        if (savedInstanceState == null) {
            val transaction = supportFragmentManager.beginTransaction()
            val fragment = fragments[0]
            transaction.replace(R.id.main_container, fragment).commit()
        }
    }
}
