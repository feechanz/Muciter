package com.bca.muciter.presenter.bcaofficer.motor.detail

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.bca.muciter.R
import com.bca.muciter.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_motor_description.*

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [MotorDescriptionFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [MotorDescriptionFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class MotorDescriptionFragment : BaseFragment() {
    lateinit var description: String

    companion object Factory{
        fun getInstance(): MotorDescriptionFragment {
            return MotorDescriptionFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_motor_description, container, false)
    }

    override fun setup() {
        if (arguments != null) {
            description = arguments!!.getString("description")
            descriptionTextView.text = description
        }
    }
}
