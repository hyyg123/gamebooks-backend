package com.gamebooks.database.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToMany
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "page")
open class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "page_id", nullable = false)
    open var pageId: Long? = null

    open var game: Game? = null

    open var title: String? = null
    open var contents: String? = null

    @OneToMany(mappedBy = "attachFile")
    open var imageList: List<AttachFile>? = ArrayList()
    @ManyToMany
    open var choiceList: List<Choice>? = ArrayList()
}
