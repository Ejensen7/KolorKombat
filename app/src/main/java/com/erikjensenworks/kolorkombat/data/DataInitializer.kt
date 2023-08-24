package com.erikjensenworks.kolorkombat.data

import com.erikjensenworks.kolorkombat.AppDatabase

class DataInitializer(private val database: AppDatabase) {
    fun initializeData() {
        val vallejoData = listOf(
            VallejoData(1, "White", "70.951", 3.29),
            VallejoData(2, "Black", "70.950", 3.29),
            VallejoData(3, "Red", "70.926", 3.29),
            VallejoData(4, "Blue", "70.965", 3.29),
            VallejoData(5, "Green", "70.968", 3.29),
            VallejoData(6, "Yellow", "70.953", 3.29),
            VallejoData(7, "Orange", "70.851", 3.29),
            VallejoData(8, "Purple", "70.959", 3.29),
            VallejoData(9, "Brown", "70.982", 3.29),
            VallejoData(10, "Grey", "70.990", 3.29),
            VallejoData(11, "Metallic", "70.863", 3.29),
            VallejoData(12, "Flesh", "70.815", 3.29),
            VallejoData(13, "Leather", "70.871", 3.29),
            VallejoData(14, "Bone", "70.815", 3.29),
            VallejoData(15, "Gold", "70.996", 3.29),
            VallejoData(16, "Silver", "70.997", 3.29),
            VallejoData(17, "Brass", "70.801", 3.29),
            VallejoData(18, "Copper", "70.999", 3.29),
            VallejoData(19, "Steel", "70.865", 3.29),
            VallejoData(20, "Gunmetal", "70.863", 3.29),
            VallejoData(21, "Bronze", "70.998", 3.29),
            VallejoData(22, "Chrome", "70.997", 3.29),
            VallejoData(23, "Aluminum", "70.864", 3.29),
            VallejoData(24, "Gold", "70.996", 3.29),
        )

        //database.vallejoDao().insertAll(vallejoData)
    }
}