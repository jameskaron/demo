package com.james.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class DemoApplication{

    @RequestMapping("/demo")
    fun greeting() : String = "Hello World!"

}


fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java, *args)
}

