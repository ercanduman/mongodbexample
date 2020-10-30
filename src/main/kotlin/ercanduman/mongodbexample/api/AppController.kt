package ercanduman.mongodbexample.api

import ercanduman.mongodbexample.data.entity.Hotel
import ercanduman.mongodbexample.data.service.AppService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class AppController {
    @Autowired
    lateinit var appService: AppService

    @GetMapping("/hotels")
    fun hotels(): List<Hotel> = appService.hotels()
}