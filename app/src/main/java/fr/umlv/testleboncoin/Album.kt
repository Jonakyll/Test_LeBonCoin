package fr.umlv.testleboncoin

data class Album(
    val albumId: Float,
    val id: Float,
    val title: String,
    val url: String,
    val thumbnailUrl: String
) {

    companion object {
        val URL = "https://static.leboncoin.fr/img/shared/technical-test.json"
    }
}