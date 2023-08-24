package com.erikjensenworks.kolorkombat.daos

import androidx.room.Dao
import androidx.room.Query
import com.erikjensenworks.kolorkombat.data.P3Data

@Dao
interface P3Dao {
    @Query("SELECT * FROM P3Data")
    fun getAllProducts(): List<P3Data>
}
