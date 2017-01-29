package com.modhajai.repository

import com.modhajai.domain.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Component

/**
 * @author jaimodha
 * @created 1/15/17
 */
@Component
interface ReadingListRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(String reader)

}
