package com.bca.muciter.presenter.bcaofficer.motor.detail


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.bca.muciter.R
import com.bca.muciter.base.BaseFragment
import com.bca.muciter.model.Motor
import kotlinx.android.synthetic.main.fragment_motor_description.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class MotorSpecificationFragment : BaseFragment() {
    private lateinit var motor: Motor

    companion object Factory{
        fun getInstance(): MotorDescriptionFragment {
            return MotorDescriptionFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_motor_specification, container, false)
    }

    override fun setup() {
        if (arguments != null) {
            //arguments (get motor object)
            motor = arguments!!.getParcelable("motor")
        }
    }
}
