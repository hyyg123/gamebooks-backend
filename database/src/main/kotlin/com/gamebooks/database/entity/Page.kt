package com.gamebooks.database.entity

import javax.persistence.*

@Entity
@Table(name = "page")
class Page() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "page_id", nullable = false)
    var id: Long? = null

}
