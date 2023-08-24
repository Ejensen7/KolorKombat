package com.erikjensenworks.kolorkombat.daos

import androidx.room.Dao
import androidx.room.Query
import com.erikjensenworks.kolorkombat.data.VallejoData

@Dao
interface VallejoDao {
    @Query("SELECT * FROM VallejoData")
    fun getAllProducts(): List<VallejoData>
}
