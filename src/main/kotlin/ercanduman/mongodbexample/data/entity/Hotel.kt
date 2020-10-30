package ercanduman.mongodbexample.data.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "hotels")
data class Hotel(
        val name: String,
        val price: Int,
        val address: Address,
        val reviews: List<Review>
) {
    @Id
    var id: String = ""
}