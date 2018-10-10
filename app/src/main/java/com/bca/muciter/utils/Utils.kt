package com.bca.muciter.utils

import java.text.NumberFormat
import java.util.*

fun toDecimalString(decimalValue : Double?): String {
    val anotherFormat = NumberFormat.getNumberInstance(Locale.GERMAN)
    return anotherFormat.format(decimalValue)
}