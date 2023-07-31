package studio.hcmc.board.dto

import kotlinx.serialization.Serializable
import studio.hcmc.kotlin.protocol.DataTransferObject

sealed interface BoardDTO : DataTransferObject {
    @Serializable
    data class Post(
        val name: String
    ) : BoardDTO

    @Serializable
    data class Put(
        val name: String
    ) : BoardDTO
}