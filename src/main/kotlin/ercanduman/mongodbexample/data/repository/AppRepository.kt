package ercanduman.mongodbexample.data.repository

import ercanduman.mongodbexample.data.entity.Hotel
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface AppRepository : MongoRepository<Hotel, String> {
    /**
     * For all supported keywords for query methods please check following link.
     *
     * https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/#mongodb.repositories.queries
     */
    fun findByPriceLessThanEqual(price: Int): List<Hotel>
}