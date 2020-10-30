package ercanduman.mongodbexample.data.entity

data class Hotel(
        val id: String,
        val name: String,
        val price: Int,
        val address: Address,
        val reviews: List<Review>
) 