package studio.hcmc.board.dto

sealed interface ErrorDTO {
    val throwable: Throwable

    data object BoardNotFound : RuntimeException(), ErrorDTO {
        override val throwable get() = this

        private fun readResolve(): Any = BoardNotFound
    }

    data object ArticleNotFound : RuntimeException(), ErrorDTO {
        override val throwable get() = this

        private fun readResolve(): Any = ArticleNotFound
    }

    data object ArticlePasswordMismatch : RuntimeException(), ErrorDTO {
        override val throwable: Throwable get() = this

        private fun readResolve(): Any = ArticlePasswordMismatch
    }

    data object CommentNotFound : RuntimeException(), ErrorDTO {
        override val throwable get() = this

        private fun readResolve(): Any = CommentNotFound
    }

    data object CommentPasswordMismatch : RuntimeException(), ErrorDTO {
        override val throwable get() = this

        private fun readResolve(): Any = CommentNotFound
    }
}