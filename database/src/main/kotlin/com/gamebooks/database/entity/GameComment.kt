package com.gamebooks.database.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "game_comment")
open class GameComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_comment_id", nullable = false)
    open var gameCommentId: Long? = null

    open var contents: String? = null

    @ManyToOne
    @JoinColumn(name = "game_game_id")
    open var game: Game? = null
    @ManyToOne
    @JoinColumn(name = "writer_user_id")
    open var writer: User? = null
}