package com.modhajai.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Jai Modha
 * @created 2/03/17
 */
@RestController
class RestWebController {

    @RequestMapping('/sayhello')
    def sayHello() {
        return 'Hello!'
    }
}
