package com.erikjensenworks.kolorkombat.daos

import androidx.room.Dao
import androidx.room.Query
import com.erikjensenworks.kolorkombat.data.ProAcrylData

@Dao
interface ProAcrylDao {
    @Query("SELECT * FROM ProAcrylData")
    fun getAllProducts(): List<ProAcrylData>
}
