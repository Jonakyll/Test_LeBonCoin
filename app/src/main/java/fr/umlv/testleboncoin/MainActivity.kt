package fr.umlv.testleboncoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        show_albums_button.setOnClickListener {
            val queue = Volley.newRequestQueue(this)

            val stringRequest = StringRequest(
                Request.Method.GET, Album.URL, { response ->
                    recycler_view.adapter = AlbumAdapter(SearchTask().execute(response).get())
                    recycler_view.layoutManager =
                        LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                }, {
                    Log.e(javaClass.name, "Error with Volley request", it)
                }
            )
            queue.add(stringRequest)
        }
    }

}