package fr.umlv.testleboncoin

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun album_equals() {
        val album = Album(1f, 1f, "title", "url", "thumbnailUrl")
        val anotherAlbum = Album(1f, 1f, "title", "url", "thumbnailUrl")
        assertEquals(album, Album(1f, 1f, "title", "url", "thumbnailUrl"))
        assertEquals(Album(1f, 1f, "title", "url", "thumbnailUrl"), album)
        assertEquals(Album(1f, 1f, "title", "url", "thumbnailUrl"), anotherAlbum)
        assertEquals(album, anotherAlbum)
    }

    @Test
    fun album_notEquals() {
        val album = Album(2f, 2f, "title", "url", "thumbnailUrl")
        assertNotEquals(album, Album(1f, 2f, "title", "url", "thumbnailUrl"))
        assertNotEquals(album, Album(2f, 1f, "title", "url", "thumbnailUrl"))
        assertNotEquals(album, Album(2f, 2f, "titl", "url", "thumbnailUrl"))
        assertNotEquals(album, Album(2f, 2f, "title", "urI", "thumbnailUrl"))
        assertNotEquals(album, Album(2f, 2f, "title", "url", "thumbnailUrI"))
    }
}