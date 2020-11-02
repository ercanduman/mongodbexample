package ercanduman.mongodbexample.data.db.datasource

import ercanduman.mongodbexample.data.entity.Address
import ercanduman.mongodbexample.data.entity.Hotel
import ercanduman.mongodbexample.data.entity.Review
import ercanduman.mongodbexample.data.repository.AppRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DataSource(private val repository: AppRepository) : CommandLineRunner {

    override fun run(vararg args: String?) {
        // Initialize some random hotels
        val hotels = listOf(
                Hotel("Beach Hotel", 125, Address("Marmaris", "Tr"), listOf(Review("Test user", 5, true))),
                Hotel("Selen Hotel", 150, Address("İçmeler/Marmaris", "Tr"), listOf(Review("Test user 2", 7, true)))
        )

        // Insert these sample hotels into mongoDb each time server started.
        if (repository.findAll().isEmpty()) repository.saveAll(hotels)
    }
}