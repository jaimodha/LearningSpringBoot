package com.modhajai.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * @author Jai Modha
 * @created 1/15/17
 */
@Entity
class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id
    String reader
    String isbn
    String title
    String author
    String description

}
