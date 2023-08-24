package com.erikjensenworks.kolorkombat

import androidx.room.Database
import androidx.room.RoomDatabase
import com.erikjensenworks.kolorkombat.daos.*
import com.erikjensenworks.kolorkombat.data.*

@Database(entities = [VallejoData::class, ProAcrylData::class, ArmyPainterData::class, P3Data::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun vallejoDao(): VallejoDao
    abstract fun proAcrylDao(): ProAcrylDao
    abstract fun armyPainterDao(): ArmyPainterDao
    abstract fun p3Dao(): P3Dao
}