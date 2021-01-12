package fr.umlv.testleboncoin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlbumAdapter(val albums: List<Album>) : RecyclerView.Adapter<AlbumAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val albumIdText = itemView.findViewById<TextView>(R.id.albumId_text)
        private val idText = itemView.findViewById<TextView>(R.id.id_text)
        private val titleText = itemView.findViewById<TextView>(R.id.title_text)
        private val urlImage = itemView.findViewById<ImageView>(R.id.url_image)
        private val thumbnailUrlImage = itemView.findViewById<ImageView>(R.id.thumbnailUrl_image)

        fun update(album: Album) {
            albumIdText.text = album.albumId.toString()
            idText.text = album.id.toString()
            titleText.text = album.title
//            DownloadImageFromInternet(urlImage).execute(album.url)
//            DownloadImageFromInternet(thumbnailUrlImage).execute(album.thumbnailUrl)
            DownloadImageFromInternet(urlImage).execute("https://www.lavalamp.com/wp-content/uploads/2016/07/placeholder-600x600.png")
            DownloadImageFromInternet(thumbnailUrlImage).execute("https://alscofirstaid.com.au/wp-content/uploads/2014/01/placeholder-150x150.png")
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.album_entry, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = albums[position]
        holder.update(item)
    }

    override fun getItemCount(): Int {
        return albums.size
    }
}