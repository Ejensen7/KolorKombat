package com.erikjensenworks.kolorkombat.daos

import androidx.room.Dao
import androidx.room.Query
import com.erikjensenworks.kolorkombat.data.CitadelData

@Dao
interface CitadelDao {
    @Query("SELECT * FROM CitadelData")
    fun getAllProducts(): List<CitadelData>
}
