package jetpack.web

import jetpack.repository.CustomerRepository
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
internal class TestController(
        private val customerRepository: CustomerRepository
) {

    @RequestMapping("/")
    fun home(): String = "Hello World!"

}
