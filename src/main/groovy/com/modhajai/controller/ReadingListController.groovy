package com.modhajai.controller

import com.modhajai.domain.Book
import com.modhajai.repository.ReadingListRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

/**
 * @author Jai Modha
 * @created 1/15/17
 */
@Controller
@RequestMapping('/')
class ReadingListController {

    @Autowired
    ReadingListRepository readingListRepository

    @RequestMapping(value='/{reader}', method=RequestMethod.GET)
    String readersBooks(@PathVariable("reader") String reader, Model model) {
        def readingList = readingListRepository.findByReader(reader)
        if (!readingList.isEmpty()) {
            model.addAttribute('books', readingList)
        }
        return 'readingList'
    }

    @RequestMapping(value = '/{reader}', method=RequestMethod.POST)
    String addToReadingList(@PathVariable('reader') String reader, Book book) {
        book.reader = reader
        readingListRepository.save(book)
        return 'redirect:/{reader}'
    }

}
