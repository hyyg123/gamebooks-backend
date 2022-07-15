package com.gamebooks.database.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToMany
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "choice")
open class Choice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var choiceId: Long? = null

    @ManyToOne
    @JoinColumn(name = "page_page_id")
    open var page: Page? = null

    @ManyToMany
    open var nextPageList: List<Page>? = ArrayList()
}