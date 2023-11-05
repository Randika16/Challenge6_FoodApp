package com.example.challenge2_foodapp.core.data.source.local.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.challenge2_foodapp.core.data.source.local.entity.FoodEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface FoodDao {

    @Query("SELECT * FROM food_entity")
    fun getAllFood(): Flow<List<FoodEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllFood(food: List<FoodEntity>)

//    @Query("SELECT * FROM food_entity WHERE food_id = :foodId")
//    fun getSpecificFood(foodId: Int): Flow<FoodEntity>

}