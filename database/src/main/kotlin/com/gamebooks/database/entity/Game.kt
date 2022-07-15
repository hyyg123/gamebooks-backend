package com.gamebooks.database.entity

import com.gamebooks.database.enums.GameStatus
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
@Table(name = "game")
open class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_id", nullable = false)
    open var gameId: Long? = null

    open var name: String? = null
    open var description: String? = null
    open var status: GameStatus? = GameStatus.EDITING
    open var views: Long? = 0

    @ManyToOne
    @JoinColumn(name = "thumbnail_attach_file_id")
    open var thumbnail: AttachFile? = null

    @ManyToOne
    @JoinColumn(name = "creator_user_id")
    open var creator: User? = null

    @OneToMany(mappedBy = "game")
    open var pageList: List<Page>? = ArrayList()
    @OneToMany(mappedBy = "game")
    open var likeList: List<GameLike>? = ArrayList()
    @OneToMany(mappedBy = "game")
    open var commentList: List<GameComment>? = ArrayList()
}