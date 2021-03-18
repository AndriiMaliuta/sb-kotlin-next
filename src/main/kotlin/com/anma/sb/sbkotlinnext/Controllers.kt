package com.anma.sb.sbkotlinnext

import org.springframework.web.bind.annotation.*

@RestController
//@CrossOrigin("*")
@RequestMapping("/rest/api/v1/dogs")
class CatController(val dogRepository: DogRepository) {

    @GetMapping
    fun getCats():List<Dog> = dogRepository.findAll()

    @PostMapping
    fun createDog(@RequestBody dog: Dog): Dog {
        return dogRepository.save(dog)
    }
}