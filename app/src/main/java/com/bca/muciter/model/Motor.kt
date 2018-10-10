package com.bca.muciter.model

import com.google.gson.annotations.SerializedName

class Motor(
    val id: Long? = null,

    @SerializedName("idMotor")
    var idMotor: String? = null,

    @SerializedName("motorThumbnail")
    var motorThumbnail: String? = null,

    @SerializedName("motorName")
    var motorName: String? = null,

    @SerializedName("motorPrice")
    var motorPrice: Double? = null,

    @SerializedName("motorDescription")
    var motorDescription: String? = null,

    @SerializedName("motorBrand")
    var motorBrand: String? = null,

    @SerializedName("motorTechnology")
    var motorTechnology: String? = null,

    @SerializedName("motorCylinder")
    var motorCylinder: String? = null,

    @SerializedName("motorFuelTanki")
    var motorFuelTanki: String? = null,

    @SerializedName("motorTransmission")
    var motorTransmission: String? = null
    )
{
}