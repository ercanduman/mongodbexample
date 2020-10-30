package ercanduman.mongodbexample.data.service

import ercanduman.mongodbexample.data.entity.Hotel
import ercanduman.mongodbexample.data.repository.AppRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class AppService {
    @Autowired
    lateinit var repository: AppRepository
    fun hotels(): List<Hotel> = repository.findAll()
    fun insert(hotel: Hotel): Hotel = repository.save(hotel)
    fun update(hotel: Hotel): Hotel = repository.save(hotel)
    fun delete(id: String) = repository.deleteById(id)
    fun findById(id: String): Optional<Hotel> = repository.findById(id)
}