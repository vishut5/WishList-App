package com.vishu.wishlistapp

import android.content.Context
import androidx.room.Room
import com.vishu.wishlistapp.Data.WishDatabase
import com.vishu.wishlistapp.Data.Wishrepository

object Graph {
    lateinit var  database:WishDatabase
    val wishRepository by lazy {
        Wishrepository(wishDao = database.wishDao())
    }
    fun provide(context: Context){
        database= Room.databaseBuilder(context, WishDatabase::class.java,"wishlist.db").build()
    }
}