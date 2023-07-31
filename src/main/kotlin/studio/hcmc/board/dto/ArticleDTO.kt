package studio.hcmc.board.dto

import kotlinx.serialization.Serializable
import studio.hcmc.kotlin.protocol.DataTransferObject

sealed interface ArticleDTO : DataTransferObject {
    @Serializable
    data class Post(
        val title: String,
        val body: String,
        val writerNickname: String,
        val writerPassword: String,
    ) : ArticleDTO

    @Serializable
    data class Put(
        val title: String,
        val body: String,
        val writerPassword: String,
    ) : ArticleDTO
}