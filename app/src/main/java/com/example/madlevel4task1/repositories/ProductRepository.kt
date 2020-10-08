package com.example.madlevel4task1.repositories

import android.content.Context
import com.example.madlevel4task1.database.ShoppingListRoomDatabase
import com.example.madlevel4task1.entities.Product
import com.example.madlevel4task1.interfaces.ProductDao

class ProductRepository(context: Context) {

    private val productDao: ProductDao

    init {
        val database = ShoppingListRoomDatabase.getDatabase(context)
        productDao = database!!.productDao()
    }

    suspend fun getAllProducts(): List<Product> {
        return productDao.getAllProducts()
    }

    suspend fun insertProduct(product: Product) {
        productDao.insertProduct(product)
    }

    suspend fun deleteProduct(product: Product) {
        productDao.deleteProduct(product)
    }

    suspend fun deleteAllProducts() {
        productDao.deleteAllProducts()
    }
}
