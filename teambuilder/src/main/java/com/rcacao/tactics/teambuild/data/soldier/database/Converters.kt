package com.rcacao.tactics.teambuild.data.soldier.database

import androidx.room.TypeConverter
import com.rcacao.tactics.core.data.job.JobId
import com.rcacao.tactics.core.data.soldier.Sex
import com.rcacao.tactics.core.data.zodiac.Zodiac

class Converters {
    @TypeConverter
    fun jobIdToInt(jobId: JobId) = jobId.ordinal

    @TypeConverter
    fun intToJobId(ordinal: Int) = JobId.values().first { it.ordinal == ordinal }

    @TypeConverter
    fun zodiacIdToInt(zodiac: Zodiac) = zodiac.ordinal

    @TypeConverter
    fun intToZodiac(ordinal: Int) = Zodiac.values().first { it.ordinal == ordinal }

    @TypeConverter
    fun sexToInt(sex: Sex) = sex.ordinal

    @TypeConverter
    fun intToSex(ordinal: Int) = Sex.values().first { it.ordinal == ordinal }
}
