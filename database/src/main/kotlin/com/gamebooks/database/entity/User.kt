package com.gamebooks.database.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "user")
open class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    open var userId: Long? = null

    open var id: String? = null

    open var password: String? = null

    @ManyToOne
    @JoinColumn(name = "profile_image_attach_file_id")
    open var profileImage: AttachFile? = null

    open var nickName: String? = null

    @OneToMany(mappedBy = "creator")
    open var gameList: List<Game>? = ArrayList()
    @OneToMany(mappedBy = "writer")
    open var commentList: List<GameComment>? = ArrayList()
    @OneToMany(mappedBy = "user")
    open var likeList: List<GameLike>? = ArrayList()
}