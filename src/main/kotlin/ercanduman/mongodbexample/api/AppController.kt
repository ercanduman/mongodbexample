package ercanduman.mongodbexample.api

import ercanduman.mongodbexample.data.entity.Hotel
import ercanduman.mongodbexample.data.service.AppService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class AppController {
    @Autowired
    lateinit var appService: AppService

    @GetMapping("/hotels")
    fun hotels(): List<Hotel> = appService.hotels()

    @PostMapping
    fun insert(@RequestBody hotel: Hotel) = appService.insert(hotel)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: String) = appService.delete(id)
}