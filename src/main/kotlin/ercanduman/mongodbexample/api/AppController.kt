package ercanduman.mongodbexample.api

import ercanduman.mongodbexample.data.entity.Hotel
import ercanduman.mongodbexample.data.service.AppService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/hotels")
class AppController {
    @Autowired
    lateinit var appService: AppService

    @GetMapping
    fun hotels(): List<Hotel> = appService.hotels()

    @PostMapping
    fun insert(@RequestBody hotel: Hotel) = appService.insert(hotel)

    @PutMapping
    fun update(@RequestBody hotel: Hotel) = appService.update(hotel)

    @GetMapping("/{id}")
    fun findById(@PathVariable("id") id: String) = appService.findById(id)

    @GetMapping("/price/{price}")
    fun findByPriceLessThanEqual(@PathVariable("price") price: Int) = appService.findByPriceLessThanEqual(price)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: String) = appService.delete(id)
}