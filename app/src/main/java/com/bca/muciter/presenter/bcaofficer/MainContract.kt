package com.bca.muciter.presenter.bcaofficer

import com.bca.muciter.base.BaseView
import com.bca.muciter.model.Motor

interface MainContract{
    interface View: BaseView{
        fun initBaseView()
        fun loadData(data: List<Motor>)
        fun loadFilteredData(data: List<Motor>)
    }

    interface Presenter{
        fun loadData(brand: String)
        fun loadFilteredData(constraint: String, data: List<Motor>)
    }
}