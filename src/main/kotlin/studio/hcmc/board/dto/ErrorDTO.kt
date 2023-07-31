package studio.hcmc.board.dto

sealed interface ErrorDTO {
    val throwable: Throwable

    data object BoardNotFound : Throwable(), ErrorDTO {
        override val throwable get() = this

        private fun readResolve(): Any = BoardNotFound
    }

    data object ArticleNotFound : RuntimeException(), ErrorDTO {
        override val throwable get() = this

        private fun readResolve(): Any = ArticleNotFound
    }

    data object CommentNotFound : RuntimeException(), ErrorDTO {
        override val throwable get() = this

        private fun readResolve(): Any = CommentNotFound
    }
}