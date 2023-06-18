package com.corps.noteapp.util

import androidx.room.TypeConverter
import java.util.Date

class ConvertDate {

    @TypeConverter
    fun timeStampFromDate(date: Date): Long {
        return date.time
    }

    @TypeConverter
    fun dateFromTimesStamp(timestamp: Long): Date {
        return Date(timestamp)
    }

}
