package com.erikjensenworks.kolorkombat.daos

import androidx.room.Dao
import androidx.room.Query
import com.erikjensenworks.kolorkombat.data.ArmyPainterData

@Dao
interface ArmyPainterDao {
    @Query("SELECT * FROM ArmyPainterData")
    fun getAllProducts(): List<ArmyPainterData>
}
