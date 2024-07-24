package com.vishu.wishlistapp.Data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id:Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title :String ="",
    @ColumnInfo(name = "wish-desc")
    val description:String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Apple Watch", description = "An IOS Watch"),
        Wish(title = "IPhone", description = "An IOS Product"),
        Wish(title = "Priyanshi", description = "Future CA"),
        Wish(title = "Vishu", description = "Became an Android Developer"),
    )
}
