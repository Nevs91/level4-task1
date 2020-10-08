package com.example.madlevel4task1.interfaces

import androidx.room.*
import com.example.madlevel4task1.entities.Product

@Dao
interface ProductDao {

    @Query("SELECT * FROM productTable")
    suspend fun getAllProducts(): List<Product>

    @Insert
    suspend fun insertProduct(product: Product)

    @Delete
    suspend fun deleteProduct(product: Product)

    @Query("DELETE FROM productTable")
    suspend fun deleteAllProducts()
}
