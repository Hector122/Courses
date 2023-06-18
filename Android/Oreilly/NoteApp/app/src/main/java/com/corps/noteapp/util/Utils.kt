package com.corps.noteapp.util

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


fun fromDate(time: Long): String {
    val date = Date(time)
    val format = SimpleDateFormat("EE, d MM hh:mm:aaa", Locale.US)
    return format.format(date)
}
