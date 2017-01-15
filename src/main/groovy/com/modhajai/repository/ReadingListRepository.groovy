package com.modhajai.repository

import com.modhajai.domain.Book
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by jaimodha on 1/15/17.
 */
interface ReadingListRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(String reader)

}
