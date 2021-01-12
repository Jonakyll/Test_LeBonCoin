package fr.umlv.testleboncoin

import android.os.AsyncTask
import com.google.gson.Gson

class SearchTask() : AsyncTask<String, Integer, List<Album>>() {

    override fun doInBackground(vararg params: String?): List<Album> {
        val obj = Gson().fromJson(params[0], Array::class.java)
        return obj.map {
            val elem = it as Map<String, Any>
            Album(
                elem["albumId"].toString().toFloat(),
                elem["id"].toString().toFloat(),
                elem["title"].toString(),
                elem["url"].toString(),
                elem["thumbnailUrl"].toString()
            )
        }
    }
}