package ercanduman.mongodbexample.data.service

import ercanduman.mongodbexample.data.entity.Hotel
import ercanduman.mongodbexample.data.repository.AppRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AppService {
    @Autowired
    lateinit var repository: AppRepository
    fun hotels(): List<Hotel> = repository.findAll()
}