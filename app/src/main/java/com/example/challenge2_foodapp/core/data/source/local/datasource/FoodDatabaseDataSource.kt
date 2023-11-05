package com.example.challenge2_foodapp.core.data.source.local.datasource

import com.example.challenge2_foodapp.core.data.source.local.entity.FoodEntity
import com.example.challenge2_foodapp.core.data.source.local.room.FoodDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

interface FoodDataSource {
    fun getAllFood(): Flow<List<FoodEntity>>
    suspend fun insertAllFood(food: List<FoodEntity>)
}

class FoodDatabaseDataSource(private val foodDao: FoodDao) : FoodDataSource {

    override fun getAllFood(): Flow<List<FoodEntity>> {
        return foodDao.getAllFood()
    }

    override suspend fun insertAllFood(food: List<FoodEntity>) = foodDao.insertAllFood(food)

}