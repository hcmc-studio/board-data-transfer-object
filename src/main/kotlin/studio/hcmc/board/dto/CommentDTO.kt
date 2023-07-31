package studio.hcmc.board.dto

import kotlinx.serialization.Serializable
import studio.hcmc.kotlin.protocol.DataTransferObject

sealed interface CommentDTO : DataTransferObject {
    @Serializable
    data class Post(
        val body: String,
        val writerNickname: String,
        val writerPassword: String,
        val writerAddress: String
    ) : CommentDTO

    @Serializable
    data class Put(
        val body: String,
        val writerPassword: String,
    ) : CommentDTO
}