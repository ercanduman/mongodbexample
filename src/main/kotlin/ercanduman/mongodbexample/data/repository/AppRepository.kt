package ercanduman.mongodbexample.data.repository

import ercanduman.mongodbexample.data.entity.Hotel
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface AppRepository : MongoRepository<Hotel, String> 