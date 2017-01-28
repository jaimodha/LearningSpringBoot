package com.modhajai.controller

import com.modhajai.repository.ReadingListRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

/**
 * Created by jaimodha on 1/15/17.
 */
@Controller
@RequestMapping('/')
class ReadingListController {

    @Autowired
    ReadingListRepository readingListRepository

    @RequestMapping(value="/{reader}", method=RequestMethod.GET)
    String readBooks(@PathVariable("reader") String reader, Model model) {
        model.addAttribute("message", reader)
        return "readingList"
    }
}
